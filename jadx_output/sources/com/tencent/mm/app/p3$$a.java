package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class p3$$a implements com.tencent.mm.app.a {
    @Override // com.tencent.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        java.lang.String str2 = (java.lang.String) ((com.tencent.mm.app.m3) obj).c(true);
        if (str2 == null) {
            return;
        }
        try {
            jSONObject.put("contents", org.json.JSONObject.wrap(str2.split("\n")));
        } catch (org.json.JSONException unused) {
        }
    }
}
