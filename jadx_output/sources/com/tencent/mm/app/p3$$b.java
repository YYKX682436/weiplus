package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class p3$$b implements com.tencent.mm.app.a {
    @Override // com.tencent.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        java.lang.String str2 = (java.lang.String) ((com.tencent.mm.app.m3) obj).c(true);
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
