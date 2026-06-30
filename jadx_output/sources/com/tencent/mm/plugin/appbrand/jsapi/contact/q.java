package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public final class q extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 72;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "chooseContact";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null || jSONObject == null) {
            return;
        }
        android.app.Activity a17 = q75.a.a(lVar.getContext());
        if (a17 == null) {
            lVar.a(i17, "fail:internal error invalid android context");
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 30) {
            C(lVar, a17, jSONObject, i17);
        } else if (b3.l.checkSelfPermission(a17, "android.permission.READ_CONTACTS") == 0) {
            C(lVar, a17, jSONObject, i17);
        } else {
            nf.g.a(a17).c(lVar, "android.permission.READ_CONTACTS", new com.tencent.mm.plugin.appbrand.jsapi.contact.o(this, lVar, a17, jSONObject, i17));
        }
    }

    public final void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, android.app.Activity activity, org.json.JSONObject jSONObject, int i17) {
        nf.g a17 = nf.g.a(activity);
        android.content.Intent intent = new android.content.Intent("android.intent.action.PICK");
        intent.setType("vnd.android.cursor.dir/phone_v2");
        a17.j(intent, new com.tencent.mm.plugin.appbrand.jsapi.contact.p(lVar, i17, this));
    }
}
