package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2265x2c1ddc83.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/conversation/ui/TextStatusGreetingFragment;", "Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Lhi4/e;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusGreetingFragment */
/* loaded from: classes11.dex */
public final class C18597x74fb2b68 extends com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951<hi4.e> {

    /* renamed from: w, reason: collision with root package name */
    public ui4.c f254745w;

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public android.view.View A0() {
        ui4.c cVar = this.f254745w;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.widget.TextView emptyTip = cVar.f509661c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emptyTip, "emptyTip");
        return emptyTip;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public int B0() {
        return 15;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public android.view.View C0() {
        ui4.c cVar = this.f254745w;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 loadingIcon = cVar.f509662d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadingIcon, "loadingIcon");
        return loadingIcon;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 G0() {
        ui4.c cVar = this.f254745w;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 conversationRecyclerView = cVar.f509660b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(conversationRecyclerView, "conversationRecyclerView");
        return conversationRecyclerView;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 H0() {
        ui4.c cVar = this.f254745w;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = cVar.f509663e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rlLayout, "rlLayout");
        return rlLayout;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.czf;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        li4.b k17 = ni4.x.f419309d.k();
        k17.getClass();
        java.lang.String[] strArr = mj4.n.f408609e;
        k17.f400321d.A("TextStatusLike", "update TextStatusGreetingItem set Read = 1 where Read != 1");
        k17.mo142179xf35bbb4(li4.b.f400320f, 6, null);
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.o4z);
        int i17 = com.p314xaae8f345.mm.R.id.ciw;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.ciw);
        if (c1163xf1deaba4 != null) {
            i17 = com.p314xaae8f345.mm.R.id.dft;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.dft);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.ilq;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.ilq);
                if (c22627xa933f8e4 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.m6e;
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.m6e);
                    if (c22801x87cbdc00 != null) {
                        com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583 c22814x6ec16583 = (com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583) findViewById;
                        this.f254745w = new ui4.c(c22814x6ec16583, c1163xf1deaba4, textView, c22627xa933f8e4, c22801x87cbdc00, c22814x6ec16583);
                        super.mo7518x594b1124(view, bundle);
                        ni4.x.f419309d.h().add(w0());
                        ym5.a1.g(G0(), new mi4.c());
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public void r0() {
        android.content.Context mo7438x76847179 = mo7438x76847179();
        if (mo7438x76847179 != null) {
            wn.a w07 = w0();
            ei4.s sVar = w07 instanceof ei4.s ? (ei4.s) w07 : null;
            if (sVar != null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = sVar.f334772e;
                int min = java.lang.Math.min(3, linkedList2.size());
                for (int i17 = 0; i17 < min; i17++) {
                    linkedList.add(((hi4.e) linkedList2.get(i17)).f76592x6c03540b);
                }
                ki4.g0.f389665a.c(mo7438x76847179, linkedList, "greeting");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public wn.a t0() {
        ei4.s sVar = new ei4.s();
        sVar.f334774g = new ei4.w(null, 1, null);
        sVar.f334773f = new ei4.v(null, 1, null);
        return sVar;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public java.util.List u0() {
        return kz5.b0.c(ni4.x.f419309d.n());
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public wn.b y0() {
        return new hi4.d(0, 0, 3, null);
    }
}
