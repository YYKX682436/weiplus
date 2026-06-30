package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class l3$$a implements com.tencent.mm.app.a {
    @Override // com.tencent.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        try {
            com.tencent.mm.app.o4 o4Var = (com.tencent.mm.app.o4) ((com.tencent.mm.app.m3) obj).c(true);
            if (o4Var == null) {
                return;
            }
            jSONObject.put("threadCount", o4Var.f53560a);
            jSONObject.put("threadInfo", o4Var.f53561b);
        } catch (java.lang.Throwable unused) {
        }
    }
}
