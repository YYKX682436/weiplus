package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class q3 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r3 f225257a;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r3 r3Var) {
        this.f225257a = r3Var;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenBizTimelinePublish", "Success: " + z17 + ", Error: " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r3 r3Var = this.f225257a;
        if (!z17) {
            jd.c cVar = r3Var.f224975e;
            if (str == null) {
                str = "";
            }
            cVar.b(str);
            return;
        }
        if (jSONObject != null) {
            if (str != null) {
                try {
                    jSONObject.put("errorMessage", str);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiOpenBizTimelinePublish", e17, "", new java.lang.Object[0]);
                }
            }
            r3Var.f224975e.f(jSONObject, false);
            return;
        }
        jd.c cVar2 = r3Var.f224975e;
        if (str == null) {
            str = "";
        }
        cVar2.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msg", str);
        cVar2.e(hashMap);
    }
}
