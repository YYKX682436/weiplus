package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class j0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f221215d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.l0 l0Var, sd.b bVar) {
        this.f221215d = bVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("value");
        java.lang.String string2 = bundle.getString("weight");
        long j17 = bundle.getLong("expireTime");
        java.lang.String string3 = bundle.getString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("weight", string2);
            jSONObject.put("expireTime", j17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                jSONObject.put("value", string);
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                jSONObject.put("value", ew4.c.c().b(string3));
            }
        } catch (org.json.JSONException unused) {
        }
        boolean has = jSONObject.has("value");
        sd.b bVar = this.f221215d;
        if (has) {
            bVar.e(jSONObject);
        } else {
            bVar.a();
        }
    }
}
