package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes7.dex */
public final class t0 extends eg.a implements sh1.f {

    /* renamed from: g, reason: collision with root package name */
    public kf.b f88946g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f88947h;

    /* renamed from: i, reason: collision with root package name */
    public sf.f f88948i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.skyline.nativeview.a f88949m = new com.tencent.mm.plugin.appbrand.skyline.nativeview.a();

    @Override // sh1.f
    public void a(int i17, java.lang.String event, java.lang.String params) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(params, "params");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNativeViewEvent component:");
        sf.f fVar = this.f88948i;
        sb6.append(fVar != null ? fVar.m() : null);
        sb6.append(" viewId:");
        sb6.append(i17);
        sb6.append(" event:");
        sb6.append(event);
        sb6.append(" params:");
        sb6.append(params);
        com.tencent.mars.xlog.Log.i("SkylineNativeViewPluginHandler", sb6.toString());
        sf.f fVar2 = this.f88948i;
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar2 != null ? fVar2.m() : null;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = m17 instanceof com.tencent.mm.plugin.appbrand.page.n7 ? (com.tencent.mm.plugin.appbrand.page.n7) m17 : null;
        if (n7Var != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            com.tencent.mm.plugin.appbrand.skyline.nativeview.a aVar = this.f88949m;
            aVar.s("viewId", valueOf);
            aVar.s("event", event);
            try {
                aVar.s("param", new org.json.JSONObject(params));
            } catch (java.lang.Exception unused) {
                aVar.s("param", params);
            }
            n7Var.i(aVar, null);
        }
    }

    @Override // eg.b
    public boolean b(sf.f fVar) {
        return true;
    }

    @Override // eg.a, eg.b
    public void c(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            com.tencent.mm.plugin.appbrand.skyline.nativeview.k0 k0Var = com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88902a;
        }
    }

    @Override // sh1.f
    public void d(java.lang.String event, java.lang.String data) {
        com.tencent.mm.plugin.appbrand.service.c0 U1;
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        sf.f fVar = this.f88948i;
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar != null ? fVar.m() : null;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = m17 instanceof com.tencent.mm.plugin.appbrand.page.n7 ? (com.tencent.mm.plugin.appbrand.page.n7) m17 : null;
        com.tencent.mars.xlog.Log.i("SkylineNativeViewPluginHandler", "onPublishEvent event:" + event + " data:" + data + " pageViewWC:" + n7Var);
        if (n7Var == null || (U1 = n7Var.U1()) == null) {
            return;
        }
        U1.g(event, data);
    }

    @Override // eg.a, eg.b
    public void e() {
    }

    @Override // eg.b
    public java.lang.String f(sf.f invokeContext) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        com.tencent.mars.xlog.Log.i("SkylineNativeViewPluginHandler", "@@@handleJsApi invokeContext:" + invokeContext);
        if (invokeContext instanceof com.tencent.mm.plugin.appbrand.extendplugin.b) {
            com.tencent.mm.plugin.appbrand.extendplugin.b bVar = (com.tencent.mm.plugin.appbrand.extendplugin.b) invokeContext;
            com.tencent.mm.plugin.appbrand.jsapi.l m17 = bVar.m();
            com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = bVar.f78021c;
            org.json.JSONObject jSONObject = bVar.f78020b;
            int i17 = bVar.f78019a;
            com.tencent.mars.xlog.Log.i("SkylineNativeViewPluginHandler", "*** handler(%s) handleJsApi(%s), data:%s", q(), k0Var.k(), jSONObject.toString());
            com.tencent.mm.plugin.appbrand.skyline.nativeview.q0 q0Var = new com.tencent.mm.plugin.appbrand.skyline.nativeview.q0(k0Var, this, invokeContext, m17, i17, jSONObject);
            synchronized (this) {
                if (this.f88946g == null) {
                    this.f88947h = q0Var;
                    return null;
                }
                q0Var.run();
            }
        }
        return null;
    }

    @Override // eg.a, eg.b
    public void i(android.view.Surface surface) {
    }

    @Override // sh1.f
    public void j() {
        ik1.h0.b(new com.tencent.mm.plugin.appbrand.skyline.nativeview.r0(this));
    }

    @Override // eg.a, eg.b
    public void k(android.graphics.Bitmap bitmap) {
    }

    @Override // sh1.f
    public void l() {
        ik1.h0.b(new com.tencent.mm.plugin.appbrand.skyline.nativeview.s0(this));
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this) {
            kotlin.jvm.internal.o.e(surfaceTexture, "null cannot be cast to non-null type com.tencent.luggage.skyline.wxa.nativeview.SkylineSurfaceTexture");
            this.f88946g = (kf.b) surfaceTexture;
            java.lang.Runnable runnable = this.f88947h;
            if (runnable != null) {
                ((com.tencent.mm.plugin.appbrand.skyline.nativeview.q0) runnable).run();
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        sb6.append(this.f252497d);
        sb6.append(" handlePluginReady width:");
        kf.b bVar = this.f88946g;
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.f307159a) : null);
        sb6.append(" height:");
        kf.b bVar2 = this.f88946g;
        sb6.append(bVar2 != null ? java.lang.Integer.valueOf(bVar2.f307160b) : null);
        com.tencent.mars.xlog.Log.i("SkylineNativeViewPluginHandler", sb6.toString());
    }
}
