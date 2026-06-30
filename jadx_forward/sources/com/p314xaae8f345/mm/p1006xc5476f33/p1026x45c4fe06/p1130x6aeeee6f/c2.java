package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c2 f165515a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c2();

    public static final void a() {
        int i17;
        int i18;
        x51.k0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ri();
        if (Ri == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.a2 a2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.a2(Ri);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.z1 z1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.z1(Ri);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z18 = false;
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d2.a(), false);
        if (s17 != null) {
            int i19 = 0;
            i18 = 0;
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                if (x1Var.f294769f) {
                    java.lang.String name = x1Var.f294765b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                    yz5.q qVar = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "@LibraryAppId") ? z1Var : null;
                    if (qVar == null) {
                        qVar = a2Var;
                    }
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d2.a() + '/' + name;
                    java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s18 = com.p314xaae8f345.mm.vfs.w6.s(str, z18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c2 c2Var = f165515a;
                    if (s18 != null) {
                        for (com.p314xaae8f345.mm.vfs.x1 x1Var2 : s18) {
                            if (x1Var2.f294769f) {
                                i19++;
                                i18 += ((java.lang.Number) qVar.mo147xb9724478(name, str, x1Var2)).intValue();
                                if (c2Var.b(x1Var2, str)) {
                                    x1Var2.a();
                                }
                            }
                        }
                    }
                    java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d2.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "retrieve(...)");
                    if (c2Var.b(x1Var, a17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.V8WasmCacheCleanupLogic", "delete appID %s relPath %s", name, x1Var.f294764a);
                        x1Var.a();
                    }
                }
                z18 = false;
            }
            i17 = i19;
        } else {
            i17 = 0;
            i18 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.V8WasmCacheCleanupLogic", "doCleanup() cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms, dirVisitedCount:" + i17 + ", fileDeletedCount:" + i18);
    }

    public final boolean b(com.p314xaae8f345.mm.vfs.x1 x1Var, java.lang.String str) {
        if (!x1Var.f294769f) {
            return false;
        }
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(str + '/' + x1Var.f294765b, false);
        java.util.List S0 = s17 != null ? kz5.n0.S0(s17) : null;
        return S0 == null || S0.isEmpty();
    }
}
