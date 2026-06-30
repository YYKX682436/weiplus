package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.l3$$b */
/* loaded from: classes12.dex */
public final /* synthetic */ class C5075x609a53b implements com.p314xaae8f345.mm.app.a {
    @Override // com.p314xaae8f345.mm.app.a
    public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
        try {
            com.p314xaae8f345.mm.app.n4 n4Var = (com.p314xaae8f345.mm.app.n4) ((com.p314xaae8f345.mm.app.m3) obj).c(true);
            if (n4Var == null) {
                return;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, n4Var.f135063a);
            jSONObject2.put("blockSize", n4Var.f135064b);
            jSONObject2.put("blockCount", n4Var.f135065c);
            jSONObject2.put("leftSpace", n4Var.f135066d * n4Var.f135064b);
            jSONObject.put("private", jSONObject2);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, n4Var.f135067e);
            jSONObject3.put("blockSize", n4Var.f135068f);
            jSONObject3.put("blockCount", n4Var.f135069g);
            jSONObject3.put("leftSpace", n4Var.f135070h * n4Var.f135068f);
            jSONObject.put("sdcard", jSONObject3);
        } catch (java.lang.Throwable unused) {
        }
    }
}
