package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes5.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 f221202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221204f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221205g;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 j3Var, java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.f221202d = j3Var;
        this.f221203e = str;
        this.f221204f = str2;
        this.f221205g = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e02.h hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 j3Var = this.f221202d;
        java.lang.String str = this.f221203e;
        java.lang.String str2 = this.f221204f;
        android.content.Context context = this.f221205g;
        j3Var.getClass();
        java.lang.String str3 = r26.i0.t(str2, ".", "", false) + java.lang.System.currentTimeMillis() + ".patch";
        java.lang.String str4 = com.p314xaae8f345.mm.vfs.q7.c("gameDownload") + "/gameApk/patch/";
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str4);
        java.lang.String str5 = a17.f294812f;
        if (str5 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
            if (!str5.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        java.lang.String str6 = str4 + str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("patchApkChannel", "gamelog.jsapi, gamedownload, download patch path  = " + str6);
        vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.e3(str2, j3Var, context, str6);
        uz.a2 a2Var = (uz.a2) y1Var;
        a2Var.getClass();
        synchronized (e02.h.class) {
            if (e02.h.f327386c == null) {
                e02.h.f327386c = new e02.h();
            }
            hVar = e02.h.f327386c;
        }
        hVar.a(str, str6, 0, new uz.z1(a2Var, e3Var));
    }
}
