package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class v0 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.w0 f80277a;

    public v0(com.tencent.mm.plugin.appbrand.jsapi.channels.w0 w0Var) {
        this.f80277a = w0Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsLiveNoticeInfo", "onCallback#failCallback, errCode: " + num);
        kotlin.jvm.internal.o.d(num);
        this.f80277a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsLiveNoticeResult(false, num.intValue()));
    }
}
