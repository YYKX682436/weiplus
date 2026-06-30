package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f159709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f159710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 f159711f;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 k1Var, android.graphics.Bitmap bitmap, float f17) {
        this.f159711f = k1Var;
        this.f159709d = bitmap;
        this.f159710e = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f159711f.getClass();
        android.graphics.Bitmap bitmap = this.f159709d;
        java.lang.String str = null;
        if (bitmap != null && !bitmap.isRecycled()) {
            java.lang.String K = lp0.b.K();
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(K + "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG, true);
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(K);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
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
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
                str = new com.p314xaae8f345.mm.vfs.r6(i17).o();
                if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 60, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", e17, "", new java.lang.Object[0]);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "convertSnapshotToThumbPath thumbPath:%s, exist:%b", str, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(str)));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "updateCover path:%s", str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.x0(this, str));
    }
}
