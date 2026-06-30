package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes7.dex */
public final class p0 implements com.tencent.mm.plugin.appbrand.jsapi.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f88931d;

    public p0(int i17) {
        this.f88931d = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public final void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        int i17 = this.f88931d;
        sb6.append(i17);
        sb6.append(" onForeground");
        com.tencent.mars.xlog.Log.i("SkylineNativeViewPluginHandler", sb6.toString());
        sh1.g b17 = com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88902a.b(i17);
        if (b17 != null) {
            b17.resume();
            return;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(dm.i4.COL_ID, i17);
        com.tencent.mm.ipcinvoker.d0.d(str, bundle, com.tencent.mm.plugin.appbrand.skyline.nativeview.d0.f88891d.getClass(), com.tencent.mm.plugin.appbrand.skyline.nativeview.e0.f88894d);
    }
}
