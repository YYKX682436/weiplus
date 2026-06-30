package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public class z0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 f236241d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var) {
        this.f236241d = m0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = this.f236241d;
        android.view.View view = m0Var.f235990i;
        view.getLocationOnScreen(iArr);
        int i17 = iArr[1];
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m0Var.f235989h;
        int f17 = i65.a.f(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30860x5b28f31.a8h);
        int h17 = com.p314xaae8f345.mm.ui.bl.h(abstractActivityC21394xb3d2c0cf);
        int a17 = com.p314xaae8f345.mm.ui.bl.a(abstractActivityC21394xb3d2c0cf);
        if (a17 > 0) {
            f17 = a17;
        }
        if (i17 == 0) {
            f17 += h17;
        }
        if (m0Var.i()) {
            f17 = 0;
        }
        if (f17 == view.getPaddingTop()) {
            return true;
        }
        view.setPadding(view.getPaddingLeft(), f17, view.getPaddingRight(), view.getPaddingBottom());
        return false;
    }
}
