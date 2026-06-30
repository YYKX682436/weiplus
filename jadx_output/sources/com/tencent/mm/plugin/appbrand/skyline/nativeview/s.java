package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes7.dex */
public final class s implements sh1.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f88941d;

    /* renamed from: e, reason: collision with root package name */
    public final int f88942e;

    public s(java.lang.String targetProcessName, int i17) {
        kotlin.jvm.internal.o.g(targetProcessName, "targetProcessName");
        this.f88941d = targetProcessName;
        this.f88942e = i17;
    }

    @Override // sh1.f
    public void a(int i17, java.lang.String event, java.lang.String params) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("SkylineNativeViewHandlerClient", "onNativeViewEvent viewId:" + i17 + " event:" + event + " params:" + params);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(dm.i4.COL_ID, this.f88942e);
        bundle.putInt("viewId", i17);
        bundle.putString("event", event);
        bundle.putString("params", params);
        com.tencent.mm.ipcinvoker.d0.d(this.f88941d, bundle, com.tencent.mm.plugin.appbrand.skyline.nativeview.m.f88920d.getClass(), com.tencent.mm.plugin.appbrand.skyline.nativeview.n.f88922d);
    }

    @Override // sh1.f
    public void d(java.lang.String event, java.lang.String data) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // sh1.f
    public void j() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(dm.i4.COL_ID, this.f88942e);
        com.tencent.mm.ipcinvoker.d0.d(this.f88941d, bundle, com.tencent.mm.plugin.appbrand.skyline.nativeview.o.f88928d.getClass(), com.tencent.mm.plugin.appbrand.skyline.nativeview.p.f88930d);
    }

    @Override // sh1.f
    public void l() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(dm.i4.COL_ID, this.f88942e);
        com.tencent.mm.ipcinvoker.d0.d(this.f88941d, bundle, com.tencent.mm.plugin.appbrand.skyline.nativeview.q.f88932d.getClass(), com.tencent.mm.plugin.appbrand.skyline.nativeview.r.f88939d);
    }
}
