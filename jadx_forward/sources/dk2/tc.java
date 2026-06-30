package dk2;

/* loaded from: classes3.dex */
public final class tc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f315662d;

    public tc(java.lang.String str) {
        this.f315662d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        qf2.y1 y1Var;
        dk2.u4 u4Var;
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.o4 o4Var = (mm2.o4) efVar.i(mm2.o4.class);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f315662d, (o4Var == null || (u4Var = o4Var.Z) == null) ? null : u4Var.f315687a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
            if (c14197x319b1b9e != null && (y1Var = (qf2.y1) c14197x319b1b9e.m56798x25fe639c(qf2.y1.class)) != null) {
                y1Var.l7();
                ((mm2.y2) y1Var.m56788xbba4bfc0(mm2.y2.class)).c7();
            }
            no0.g gVar = no0.k.f420262a;
            if (gVar != null) {
                gVar.mo57494xe4011f13();
            }
            mm2.o4 o4Var2 = (mm2.o4) efVar.i(mm2.o4.class);
            if (o4Var2 == null) {
                return;
            }
            o4Var2.Z = null;
        }
    }
}
