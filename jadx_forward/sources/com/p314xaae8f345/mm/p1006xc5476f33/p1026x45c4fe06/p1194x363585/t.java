package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cf.d f170725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.y f170726e;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.y yVar, cf.d dVar) {
        this.f170726e = yVar;
        this.f170725d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.m(-8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.y yVar = this.f170726e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var = yVar.f170749d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170693a;
        if (!com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j() && !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f()) {
                com.p314xaae8f345.p3210x3857dc.a3.z(true);
                ((th0.a0) ((sh0.e) i95.n0.c(sh0.e.class))).wi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadPageView tried but kernel incompatible");
        } else {
            java.util.Queue queue = (java.util.Queue) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170695c.get(x0Var);
            java.util.Objects.requireNonNull(queue);
            if (!queue.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadPageView skipped cause already cached");
            } else if (x0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadPageView skipped in request[%s]", x0Var);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7();
                n7Var.L0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.b());
                n7Var.A3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadOnProcessCreated);
                n7Var.i4(yVar.f170750e);
                queue.add(n7Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadPageView done");
            }
        }
        this.f170725d.a();
    }
}
