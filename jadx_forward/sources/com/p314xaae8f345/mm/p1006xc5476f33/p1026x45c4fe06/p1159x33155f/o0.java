package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f167519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f167520e;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p0 p0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        this.f167519d = o6Var;
        this.f167520e = n7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        rh1.c V2 = this.f167519d.V2();
        if (V2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MenuDelegate_Star", "performItemClick, no float ball helper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class));
        if (i1Var.Di()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = V2.f381610a;
            boolean z17 = c16601x7ed0e40c != null && i1Var.cj(c16601x7ed0e40c);
            V2.B(!z17);
            i17 = z17 ? 60 : 59;
        } else {
            V2.B(true);
            i17 = 29;
        }
        int i18 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f167520e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(n7Var.mo48798x74292566(), n7Var.X1(), i18, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
    }
}
