package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class b extends si1.a {

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.List f92130k = kz5.c0.i(com.tencent.mm.plugin.appbrand.jsapi.pay.y1.NAME, com.tencent.mm.plugin.appbrand.jsapi.pay.a2.NAME);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f92131h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f92132i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f92133j;

    public b(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var) {
        super(o6Var, d0Var);
        this.f92131h = o6Var;
        this.f92132i = kz5.b0.c(com.tencent.mm.plugin.appbrand.jsapi.advertise.r.NAME);
        this.f92133j = new java.util.concurrent.CopyOnWriteArraySet();
    }

    @Override // si1.a, com.tencent.mm.plugin.appbrand.x, com.tencent.mm.plugin.appbrand.jsapi.k
    public boolean c(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, com.tencent.mm.plugin.appbrand.jsapi.j jVar) {
        java.lang.String k17 = k0Var != null ? k0Var.k() : null;
        if (k17 == null) {
            k17 = "";
        }
        boolean contains = f92130k.contains(k17);
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f92131h;
        if (contains) {
            kotlin.jvm.internal.o.d(o6Var);
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
            kotlin.jvm.internal.o.d(u07);
            java.lang.String f17 = u07.f();
            com.tencent.mm.plugin.appbrand.service.u5 u5Var = (com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class);
            kotlin.jvm.internal.o.d(f17);
            com.tencent.mm.plugin.appbrand.wxassistant.a aVar = new com.tencent.mm.plugin.appbrand.wxassistant.a(jVar);
            com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) u5Var;
            u0Var.getClass();
            com.tencent.mm.plugin.appbrand.wxassistant.j1 j1Var = u0Var.f92318e;
            j1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "waitForHumanAction: sessionId:" + f17 + " apiName:" + k17);
            ((java.util.HashMap) ((jz5.n) j1Var.f92217c).getValue()).put(f17, aVar);
            ((java.util.HashMap) ((jz5.n) j1Var.f92218d).getValue()).put(f17, k17);
            return true;
        }
        com.tencent.mm.plugin.appbrand.wxassistant.n nVar = com.tencent.mm.plugin.appbrand.wxassistant.n.f92236a;
        nVar.getClass();
        if (com.tencent.mm.plugin.appbrand.wxassistant.n.f92241f.contains(k17) || com.tencent.mm.plugin.appbrand.wxassistant.n.f92242g.containsKey(k17)) {
            kotlin.jvm.internal.o.d(o6Var);
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u08 = o6Var.u0();
            kotlin.jvm.internal.o.d(u08);
            java.lang.String f18 = u08.f();
            this.f92133j.add(java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.appbrand.service.u5 u5Var2 = (com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class);
            kotlin.jvm.internal.o.d(f18);
            com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var2 = (com.tencent.mm.plugin.appbrand.wxassistant.u0) u5Var2;
            u0Var2.getClass();
            com.tencent.mm.plugin.appbrand.wxassistant.j1 j1Var2 = u0Var2.f92318e;
            j1Var2.getClass();
            java.lang.Object computeIfAbsent = ((java.util.HashMap) ((jz5.n) j1Var2.f92219e).getValue()).computeIfAbsent(f18, com.tencent.mm.plugin.appbrand.wxassistant.c1.f92144a);
            kotlin.jvm.internal.o.f(computeIfAbsent, "computeIfAbsent(...)");
            ((java.util.HashMap) computeIfAbsent).put(java.lang.Integer.valueOf(i17), new com.tencent.mm.plugin.appbrand.wxassistant.x0(i17, k17));
            nVar.getClass();
            java.lang.Integer num = (java.lang.Integer) com.tencent.mm.plugin.appbrand.wxassistant.n.f92242g.get(k17);
            int intValue = num != null ? num.intValue() : -1;
            ((java.util.HashMap) ((jz5.n) j1Var2.f92220f).getValue()).put(f18, java.lang.Integer.valueOf(intValue));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "doAppBrandApi: sessionId:" + f18 + " callbackId:" + i17 + " apiName:" + k17 + " appbrandApiState:" + intValue);
        }
        if (!this.f92132i.contains(k17)) {
            return super.c(k0Var, str, str2, i17, jVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandComponentInterceptorForWxAssistant", "preInvoke: skipJsApiName: " + k17 + ", ignore");
        if (jVar != null) {
            if (k0Var != null) {
                r4 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                java.lang.String str3 = r4 != null ? r4 : "";
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                r4 = k0Var.u(str3, jSONObject);
            }
            jVar.b(r4);
        }
        return true;
    }

    @Override // si1.a, com.tencent.mm.plugin.appbrand.x, com.tencent.mm.plugin.appbrand.jsapi.k
    public void d(int i17, java.lang.String str) {
        this.f408225f.b(i17, str);
        if (this.f92133j.contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mm.plugin.appbrand.o6 o6Var = this.f92131h;
            kotlin.jvm.internal.o.d(o6Var);
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
            kotlin.jvm.internal.o.d(u07);
            java.lang.String f17 = u07.f();
            com.tencent.mm.plugin.appbrand.service.u5 u5Var = (com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class);
            kotlin.jvm.internal.o.d(f17);
            com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) u5Var;
            u0Var.getClass();
            com.tencent.mm.plugin.appbrand.wxassistant.j1 j1Var = u0Var.f92318e;
            j1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "callbackAppBrandApi: sessionId:" + f17 + " callbackId:" + i17);
            java.util.HashMap hashMap = (java.util.HashMap) ((java.util.HashMap) ((jz5.n) j1Var.f92219e).getValue()).get(f17);
            if (hashMap != null) {
            }
        }
    }
}
