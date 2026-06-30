package com.tencent.mm.plugin.appbrand.profile;

/* loaded from: classes7.dex */
public final class v extends com.tencent.mm.plugin.appbrand.profile.o {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f87707o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f87708p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.profile.q f87709q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f87710r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.profile.e f87711s;

    public v() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f87707o = new java.text.SimpleDateFormat("HH:mm:ss").format(new java.util.Date(currentTimeMillis));
        this.f87708p = jz5.h.b(new com.tencent.mm.plugin.appbrand.profile.p(this));
        this.f87709q = new com.tencent.mm.plugin.appbrand.profile.q(this);
        this.f87711s = new com.tencent.mm.plugin.appbrand.profile.u();
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.o, com.tencent.mm.plugin.appbrand.profile.d
    public void I() {
        super.I();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f87710r;
        if (b4Var != null) {
            b4Var.c(500L, 500L);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.o, com.tencent.mm.plugin.appbrand.profile.d
    public java.lang.String L1() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f87710r;
        if (b4Var != null) {
            b4Var.d();
        }
        return super.L1();
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.o
    public void a(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        com.tencent.luggage.sdk.jsapi.component.service.a0 A1;
        com.tencent.luggage.sdk.jsapi.component.service.e O;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init isEnable:");
        boolean z17 = this.f87695d;
        sb6.append(z17);
        sb6.append(" service:");
        sb6.append(e9Var);
        com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", sb6.toString());
        if (z17 && e9Var != null) {
            nd.f.e(com.tencent.mm.plugin.appbrand.profile.d.class, this);
            this.f87696e = e9Var;
            com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = e9Var.getJsRuntime();
            if (jsRuntime != null) {
                jsRuntime.addJavascriptInterface(new com.tencent.mm.plugin.appbrand.profile.w(this), "ProfileGlobal");
            }
            kotlin.jvm.internal.o.d(jsRuntime);
            com.tencent.mm.plugin.appbrand.e9 e9Var2 = this.f87696e;
            com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni appBrandCommonBindingJni = null;
            com.tencent.luggage.sdk.jsapi.component.service.y yVar = e9Var2 instanceof com.tencent.luggage.sdk.jsapi.component.service.y ? (com.tencent.luggage.sdk.jsapi.component.service.y) e9Var2 : null;
            if (yVar != null && (A1 = yVar.A1()) != null && (O = A1.O()) != null) {
                appBrandCommonBindingJni = O.f47398a;
            }
            this.f87697f = appBrandCommonBindingJni;
            com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", "installCommonBindingJni waService:" + this.f87696e + " inspectorAccessible:" + this.f87697f);
            ((com.tencent.mm.plugin.appbrand.jsruntime.f0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)).k0(new com.tencent.mm.plugin.appbrand.profile.k(this, (com.tencent.mm.plugin.appbrand.jsruntime.l0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class)));
            com.tencent.mm.plugin.appbrand.jsruntime.u h07 = jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class);
            kotlin.jvm.internal.o.f(h07, "getAddon(...)");
            ((com.tencent.mm.plugin.appbrand.jsruntime.y) h07).r(new com.tencent.mm.plugin.appbrand.profile.l(this));
        }
        if (z17) {
            qk.v6 v6Var = (qk.v6) ((jz5.n) this.f87708p).getValue();
            kotlin.jvm.internal.o.d(v6Var);
            ((xz1.k) v6Var).Ai(this.f87709q);
            this.f87710r = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.appbrand.profile.s(this), true);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.o
    public void b(java.lang.String msg) {
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime;
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.appbrand.profile.e eVar = this.f87711s;
        boolean z17 = false;
        if (eVar != null) {
            com.tencent.mm.plugin.appbrand.profile.u uVar = (com.tencent.mm.plugin.appbrand.profile.u) eVar;
            org.json.JSONObject jSONObject = new org.json.JSONObject(msg);
            java.lang.String optString = jSONObject.optString(ya.b.METHOD, "");
            int optInt = jSONObject.optInt(dm.i4.COL_ID, 0);
            kotlin.jvm.internal.o.d(optString);
            if (r26.n0.B(optString, "HeapProfiler", false) || uVar.f87706a.contains(java.lang.Integer.valueOf(optInt))) {
                z17 = true;
            }
        }
        if (z17) {
            this.f87709q.b(msg);
            return;
        }
        if (this.f87695d) {
            java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "ProfileGlobal.onInspectMessage('%s')", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.plugin.appbrand.utils.w2.a(msg)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            com.tencent.mm.plugin.appbrand.e9 e9Var = this.f87696e;
            if (e9Var == null || (jsRuntime = e9Var.getJsRuntime()) == null) {
                return;
            }
            jsRuntime.evaluateJavascript(format, new com.tencent.mm.plugin.appbrand.profile.m(msg));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.o
    public void d() {
        super.d();
        qk.v6 v6Var = (qk.v6) ((jz5.n) this.f87708p).getValue();
        kotlin.jvm.internal.o.d(v6Var);
        ((xz1.k) v6Var).Bi(this.f87709q);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f87710r;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.b
    public void s(java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f87709q.b(data);
    }
}
