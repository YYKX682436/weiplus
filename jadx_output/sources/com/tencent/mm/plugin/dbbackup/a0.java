package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f96793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d95.f f96794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96795f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.a f96796g;

    public a0(com.tencent.mm.plugin.dbbackup.e0 e0Var, com.tencent.mm.vfs.r6 r6Var, d95.f fVar, java.lang.String str, com.tencent.mm.plugin.dbbackup.a aVar) {
        this.f96793d = r6Var;
        this.f96794e = fVar;
        this.f96795f = str;
        this.f96796g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        try {
            java.lang.Thread.sleep(200L);
        } catch (java.lang.InterruptedException unused) {
        }
        java.lang.String h17 = gm0.j1.u().h();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(h17);
        com.tencent.mm.vfs.r6 r6Var = this.f96793d;
        sb6.append(r6Var.getName().replace(".db", "temp.db"));
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "temp db path is %s", sb7);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(sb7);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 M = r6Var.M();
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (M.a() && m17.a()) {
            try {
                m17.f213266a.t(m17.f213267b, M.f213266a, M.f213267b);
            } catch (java.io.IOException unused2) {
            }
        }
        java.util.List asList = java.util.Arrays.asList("getcontactinfo", "contact", "contact_ext", "ContactCmdBuf", "rcontact", "img_flag", "userinfo");
        int[] iArr = new int[1];
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean doRecoveryDb = com.tencent.wcdb.repair.DBDumpUtil.doRecoveryDb(this.f96794e.f227678a, sb7, this.f96795f, h17 + "sqlTemp.sql", asList, null, new com.tencent.mm.plugin.dbbackup.z(this, iArr), true);
        if (doRecoveryDb) {
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).getClass();
            gm0.j1.i();
            gm0.j1.u().c().w(348167, 1);
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).N();
            c01.d9.b().u().getClass();
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).tb();
            i17 = 12;
        } else {
            i17 = 15;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(181L, i17, 1L, true);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "execute %d sql and last %d", java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(currentTimeMillis2));
        g0Var.d(11224, java.lang.Integer.valueOf(doRecoveryDb ? 1 : 0), iArr, java.lang.Long.valueOf(currentTimeMillis2));
        gm0.j1.e().o();
        com.tencent.mm.plugin.dbbackup.a aVar = this.f96796g;
        if (aVar != null) {
            aVar.onResult(doRecoveryDb ? 0 : -1);
        }
    }
}
