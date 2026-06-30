package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

@j95.b
/* loaded from: classes12.dex */
public class e0 extends i95.w {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 f178374m = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2().m107400xa9cc75b2(1024).m107401x4c1f4da1(1);

    /* renamed from: d, reason: collision with root package name */
    public volatile com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26983xc83ae194 f178375d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26985xa98e2af2 f178376e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9 f178377f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f178378g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f178379h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.text.SimpleDateFormat f178380i = new java.text.SimpleDateFormat("HH:mm:ss.SSS");

    public static void Ai() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "try use tinker patch suicide strategy");
            com.p314xaae8f345.mm.p1006xc5476f33.hp.p1780xcbed6b1f.C16113x4eb7d20f c16113x4eb7d20f = com.p314xaae8f345.mm.p1006xc5476f33.hp.p1780xcbed6b1f.C16113x4eb7d20f.f223936a;
            com.p314xaae8f345.mm.p1006xc5476f33.hp.p1780xcbed6b1f.C16113x4eb7d20f.class.getDeclaredMethod("prepareSuicide", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreDBBackup", e17, "Failed to prepare suicide", new java.lang.Object[0]);
            new w11.f1(context, new com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.d0(context), false);
        }
    }

    public static boolean wi(com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.e0 e0Var, java.lang.String str, long[] jArr) {
        com.p314xaae8f345.mm.vfs.a7 a7Var;
        e0Var.getClass();
        com.p314xaae8f345.mm.vfs.a7 a7Var2 = null;
        try {
            try {
                a7Var = new com.p314xaae8f345.mm.vfs.a7(str + ".bcur");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreDBBackup", e, "Failed to write previous cursor '%s'", str);
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
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) fVar.u();
        g9Var.getClass();
        gm0.j1.i();
        gm0.j1.u().c().w(348167, 1);
        g9Var.tb();
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) fVar.r()).N();
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b1.Di().M4();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = fVar.p();
        p17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_NEW_EMOJI_INT, 0);
        p17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_NEW_PANEL_INT, 0);
        p17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_NEW_SUGGEST_INT, 0);
    }

    public synchronized int Di(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.x(this, c01.d9.b(), str, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B(), aVar);
        this.f178378g = true;
        gm0.j1.e().n();
        gm0.j1.e().f(xVar);
        return 0;
    }

    public synchronized int Ni(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a aVar) {
        c01.f b17 = c01.d9.b();
        if (str == null) {
            b17.getClass();
            gm0.j1.i();
            str = gm0.j1.u().m();
        }
        long B = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B();
        com.p314xaae8f345.mm.vfs.r6 r6Var = str == null ? null : new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (r6Var != null && r6Var.h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "[Repair] inFileSize: %d, diskFreeSpace: %d", java.lang.Long.valueOf(r6Var.C()), java.lang.Long.valueOf(B));
            if (((float) B) < ((float) r6Var.C()) * 1.5f) {
                return -2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.y(this, b17, str, aVar);
            this.f178378g = true;
            gm0.j1.e().n();
            gm0.j1.e().f(yVar);
            return 0;
        }
        return -3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c8, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBRecoveryUtils", "Key information is already backed up.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01cd, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x033b  */
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo204xfac946a6(android.content.Context r27) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.e0.mo204xfac946a6(android.content.Context):void");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        synchronized (this) {
            this.f178378g = false;
            if (this.f178375d != null) {
                this.f178375d.mo82492x3d6f0539();
            }
        }
        q25.b.c("//recover-old", "//recover", "//post-recover", "//backupdb", "//recoverdb", "//repairdb", "//corruptdb", "//iotracedb", "//recover-status", "//dbbusy", "//fixdb", "//dbscanleaf");
    }
}
