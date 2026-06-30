package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class fd implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f265717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f265718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld f265719f;

    public fd(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar, android.view.View view, float f17) {
        this.f265719f = ldVar;
        this.f265717d = view;
        this.f265718e = f17;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f265717d;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.ViewParent parent = view.getParent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = this.f265719f;
        ldVar.s(this.f265718e + ((parent == null || view.getVisibility() == 8) ? 0.0f : view.getMeasuredHeight() / ldVar.f267186d.m81401x1f106092()));
    }
}
