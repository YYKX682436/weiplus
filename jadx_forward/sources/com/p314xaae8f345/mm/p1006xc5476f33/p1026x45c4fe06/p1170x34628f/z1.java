package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 f168840d;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var) {
        this.f168840d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = this.f168840d;
        if (y1Var.A1 || y1Var.mo14682x9dee9c37() == null || y1Var.f168806z1 || !"top".equals(y1Var.f168804y0.m179083xa86cd69f()) || !(y1Var.f168804y0.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) y1Var.f168804y0.getLayoutParams();
        al1.b r17 = y1Var.mo14682x9dee9c37().r1();
        int top = r17.getTop() + r17.getMeasuredHeight();
        if (marginLayoutParams.topMargin != top) {
            marginLayoutParams.topMargin = top;
            y1Var.f168804y0.setLayoutParams(marginLayoutParams);
            y1Var.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a2(y1Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = y1Var.mo14682x9dee9c37();
        int measuredHeight = y1Var.f168804y0.getMeasuredHeight();
        if (!mo14682x9dee9c37.G1 && (mo14682x9dee9c37.G.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) mo14682x9dee9c37.G.getLayoutParams();
            if (marginLayoutParams2.bottomMargin != measuredHeight) {
                marginLayoutParams2.bottomMargin = measuredHeight;
                mo14682x9dee9c37.G.setLayoutParams(marginLayoutParams2);
            }
        }
    }
}
