package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 f221148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.pm.PackageInfo f221150f;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 j3Var, java.lang.String str, android.content.pm.PackageInfo packageInfo) {
        this.f221148d = j3Var;
        this.f221149e = str;
        this.f221150f = packageInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.pm.PackageInfo pkgInfo = this.f221150f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pkgInfo, "$pkgInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 j3Var = this.f221148d;
        java.lang.String str = this.f221149e;
        java.lang.String k17 = j3Var.k(str);
        android.content.pm.ApplicationInfo applicationInfo = pkgInfo.applicationInfo;
        if (com.p314xaae8f345.mm.vfs.w6.d(applicationInfo != null ? applicationInfo.sourceDir : null, k17, false) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("patchApkChannel", "apkApplyPatch failed: COPY FILE ERROR ");
            return;
        }
        ((uz.a2) ((vz.y1) i95.n0.c(vz.y1.class))).getClass();
        try {
            e02.j.a(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(k17)), "10000145");
        } catch (e02.d | java.io.IOException unused) {
        }
        vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((uz.a2) y1Var).getClass();
        g02.c cVar = j3Var.f221227e;
        k02.l.b(context, k17, new k02.i(cVar));
        u43.b bVar = new u43.b();
        bVar.f67989xf72be4b6 = false;
        bVar.f67993x55b38832 = str;
        bVar.f67997xf2f12e3c = 2;
        bVar.f67990x867b0399 = k17;
        bVar.f67996x1bb3b54a = java.lang.System.currentTimeMillis();
        j3Var.j(cVar, bVar);
        ((u43.a) i95.n0.c(u43.a.class)).ya(bVar);
    }
}
