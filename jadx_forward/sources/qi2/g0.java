package qi2;

/* loaded from: classes10.dex */
public final class g0 extends qi2.n {
    public final android.view.View B;
    public final nj2.p C;
    public final mj2.k D;
    public android.view.View E;
    public final kj2.o F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.content.Context context, zh2.e userInterface, zh2.c pluginAbility) {
        super(context, userInterface, pluginAbility);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userInterface, "userInterface");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        android.view.View findViewById = y().findViewById(com.p314xaae8f345.mm.R.id.r9j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.B = findViewById;
        android.view.View view = this.E;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inviteListLayout");
            throw null;
        }
        this.F = new kj2.o(view, pluginAbility.g(), new qi2.e0(pluginAbility), null, new qi2.f0(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorVisitorPkPanelWidget", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/mic/api/IMicUserInterface;Lcom/tencent/mm/plugin/finder/live/mic/api/IMicLinkPluginAbility;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorVisitorPkPanelWidget", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/mic/api/IMicUserInterface;Lcom/tencent/mm/plugin/finder/live/mic/api/IMicLinkPluginAbility;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.D = new mj2.k(context, pluginAbility.g(), findViewById, pluginAbility, userInterface, new qi2.d0(this));
        android.view.View y17 = y();
        android.view.View findViewById2 = y().findViewById(com.p314xaae8f345.mm.R.id.qv7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.C = new nj2.p(y17, findViewById2, pluginAbility.g(), userInterface);
    }

    public final boolean A() {
        zh2.c cVar = this.f445110h;
        return ((mm2.e1) cVar.g().a(mm2.e1.class)).c7() || ((mm2.c1) cVar.g().a(mm2.c1.class)).L;
    }

    @Override // qi2.n, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        super.p(rootView);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.qtx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.E = findViewById;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        if (A()) {
            this.F.b();
        }
    }

    @Override // qi2.n, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        this.C.n();
        this.D.s();
        android.view.View view = this.E;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inviteListLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorVisitorPkPanelWidget", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorVisitorPkPanelWidget", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (A()) {
            this.F.f();
        }
    }

    @Override // qi2.n
    public void z() {
        super.z();
        this.D.r("onTimerUpdateData");
        nj2.p pVar = this.C;
        pVar.getClass();
        pm0.v.X(new nj2.l(pVar));
        if (A()) {
            this.F.c();
        }
    }
}
