package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* loaded from: classes7.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 f158525a;

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t0 f158526b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f158527c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f158528d;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f158527c = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1128x6f7d720f.p1129x32b0ec.C12295xd16fc59e>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor$1
            {
                this.f39173x3fe91575 = 15624729;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1128x6f7d720f.p1129x32b0ec.C12295xd16fc59e c12295xd16fc59e) {
                xf1.a aVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0;
                boolean z17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1128x6f7d720f.p1129x32b0ec.C12295xd16fc59e c12295xd16fc59e2 = c12295xd16fc59e;
                if (c12295xd16fc59e2 != null && (aVar = c12295xd16fc59e2.f165456g) != null && (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(aVar.f535755a)) != null && (C0 = b17.C0()) != null) {
                    xf1.a aVar2 = c12295xd16fc59e2.f165456g;
                    int i17 = aVar2.f535757c;
                    int i18 = aVar2.f535756b;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158525a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "interceptBackgroundRunningOperationEvent4NotificationLogic, operation: %d, usage: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    if ((i18 == 8 || i18 == 64) && i17 == 2) {
                        tf1.f fVar = (tf1.f) b17.k(tf1.f.class);
                        if (fVar == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "interceptBackgroundRunningOperationEvent4NotificationLogic, audioOfVideoBackgroundPlayManager is null");
                        } else if (fVar.f500397m) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "interceptBackgroundRunningOperationEvent4NotificationLogic, audioOfVideoBackgroundPlayManager isBackgroundAudioPlayPaused");
                            z17 = true;
                            xf1.a aVar3 = c12295xd16fc59e2.f165456g;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.a(C0, aVar3.f535757c, aVar3.f535756b, z17);
                        }
                    }
                    z17 = false;
                    xf1.a aVar32 = c12295xd16fc59e2.f165456g;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.a(C0, aVar32.f535757c, aVar32.f535756b, z17);
                }
                return false;
            }
        };
        f158528d = new java.util.HashSet();
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, int i18, boolean z17) {
        if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85 c11738x6e2c0d85 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85();
            c11738x6e2c0d85.f158465d = e9Var.mo48798x74292566();
            c11738x6e2c0d85.f158466e = e9Var.t3().f156338p.f158814g;
            c11738x6e2c0d85.f158467f = i18;
            c11738x6e2c0d85.f158468g = i17;
            c11738x6e2c0d85.f158469h = e9Var.mo50352x76847179().getClass().getName();
            c11738x6e2c0d85.f158473o = bm5.f1.a();
            c11738x6e2c0d85.f158476r = z17;
            c11738x6e2c0d85.f158474p = ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) e9Var.t3().u0()).X;
            if (i18 == 8 || i18 == 64) {
                c11738x6e2c0d85.f158475q = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd.class.getName();
            }
            if ((e9Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) && e9Var.t3() != null && e9Var.t3().u0() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) e9Var.t3().u0();
                c11738x6e2c0d85.f158470i = c11809xbc286be4.f158812e;
                c11738x6e2c0d85.f158471m = c11809xbc286be4.f158813f;
                c11738x6e2c0d85.f158472n = c11809xbc286be4.f128811x;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class))).Di(c11738x6e2c0d85);
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "sendRemoveLocationUsageOperation, runtime:%s", o6Var.f156336n);
        if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85 c11738x6e2c0d85 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85();
            c11738x6e2c0d85.f158465d = o6Var.f156336n;
            c11738x6e2c0d85.f158466e = o6Var.f156338p.f158814g;
            c11738x6e2c0d85.f158467f = 2;
            c11738x6e2c0d85.f158468g = 2;
            c11738x6e2c0d85.f158474p = o6Var.u0().X;
            if (o6Var.r0() != null) {
                c11738x6e2c0d85.f158469h = o6Var.r0().getClass().getName();
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class))).Di(c11738x6e2c0d85);
        }
        java.lang.String str = o6Var.f156336n;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11911xbdcd860(false));
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11737xeb4bc1f3(str, false), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.r.class, null);
        }
    }
}
