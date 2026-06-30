package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 f173254d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 d1Var) {
        this.f173254d = d1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb a27;
        android.view.View mo14662xc2a54588;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 d1Var = this.f173254d;
        if (d1Var.f172922e.mo50262x39e05d35()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = d1Var.f172922e;
            android.widget.FrameLayout mo51313xaf0c0532 = !v5Var.mo50262x39e05d35() ? null : v5Var.mo51313xaf0c0532();
            if (mo51313xaf0c0532 != null) {
                mo51313xaf0c0532.scrollTo(0, 0);
                if (d1Var.f172929o != 0 && (a27 = v5Var.a2()) != null && (mo14662xc2a54588 = a27.mo14662xc2a54588()) != null) {
                    mo14662xc2a54588.scrollBy(mo14662xc2a54588.getScrollX(), -d1Var.f172929o);
                }
                java.lang.Object obj = d1Var.f172921d;
                if (((x.n) obj).f532379f <= 0) {
                    return;
                }
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b1 b1Var : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b1[]) ((x.b) obj).keySet().toArray(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b1[((x.n) obj).f532379f])) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.l) b1Var).f172877a;
                    oVar.f172885e = Integer.MIN_VALUE;
                    oVar.b(3);
                }
            }
        }
    }
}
