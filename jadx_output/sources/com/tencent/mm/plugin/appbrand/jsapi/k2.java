package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes8.dex */
public abstract class k2 {
    public static final int a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.jsapi.wf.a(str, str2, str3);
        ((com.tencent.mm.pluginsdk.model.b2) c5Var).getClass();
        com.tencent.mm.pluginsdk.model.a2.k(doFavoriteEvent, 6, str, a17, "", str2);
        doFavoriteEvent.e();
        int i17 = doFavoriteEvent.f54091h.f6433a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "doFavoriteMainProcess, ret: " + i17);
        return i17;
    }
}
