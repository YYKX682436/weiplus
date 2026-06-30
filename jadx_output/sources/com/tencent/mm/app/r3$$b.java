package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class r3$$b implements com.tencent.mm.app.a {
    @Override // com.tencent.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        java.lang.String[] strArr = (java.lang.String[]) ((com.tencent.mm.app.m3) obj).c(true);
        if (strArr != null) {
            try {
                jSONObject.put("lines", strArr.length);
                jSONObject.put("contents", org.json.JSONObject.wrap(strArr));
            } catch (org.json.JSONException unused) {
            }
        }
    }
}
