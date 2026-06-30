package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public abstract class p3 {
    public static final int a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        int b17 = com.tencent.mm.plugin.appbrand.jsapi.xf.b(str);
        if (b17 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteMainProcess, durationS: " + b17);
            return Integer.MIN_VALUE;
        }
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.jsapi.xf.a(str, str2);
        if (a17 == null || a17.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteMainProcess, thumbPath is empty");
            return Integer.MIN_VALUE;
        }
        ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
        com.tencent.mm.pluginsdk.model.a2.h(doFavoriteEvent, 6, str, a17, b17, "", "", true);
        doFavoriteEvent.e();
        int i17 = doFavoriteEvent.f54091h.f6433a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteMainProcess, ret: " + i17);
        return i17;
    }
}
