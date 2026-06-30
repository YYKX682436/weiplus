package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class k1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private k1() {
    }

    public final long a(java.lang.String str) {
        long j17 = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0L;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
            sVar.d(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.j1(this, jSONObject));
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData();
            openExtraData.f37267x68af8e1 = sVar;
            j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65289x6ce315f5();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65475x36d8ff6e(j17, openExtraData);
            return j17;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppFeatureService", e17, "", new java.lang.Object[0]);
            return j17;
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.C10622xe53aefa1 c10622xe53aefa1 = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.C10622xe53aefa1) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "OpenLiteApp in mm process");
        try {
            java.lang.String str = c10622xe53aefa1.f148649d;
            java.lang.String str2 = c10622xe53aefa1.f148650e;
            java.lang.String str3 = c10622xe53aefa1.f148651f;
            java.lang.Boolean bool = c10622xe53aefa1.f148652g;
            java.lang.Boolean bool2 = c10622xe53aefa1.f148653h;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).sj(7, null);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.d();
            int indexOf = str.indexOf("@");
            java.lang.String substring = indexOf >= 0 ? str.substring(0, indexOf) : str;
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 Bj = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(substring);
            if (Bj != null && str2 != null && !str2.isEmpty()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, Bj.f14369x346425);
                bundle.putString("appId", str);
                bundle.putString("signatureKey", Bj.f14372xa8503287);
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65520x18714402(str2, ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ej(Bj.f14369x346425, substring, Bj.f14372xa8503287))) {
                    bool = java.lang.Boolean.TRUE;
                    bool2 = bool;
                }
            }
            if (Bj == null) {
                bool2 = java.lang.Boolean.TRUE;
                bool = bool2;
            }
            if (!bool.booleanValue()) {
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(a(str3)));
            } else if (bool2.booleanValue()) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).hj(str, bool2.booleanValue(), false, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i1(this, rVar, str3));
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).hj(str, bool2.booleanValue(), true, null);
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(a(str3)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppFeatureService", e17, "OpenLiteApp exception", new java.lang.Object[0]);
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(-1L));
        }
    }
}
