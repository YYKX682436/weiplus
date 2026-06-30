package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.p3$$b */
/* loaded from: classes12.dex */
public final /* synthetic */ class C5079x642033f implements com.p314xaae8f345.mm.app.a {
    @Override // com.p314xaae8f345.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        java.lang.String str2 = (java.lang.String) ((com.p314xaae8f345.mm.app.m3) obj).c(true);
        if (str2 == null) {
            return;
        }
        java.lang.String[] split = str2.split("\n");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(split.length);
            for (java.lang.String str3 : split) {
                if (str3.startsWith("\t")) {
                    arrayList.add(str3.substring(1));
                } else {
                    arrayList.add(str3);
                }
            }
            jSONObject.put("contents", org.json.JSONObject.wrap(arrayList));
        } catch (org.json.JSONException unused) {
        }
    }
}
