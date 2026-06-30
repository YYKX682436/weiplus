package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class u0 implements i11.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f264001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.x0 f264003f;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.x0 x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, java.lang.String str) {
        this.f264003f = x0Var;
        this.f264001d = q5Var;
        this.f264002e = str;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        return false;
    }

    @Override // i11.d
    public boolean w6(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19, android.os.Bundle bundle) {
        i11.d dVar;
        if (!z17) {
            this.f264003f.g(this.f264001d, "location_error");
            return true;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("longitude", f17);
            jSONObject.put("latitude", f18);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54483x1466c762, d17);
            jSONObject.put("accuracy", d18);
            jSONObject.put("type", this.f264002e);
            if (bundle != null) {
                jSONObject.put("indoor_building_id", bundle.getString("indoor_building_id"));
                jSONObject.put("indoor_building_floor", bundle.getString("indoor_building_floor"));
                jSONObject.put("indoor_building_type", bundle.getInt("indoor_building_type"));
            }
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.x0 x0Var = this.f264003f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f264001d;
        synchronized (x0Var) {
            x0Var.f264036e.unregisterReceiver(x0Var.f264044p);
            i11.e eVar = x0Var.f264040i;
            if (eVar != null && (dVar = x0Var.f264041m) != null) {
                ((i11.h) eVar).m(dVar);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = x0Var.f264042n;
            if (n3Var != null) {
                n3Var.mo50302x6b17ad39(null);
            }
            x0Var.f264041m = null;
            if (!x0Var.f264039h) {
                x0Var.f264039h = true;
                q5Var.a(null, jSONObject);
            }
        }
        return false;
    }
}
