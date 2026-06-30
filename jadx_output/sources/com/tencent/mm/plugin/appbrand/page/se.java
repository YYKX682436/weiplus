package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class se implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f87097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ue f87098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f87099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f87100g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ne f87101h;

    public se(o25.y1 y1Var, com.tencent.mm.plugin.appbrand.page.ue ueVar, android.content.Context context, com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.page.ne neVar) {
        this.f87097d = y1Var;
        this.f87098e = ueVar;
        this.f87099f = context;
        this.f87100g = n7Var;
        this.f87101h = neVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem instanceof db5.h4) {
            com.tencent.mm.plugin.appbrand.page.re reVar = new com.tencent.mm.plugin.appbrand.page.re(this.f87098e, this.f87099f, this.f87100g, this.f87101h);
            ((com.tencent.mm.pluginsdk.forward.m) this.f87097d).aj((db5.h4) menuItem, reVar);
        }
    }
}
