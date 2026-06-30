package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class q3$$b implements com.tencent.mm.app.a {
    @Override // com.tencent.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        java.util.Map map = (java.util.Map) ((com.tencent.mm.app.m3) obj).c(true);
        if (map != null) {
            try {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
