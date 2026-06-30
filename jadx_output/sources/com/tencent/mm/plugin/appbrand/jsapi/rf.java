package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class rf extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 644;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "preloadMiniProgramEnv";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.pf pfVar;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null || jSONObject == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.of ofVar = com.tencent.mm.plugin.appbrand.jsapi.pf.f82704e;
        java.lang.String optString = jSONObject.optString("type");
        ofVar.getClass();
        boolean z17 = true;
        if (optString != null) {
            com.tencent.mm.plugin.appbrand.jsapi.pf[] values = com.tencent.mm.plugin.appbrand.jsapi.pf.values();
            int length = values.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    pfVar = com.tencent.mm.plugin.appbrand.jsapi.pf.f82705f;
                    break;
                }
                com.tencent.mm.plugin.appbrand.jsapi.pf pfVar2 = values[i18];
                if (r26.i0.p(optString, pfVar2.name(), true)) {
                    pfVar = pfVar2;
                    break;
                }
                i18++;
            }
        } else {
            pfVar = com.tencent.mm.plugin.appbrand.jsapi.pf.f82705f;
        }
        com.tencent.mm.plugin.appbrand.task.x0 x0Var = pfVar.f82707d;
        if (x0Var == com.tencent.mm.plugin.appbrand.task.x0.WAGAME) {
            if ((!com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.c(yVar) || ha1.m.a()) && !com.tencent.mm.plugin.appbrand.jsruntime.f2.f83986a.b() && (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.c(yVar) || !com.tencent.mm.plugin.appbrand.ui.t7.h() || !u46.l.a(com.tencent.mm.plugin.appbrand.task.z0.f89222n, bm5.f1.a()))) {
                z17 = false;
            }
            if (z17) {
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.jsapi.nf.class, null);
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                yVar.a(i17, u(str, jSONObject2));
                return;
            }
        }
        if (!com.tencent.mm.plugin.appbrand.task.r.b(x0Var)) {
            if (com.tencent.mm.plugin.appbrand.task.r.m(x0Var)) {
                yVar.a(i17, p("ok", kz5.b1.e(new jz5.l("alreadyExist", java.lang.Boolean.TRUE))));
                return;
            } else {
                yVar.a(i17, o("fail internal error"));
                return;
            }
        }
        boolean c17 = com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.c(yVar);
        com.tencent.mm.plugin.appbrand.task.preload.w wVar = com.tencent.mm.plugin.appbrand.task.preload.x.f89149a;
        int i19 = c17 ? 1539 : 1144;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.appbrand.service.x6 x6Var = com.tencent.mm.plugin.appbrand.service.x6.f88827r;
        g0Var.A(i19, 39);
        com.tencent.mm.plugin.appbrand.task.r.j(x0Var, new com.tencent.mm.plugin.appbrand.jsapi.qf(x0Var, i19, yVar, i17, this), true, null, x6Var, 2);
    }
}
