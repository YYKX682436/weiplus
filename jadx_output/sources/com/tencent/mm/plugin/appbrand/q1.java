package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class q1 implements com.tencent.mm.ipcinvoker.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f87722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.v0 f87723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f87724f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87725g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.r1 f87726h;

    public q1(int i17, l81.v0 v0Var, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.lang.String str, com.tencent.mm.plugin.appbrand.r1 r1Var) {
        this.f87722d = i17;
        this.f87723e = v0Var;
        this.f87724f = atomicBoolean;
        this.f87725g = str;
        this.f87726h = r1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.BindRemoteServiceResult bindRemoteServiceResult = (com.tencent.mm.plugin.appbrand.BindRemoteServiceResult) obj;
        l81.v0 v0Var = this.f87723e;
        if (bindRemoteServiceResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPreRenderColdStartService", "bindRemoteService onCallback with NULL data, id:" + this.f87722d);
            if (v0Var != null) {
                l81.v0.b(v0Var, -4, null, 2, null);
                return;
            }
            return;
        }
        this.f87724f.set(true);
        int i17 = bindRemoteServiceResult.f74871d;
        if (i17 == 0) {
            if (v0Var != null) {
                v0Var.onSuccess();
            }
        } else if (v0Var != null) {
            v0Var.a(i17, bindRemoteServiceResult.f74872e);
        }
        com.tencent.mm.ipcinvoker.d0.i(this.f87725g, this.f87726h);
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void c(java.lang.Exception exc) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPreRenderColdStartService", "bindRemoteService onCaughtInvokeException, id:" + this.f87722d + ", exception:" + exc);
        l81.v0 v0Var = this.f87723e;
        if (v0Var != null) {
            l81.v0.b(v0Var, -4, null, 2, null);
        }
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void d() {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPreRenderColdStartService", "bindRemoteService onBridgeNotFound, id:" + this.f87722d);
        l81.v0 v0Var = this.f87723e;
        if (v0Var != null) {
            l81.v0.b(v0Var, -4, null, 2, null);
        }
    }
}
