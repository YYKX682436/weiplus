package com.tencent.mm.plugin.appbrand.wxassistant;

@j95.b
/* loaded from: classes7.dex */
public final class u0 extends i95.w implements com.tencent.mm.plugin.appbrand.service.u5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.x1 f92317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.j1 f92318e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f92319f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f92320g;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f92321m;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f92322o;

    public u0() {
        com.tencent.mm.plugin.appbrand.wxassistant.x1 x1Var = new com.tencent.mm.plugin.appbrand.wxassistant.x1();
        this.f92317d = x1Var;
        com.tencent.mm.plugin.appbrand.wxassistant.j1 j1Var = new com.tencent.mm.plugin.appbrand.wxassistant.j1();
        this.f92318e = j1Var;
        this.f92319f = jz5.h.b(com.tencent.mm.plugin.appbrand.wxassistant.t0.f92309d);
        this.f92320g = jz5.h.b(com.tencent.mm.plugin.appbrand.wxassistant.s0.f92306d);
        new java.util.HashMap();
        new java.util.HashMap();
        x1Var.f92340a = this;
        j1Var.f92215a = this;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "init: NetworkRequestCollector NOT registered (disabled by compile flag)");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "init: main process, clear all");
            Di().getClass();
            com.tencent.mm.plugin.appbrand.wxassistant.v2.a(com.tencent.mm.plugin.appbrand.wxassistant.w2.f92328a).d();
            Ri().d();
        } else {
            com.tencent.mm.plugin.appbrand.widget.input.n.f91551d = false;
        }
        this.f92321m = jz5.h.b(com.tencent.mm.plugin.appbrand.wxassistant.r0.f92300d);
        jz5.h.b(com.tencent.mm.plugin.appbrand.wxassistant.y.f92346d);
        this.f92322o = java.util.concurrent.ConcurrentHashMap.newKeySet();
    }

    public java.util.List Ai(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        com.tencent.mm.plugin.appbrand.wxassistant.w2 Di = Di();
        Di.getClass();
        java.lang.String b17 = Di.b(sessionId);
        java.lang.String a17 = Di.a(sessionId);
        com.tencent.mm.plugin.appbrand.wxassistant.v2 v2Var = com.tencent.mm.plugin.appbrand.wxassistant.w2.f92328a;
        int i17 = com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).getInt(b17, -1);
        if (i17 == -1) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i17 >= 0) {
            int i18 = 0;
            while (true) {
                java.lang.String string = com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).getString(a17 + i18, null);
                kotlin.jvm.internal.o.d(string);
                arrayList.add(string);
                if (i18 == i17) {
                    break;
                }
                i18++;
            }
        }
        return arrayList;
    }

    public final com.tencent.mm.plugin.appbrand.wxassistant.cdp.e Bi(java.lang.String method) {
        kotlin.jvm.internal.o.g(method, "method");
        yz5.a aVar = (yz5.a) ((java.util.Map) ((jz5.n) this.f92321m).getValue()).get(method);
        if (aVar != null) {
            return (com.tencent.mm.plugin.appbrand.wxassistant.cdp.e) aVar.invoke();
        }
        return null;
    }

    public final com.tencent.mm.plugin.appbrand.wxassistant.w2 Di() {
        return (com.tencent.mm.plugin.appbrand.wxassistant.w2) this.f92319f.getValue();
    }

    public java.lang.String Ni(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        com.tencent.mm.plugin.appbrand.wxassistant.w2 Di = Di();
        Di.getClass();
        java.lang.String b17 = Di.b(sessionId);
        java.lang.String a17 = Di.a(sessionId);
        com.tencent.mm.plugin.appbrand.wxassistant.v2 v2Var = com.tencent.mm.plugin.appbrand.wxassistant.w2.f92328a;
        int i17 = com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).getInt(b17, -1);
        if (i17 == -1) {
            return null;
        }
        return com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).getString(a17 + i17, null);
    }

    public final com.tencent.mm.sdk.platformtools.o4 Ri() {
        java.lang.Object value = this.f92320g.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.sdk.platformtools.o4) value;
    }

    public void Ui(java.lang.String sessionId, java.lang.String appId, com.tencent.mm.plugin.appbrand.service.o0 status) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(status, "status");
        this.f92318e.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "notifyLaunchClient: sessionId:" + sessionId + " appId:" + appId + " status:" + status);
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, sessionId);
        bundle.putString("appId", appId);
        bundle.putSerializable("status", status);
        com.tencent.mm.ipcinvoker.d0.d(str, bundle, com.tencent.mm.plugin.appbrand.wxassistant.f1.f92202d.getClass(), com.tencent.mm.plugin.appbrand.wxassistant.g1.f92205d);
    }
}
