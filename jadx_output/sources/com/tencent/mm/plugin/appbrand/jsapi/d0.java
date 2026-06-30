package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public interface d0 extends com.tencent.mm.plugin.appbrand.jsapi.l, uh1.v {
    /* synthetic */ void a(int i17, java.lang.String str);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.g0 b(java.lang.Class cls);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ boolean c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var);

    /* synthetic */ void d(java.lang.String str, java.lang.String str2, int[] iArr);

    /* synthetic */ void e(java.lang.String str, java.lang.String str2, int i17);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* bridge */ /* synthetic */ default com.tencent.mm.plugin.appbrand.jsapi.k0 f(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ void g(java.lang.String str, java.lang.String str2);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    /* synthetic */ java.lang.String getAppId();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    /* synthetic */ u81.b getAppState();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* bridge */ /* synthetic */ default qu5.a getAsyncHandler() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* bridge */ /* synthetic */ default fl1.g2 getAuthorizeDialogContainer() {
        return null;
    }

    /* synthetic */ int getComponentId();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ android.content.Context getContext();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ fl1.g2 getDialogContainer();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k getInterceptor();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* bridge */ /* synthetic */ default com.tencent.mm.plugin.appbrand.jsapi.Cif getInvokeCostManager() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t getJsRuntime();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* bridge */ /* synthetic */ default androidx.lifecycle.y getLifecycleOwner() {
        return null;
    }

    /* renamed from: getRuntime */
    com.tencent.mm.plugin.appbrand.AppBrandRuntime t3();

    /* bridge */ /* synthetic */ default xi1.g getWindowAndroid() {
        return null;
    }

    /* synthetic */ void h();

    /* synthetic */ void i(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, int[] iArr);

    /* synthetic */ boolean isRunning();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ void j(java.lang.Runnable runnable, long j17);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.h0 k(java.lang.Class cls);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ boolean l(com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ void m(java.lang.Runnable runnable);

    default android.content.Context n() {
        return getContext();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    default void o(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).g(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ void p(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ nd.b q(java.lang.Class cls);

    /* synthetic */ void r(com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var);

    /* synthetic */ boolean s(java.lang.String str);

    /* synthetic */ void setEvalInterceptor(com.tencent.mm.plugin.appbrand.jsapi.i iVar);

    /* synthetic */ void setInterceptor(com.tencent.mm.plugin.appbrand.jsapi.k kVar);

    /* bridge */ /* synthetic */ default boolean t() {
        return false;
    }

    /* synthetic */ void u(java.util.Collection collection);

    @Override // uh1.v
    default uh1.u v() {
        return t3();
    }

    com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x();
}
