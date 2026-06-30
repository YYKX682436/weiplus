package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.p3$$a */
/* loaded from: classes12.dex */
public final /* synthetic */ class C5078x642033e implements com.p314xaae8f345.mm.app.a {
    @Override // com.p314xaae8f345.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        java.lang.String str2 = (java.lang.String) ((com.p314xaae8f345.mm.app.m3) obj).c(true);
        if (str2 == null) {
            return;
        }
        try {
            jSONObject.put("contents", org.json.JSONObject.wrap(str2.split("\n")));
        } catch (org.json.JSONException unused) {
        }
    }
}
