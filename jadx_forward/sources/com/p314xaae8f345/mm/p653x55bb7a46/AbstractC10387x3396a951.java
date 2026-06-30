package com.p314xaae8f345.mm.p653x55bb7a46;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Ll75/f0;", "CONVERSATION", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "<init>", "()V", "wn/a", "wn/b", "common-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.chatting.BasePrivateMsgConvListFragment */
/* loaded from: classes10.dex */
public abstract class AbstractC10387x3396a951<CONVERSATION extends l75.f0> extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f146263v = 0;

    /* renamed from: n, reason: collision with root package name */
    public wn.b f146264n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f146265o = jz5.h.b(new wn.g(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f146266p = jz5.h.b(new wn.f(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f146267q = jz5.h.b(new wn.e(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f146268r = jz5.h.b(new wn.h(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f146269s = jz5.h.b(new wn.d(this));

    /* renamed from: t, reason: collision with root package name */
    public long f146270t;

    /* renamed from: u, reason: collision with root package name */
    public wn.u f146271u;

    public abstract android.view.View A0();

    public int B0() {
        return 0;
    }

    public abstract android.view.View C0();

    public wn.u F0() {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x19263085);
        pf5.z zVar = pf5.z.f435481a;
        if (!(mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(wn.u.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (wn.u) a17;
    }

    public abstract p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 G0();

    public abstract com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 H0();

    public void J0(long j17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return kz5.r0.f395535d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        yj0.a.a("com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        yj0.a.h(this, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        z0().c().mo49775xc84af884(w0());
        java.util.Iterator it = u0().iterator();
        while (it.hasNext()) {
            ((l75.s0) it.next()).mo49775xc84af884(w0());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        s0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        this.f146270t = android.os.SystemClock.uptimeMillis();
        wn.u F0 = F0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(F0, "<set-?>");
        this.f146271u = F0;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) this.f146265o).mo141623x754a37bb();
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext()));
        c1163xf1deaba4.mo7960x6cab2c8d(w0());
        wn.b y07 = y0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y07, "<set-?>");
        this.f146264n = y07;
        z0().c().add(w0());
        java.util.Iterator it = u0().iterator();
        while (it.hasNext()) {
            ((l75.s0) it.next()).add(w0());
        }
        x0().m82683xb165a19d(new wn.i(this));
        jz5.g gVar = this.f146266p;
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.List b17 = z0().b();
        w0().y(true, b17);
        r0();
        if (B0() > b17.size()) {
            x0().m82688x390c1d00(false);
        }
        J0(android.os.SystemClock.uptimeMillis() - this.f146270t);
        android.view.View view3 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        s0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void p0() {
        yj0.a.a("com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    public void r0() {
    }

    public final void s0() {
        int mo1894x7e414b06 = w0().mo1894x7e414b06();
        jz5.g gVar = this.f146267q;
        if (mo1894x7e414b06 == 0) {
            android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            x0().setVisibility(8);
            return;
        }
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        x0().setVisibility(0);
    }

    public abstract wn.a t0();

    public abstract java.util.List u0();

    public final wn.a w0() {
        return (wn.a) ((jz5.n) this.f146269s).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 x0() {
        return (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) ((jz5.n) this.f146268r).mo141623x754a37bb();
    }

    public abstract wn.b y0();

    public final wn.b z0() {
        wn.b bVar = this.f146264n;
        if (bVar != null) {
            return bVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataSource");
        throw null;
    }
}
