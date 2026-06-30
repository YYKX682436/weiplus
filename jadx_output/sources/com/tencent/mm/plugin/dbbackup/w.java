package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.a f96877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f96879f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.database.SQLiteDatabase f96880g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96881h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96882i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96883m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long[] f96884n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long[] f96885o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f96886p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f96887q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96888r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.e0 f96889s;

    public w(com.tencent.mm.plugin.dbbackup.e0 e0Var, com.tencent.mm.plugin.dbbackup.a aVar, java.lang.String str, boolean z17, com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str2, java.lang.String str3, java.lang.String str4, long[] jArr, long[] jArr2, int i17, java.lang.String[] strArr, java.lang.String str5) {
        this.f96889s = e0Var;
        this.f96877d = aVar;
        this.f96878e = str;
        this.f96879f = z17;
        this.f96880g = sQLiteDatabase;
        this.f96881h = str2;
        this.f96882i = str3;
        this.f96883m = str4;
        this.f96884n = jArr;
        this.f96885o = jArr2;
        this.f96886p = i17;
        this.f96887q = strArr;
        this.f96888r = str5;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        long j18;
        int i17;
        int i18;
        char c17;
        java.lang.String str;
        if (!this.f96889s.f96845g) {
            com.tencent.mm.plugin.dbbackup.a aVar = this.f96877d;
            if (aVar != null) {
                aVar.onResult(1);
                return;
            }
            return;
        }
        this.f96889s.f96842d = null;
        try {
            try {
                long nanoTime = java.lang.System.nanoTime();
                byte[] h17 = kk.k.h((wo.w0.g(true) + gm0.j1.b().h()).getBytes());
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f96878e);
                if (!this.f96879f || !r6Var.m()) {
                    boolean save = com.tencent.wcdb.repair.RepairKit.MasterInfo.save(this.f96880g, kk.w.a(this.f96881h, true), h17);
                    com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(this.f96881h);
                    if (save) {
                        r6Var.l();
                        save = r6Var2.L(r6Var);
                    } else {
                        r6Var2.l();
                    }
                    long nanoTime2 = java.lang.System.nanoTime() - nanoTime;
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = save ? "SUCCEEDED" : "FAILED";
                    objArr[1] = java.lang.Float.valueOf(((float) nanoTime2) / 1.0E9f);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "Master table backup %s, elapsed %.3f", objArr);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(181L, save ? 24L : 25L, 1L, false);
                }
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(this.f96882i);
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!a17.f213279f.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (m17.a()) {
                    com.tencent.mm.vfs.x1 m18 = m17.f213266a.m(m17.f213267b);
                    j17 = m18 == null ? 0L : m18.f213233c;
                } else {
                    j17 = 0;
                }
                com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(this.f96883m);
                java.lang.String str3 = a18.f213279f;
                if (str3 != null) {
                    java.lang.String l18 = com.tencent.mm.vfs.e8.l(str3, false, false);
                    if (!a18.f213279f.equals(l18)) {
                        a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m19 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                if (m19.a()) {
                    com.tencent.mm.vfs.x1 m27 = m19.f213266a.m(m19.f213267b);
                    j18 = m27 == null ? 0L : m27.f213233c;
                } else {
                    j18 = 0;
                }
                java.lang.Object[] objArr2 = new java.lang.Object[3];
                java.lang.String str4 = "incremental";
                objArr2[0] = this.f96879f ? "incremental" : "new";
                long[] jArr = this.f96884n;
                objArr2[1] = java.lang.Long.valueOf(jArr != null ? jArr[0] : 0L);
                objArr2[2] = java.lang.Long.valueOf(this.f96885o[0]);
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "Backup started [%s, cursor: %d ~ %d]", objArr2);
                int i19 = this.f96879f ? 10011 : 10000;
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.d(11098, java.lang.Integer.valueOf(i19), java.lang.String.format("%d|%d|%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), this.f96889s.f96847i.format(new java.util.Date())));
                this.f96889s.f96842d = new com.tencent.wcdb.repair.BackupKit(this.f96880g, this.f96883m, h17, this.f96886p, this.f96887q);
                int run = this.f96889s.f96842d.run();
                long nanoTime3 = java.lang.System.nanoTime() - nanoTime;
                com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(this.f96883m);
                long C = r6Var3.C();
                if (run == 0) {
                    com.tencent.mm.plugin.dbbackup.e0.wi(this.f96889s, this.f96882i, this.f96885o);
                    com.tencent.mm.vfs.r6 r6Var4 = new com.tencent.mm.vfs.r6(this.f96888r);
                    r6Var4.l();
                    r6Var3.L(r6Var4);
                    if (this.f96879f) {
                        i17 = 10012;
                        i18 = 19;
                    } else {
                        i17 = 10001;
                        i18 = 16;
                    }
                } else {
                    r6Var3.l();
                    if (run == 1) {
                        if (this.f96879f) {
                            i17 = 10013;
                            i18 = 20;
                        } else {
                            i17 = 10002;
                            i18 = 17;
                        }
                    } else if (this.f96879f) {
                        i17 = 10014;
                        i18 = 21;
                    } else {
                        i17 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL;
                        i18 = 18;
                    }
                }
                java.lang.Object[] objArr3 = new java.lang.Object[3];
                if (!this.f96879f) {
                    str4 = "new";
                }
                objArr3[0] = str4;
                if (run == 0) {
                    str = "succeeded";
                    c17 = 1;
                } else {
                    c17 = 1;
                    str = run == 1 ? "canceled" : com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED;
                }
                objArr3[c17] = str;
                objArr3[2] = java.lang.Float.valueOf(((float) nanoTime3) / 1.0E9f);
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "Database %s backup %s, elapsed %.2f seconds.", objArr3);
                g0Var.idkeyStat(181L, i18, 1L, false);
                g0Var.d(11098, java.lang.Integer.valueOf(i17), java.lang.String.format("%d|%d|%d|%d|%d|%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(C), java.lang.Integer.valueOf(this.f96889s.f96842d.statementCount()), java.lang.Long.valueOf(nanoTime3 / 1000000), this.f96889s.f96847i.format(new java.util.Date())));
                com.tencent.mm.plugin.dbbackup.a aVar2 = this.f96877d;
                if (aVar2 != null) {
                    aVar2.onResult(run);
                }
                this.f96889s.f96842d.release();
                this.f96889s.f96842d = null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                gm0.j1.i();
                sb6.append(gm0.j1.u().d());
                sb6.append("dbback");
                com.tencent.mm.vfs.w6.u(sb6.toString());
                java.lang.String str5 = this.f96878e;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                gm0.j1.i();
                sb7.append(gm0.j1.u().d());
                sb7.append("dbback/EnMicroMsg.db.sm");
                com.tencent.mm.vfs.w6.c(str5, sb7.toString());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreDBBackup", e17, "Failed to start database backup, path: %s", this.f96882i);
                com.tencent.mm.plugin.dbbackup.a aVar3 = this.f96877d;
                if (aVar3 != null) {
                    aVar3.onResult(-1);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(181L, this.f96879f ? 18L : 21L, 1L, false);
                if (this.f96889s.f96842d != null) {
                    this.f96889s.f96842d.release();
                    this.f96889s.f96842d = null;
                }
            }
        } finally {
            if (this.f96889s.f96842d != null) {
                this.f96889s.f96842d.release();
                this.f96889s.f96842d = null;
            }
            this.f96889s.f96845g = false;
        }
    }
}
