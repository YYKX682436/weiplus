package r53;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r53.c0 f474179a = new r53.c0();

    public static final void a(r53.c0 c0Var, java.lang.String str) {
        c0Var.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        android.content.pm.PackageInfo a17 = ik1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LocalGameReportUtil", "gamelog.report32418 pkgName = " + str + "  pkgInfo is null can not get it");
            return;
        }
        android.content.pm.ApplicationInfo applicationInfo = a17.applicationInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(applicationInfo);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(applicationInfo.sourceDir);
        if (r6Var.m()) {
            ((uz.a2) ((vz.y1) i95.n0.c(vz.y1.class))).getClass();
            b(str, e02.k.a(r6Var));
        } else {
            b(str, null);
        }
        p43.e eVar = new p43.e();
        eVar.f68053x55b38832 = str;
        eVar.f68052xac7571e7 = java.lang.System.currentTimeMillis();
        p43.h hVar = (p43.h) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).aj();
        l75.k0 k0Var = hVar.f433300d;
        long b17 = k0Var.b();
        try {
            hVar.f433301e.d(eVar);
            k0Var.w(java.lang.Long.valueOf(b17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertOrUpdate patchInfo =");
            sb6.append("pkgName: " + eVar.f68053x55b38832 + "; lastReportTimeStamp : " + eVar.f68052xac7571e7);
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("LocalGameReportInfoDaoImpl", sb6.toString());
        } catch (java.lang.Throwable th6) {
            k0Var.w(java.lang.Long.valueOf(b17));
            throw th6;
        }
    }

    public static final void b(java.lang.String pkgName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgName, "pkgName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocalGameReportUtil", "gamelog.report32418 pkgName = " + pkgName + ", channel = " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(32418, 1, pkgName, str);
    }
}
