package com.tencent.mm.plugin.appbrand.game.preload;

/* loaded from: classes7.dex */
public final class f implements com.tencent.mm.plugin.appbrand.jsapi.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f78204d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedHashSet f78205e = new java.util.LinkedHashSet();

    public f(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f78204d = appBrandRuntime;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void a(int i17, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.g0> T b(java.lang.Class<T> cls) {
        T t17;
        java.util.Iterator it = this.f78205e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t17 = null;
                break;
            }
            t17 = (T) it.next();
            if (cls.isInstance(t17)) {
                break;
            }
        }
        if (t17 == null) {
            try {
                t17 = cls.newInstance();
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WAGamePreloadComponent", "Make sure %s has default constructor", cls.getName());
            }
        }
        iz5.a.g(null, t17 != null);
        r(t17);
        return t17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void e(java.lang.String str, java.lang.String str2, int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public void g(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public java.lang.String getAppId() {
        return this.f78204d.f74803n;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public u81.b getAppState() {
        return getRuntime() == null ? u81.b.DESTROYED : getRuntime().N.b();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ qu5.a getAsyncHandler() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ fl1.g2 getAuthorizeDialogContainer() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public int getComponentId() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* renamed from: getContext */
    public android.content.Context getF147807d() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public fl1.g2 getDialogContainer() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.jsapi.k getInterceptor() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.Cif getInvokeCostManager() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* renamed from: getJsRuntime */
    public com.tencent.mm.plugin.appbrand.jsruntime.t getF147808e() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ androidx.lifecycle.y getLifecycleOwner() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime getRuntime() {
        return this.f78204d;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public /* bridge */ /* synthetic */ xi1.g getWindowAndroid() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void h() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public void i(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, int[] iArr) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public boolean isRunning() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public void j(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        if (j17 < 0) {
            j17 = 0;
        }
        com.tencent.mm.sdk.platformtools.u3.i(runnable, j17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.h0> T k(java.lang.Class<T> cls) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean l(com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public void m(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getF147807d();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public void o(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).g(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public void p(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends nd.b> T q(java.lang.Class<T> cls) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void r(com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public boolean s(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void setEvalInterceptor(com.tencent.mm.plugin.appbrand.jsapi.i iVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void setInterceptor(com.tencent.mm.plugin.appbrand.jsapi.k kVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public /* bridge */ /* synthetic */ boolean t() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void u(java.util.Collection<com.tencent.mm.plugin.appbrand.jsapi.g0> collection) {
        this.f78205e.addAll(collection);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x() {
        return null;
    }
}
