package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public final class i1 implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final p75.k f83993d;

    public i1(d95.b0 db6) {
        kotlin.jvm.internal.o.g(db6, "db");
        this.f83993d = db6.z("SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId =? AND version=? ;");
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i17;
        long j17;
        java.lang.String appId = (java.lang.String) obj;
        java.lang.String rootDir = (java.lang.String) obj2;
        com.tencent.mm.vfs.x1 dir = (com.tencent.mm.vfs.x1) obj3;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(rootDir, "rootDir");
        kotlin.jvm.internal.o.g(dir, "dir");
        p75.k kVar = this.f83993d;
        int i18 = 0;
        if (kVar == null) {
            return 0;
        }
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(rootDir + '/' + dir.f213232b, false);
        if (s17 != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                try {
                    java.lang.String name = x1Var.f213232b;
                    kotlin.jvm.internal.o.f(name, "name");
                    java.lang.String substring = name.substring(1);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    r26.a.a(10);
                    i17 = java.lang.Integer.parseInt(substring, 10);
                } catch (java.lang.NumberFormatException unused) {
                    i17 = -1;
                }
                if (i17 != -1 && i17 != 0) {
                    int i19 = com.tencent.mm.plugin.appbrand.appcache.w8.f76026a;
                    if (i17 != 0 && i17 != com.tencent.mm.plugin.appbrand.appcache.w8.f76026a) {
                        p75.e0 e0Var = (p75.e0) kVar;
                        e0Var.bindString(1, appId);
                        e0Var.bindLong(2, i17);
                        try {
                            j17 = ((p75.e0) kVar).c();
                        } catch (com.tencent.wcdb.database.SQLiteException e17) {
                            boolean z17 = e17 instanceof com.tencent.wcdb.database.SQLiteDoneException;
                            j17 = 0;
                        }
                        if (j17 <= 0) {
                            x1Var.a();
                            i18++;
                        }
                    }
                }
            }
        }
        return java.lang.Integer.valueOf(i18);
    }
}
