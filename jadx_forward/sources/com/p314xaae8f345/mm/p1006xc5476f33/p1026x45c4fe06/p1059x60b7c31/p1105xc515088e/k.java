package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public abstract class k extends tl1.c {

    /* renamed from: i, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o2 f164273i = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o.f172052b;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f164274e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f164275f;

    /* renamed from: g, reason: collision with root package name */
    public int f164276g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f164277h;

    public final void d(java.lang.String str, java.util.Map map) {
        java.lang.ref.WeakReference weakReference = this.f164275f;
        if (weakReference == null || weakReference.get() == null || this.f164274e == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) this.f164275f.get()).a(this.f164276g, this.f164274e.p(str, map));
    }

    public void e(org.json.JSONObject jSONObject) {
        this.f164277h = jSONObject.optString("headerText");
        f(jSONObject);
    }

    public abstract void f(org.json.JSONObject jSONObject);

    public final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject, int i17, boolean z17) {
        this.f164274e = k0Var;
        this.f164275f = new java.lang.ref.WeakReference(tVar);
        this.f164276g = i17;
        e(jSONObject);
    }

    public final void h(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f164275f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = weakReference == null ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) weakReference.get();
        if (tVar == null) {
            return;
        }
        tVar.m(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12784x7e75de9a) c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12784x7e75de9a.class)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiPickerHandler", "showEmptyView settlePicker returns NULL");
        } else {
            this.f501733d.m166747x3c802832(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.j(this));
            this.f501733d.i();
        }
    }
}
