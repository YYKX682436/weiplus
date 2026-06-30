package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class c1 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.d1 f80233a;

    public c1(com.tencent.mm.plugin.appbrand.jsapi.channels.d1 d1Var) {
        this.f80233a = d1Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "failedCallback#handleRequest#OpenChannelsRewardedVideoAdTask, errCode: " + num);
        kotlin.jvm.internal.o.d(num);
        this.f80233a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsRewardedVideoAdResult(num.intValue(), null));
    }
}
