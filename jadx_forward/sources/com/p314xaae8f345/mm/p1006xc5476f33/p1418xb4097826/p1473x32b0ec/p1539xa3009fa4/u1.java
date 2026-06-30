package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes9.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 f198976d;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 e2Var) {
        this.f198976d = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 e2Var = this.f198976d;
        android.view.View view = e2Var.f198591f;
        if (view != null) {
            view.getHitRect(rect);
        }
        rect.inset(rect.width() * (-2), -rect.width());
        android.view.View view2 = e2Var.f198591f;
        android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
        android.view.View view3 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view3 == null) {
            return;
        }
        view3.setTouchDelegate(new android.view.TouchDelegate(rect, e2Var.f198591f));
    }
}
