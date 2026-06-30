package com.tencent.mm.plugin.appbrand;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;", "", "isGame", "plugin-appbrand-integration_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandRuntimeWCAccessible {
    public static final java.lang.String a(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.d0 ? (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar : null;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = d0Var != null ? d0Var.t3() : null;
        com.tencent.mm.plugin.appbrand.o6 o6Var = t37 instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) t37 : null;
        if (o6Var == null || (u07 = o6Var.u0()) == null) {
            return null;
        }
        return u07.f47278x;
    }

    public static final boolean b(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = appBrandInitConfig instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC ? (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig : null;
        if (appBrandInitConfigWC != null) {
            return appBrandInitConfigWC.k();
        }
        return false;
    }

    public static final boolean c(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.d0 ? (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar : null;
        if (d0Var == null || (t37 = d0Var.t3()) == null) {
            return false;
        }
        return isGame(t37);
    }

    public static final boolean d(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.d0 ? (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar : null;
        com.tencent.mm.plugin.appbrand.utils.n2 t37 = d0Var != null ? d0Var.t3() : null;
        com.tencent.mm.plugin.appbrand.o6 o6Var = t37 instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) t37 : null;
        return o6Var != null && true == o6Var.r2();
    }

    public static final boolean e(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        com.tencent.mm.plugin.appbrand.o6 o6Var = appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) appBrandRuntime : null;
        if (o6Var != null) {
            return o6Var.e3();
        }
        return false;
    }

    public static final boolean isGame(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        com.tencent.mm.plugin.appbrand.o6 o6Var = appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) appBrandRuntime : null;
        if (o6Var != null) {
            return o6Var.q2();
        }
        return false;
    }
}
