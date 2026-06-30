package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.c1 f80154a = new com.tencent.mm.plugin.appbrand.jsapi.c1();

    public final boolean a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CheckIsThirdAppInstalledLogic", "checkByDeepLinkUrl, deepLinkUrl: " + str);
        if (str == null) {
            return false;
        }
        java.util.List w17 = com.tencent.mm.sdk.platformtools.t8.w1(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
        return !(w17 == null || w17.isEmpty());
    }
}
