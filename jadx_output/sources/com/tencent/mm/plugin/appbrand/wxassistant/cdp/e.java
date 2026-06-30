package com.tencent.mm.plugin.appbrand.wxassistant.cdp;

/* loaded from: classes7.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public yz5.l f92171a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.service.CdpCommandParams f92172b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f92173c;

    /* renamed from: d, reason: collision with root package name */
    public long f92174d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.wxassistant.cdp.f f92175e;

    public e() {
        jz5.h.b(new com.tencent.mm.plugin.appbrand.wxassistant.cdp.a(this));
        this.f92173c = jz5.h.b(new com.tencent.mm.plugin.appbrand.wxassistant.cdp.d(this));
        this.f92175e = com.tencent.mm.plugin.appbrand.wxassistant.cdp.f.f92176e;
    }

    public static com.tencent.mm.plugin.appbrand.service.CdpCommandResponse f(com.tencent.mm.plugin.appbrand.wxassistant.cdp.e eVar, com.tencent.mm.plugin.appbrand.service.o0 result, java.util.Map response, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeReturnResponse");
        }
        if ((i17 & 2) != 0) {
            response = new java.util.HashMap();
        }
        eVar.getClass();
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(response, "response");
        nf.f.c(response);
        org.json.JSONObject jSONObject = new org.json.JSONObject(response);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        int i18 = result.f88734d;
        jSONObject2.put("code", i18);
        jSONObject2.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, result.f88735e);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("event", "notSupport");
        jSONObject.put("task_id", (java.lang.String) ((jz5.n) eVar.f92173c).getValue());
        jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject);
        jSONObject3.put("start_time", eVar.f92174d);
        jSONObject3.put("end_time", java.lang.System.currentTimeMillis());
        jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject3);
        java.lang.String jSONObject4 = jSONObject2.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        return new com.tencent.mm.plugin.appbrand.service.CdpCommandResponse(i18, jSONObject4);
    }

    public final java.lang.Object b(com.tencent.mm.plugin.appbrand.service.CdpCommandParams params, kotlin.coroutines.Continuation continuation) {
        this.f92174d = java.lang.System.currentTimeMillis();
        this.f92175e = com.tencent.mm.plugin.appbrand.wxassistant.cdp.f.f92177f;
        this.f92172b = params;
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CdpCommand_NotSupport", "onHandle: sessionId:" + params.f88604d + " cmdId:" + params.f88605e + ' ' + params.f88608h);
            return f((com.tencent.mm.plugin.appbrand.wxassistant.cdp.q2) this, com.tencent.mm.plugin.appbrand.service.o0.f88730h, null, 2, null);
        }
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        if (!(this.f92171a == null)) {
            throw new java.lang.IllegalStateException("Command already executing".toString());
        }
        this.f92171a = new com.tencent.mm.plugin.appbrand.wxassistant.cdp.b(rVar);
        com.tencent.mm.plugin.appbrand.service.u5 u5Var = (com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class);
        com.tencent.mm.plugin.appbrand.wxassistant.cdp.c cVar = new com.tencent.mm.plugin.appbrand.wxassistant.cdp.c(this);
        com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) u5Var;
        u0Var.getClass();
        kotlin.jvm.internal.o.g(params, "params");
        if (!u0Var.f92317d.b(params, cVar)) {
            rVar.s(f(this, com.tencent.mm.plugin.appbrand.service.o0.f88729g, null, 2, null), null);
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
