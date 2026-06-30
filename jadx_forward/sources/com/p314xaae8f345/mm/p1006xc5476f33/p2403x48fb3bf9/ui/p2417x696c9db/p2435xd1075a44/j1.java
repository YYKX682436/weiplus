package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class j1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public int f268871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 f268872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f268873f;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var, android.content.res.Configuration configuration) {
        this.f268872e = m1Var;
        this.f268873f = configuration;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view;
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var = this.f268872e;
        android.view.View view2 = m1Var.f362935h;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.height = m1Var.E();
            android.view.View view3 = m1Var.f362935h;
            if (view3 != null) {
                view3.setLayoutParams(layoutParams);
            }
        }
        android.view.View view4 = m1Var.f362934g;
        if (view4 != null) {
            view4.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.b1(m1Var, this.f268873f));
        }
        m1Var.D();
        int i17 = this.f268871d + 1;
        this.f268871d = i17;
        if (i17 < 2 || (view = m1Var.f362934g) == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
