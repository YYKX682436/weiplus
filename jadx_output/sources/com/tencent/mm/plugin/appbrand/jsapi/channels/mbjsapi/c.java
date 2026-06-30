package com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi;

/* loaded from: classes7.dex */
public final class c implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.d f80252a;

    public c(com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.d dVar) {
        this.f80252a = dVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("JsApiOpenChannelsActivityMB", "onCallback, ret:" + obj);
        jz5.l lVar = obj instanceof jz5.l ? (jz5.l) obj : null;
        com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.d dVar = this.f80252a;
        if (lVar != null) {
            java.lang.Object obj2 = lVar.f302833d;
            java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
            dVar.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.JsApiOpenChannelsActivityMB$EnterChannelActivityResult(num != null ? num.intValue() : 0));
        }
        dVar.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.JsApiOpenChannelsActivityMB$EnterChannelActivityResult(0));
    }
}
