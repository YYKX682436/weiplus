package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class ga extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 982;
    public static final java.lang.String NAME = "openWCExDeviceList";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWCExDeviceList", "invoke JsApiOpenWCExDeviceList!");
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCExDeviceList", "fail:component is null");
            return;
        }
        if (lVar.getContext() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCExDeviceList", "fail:context is null");
            lVar.a(i17, o("fail"));
        } else {
            j45.l.j(lVar.getContext(), "exdevice", ".ui.ExdeviceManageDeviceUI", new android.content.Intent(), null);
            lVar.a(i17, o("ok"));
        }
    }
}
