package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public class j1 implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.e0 f235037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 f235039c;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var, j41.e0 e0Var2, java.lang.String str) {
        this.f235039c = e0Var;
        this.f235037a = e0Var2;
        this.f235038b = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0
    public boolean a(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str;
        android.content.Intent intent = new android.content.Intent();
        try {
            str = new org.json.JSONObject(this.f235037a.f379156e).optString("url");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NewContactWidgetNormal", e17, "loadProfile", new java.lang.Object[0]);
            str = "";
        }
        intent.putExtra("geta8key_scene", 58);
        java.lang.String str2 = this.f235038b;
        intent.putExtra("geta8key_username", str2);
        intent.putExtra("msgUsername", str2);
        intent.putExtra("rawUrl", str);
        j45.l.j(this.f235039c.f234953d, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }
}
