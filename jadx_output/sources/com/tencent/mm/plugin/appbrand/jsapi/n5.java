package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public abstract class n5 extends com.tencent.mm.plugin.appbrand.jsapi.h {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f82373e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f82374f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f82375g;

    /* renamed from: h, reason: collision with root package name */
    public int f82376h;

    public final void l(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        if (c0Var == this.f82373e.getJsRuntime()) {
            this.f82373e.e(k(), o(), this.f82376h);
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.jf.a(c0Var, k(), o(), this.f82376h, 0);
        }
    }

    public void m() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82373e;
        if (lVar == null || !lVar.isRunning()) {
            return;
        }
        n(this.f82373e.getJsRuntime());
    }

    public void n(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82373e;
        if (lVar == null) {
            return;
        }
        if (c0Var == null) {
            c0Var = lVar.getJsRuntime();
        }
        if (this.f82373e.c(k(), c0Var)) {
            com.tencent.mm.plugin.appbrand.jsapi.k interceptor = this.f82373e.getInterceptor();
            if (interceptor == null) {
                l(c0Var);
            } else {
                interceptor.b(this, c0Var, new com.tencent.mm.plugin.appbrand.jsapi.m5(this, c0Var));
            }
        }
    }

    public java.lang.String o() {
        java.lang.String str = this.f82374f;
        if (str != null) {
            return str;
        }
        java.util.Map map = this.f82375g;
        if (map == null) {
            return null;
        }
        nf.f.c(map);
        return new org.json.JSONObject(this.f82375g).toString();
    }

    public com.tencent.mm.plugin.appbrand.jsapi.n5 p(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        if (lVar == null) {
            return this;
        }
        this.f82373e = lVar;
        this.f82376h = 0;
        return this;
    }

    public com.tencent.mm.plugin.appbrand.jsapi.n5 q(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        p(lVar);
        this.f82376h = i17;
        return this;
    }

    public com.tencent.mm.plugin.appbrand.jsapi.n5 r(java.lang.String str) {
        this.f82374f = str;
        return this;
    }

    public com.tencent.mm.plugin.appbrand.jsapi.n5 s(java.lang.String str, java.lang.Object obj) {
        if (this.f82375g == null) {
            this.f82375g = new java.util.HashMap();
        }
        this.f82375g.put(str, obj);
        return this;
    }

    public com.tencent.mm.plugin.appbrand.jsapi.n5 t(java.util.Map map) {
        if (map == null) {
            return this;
        }
        nf.f.c(map);
        this.f82375g = map;
        return this;
    }
}
