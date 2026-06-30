package qd1;

/* loaded from: classes.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76459x366c91de = 107;

    /* renamed from: NAME */
    private static final java.lang.String f76460x24728b = "showActionSheet";

    /* renamed from: g, reason: collision with root package name */
    public static qd1.g f443168g;

    public static void C(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setHeight(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj));
        textView.setGravity(17);
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
        textView.setTextSize(0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
        int b17 = i65.a.b(context, 18);
        textView.setPadding(b17, 0, b17, 0);
        textView.setText(str);
        k0Var.s(textView, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (V0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowActionSheet", "invoke JsApi JsApiShowActionSheet failed, current page view is null.");
            e9Var.a(i17, o("fail"));
            return;
        }
        int optInt = jSONObject.optInt(dm.i4.f66865x76d1ec5a, -1);
        java.lang.String a17 = nf.e.a(jSONObject, "alertText");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowActionSheet", "invoke, alertText: " + a17);
        java.lang.String optString = jSONObject.optString("itemList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                arrayList.add((java.lang.String) jSONArray.get(i18));
            }
            e9Var.m(new qd1.f(this, e9Var, V0, i17, optInt, a17, jSONObject, arrayList));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowActionSheet", e17.getMessage());
            e9Var.a(i17, o("fail"));
        }
    }
}
