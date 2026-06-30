package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public abstract class o2 {
    public static final com.tencent.mm.modelmulti.WxaInfo a(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, java.lang.String enterPath) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(enterPath, "enterPath");
        java.lang.String str = runtime.f74803n;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareImageHelper", "resolveWxaInfo, appId is null");
            return null;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = runtime.u0();
        java.lang.String str2 = u07 != null ? u07.f77279e : null;
        if (str2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareImageHelper", "resolveWxaInfo, nickname is null");
            return null;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u08 = runtime.u0();
        java.lang.String str3 = u08 != null ? u08.f77280f : null;
        if (str3 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareImageHelper", "resolveWxaInfo, iconUrl is null");
            return null;
        }
        com.tencent.mm.modelmulti.WxaInfo wxaInfo = new com.tencent.mm.modelmulti.WxaInfo(str, str2, str3, enterPath, "1", 1, runtime.f74805p.f77281g);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImageHelper", "resolveWxaInfo, screenshotInfo: " + wxaInfo);
        return wxaInfo;
    }
}
