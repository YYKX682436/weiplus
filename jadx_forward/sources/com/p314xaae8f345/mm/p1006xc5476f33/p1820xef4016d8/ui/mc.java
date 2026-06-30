package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class mc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f228709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f228710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f228711f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f228712g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f228713h;

    public mc(com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223, android.view.View view, boolean z17, android.widget.EditText editText, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13) {
        this.f228709d = c22894x55bf3223;
        this.f228710e = view;
        this.f228711f = z17;
        this.f228712g = editText;
        this.f228713h = activityC16373x8a110f13;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f228709d;
        android.animation.ObjectAnimator objectAnimator = c22894x55bf3223.F;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        android.animation.ObjectAnimator objectAnimator2 = c22894x55bf3223.G;
        if (objectAnimator2 != null) {
            objectAnimator2.end();
        }
        boolean isShown = c22894x55bf3223.isShown();
        android.view.View view = this.f228710e;
        if (!isShown && view.isShown()) {
            c22894x55bf3223.m82984x1c238f87(this.f228711f);
            c22894x55bf3223.u();
        }
        c22894x55bf3223.m82983xce4186ff(this.f228712g);
        java.lang.Object systemService = this.f228713h.mo55332x76847179().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
