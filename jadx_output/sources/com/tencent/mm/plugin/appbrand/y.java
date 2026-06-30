package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class y extends com.tencent.mm.plugin.appbrand.jsapi.e0 {
    public final void L0(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        iCommLibReader.getClass();
        super.w0(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class, iCommLibReader);
    }

    public com.tencent.mm.plugin.appbrand.appcache.y3 M0() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = t3();
        if (t37 == null) {
            return null;
        }
        return com.tencent.mm.plugin.appbrand.appcache.la.o(t37, false);
    }

    public abstract void N0(xi1.g gVar);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public java.lang.String getAppId() {
        if (t3() == null) {
            return null;
        }
        return t3().f74803n;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public u81.b getAppState() {
        return !isRunning() ? u81.b.DESTROYED : t3().N.b();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public fl1.g2 getAuthorizeDialogContainer() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = t3();
        if (t37 != null) {
            return t37.getAuthorizeDialogContainer();
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public final android.content.Context getContext() {
        if (t3() == null) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.app.Activity r07 = t3().r0();
        if (r07 != null) {
            return r07;
        }
        android.content.Context context = t3().f74795d;
        return context != null ? context : com.tencent.mm.sdk.platformtools.x2.f193071a;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public fl1.g2 getDialogContainer() {
        return !isRunning() ? super.getDialogContainer() : t3().getDialogContainer();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem() {
        return !isRunning() ? super.getFileSystem() : t3().getFileSystem();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public androidx.lifecycle.y getLifecycleOwner() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = t3();
        if (t37 == null) {
            return null;
        }
        return t37.P;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0
    /* renamed from: getRuntime */
    public abstract /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime t3();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public /* bridge */ /* synthetic */ xi1.g getWindowAndroid() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public boolean isRunning() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = t3();
        return (t37 == null || t37.L0()) ? false : true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.h0> T k(java.lang.Class<T> cls) {
        T t17;
        return (!isRunning() || (t17 = (T) t3().k(cls)) == null) ? (T) super.k(cls) : t17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean l(com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var) {
        if (isRunning() && t3().l(h0Var)) {
            return true;
        }
        return super.l(h0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getContext();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public final <T extends nd.b> T q(java.lang.Class<T> cls) {
        T t17;
        if (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class == cls) {
            return (T) super.q(cls);
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = t3();
        return (t37 == null || (t17 = (T) t37.K1(cls)) == null) ? (T) super.q(cls) : t17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m
    public com.tencent.mm.plugin.appbrand.jsapi.g0 t0(java.lang.Class cls) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = t3();
        if (t37 != null) {
            return t37.p0(cls, false);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0
    public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x() {
        return (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) q(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class);
    }
}
