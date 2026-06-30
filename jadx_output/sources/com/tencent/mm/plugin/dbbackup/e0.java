package com.tencent.mm.plugin.dbbackup;

@j95.b
/* loaded from: classes12.dex */
public class e0 extends i95.w {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wcdb.database.SQLiteCipherSpec f96841m = new com.tencent.wcdb.database.SQLiteCipherSpec().setPageSize(1024).setSQLCipherVersion(1);

    /* renamed from: d, reason: collision with root package name */
    public volatile com.tencent.wcdb.repair.BackupKit f96842d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.tencent.wcdb.repair.RecoverKit f96843e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.tencent.wcdb.repair.RepairKit f96844f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f96845g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f96846h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.text.SimpleDateFormat f96847i = new java.text.SimpleDateFormat("HH:mm:ss.SSS");

    public static void Ai() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "try use tinker patch suicide strategy");
            com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService tinkerPatchResultService = com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.f142403a;
            com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.class.getDeclaredMethod("prepareSuicide", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreDBBackup", e17, "Failed to prepare suicide", new java.lang.Object[0]);
            new w11.f1(context, new com.tencent.mm.plugin.dbbackup.d0(context), false);
        }
    }

    public static boolean wi(com.tencent.mm.plugin.dbbackup.e0 e0Var, java.lang.String str, long[] jArr) {
        com.tencent.mm.vfs.a7 a7Var;
        e0Var.getClass();
        com.tencent.mm.vfs.a7 a7Var2 = null;
        try {
            try {
                a7Var = new com.tencent.mm.vfs.a7(str + ".bcur");
            } catch (java.io.IOException e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            a7Var = a7Var2;
        }
        try {
            for (long j17 : jArr) {
                a7Var.write(java.lang.Long.toString(j17) + "\n");
            }
            try {
                a7Var.close();
            } catch (java.io.IOException unused) {
            }
            return true;
        } catch (java.io.IOException e18) {
            e = e18;
            a7Var2 = a7Var;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreDBBackup", e, "Failed to write previous cursor '%s'", str);
            if (a7Var2 == null) {
                return false;
            }
            try {
                a7Var2.close();
                return false;
            } catch (java.io.IOException unused2) {
                return false;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (a7Var != null) {
                try {
                    a7Var.close();
                } catch (java.io.IOException unused3) {
                }
            }
            throw th;
        }
    }

    public void Bi(c01.f fVar) {
        com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) fVar.u();
        g9Var.getClass();
        gm0.j1.i();
        gm0.j1.u().c().w(348167, 1);
        g9Var.tb();
        ((com.tencent.mm.storage.m4) fVar.r()).N();
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b1.Di().M4();
        com.tencent.mm.storage.n3 p17 = fVar.p();
        p17.x(com.tencent.mm.storage.u3.USERINFO_EMOJI_NEW_EMOJI_INT, 0);
        p17.x(com.tencent.mm.storage.u3.USERINFO_EMOJI_NEW_PANEL_INT, 0);
        p17.x(com.tencent.mm.storage.u3.USERINFO_EMOJI_NEW_SUGGEST_INT, 0);
    }

    public synchronized int Di(java.lang.String str, com.tencent.mm.plugin.dbbackup.a aVar) {
        com.tencent.mm.plugin.dbbackup.x xVar = new com.tencent.mm.plugin.dbbackup.x(this, c01.d9.b(), str, com.tencent.mm.sdk.platformtools.t8.B(), aVar);
        this.f96845g = true;
        gm0.j1.e().n();
        gm0.j1.e().f(xVar);
        return 0;
    }

    public synchronized int Ni(java.lang.String str, com.tencent.mm.plugin.dbbackup.a aVar) {
        c01.f b17 = c01.d9.b();
        if (str == null) {
            b17.getClass();
            gm0.j1.i();
            str = gm0.j1.u().m();
        }
        long B = com.tencent.mm.sdk.platformtools.t8.B();
        com.tencent.mm.vfs.r6 r6Var = str == null ? null : new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (r6Var != null && r6Var.h()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "[Repair] inFileSize: %d, diskFreeSpace: %d", java.lang.Long.valueOf(r6Var.C()), java.lang.Long.valueOf(B));
            if (((float) B) < ((float) r6Var.C()) * 1.5f) {
                return -2;
            }
            com.tencent.mm.plugin.dbbackup.y yVar = new com.tencent.mm.plugin.dbbackup.y(this, b17, str, aVar);
            this.f96845g = true;
            gm0.j1.e().n();
            gm0.j1.e().f(yVar);
            return 0;
        }
        return -3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c8, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.DBRecoveryUtils", "Key information is already backed up.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01cd, code lost:
    
        com.tencent.mm.sdk.platformtools.t8.v1(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x033b  */
    @Override // i95.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAccountInitialized(android.content.Context r27) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.dbbackup.e0.onAccountInitialized(android.content.Context):void");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        synchronized (this) {
            this.f96845g = false;
            if (this.f96842d != null) {
                this.f96842d.onCancel();
            }
        }
        q25.b.c("//recover-old", "//recover", "//post-recover", "//backupdb", "//recoverdb", "//repairdb", "//corruptdb", "//iotracedb", "//recover-status", "//dbbusy", "//fixdb", "//dbscanleaf");
    }
}
