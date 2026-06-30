package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class p2 extends l01.l {

    /* renamed from: d, reason: collision with root package name */
    public final im5.a f86309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xi1.g f86310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xi1.d f86311f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.q2 f86312g;

    public p2(com.tencent.mm.plugin.appbrand.q2 q2Var, xi1.g gVar, xi1.d dVar) {
        this.f86312g = q2Var;
        this.f86310e = gVar;
        this.f86311f = dVar;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = q2Var.f87727d;
        im5.a aVar = new im5.a() { // from class: com.tencent.mm.plugin.appbrand.p2$$b
            @Override // im5.a
            public final void dead() {
                l01.d0.f314761a.e(l01.u.this);
            }
        };
        this.f86309d = aVar;
        appBrandRuntime.keep(aVar);
    }

    @Override // l01.l, l01.u
    public void onBitmapLoaded(final android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.appbrand.q2 q2Var = this.f86312g;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = q2Var.f87727d;
        final xi1.g gVar = this.f86310e;
        final xi1.d dVar = this.f86311f;
        appBrandRuntime.o(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.p2$$a
            @Override // java.lang.Runnable
            public final void run() {
                xi1.d dVar2 = dVar;
                xi1.g.this.setWindowDescription(new xi1.d(dVar2.f454698a, bitmap, dVar2.f454700c));
            }
        });
        q2Var.f87727d.n2(this.f86309d);
    }
}
