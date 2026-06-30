package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.q3$$a */
/* loaded from: classes12.dex */
public final /* synthetic */ class C5091x6501abf implements com.p314xaae8f345.mm.app.a {
    @Override // com.p314xaae8f345.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        java.util.List<android.util.Pair> list = (java.util.List) ((com.p314xaae8f345.mm.app.m3) obj).c(true);
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
