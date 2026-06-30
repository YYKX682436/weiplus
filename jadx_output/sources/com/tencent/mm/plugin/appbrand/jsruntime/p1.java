package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public final class p1 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final p75.k f84028d;

    /* renamed from: e, reason: collision with root package name */
    public final p75.k f84029e;

    public p1(d95.b0 db6) {
        kotlin.jvm.internal.o.g(db6, "db");
        this.f84028d = db6.z("SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId LIKE ? AND versionMd5=? ;");
        this.f84029e = db6.z("SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId LIKE ? AND NewMd5=? ;");
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        p75.k kVar;
        long j17;
        long j18;
        java.lang.String rootDir = (java.lang.String) obj;
        com.tencent.mm.vfs.x1 dir = (com.tencent.mm.vfs.x1) obj2;
        kotlin.jvm.internal.o.g(rootDir, "rootDir");
        kotlin.jvm.internal.o.g(dir, "dir");
        p75.k kVar2 = this.f84028d;
        int i17 = 0;
        if (kVar2 == null || (kVar = this.f84029e) == null) {
            return 0;
        }
        java.lang.String str = dir.f213232b;
        java.lang.String[] p17 = u46.l.p(str, '_');
        java.lang.String str2 = null;
        if (p17 != null) {
            if (!(p17.length == 0)) {
                str2 = p17[p17.length - 1];
            }
        }
        if (str2 == null || str2.length() == 0) {
            return 0;
        }
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(rootDir + '/' + str, false);
        if (s17 != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                if (!x1Var.f213236f) {
                    p75.e0 e0Var = (p75.e0) kVar2;
                    e0Var.bindString(1, str2 + "%%");
                    java.lang.String name = x1Var.f213232b;
                    kotlin.jvm.internal.o.f(name, "name");
                    e0Var.bindString(2, name);
                    try {
                        j17 = ((p75.e0) kVar2).c();
                    } catch (com.tencent.wcdb.database.SQLiteException e17) {
                        boolean z17 = e17 instanceof com.tencent.wcdb.database.SQLiteDoneException;
                        j17 = 0;
                    }
                    p75.e0 e0Var2 = (p75.e0) kVar;
                    e0Var2.bindString(1, str2 + "%%");
                    e0Var2.bindString(2, name);
                    try {
                        j18 = ((p75.e0) kVar).c();
                    } catch (com.tencent.wcdb.database.SQLiteException e18) {
                        boolean z18 = e18 instanceof com.tencent.wcdb.database.SQLiteDoneException;
                        j18 = 0;
                    }
                    if (j17 + j18 <= 0) {
                        x1Var.a();
                        i17++;
                    }
                }
            }
        }
        return java.lang.Integer.valueOf(i17);
    }
}
