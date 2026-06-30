package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.r3$$a */
/* loaded from: classes12.dex */
public final /* synthetic */ class C5096x65e3240 implements com.p314xaae8f345.mm.app.a {
    @Override // com.p314xaae8f345.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        java.lang.String[] strArr = (java.lang.String[]) ((com.p314xaae8f345.mm.app.m3) obj).c(true);
        if (strArr != null) {
            try {
                jSONObject.put("lines", strArr.length);
                jSONObject.put("contents", org.json.JSONObject.wrap(strArr));
            } catch (org.json.JSONException unused) {
            }
        }
    }
}
