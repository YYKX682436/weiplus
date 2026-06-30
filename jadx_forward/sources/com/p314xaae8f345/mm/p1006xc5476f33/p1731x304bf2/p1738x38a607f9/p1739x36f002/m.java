package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002;

/* loaded from: classes8.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f220952a = lp0.b.e() + "game/";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f220953b = lp0.b.D() + "game/";

    public static boolean a(com.p314xaae8f345.mm.vfs.r6 r6Var, long j17) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        if (r6Var == null || !r6Var.m()) {
            return false;
        }
        if (r6Var.A()) {
            if (java.lang.System.currentTimeMillis() - r6Var.B() <= j17) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFileManager", "remove file:%s, lifetime:%d", r6Var.o(), java.lang.Long.valueOf(j17));
            r6Var.l();
            return true;
        }
        if (!r6Var.y() || (G = r6Var.G()) == null) {
            return true;
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            a(r6Var2, j17);
        }
        return true;
    }

    public static java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l lVar) {
        return f220953b + lVar.name() + "/";
    }

    public static java.lang.String c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l lVar) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String e17 = com.p314xaae8f345.mm.vfs.e8.e(com.p314xaae8f345.mm.vfs.a3.f294314a.c(), "account");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            str = f220953b;
        } else {
            str = lp0.b.D() + e17 + "/game/";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFileManager", "getGameSdcardRootPathByUin, validPath:%s", str);
        sb6.append(str);
        sb6.append(lVar.name());
        sb6.append("/");
        return sb6.toString();
    }

    public static java.lang.String d() {
        java.lang.String str;
        java.lang.String e17 = com.p314xaae8f345.mm.vfs.e8.e(com.p314xaae8f345.mm.vfs.a3.f294314a.c(), "account");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            str = f220952a;
        } else {
            str = lp0.b.e() + e17 + "/game/";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFileManager", "getGameDataRootPathByUin, validPath:%s", str);
        return str;
    }

    public static java.lang.String e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l lVar) {
        return d() + lVar.name() + "/";
    }

    public static void f(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFileManager", "delete file:%s, ret:%b", str, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.h(str)));
    }
}
