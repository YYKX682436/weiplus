package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class j5 implements com.tencent.mm.plugin.appbrand.jsapi.nfc.e {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.j5 f90489d = new com.tencent.mm.plugin.appbrand.utils.j5();

    public final void a(boolean z17) {
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.nfc_open.ui.InnerNfcDispatchLogicUI"), z17 ? 1 : 2, 1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.WeChatNFCLogic", e17, "toggleWeChatNFCLogicUI fail", new java.lang.Object[0]);
        }
    }
}
