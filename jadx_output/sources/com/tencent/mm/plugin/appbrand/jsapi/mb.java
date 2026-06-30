package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class mb extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 407;
    public static final java.lang.String NAME = "private_addContact";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        ((mq0.s0) ((mq0.d0) i95.n0.c(mq0.d0.class))).wi(mq0.g0.f330561g);
        int C = C();
        try {
            int i18 = jSONObject.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            java.lang.String string = jSONObject.getString(dm.i4.COL_USERNAME);
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateAddContact", "username nil");
                lVar.a(i17, o("fail:username is nil"));
                return;
            }
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            if (oVar == null || ((ox.g) oVar).Ui() || !com.tencent.mm.storage.z3.F3(string)) {
                com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactRequest jsApiPrivateAddContact$AddContactRequest = new com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactRequest();
                jsApiPrivateAddContact$AddContactRequest.f78594d = string;
                jsApiPrivateAddContact$AddContactRequest.f78595e = i18;
                jsApiPrivateAddContact$AddContactRequest.f78596f = C;
                com.tencent.mm.plugin.appbrand.jsapi.hb hbVar = new com.tencent.mm.plugin.appbrand.jsapi.hb(this, lVar, i17);
                android.content.Context context = lVar.getContext();
                java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
                com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiPrivateAddContact$AddContactRequest, hbVar, null);
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPrivateAddContact", "private_addContact fail, is photo account");
            com.tencent.mm.plugin.appbrand.jsapi.profile.b.a(lVar.getContext(), com.tencent.mm.R.string.n7b);
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str, jSONObject2));
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPrivateAddContact", "parse exp:%s", e18);
            lVar.a(i17, o("fail:parse exp"));
        }
    }

    public int C() {
        return 1;
    }
}
