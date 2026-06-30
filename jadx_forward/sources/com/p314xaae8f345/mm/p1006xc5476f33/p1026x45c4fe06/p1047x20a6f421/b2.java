package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 f159168d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var) {
        this.f159168d = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var = this.f159168d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 c11848x16ccb2c3 = l2Var.f159318f;
        int width = l2Var.getWidth();
        int height = l2Var.getHeight();
        c11848x16ccb2c3.getClass();
        c11848x16ccb2c3.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        c11848x16ccb2c3.f159120d = width;
        c11848x16ccb2c3.f159121e = height;
        c11848x16ccb2c3.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.j1(c11848x16ccb2c3));
        l2Var.addView(l2Var.f159318f);
    }
}
