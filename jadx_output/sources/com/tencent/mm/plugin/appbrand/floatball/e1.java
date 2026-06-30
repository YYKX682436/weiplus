package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class e1 implements com.tencent.mm.plugin.appbrand.utils.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.k1 f78087a;

    public e1(com.tencent.mm.plugin.appbrand.floatball.k1 k1Var) {
        this.f78087a = k1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c0
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "loadAlbum, localPath: " + str);
        android.graphics.Bitmap i07 = com.tencent.mm.sdk.platformtools.x.i0(str);
        if (i07 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "loadAlbum, albumBitmap is null");
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.floatball.d1(this));
        } else {
            com.tencent.mm.plugin.appbrand.floatball.k1 k1Var = this.f78087a;
            k1Var.D0(i07, k1Var.f78110y.j());
        }
    }
}
