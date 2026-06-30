package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f78176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f78177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.k1 f78178f;

    public y0(com.tencent.mm.plugin.appbrand.floatball.k1 k1Var, android.graphics.Bitmap bitmap, float f17) {
        this.f78178f = k1Var;
        this.f78176d = bitmap;
        this.f78177e = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f78178f.getClass();
        android.graphics.Bitmap bitmap = this.f78176d;
        java.lang.String str = null;
        if (bitmap != null && !bitmap.isRecycled()) {
            java.lang.String K = lp0.b.K();
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(K + "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG, true);
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(K);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
                str = new com.tencent.mm.vfs.r6(i17).o();
                if (!com.tencent.mm.vfs.w6.j(str)) {
                    try {
                        com.tencent.mm.sdk.platformtools.x.D0(bitmap, 60, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", e17, "", new java.lang.Object[0]);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "convertSnapshotToThumbPath thumbPath:%s, exist:%b", str, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(str)));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "updateCover path:%s", str);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.floatball.x0(this, str));
    }
}
