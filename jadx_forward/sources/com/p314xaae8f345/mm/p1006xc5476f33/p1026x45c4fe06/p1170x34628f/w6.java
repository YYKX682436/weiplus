package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class w6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x6 f168732d;

    public w6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x6 x6Var) {
        this.f168732d = x6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x6 x6Var = this.f168732d;
        if (x6Var.f168783g.mo50262x39e05d35()) {
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0> G1 = x6Var.f168783g.G1();
            if (G1 == null || G1.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPageView", "showPageActionSheet appId[%s], url[%s], empty list skip", x6Var.f168783g.mo48798x74292566(), x6Var.f168783g.X1());
            } else {
                x6Var.f168783g.I2(G1, x6Var.f168781e, x6Var.f168782f);
            }
        }
    }
}
