package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public final class j1 implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final p75.k f83995d;

    /* renamed from: e, reason: collision with root package name */
    public final p75.k f83996e;

    public j1(d95.b0 db6) {
        kotlin.jvm.internal.o.g(db6, "db");
        this.f83995d = db6.z("SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId LIKE ? AND versionMd5=? ;");
        this.f83996e = db6.z("SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId LIKE ? AND NewMd5=? ;");
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p75.k kVar;
        long j17;
        long j18;
        java.lang.String appId = (java.lang.String) obj;
        java.lang.String rootDir = (java.lang.String) obj2;
        com.tencent.mm.vfs.x1 dir = (com.tencent.mm.vfs.x1) obj3;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(rootDir, "rootDir");
        kotlin.jvm.internal.o.g(dir, "dir");
        p75.k kVar2 = this.f83995d;
        int i17 = 0;
        if (kVar2 == null || (kVar = this.f83996e) == null) {
            return 0;
        }
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(rootDir + '/' + dir.f213232b, false);
        if (s17 != null) {
            int i18 = 0;
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                if (!x1Var.f213236f) {
                    java.lang.String name = x1Var.f213232b;
                    kotlin.jvm.internal.o.f(name, "name");
                    if (r26.n0.B(name, ".", false)) {
                        name = (java.lang.String) r26.n0.f0(name, new java.lang.String[]{"."}, false, 0, 6, null).get(0);
                    }
                    p75.e0 e0Var = (p75.e0) kVar2;
                    e0Var.bindString(1, appId.concat("%%"));
                    e0Var.bindString(2, name);
                    try {
                        j17 = ((p75.e0) kVar2).c();
                    } catch (com.tencent.wcdb.database.SQLiteException e17) {
                        boolean z17 = e17 instanceof com.tencent.wcdb.database.SQLiteDoneException;
                        j17 = 0;
                    }
                    p75.e0 e0Var2 = (p75.e0) kVar;
                    e0Var2.bindString(1, appId.concat("%%"));
                    e0Var2.bindString(2, name);
                    try {
                        j18 = ((p75.e0) kVar).c();
                    } catch (com.tencent.wcdb.database.SQLiteException e18) {
                        boolean z18 = e18 instanceof com.tencent.wcdb.database.SQLiteDoneException;
                        j18 = 0;
                    }
                    if (j17 + j18 <= 0) {
                        x1Var.a();
                        i18++;
                    }
                }
            }
            i17 = i18;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
