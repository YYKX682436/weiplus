package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public final class c1 {

    /* renamed from: b, reason: collision with root package name */
    public mi1.w0 f81395b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f81397d;

    /* renamed from: a, reason: collision with root package name */
    public long f81394a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f81396c = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    public void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LbsBlinkHelper", "startBlinkSubTitle");
        ik1.h0.b(new com.tencent.mm.plugin.appbrand.jsapi.lbs.y0(this, appBrandRuntime));
    }

    public void b(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LbsBlinkHelper", "stopBlinkSubTitle");
        ik1.h0.b(new com.tencent.mm.plugin.appbrand.jsapi.lbs.a1(this));
    }
}
