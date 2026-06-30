package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class q0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.t0 f82003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km5.b f82004e;

    public q0(com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var, km5.b bVar) {
        this.f82003d = t0Var;
        this.f82004e = bVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var = this.f82003d;
        pq5.g b17 = itemId != 1 ? itemId != 2 ? pq5.h.b(com.tencent.mm.plugin.appbrand.jsapi.media.x.f82124a) : com.tencent.mm.plugin.appbrand.jsapi.media.t0.a(t0Var) : com.tencent.mm.plugin.appbrand.jsapi.media.t0.b(t0Var);
        km5.b bVar = this.f82004e;
        final com.tencent.mm.plugin.appbrand.jsapi.media.o0 o0Var = new com.tencent.mm.plugin.appbrand.jsapi.media.o0(bVar);
        b17.h(new gm5.a(o0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.media.l0

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.l f81909a;

            {
                kotlin.jvm.internal.o.g(o0Var, "function");
                this.f81909a = o0Var;
            }

            @Override // gm5.a
            public final /* synthetic */ java.lang.Object call(java.lang.Object obj) {
                return this.f81909a.invoke(obj);
            }
        }).s(new com.tencent.mm.plugin.appbrand.jsapi.media.p0(bVar));
    }
}
