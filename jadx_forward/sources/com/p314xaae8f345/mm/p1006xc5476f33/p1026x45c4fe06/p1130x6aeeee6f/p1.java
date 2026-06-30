package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public final class p1 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final p75.k f165561d;

    /* renamed from: e, reason: collision with root package name */
    public final p75.k f165562e;

    public p1(d95.b0 db6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f165561d = db6.z("SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId LIKE ? AND versionMd5=? ;");
        this.f165562e = db6.z("SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId LIKE ? AND NewMd5=? ;");
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        p75.k kVar;
        long j17;
        long j18;
        java.lang.String rootDir = (java.lang.String) obj;
        com.p314xaae8f345.mm.vfs.x1 dir = (com.p314xaae8f345.mm.vfs.x1) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootDir, "rootDir");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dir, "dir");
        p75.k kVar2 = this.f165561d;
        int i17 = 0;
        if (kVar2 == null || (kVar = this.f165562e) == null) {
            return 0;
        }
        java.lang.String str = dir.f294765b;
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
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(rootDir + '/' + str, false);
        if (s17 != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                if (!x1Var.f294769f) {
                    p75.e0 e0Var = (p75.e0) kVar2;
                    e0Var.m157941x35198eae(1, str2 + "%%");
                    java.lang.String name = x1Var.f294765b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                    e0Var.m157941x35198eae(2, name);
                    try {
                        j17 = ((p75.e0) kVar2).c();
                    } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
                        boolean z17 = e17 instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26958x769a621;
                        j17 = 0;
                    }
                    p75.e0 e0Var2 = (p75.e0) kVar;
                    e0Var2.m157941x35198eae(1, str2 + "%%");
                    e0Var2.m157941x35198eae(2, name);
                    try {
                        j18 = ((p75.e0) kVar).c();
                    } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e18) {
                        boolean z18 = e18 instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26958x769a621;
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
