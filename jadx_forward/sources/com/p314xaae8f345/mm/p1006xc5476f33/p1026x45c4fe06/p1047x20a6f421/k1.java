package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l1 f159313d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l1 l1Var) {
        this.f159313d = l1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l1 l1Var = this.f159313d;
        if (l1Var.f159315e.getParent() instanceof android.view.View) {
            android.view.View view = (android.view.View) l1Var.f159315e.getParent();
            l1Var.f159315e.f159120d = view.getMeasuredWidth();
            l1Var.f159315e.f159121e = view.getMeasuredHeight();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 c11848x16ccb2c3 = l1Var.f159315e;
            float max = java.lang.Math.max(0.0f, java.lang.Math.min(c11848x16ccb2c3.f159120d - c11848x16ccb2c3.getWidth(), l1Var.f159315e.getX()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 c11848x16ccb2c32 = l1Var.f159315e;
            float max2 = java.lang.Math.max(0.0f, java.lang.Math.min(c11848x16ccb2c32.f159121e - c11848x16ccb2c32.getHeight(), l1Var.f159315e.getY()));
            l1Var.f159315e.setX(max);
            l1Var.f159315e.setY(max2);
            l1Var.f159315e.requestLayout();
        }
    }
}
