package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.l3$$a */
/* loaded from: classes12.dex */
public final /* synthetic */ class C5074x609a53a implements com.p314xaae8f345.mm.app.a {
    @Override // com.p314xaae8f345.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        try {
            com.p314xaae8f345.mm.app.o4 o4Var = (com.p314xaae8f345.mm.app.o4) ((com.p314xaae8f345.mm.app.m3) obj).c(true);
            if (o4Var == null) {
                return;
            }
            jSONObject.put("threadCount", o4Var.f135093a);
            jSONObject.put("threadInfo", o4Var.f135094b);
        } catch (java.lang.Throwable unused) {
        }
    }
}
