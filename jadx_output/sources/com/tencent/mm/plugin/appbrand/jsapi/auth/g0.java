package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes5.dex */
public final class g0 {
    public g0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.appbrand.jsapi.auth.l0 a(android.content.Context context, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo info) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo mMAuthScopeRiskWxaAppInfo;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(info, "info");
        int i17 = info.f79453e;
        if (i17 != 0) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.i0 i0Var = i17 == 1 ? new com.tencent.mm.plugin.appbrand.jsapi.auth.i0(context) : null;
            if (i0Var != null) {
                return i0Var;
            }
        }
        int i18 = info.f79452d;
        if (i18 == 1) {
            return new com.tencent.mm.plugin.appbrand.jsapi.auth.j0(context, "");
        }
        if (i18 == 2) {
            return new com.tencent.mm.plugin.appbrand.jsapi.auth.j0(context, info.f79457i);
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.h0 h0Var = com.tencent.mm.plugin.appbrand.jsapi.auth.h0.f79567b;
        return (i18 == 3 && (mMAuthScopeRiskWxaAppInfo = info.f79458m) != null) ? new com.tencent.mm.plugin.appbrand.jsapi.auth.k0(context, mMAuthScopeRiskWxaAppInfo.f79459d, mMAuthScopeRiskWxaAppInfo.f79463h, mMAuthScopeRiskWxaAppInfo.f79460e, mMAuthScopeRiskWxaAppInfo.f79462g, mMAuthScopeRiskWxaAppInfo.f79461f) : h0Var;
    }
}
