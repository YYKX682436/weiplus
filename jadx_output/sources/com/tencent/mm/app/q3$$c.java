package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class q3$$c implements com.tencent.mm.app.a {
    @Override // com.tencent.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        java.util.List<android.util.Pair> list = (java.util.List) ((com.tencent.mm.app.m3) obj).c(true);
        if (list != null) {
            try {
                for (android.util.Pair pair : list) {
                    jSONObject.put((java.lang.String) pair.first, pair.second);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
