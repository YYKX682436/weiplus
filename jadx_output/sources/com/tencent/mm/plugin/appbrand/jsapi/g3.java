package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes9.dex */
final class g3 extends com.tencent.mm.plugin.appbrand.ipc.v {
    private g3() {
    }

    private int c(com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavRequest jsApiAddToFavorites$IPCFavRequest) {
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.h0(19);
        gp0Var.B0(jsApiAddToFavorites$IPCFavRequest.f78503n);
        if (com.tencent.mm.sdk.platformtools.t8.K0(jsApiAddToFavorites$IPCFavRequest.f78503n)) {
            gp0Var.z0(true);
        }
        gp0Var.A0(jsApiAddToFavorites$IPCFavRequest.f78503n);
        gp0Var.O0(jsApiAddToFavorites$IPCFavRequest.f78502m);
        gp0Var.m0(jsApiAddToFavorites$IPCFavRequest.f78502m);
        gp0Var.e0(o72.d2.d(gp0Var.toString(), 19));
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.g(jsApiAddToFavorites$IPCFavRequest.f78506q);
        r45.dp0 dp0Var = new r45.dp0();
        dp0Var.f372635e = jsApiAddToFavorites$IPCFavRequest.f78497e;
        dp0Var.f372637g = jsApiAddToFavorites$IPCFavRequest.f78499g;
        dp0Var.f372639i = jsApiAddToFavorites$IPCFavRequest.f78498f;
        dp0Var.f372636f = jsApiAddToFavorites$IPCFavRequest.f78501i;
        dp0Var.f372641n = jsApiAddToFavorites$IPCFavRequest.f78500h;
        dp0Var.f372634d = jsApiAddToFavorites$IPCFavRequest.f78496d;
        dp0Var.f372642o = jsApiAddToFavorites$IPCFavRequest.f78504o;
        dp0Var.f372646s = jsApiAddToFavorites$IPCFavRequest.f78505p;
        dp0Var.f372644q = jsApiAddToFavorites$IPCFavRequest.f78507r;
        dp0Var.f372645r = jsApiAddToFavorites$IPCFavRequest.f78508s;
        r45.bq0 bq0Var = new r45.bq0();
        bq0Var.f370964f.add(gp0Var);
        bq0Var.b(dp0Var);
        bq0Var.o(jq0Var);
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        bq0Var.p(jsApiAddToFavorites$IPCFavRequest.f78502m);
        java.lang.String str = jsApiAddToFavorites$IPCFavRequest.f78502m;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6319e = str;
        c4Var.f6318d = str;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 19;
        doFavoriteEvent.e();
        return doFavoriteEvent.f54091h.f6433a;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavRequest jsApiAddToFavorites$IPCFavRequest = (com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavRequest) appBrandProxyUIProcessTask$ProcessRequest;
        if (jsApiAddToFavorites$IPCFavRequest.f78510u) {
            com.tencent.mm.plugin.appbrand.ui.na.g(getActivityContext(), true);
        }
        int c17 = c(jsApiAddToFavorites$IPCFavRequest);
        com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavResult jsApiAddToFavorites$IPCFavResult = new com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavResult();
        jsApiAddToFavorites$IPCFavResult.f78511d = c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddToFavorites", "fav result:%d", java.lang.Integer.valueOf(c17));
        n82.e eVar = (n82.e) i95.n0.c(n82.e.class);
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        com.tencent.mm.plugin.appbrand.jsapi.e3 e3Var = new com.tencent.mm.plugin.appbrand.jsapi.e3(this, jsApiAddToFavorites$IPCFavResult);
        com.tencent.mm.plugin.appbrand.jsapi.f3 f3Var = new com.tencent.mm.plugin.appbrand.jsapi.f3(this);
        ((a40.k) eVar).getClass();
        com.tencent.mm.plugin.fav.ui.u1.f(-1, c17, 32, activityContext, null, e3Var, null, f3Var);
    }
}
