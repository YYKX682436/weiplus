package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2265x2c1ddc83.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/conversation/ui/TextStatusConversationFragment;", "Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Lhi4/a;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusConversationFragment */
/* loaded from: classes11.dex */
public final class C18595x38eba632 extends com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951<hi4.a> {

    /* renamed from: w, reason: collision with root package name */
    public ui4.a f254742w;

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public android.view.View A0() {
        ui4.a aVar = this.f254742w;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.widget.TextView emptyTip = aVar.f509649c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emptyTip, "emptyTip");
        return emptyTip;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public int B0() {
        return 15;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public android.view.View C0() {
        ui4.a aVar = this.f254742w;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 loadingIcon = aVar.f509650d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadingIcon, "loadingIcon");
        return loadingIcon;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 G0() {
        ui4.a aVar = this.f254742w;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 conversationRecyclerView = aVar.f509648b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(conversationRecyclerView, "conversationRecyclerView");
        return conversationRecyclerView;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 H0() {
        ui4.a aVar = this.f254742w;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = aVar.f509651e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rlLayout, "rlLayout");
        return rlLayout;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cyz;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        ni4.x xVar = ni4.x.f419309d;
        xVar.k().mo49775xc84af884(w0());
        xVar.n().mo49775xc84af884(w0());
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.o4y);
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
                        this.f254742w = new ui4.a(c22814x6ec16583, c1163xf1deaba4, textView, c22627xa933f8e4, c22801x87cbdc00, c22814x6ec16583);
                        super.mo7518x594b1124(view, bundle);
                        ni4.x xVar = ni4.x.f419309d;
                        xVar.k().add(w0());
                        xVar.n().add(w0());
                        ym5.a1.g(G0(), new mi4.a());
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public void r0() {
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: setUserVisibleHint */
    public void mo7583x951b248c(boolean z17) {
        super.mo7583x951b248c(z17);
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public wn.a t0() {
        ei4.h hVar = new ei4.h();
        hVar.f334750g = new ei4.j(this);
        hVar.f334751h = new ei4.l(this, null, 2, null);
        return hVar;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public java.util.List u0() {
        return kz5.b0.c(ni4.x.f419309d.n());
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public wn.b y0() {
        return new hi4.b(0, 0, 3, null);
    }
}
