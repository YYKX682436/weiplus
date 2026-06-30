package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class d1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f263829d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f1 f1Var, sd.b bVar) {
        this.f263829d = bVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        sd.b bVar = this.f263829d;
        if (c10756x2a5d7b2d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10756x2a5d7b2d.f149939d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetLocalImgData", "path is null");
            bVar.c("fail", null);
            return;
        }
        try {
            java.lang.String str = c10756x2a5d7b2d.f149939d;
            if (str != null) {
                java.lang.String a17 = fy4.f.f348794a.a(str, 0);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("localData", a17);
                    bVar.e(jSONObject);
                    return;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetLocalImgData", e17.getMessage());
        }
        bVar.c("fail", null);
    }
}
