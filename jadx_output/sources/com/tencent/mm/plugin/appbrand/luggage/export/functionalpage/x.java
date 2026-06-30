package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public interface x extends com.tencent.mm.plugin.appbrand.jsapi.d0 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* synthetic */ void a(int i17, java.lang.String str);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.g0 b(java.lang.Class cls);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ boolean c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* synthetic */ void d(java.lang.String str, java.lang.String str2, int[] iArr);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* synthetic */ void e(java.lang.String str, java.lang.String str2, int i17);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* bridge */ /* synthetic */ default com.tencent.mm.plugin.appbrand.jsapi.k0 f(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ void g(java.lang.String str, java.lang.String str2);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    /* synthetic */ java.lang.String getAppId();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    /* synthetic */ u81.b getAppState();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* bridge */ /* synthetic */ default qu5.a getAsyncHandler() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* bridge */ /* synthetic */ default fl1.g2 getAuthorizeDialogContainer() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* synthetic */ int getComponentId();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ android.content.Context getContext();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ fl1.g2 getDialogContainer();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k getInterceptor();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* bridge */ /* synthetic */ default com.tencent.mm.plugin.appbrand.jsapi.Cif getInvokeCostManager() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t getJsRuntime();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* bridge */ /* synthetic */ default androidx.lifecycle.y getLifecycleOwner() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* renamed from: getRuntime */
    com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t t3();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* bridge */ /* synthetic */ default xi1.g getWindowAndroid() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* synthetic */ void h();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    /* synthetic */ void i(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, int[] iArr);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* synthetic */ boolean isRunning();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ void j(java.lang.Runnable runnable, long j17);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.h0 k(java.lang.Class cls);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ boolean l(com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ void m(java.lang.Runnable runnable);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    default android.content.Context n() {
        return getContext();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    default void o(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).g(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ void p(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    /* synthetic */ nd.b q(java.lang.Class cls);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* synthetic */ void r(com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* synthetic */ boolean s(java.lang.String str);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* synthetic */ void setEvalInterceptor(com.tencent.mm.plugin.appbrand.jsapi.i iVar);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* synthetic */ void setInterceptor(com.tencent.mm.plugin.appbrand.jsapi.k kVar);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* bridge */ /* synthetic */ default boolean t() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* synthetic */ void u(java.util.Collection collection);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    /* bridge */ /* synthetic */ default uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x();
}
