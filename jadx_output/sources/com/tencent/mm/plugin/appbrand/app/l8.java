package com.tencent.mm.plugin.appbrand.app;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public class l8 extends i95.w implements com.tencent.mm.plugin.appbrand.service.r5 {
    public static boolean wi(java.lang.String str, cl0.g gVar) {
        try {
            cl0.g gVar2 = new cl0.g(gVar.optString("invokeData"));
            java.lang.String optString = gVar2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            cl0.g gVar3 = new cl0.g(gVar2.optString("args"));
            if (!"standaloneFunctionalDirectApi".equals(optString)) {
                return false;
            }
            oj1.e.a(str, oj1.d.valueOf(gVar3.optString("standaloneDirectApiType")), gVar3);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public int Ai() {
        if (!gm0.j1.b().f273254q || !i95.n0.h(l81.q0.class)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ServiceForWebView", "getWxaCommLibVersion, invalid account status, stack:%s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return -1;
        }
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader a17 = com.tencent.mm.plugin.appbrand.appcache.x7.a();
        if (a17 == null) {
            try {
                com.tencent.mm.plugin.appbrand.appcache.v7.b();
                a17 = com.tencent.mm.plugin.appbrand.appcache.x7.a();
            } catch (c01.c unused) {
                return -1;
            }
        }
        if (a17 == null) {
            return -1;
        }
        return a17.i();
    }

    public void Eh(final java.lang.String str, final r.a aVar) {
        if (!android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.appbrand.appcache.f8.a(true, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.app.l8$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC I = com.tencent.mm.plugin.appbrand.task.u0.C().I(str);
                    r.a aVar2 = aVar;
                    if (I == null) {
                        if (aVar2 != null) {
                            aVar2.apply("fail miniprogram not running");
                            return;
                        }
                        return;
                    }
                    if (aVar2 != null) {
                        aVar2.apply("ok");
                    }
                    com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel a17 = k91.h0.a(I);
                    a17.Z = true;
                    ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).a(com.tencent.mm.sdk.platformtools.x2.f193071a, a17);
                }
            });
        } else if (aVar != null) {
            aVar.apply("fail invalid appId");
        }
    }

    public void Ug(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.service.q5 q5Var) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ServiceForWebView", "privateOpenWeappFunctionalPage invalid uuid");
        } else {
            pq5.h.a().q(new com.tencent.mm.plugin.appbrand.app.r8(this, str, str2, q5Var)).B();
        }
    }

    public km5.q g2(java.lang.String str) {
        return pq5.h.a().h(new com.tencent.mm.plugin.appbrand.app.n8(this, str));
    }

    public void oh(int i17, java.lang.String str, java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar;
        android.util.SparseArray sparseArray = com.tencent.mm.plugin.appbrand.jsapi.webview.a.f83870a;
        android.util.SparseArray sparseArray2 = com.tencent.mm.plugin.appbrand.jsapi.webview.a.f83870a;
        synchronized (sparseArray2) {
            oVar = (com.tencent.mm.plugin.appbrand.jsapi.webview.o) sparseArray2.get(i17);
        }
        if (oVar != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            of1.w1 w1Var = (of1.w1) oVar;
            jSONObject.put("htmlId", w1Var.getCoverViewId());
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
            jSONObject.put("arg", obj);
            w1Var.F(jSONObject);
        }
    }

    public void p7(java.util.List list) {
        com.tencent.mm.plugin.appbrand.config.q.c(list, k91.h1.MP_PRELOAD, null).a(new com.tencent.mm.plugin.appbrand.app.p8(this));
    }

    public void sd(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event sendDataToMiniProgramFromH5Event = new com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event();
        sendDataToMiniProgramFromH5Event.f81271d = str;
        sendDataToMiniProgramFromH5Event.f81272e = str2;
        sendDataToMiniProgramFromH5Event.f81273f = i17;
        com.tencent.mm.plugin.appbrand.ipc.m0.b(str, sendDataToMiniProgramFromH5Event);
    }

    public void xh(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.task.u0.C().P(com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e, com.tencent.mm.plugin.appbrand.service.x6.f88828s);
    }
}
