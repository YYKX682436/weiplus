package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 f268642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f268643e;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var, android.content.res.Configuration configuration) {
        this.f268642d = m1Var;
        this.f268643e = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var = this.f268642d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 o4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) m1Var.K;
        android.content.res.Configuration configuration = this.f268643e;
        if (configuration != null) {
            int i17 = o4Var.A;
            int i18 = configuration.orientation;
            if (i17 != i18) {
                o4Var.A = i18;
                o4Var.q();
            }
        } else {
            o4Var.getClass();
        }
        android.view.View view = m1Var.f362935h;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = m1Var.E();
            android.view.View view2 = m1Var.f362935h;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
            }
        }
        m1Var.U();
        android.view.View view3 = m1Var.f362934g;
        if (view3 != null) {
            view3.requestLayout();
        }
    }
}
