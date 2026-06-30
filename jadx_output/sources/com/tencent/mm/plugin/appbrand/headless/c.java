package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class c implements com.tencent.mm.ipcinvoker.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f78284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.headless.p f78285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.headless.d f78287g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f78288h;

    public c(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.tencent.mm.plugin.appbrand.headless.p pVar, java.lang.String str, com.tencent.mm.plugin.appbrand.headless.d dVar, int i17) {
        this.f78284d = atomicBoolean;
        this.f78285e = pVar;
        this.f78286f = str;
        this.f78287g = dVar;
        this.f78288h = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceResult bindRemoteServiceResult = (com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceResult) obj;
        com.tencent.mm.plugin.appbrand.headless.p pVar = this.f78285e;
        if (bindRemoteServiceResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandHeadlessStartService", "bindRemoteService onCallback with NULL data, id:" + this.f78288h);
            if (pVar != null) {
                com.tencent.mm.plugin.appbrand.headless.p.b(pVar, -4, null, 2, null);
                return;
            }
            return;
        }
        this.f78284d.set(true);
        java.lang.String str = this.f78286f;
        int i17 = bindRemoteServiceResult.f78280d;
        if (i17 == 0) {
            if (pVar != null) {
                pVar.onSuccess(str);
            }
        } else if (pVar != null) {
            pVar.a(i17, bindRemoteServiceResult.f78281e);
        }
        com.tencent.mm.ipcinvoker.d0.i(str, this.f78287g);
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void c(java.lang.Exception exc) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandHeadlessStartService", "bindRemoteService onCaughtInvokeException, id:" + this.f78288h + ", exception:" + exc);
        com.tencent.mm.plugin.appbrand.headless.p pVar = this.f78285e;
        if (pVar != null) {
            com.tencent.mm.plugin.appbrand.headless.p.b(pVar, -4, null, 2, null);
        }
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void d() {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandHeadlessStartService", "bindRemoteService onBridgeNotFound, id:" + this.f78288h);
        com.tencent.mm.plugin.appbrand.headless.p pVar = this.f78285e;
        if (pVar != null) {
            com.tencent.mm.plugin.appbrand.headless.p.b(pVar, -4, null, 2, null);
        }
    }
}
