package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class s extends com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.a {
    public static final int CTRL_INDEX = 251;
    public static final java.lang.String NAME = "navigateToMiniProgram";

    public void D(com.tencent.mm.plugin.appbrand.config.l lVar, org.json.JSONObject jSONObject) {
    }

    public com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g E(com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject, int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.u(this, yVar, i17, jSONObject);
    }

    public void F(final com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, int i17, java.lang.String str, final com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.v vVar) {
        final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig clone = appBrandRuntime.u0().clone();
        clone.f77281g = i17;
        clone.f77283i = str;
        appBrandRuntime.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.v.this.getClass();
                appBrandRuntime.z1(clone, wg1.b.f445718n.h());
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x03c6  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.y r43, org.json.JSONObject r44, int r45) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s.A(com.tencent.mm.plugin.appbrand.y, org.json.JSONObject, int):void");
    }

    public void H(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
    }

    public boolean I(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, org.json.JSONObject jSONObject) {
        return true;
    }

    public final double J(double d17) {
        if (d17 == -2.0d) {
            return d17;
        }
        if (d17 < 0.0d) {
            d17 = 0.0d;
        }
        return ik1.w.f() * d17;
    }
}
