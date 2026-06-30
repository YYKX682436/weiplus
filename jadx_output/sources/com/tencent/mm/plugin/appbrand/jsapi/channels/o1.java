package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class o1 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.q1 f80260a;

    public o1(com.tencent.mm.plugin.appbrand.jsapi.channels.q1 q1Var) {
        this.f80260a = q1Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiReserveChannelsLive", "onCallback#successCallback, state: " + num);
        kotlin.jvm.internal.o.d(num);
        this.f80260a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.channels.ReserveChannelsLiveResult(true, num.intValue()));
    }
}
