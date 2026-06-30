package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 f167924d;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var) {
        this.f167924d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = this.f167924d;
        if (n3.x0.b(y1Var) && (y1Var.f168804y0.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) && ((android.view.ViewGroup.MarginLayoutParams) y1Var.f168804y0.getLayoutParams()).topMargin != y1Var.f168804y0.getTop()) {
            y1Var.f168804y0.requestLayout();
        }
    }
}
