package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class ga extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34328x366c91de = 982;

    /* renamed from: NAME */
    public static final java.lang.String f34329x24728b = "openWCExDeviceList";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWCExDeviceList", "invoke JsApiOpenWCExDeviceList!");
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenWCExDeviceList", "fail:component is null");
            return;
        }
        if (lVar.mo50352x76847179() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenWCExDeviceList", "fail:context is null");
            lVar.a(i17, o("fail"));
        } else {
            j45.l.j(lVar.mo50352x76847179(), "exdevice", ".ui.ExdeviceManageDeviceUI", new android.content.Intent(), null);
            lVar.a(i17, o("ok"));
        }
    }
}
