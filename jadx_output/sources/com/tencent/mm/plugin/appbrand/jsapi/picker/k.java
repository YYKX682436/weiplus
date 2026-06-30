package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public abstract class k extends tl1.c {

    /* renamed from: i, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.utils.o2 f82740i = com.tencent.mm.plugin.appbrand.utils.o.f90519b;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.k0 f82741e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f82742f;

    /* renamed from: g, reason: collision with root package name */
    public int f82743g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f82744h;

    public final void d(java.lang.String str, java.util.Map map) {
        java.lang.ref.WeakReference weakReference = this.f82742f;
        if (weakReference == null || weakReference.get() == null || this.f82741e == null) {
            return;
        }
        ((com.tencent.mm.plugin.appbrand.jsapi.t) this.f82742f.get()).a(this.f82743g, this.f82741e.p(str, map));
    }

    public void e(org.json.JSONObject jSONObject) {
        this.f82744h = jSONObject.optString("headerText");
        f(jSONObject);
    }

    public abstract void f(org.json.JSONObject jSONObject);

    public final void g(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject, int i17, boolean z17) {
        this.f82741e = k0Var;
        this.f82742f = new java.lang.ref.WeakReference(tVar);
        this.f82743g = i17;
        e(jSONObject);
    }

    public final void h(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f82742f;
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = weakReference == null ? null : (com.tencent.mm.plugin.appbrand.jsapi.t) weakReference.get();
        if (tVar == null) {
            return;
        }
        tVar.m(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        if (((com.tencent.mm.plugin.appbrand.widget.picker.AppBrandEmptyPickerView) c(com.tencent.mm.plugin.appbrand.widget.picker.AppBrandEmptyPickerView.class)) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiPickerHandler", "showEmptyView settlePicker returns NULL");
        } else {
            this.f420200d.setOnResultListener(new com.tencent.mm.plugin.appbrand.jsapi.picker.j(this));
            this.f420200d.i();
        }
    }
}
