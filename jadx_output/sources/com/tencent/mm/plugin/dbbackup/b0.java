package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class b0 implements com.tencent.mm.plugin.dbbackup.a {

    /* renamed from: a, reason: collision with root package name */
    public int f96826a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f96827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.a f96828c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.comm.MMWakerLock f96829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.e0 f96830e;

    public b0(com.tencent.mm.plugin.dbbackup.e0 e0Var, com.tencent.mm.vfs.r6 r6Var, com.tencent.mm.plugin.dbbackup.a aVar, com.tencent.mars.comm.MMWakerLock mMWakerLock) {
        this.f96830e = e0Var;
        this.f96827b = r6Var;
        this.f96828c = aVar;
        this.f96829d = mMWakerLock;
    }

    @Override // com.tencent.mm.plugin.dbbackup.a
    public void onResult(int i17) {
        int Ni;
        int i18 = this.f96826a;
        if (i18 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "Recovery stage %d result: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        }
        com.tencent.mars.comm.MMWakerLock mMWakerLock = this.f96829d;
        com.tencent.mm.plugin.dbbackup.a aVar = this.f96828c;
        com.tencent.mm.vfs.r6 r6Var = this.f96827b;
        if (i17 == 0) {
            r6Var.l();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(181L, 29L, 1L, true);
            if (aVar != null) {
                aVar.onResult(i17);
            }
            mMWakerLock.unLock();
            return;
        }
        int i19 = -2;
        if (i17 == -2) {
            r6Var.l();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(181L, 3L, 1L, true);
            if (aVar != null) {
                aVar.onResult(i17);
            }
            mMWakerLock.unLock();
            return;
        }
        int i27 = this.f96826a + 1;
        this.f96826a = i27;
        com.tencent.mm.plugin.dbbackup.e0 e0Var = this.f96830e;
        if (i27 != 1) {
            Ni = 0;
            if (i27 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: BACKUP RECOVER", java.lang.Integer.valueOf(i27));
                e0Var.Di(null, this);
            } else {
                if (i27 != 3) {
                    r6Var.l();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(181L, 30L, 1L, true);
                    if (aVar != null) {
                        aVar.onResult(i17);
                    }
                    mMWakerLock.unLock();
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: DUMP", java.lang.Integer.valueOf(i27));
                e0Var.getClass();
                c01.d9.b().getClass();
                gm0.j1.i();
                java.lang.String m17 = gm0.j1.u().m();
                if (m17 != null && !m17.isEmpty()) {
                    com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(m17));
                    if (r6Var2.h()) {
                        d95.f fVar = c01.d9.b().s() instanceof d95.b0 ? ((d95.b0) c01.d9.b().s()).f227610b : null;
                        if (fVar != null) {
                            java.lang.String substring = kk.k.g((wo.w0.g(true) + c01.d9.b().C()).getBytes()).substring(0, 7);
                            long C = r6Var2.C() * 2;
                            long B = com.tencent.mm.sdk.platformtools.t8.B();
                            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "db recover needSize : %d blockSize:%d", java.lang.Long.valueOf(C), java.lang.Long.valueOf(B));
                            if (B >= C) {
                                gm0.j1.e().n();
                                gm0.j1.e().f(new com.tencent.mm.plugin.dbbackup.a0(e0Var, r6Var2, fVar, substring, this));
                                i19 = 0;
                            }
                            Ni = i19;
                        }
                    }
                }
                i19 = -3;
                Ni = i19;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: REPAIR", java.lang.Integer.valueOf(i27));
            Ni = e0Var.Ni(null, this);
        }
        if (Ni != 0) {
            onResult(Ni);
        }
    }
}
