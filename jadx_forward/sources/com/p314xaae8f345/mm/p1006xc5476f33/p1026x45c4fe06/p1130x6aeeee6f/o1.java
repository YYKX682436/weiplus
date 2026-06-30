package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public final class o1 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final p75.k f165556d;

    public o1(d95.b0 db6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f165556d = db6.z("SELECT COUNT(*) FROM AppBrandWxaPkgManifestRecord WHERE appId =? AND version=? ;");
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        long j17;
        java.lang.String rootDir = (java.lang.String) obj;
        com.p314xaae8f345.mm.vfs.x1 dir = (com.p314xaae8f345.mm.vfs.x1) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootDir, "rootDir");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dir, "dir");
        p75.k kVar = this.f165556d;
        int i18 = 0;
        if (kVar == null) {
            return 0;
        }
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(rootDir + '/' + dir.f294765b, false);
        if (s17 != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                try {
                    java.lang.String name = x1Var.f294765b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                    java.lang.String substring = name.substring(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    r26.a.a(10);
                    i17 = java.lang.Integer.parseInt(substring, 10);
                } catch (java.lang.NumberFormatException unused) {
                    i17 = -1;
                }
                if (i17 != -1 && i17 != 0) {
                    int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a;
                    if (i17 != 0 && i17 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a) {
                        p75.e0 e0Var = (p75.e0) kVar;
                        e0Var.m157941x35198eae(1, "@LibraryAppId");
                        e0Var.m157940x37fbf859(2, i17);
                        try {
                            j17 = ((p75.e0) kVar).c();
                        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
                            boolean z17 = e17 instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26958x769a621;
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
