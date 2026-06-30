package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class ec implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession$RefreshSessionTask f80771d;

    public ec(com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession$RefreshSessionTask jsApiRefreshSession$RefreshSessionTask) {
        this.f80771d = jsApiRefreshSession$RefreshSessionTask;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.j14 j14Var;
        com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession$RefreshSessionTask jsApiRefreshSession$RefreshSessionTask = this.f80771d;
        if (i17 != 0 || i18 != 0) {
            jsApiRefreshSession$RefreshSessionTask.f78606o = 0;
            jsApiRefreshSession$RefreshSessionTask.f78609r = "cgi fail";
            jsApiRefreshSession$RefreshSessionTask.c();
            return 0;
        }
        r45.p24 p24Var = (r45.p24) oVar.f70711b.f70700a;
        if (p24Var == null || (j14Var = p24Var.f382680d) == null) {
            jsApiRefreshSession$RefreshSessionTask.f78606o = 0;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest failed, response is null!");
            jsApiRefreshSession$RefreshSessionTask.c();
        } else {
            int i19 = j14Var.f377491d;
            jsApiRefreshSession$RefreshSessionTask.f78605n = i19;
            jsApiRefreshSession$RefreshSessionTask.f78609r = j14Var.f377492e;
            if (i19 == 0) {
                jsApiRefreshSession$RefreshSessionTask.f78604m = p24Var.f382681e;
                jsApiRefreshSession$RefreshSessionTask.f78605n = i19;
                jsApiRefreshSession$RefreshSessionTask.f78606o = 1;
                jsApiRefreshSession$RefreshSessionTask.c();
            } else {
                jsApiRefreshSession$RefreshSessionTask.f78605n = i19;
                jsApiRefreshSession$RefreshSessionTask.f78606o = 2;
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest ERROR %s", str);
                jsApiRefreshSession$RefreshSessionTask.c();
            }
        }
        return 0;
    }
}
