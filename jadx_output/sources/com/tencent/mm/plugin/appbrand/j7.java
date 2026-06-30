package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class j7 implements com.tencent.mm.plugin.appbrand.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78469a;

    public j7(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f78469a = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.EventLocationBackgroundStateChanged) {
            if (((com.tencent.mm.plugin.appbrand.jsapi.EventLocationBackgroundStateChanged) obj).f78487d) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "locationBackgroundStateChanged, not listening, appId[%s]", this.f78469a.f74803n);
            this.f78469a.N.f425432a.s(u81.u.ON_STOP_BACKGROUND_LOCATION_LISTENING, null);
            return;
        }
        if (obj instanceof com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify, appId[%s], WxaAppMsgChannel msg", this.f78469a.f74803n);
            com.tencent.mm.plugin.appbrand.jsapi.msgchannel.h hVar = new com.tencent.mm.plugin.appbrand.jsapi.msgchannel.h();
            com.tencent.mm.plugin.appbrand.service.c0 C0 = this.f78469a.C0();
            com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel wxaAppMsgChannel = (com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.onReceiveMsgChannelJsApiEvent", "dispatch msg channel to web ， msgContent:%s", wxaAppMsgChannel.f86013i);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("msgId", wxaAppMsgChannel.f86008d);
            hashMap.put("sendTime", java.lang.Long.valueOf(wxaAppMsgChannel.f86014m));
            hashMap.put("msgType", java.lang.Integer.valueOf(wxaAppMsgChannel.f86012h));
            hashMap.put("msgContent", wxaAppMsgChannel.f86013i);
            hVar.u(C0);
            com.tencent.mars.xlog.Log.i("MicroMsg.onReceiveMsgChannelJsApiEvent", "dispatch wxa msg channel");
            hVar.t(hashMap);
            hVar.m();
            return;
        }
        if (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.openvoice.AppBrandVoIP1v1FloatBallEvent) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify, appId[%s], AppBrandVoIP1v1FloatBallEvent msg", this.f78469a.f74803n);
            if (((com.tencent.mm.plugin.appbrand.jsapi.openvoice.AppBrandVoIP1v1FloatBallEvent) obj).f82474d == 1) {
                md1.m1.b();
                return;
            }
            return;
        }
        if (obj instanceof com.tencent.mm.plugin.appbrand.location.AppBrandLocationReport$LocationInfoData) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify appId[%s], receive LocationInfoData", this.f78469a.f74803n);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "isReported:%b", java.lang.Boolean.valueOf(com.tencent.mm.plugin.appbrand.location.b.a(this.f78469a.f74803n)));
            if (com.tencent.mm.plugin.appbrand.location.b.a(this.f78469a.f74803n)) {
                return;
            }
            java.lang.String str = this.f78469a.f74803n;
            synchronized (com.tencent.mm.plugin.appbrand.location.b.f85512b) {
                com.tencent.mm.plugin.appbrand.location.b.f85511a.put(str, java.lang.Boolean.TRUE);
            }
            com.tencent.mm.plugin.appbrand.location.b.c((com.tencent.mm.plugin.appbrand.location.AppBrandLocationReport$LocationInfoData) obj, this.f78469a.u0().f47276v);
            return;
        }
        if (obj instanceof com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallHelper$AppBrandContentFloatBallEvent) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify, appId[%s], AppBrandContentFloatBallEvent msg", this.f78469a.f74803n);
            int i17 = ((com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallHelper$AppBrandContentFloatBallEvent) obj).f78058d;
            if (i17 == 1) {
                this.f78469a.N.f425432a.s(u81.u.ON_REMOVE_CONTENT_FLOAT_WINDOW, null);
            } else if (i17 == 2) {
                this.f78469a.N.f425432a.s(u81.u.ON_ADDED_CONTENT_FLOAT_WINDOW, null);
            }
        }
    }
}
