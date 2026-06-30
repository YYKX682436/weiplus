package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class bd extends be1.r0 {
    @Override // be1.r0
    public void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String appId = e9Var.getAppId();
        com.tencent.mm.plugin.appbrand.page.i3 x07 = e9Var.getRuntime().x0();
        if (x07 == null || x07.getCurrentPage() == null) {
            return;
        }
        new com.tencent.mm.plugin.appbrand.jsapi.JsApiSetClipboardDataWC$ReportClipBoardTask(appId, x07.getCurrentPage().getCurrentUrl(), str.getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)).length).d();
    }
}
