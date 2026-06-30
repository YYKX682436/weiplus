package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes7.dex */
public final class m0 implements kf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88921a;

    public m0(int i17) {
        this.f88921a = i17;
    }

    public void a(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.skyline.nativeview.k0 k0Var = com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88902a;
        int i19 = this.f88921a;
        sh1.g b17 = k0Var.b(i19);
        if (b17 != null) {
            b17.a(i17, i18);
            return;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(dm.i4.COL_ID, i19);
        bundle.putInt("width", i17);
        bundle.putInt("height", i18);
        com.tencent.mm.ipcinvoker.d0.d(str, bundle, com.tencent.mm.plugin.appbrand.skyline.nativeview.i0.f88897d.getClass(), com.tencent.mm.plugin.appbrand.skyline.nativeview.j0.f88899d);
    }
}
