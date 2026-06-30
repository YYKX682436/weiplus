package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.q3$$b */
/* loaded from: classes12.dex */
public final /* synthetic */ class C5092x6501ac0 implements com.p314xaae8f345.mm.app.a {
    @Override // com.p314xaae8f345.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        java.util.Map map = (java.util.Map) ((com.p314xaae8f345.mm.app.m3) obj).c(true);
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
