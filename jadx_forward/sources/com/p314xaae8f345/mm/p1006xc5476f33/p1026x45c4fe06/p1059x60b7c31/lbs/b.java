package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public abstract class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: g, reason: collision with root package name */
    public boolean f162924g;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean c17;
        if (C(lVar)) {
            c17 = true;
        } else {
            if (this.f162924g) {
                lVar.a(i17, o("fail:system permission denied"));
            } else {
                android.app.Activity activity = lVar.mo50352x76847179() instanceof android.app.Activity ? (android.app.Activity) lVar.mo50352x76847179() : null;
                if (activity == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "operateRecorder, pageContext is null");
                    lVar.a(i17, o("fail:internal error invalid android context"));
                } else {
                    c17 = nf.g.a(activity).c(lVar, "android.permission.ACCESS_FINE_LOCATION", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.a(this, lVar, jSONObject, i17));
                }
            }
            c17 = false;
        }
        if (!c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "%s requestPermission fail", k());
        } else if (jSONObject != null) {
            D(lVar, jSONObject, i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "%s invalid data", k());
            lVar.a(i17, o("fail:invalid data"));
        }
    }

    public final boolean C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            mo50352x76847179 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        return nf.t.b(mo50352x76847179, lVar, "android.permission.ACCESS_FINE_LOCATION");
    }

    public abstract void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17);
}
