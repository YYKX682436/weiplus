package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes7.dex */
public final class o0 implements com.tencent.mm.plugin.appbrand.jsapi.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f88929d;

    public o0(int i17) {
        this.f88929d = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public final void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        int i17 = this.f88929d;
        sb6.append(i17);
        sb6.append(" onBackground");
        com.tencent.mars.xlog.Log.i("SkylineNativeViewPluginHandler", sb6.toString());
        sh1.g b17 = com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88902a.b(i17);
        if (b17 != null) {
            b17.pause();
            return;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(dm.i4.COL_ID, i17);
        com.tencent.mm.ipcinvoker.d0.d(str, bundle, com.tencent.mm.plugin.appbrand.skyline.nativeview.z.f88958d.getClass(), com.tencent.mm.plugin.appbrand.skyline.nativeview.a0.f88887d);
    }
}
