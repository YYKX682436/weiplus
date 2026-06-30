package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class l3$$b implements com.tencent.mm.app.a {
    @Override // com.tencent.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        try {
            com.tencent.mm.app.n4 n4Var = (com.tencent.mm.app.n4) ((com.tencent.mm.app.m3) obj).c(true);
            if (n4Var == null) {
                return;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, n4Var.f53530a);
            jSONObject2.put("blockSize", n4Var.f53531b);
            jSONObject2.put("blockCount", n4Var.f53532c);
            jSONObject2.put("leftSpace", n4Var.f53533d * n4Var.f53531b);
            jSONObject.put("private", jSONObject2);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, n4Var.f53534e);
            jSONObject3.put("blockSize", n4Var.f53535f);
            jSONObject3.put("blockCount", n4Var.f53536g);
            jSONObject3.put("leftSpace", n4Var.f53537h * n4Var.f53535f);
            jSONObject.put("sdcard", jSONObject3);
        } catch (java.lang.Throwable unused) {
        }
    }
}
