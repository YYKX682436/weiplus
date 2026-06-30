package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f218758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f218759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.C15530x17431dc6 f218760f;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.C15530x17431dc6 c15530x17431dc6, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f218760f = c15530x17431dc6;
        this.f218758d = jSONObject;
        this.f218759e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        org.json.JSONObject jSONObject = this.f218758d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/FaceFlashProcessLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.String str = this.f218759e + "?customInfo=" + fp.s0.b(java.lang.String.format("appid=%s;errcode=%d;identifyid=%s", jSONObject.optString("key_app_id", ""), java.lang.Integer.valueOf(jSONObject.optInt("err_code", 0)), jSONObject.optString("verify_result", "")), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.j(this.f218760f.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.lang.Exception e17) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.C15530x17431dc6.f218573q;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e17, "face start feedback webview exception", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/flash/FaceFlashProcessLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
