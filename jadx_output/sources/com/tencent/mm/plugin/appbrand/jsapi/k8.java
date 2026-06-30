package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes9.dex */
public class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent f81348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f81349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f81350f;

    public k8(com.tencent.mm.plugin.appbrand.jsapi.l8 l8Var, com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent, android.os.Bundle bundle, com.tencent.mm.ipcinvoker.r rVar) {
        this.f81348d = jsApiOfflineUserBindQueryResultCallBackEvent;
        this.f81349e = bundle;
        this.f81350f = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent = this.f81348d;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCLoadPayOfflineUserBindQuery", "event.data.callback，result ：%s", jsApiOfflineUserBindQueryResultCallBackEvent.f54446h.f8196a);
        java.lang.String str = jsApiOfflineUserBindQueryResultCallBackEvent.f54446h.f8196a;
        android.os.Bundle bundle = this.f81349e;
        bundle.putString("errMsg", str);
        this.f81350f.a(bundle);
    }
}
