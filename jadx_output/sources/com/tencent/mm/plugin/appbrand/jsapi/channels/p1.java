package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class p1 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.q1 f80263a;

    public p1(com.tencent.mm.plugin.appbrand.jsapi.channels.q1 q1Var) {
        this.f80263a = q1Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiReserveChannelsLive", "onCallback#failCallback, errCode: " + num);
        kotlin.jvm.internal.o.d(num);
        this.f80263a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.channels.ReserveChannelsLiveResult(false, num.intValue()));
    }
}
