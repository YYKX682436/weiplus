package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f262412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f262413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i f262414c;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m mVar, java.util.List list, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i iVar) {
        this.f262412a = list;
        this.f262413b = map;
        this.f262414c = iVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.Map map;
        java.util.Iterator it = this.f262412a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            map = this.f262413b;
            at4.k kVar = null;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
            java.lang.String str = c19091x9511676c.f69223x58802fcb;
            if (dt4.b.f324762b == null) {
                dt4.b.d();
            }
            boolean z17 = true;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) ((java.util.HashMap) dt4.b.f324762b).get(str))) {
                java.lang.String str2 = (java.lang.String) ((java.util.HashMap) dt4.b.f324762b).get(str);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    at4.k kVar2 = new at4.k();
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                        long optLong = jSONObject.optLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, 0L);
                        kVar2.f95411a = jSONObject.getString("logo2x_url");
                        kVar2.f95412b = jSONObject.getString("bg2x_url");
                        kVar2.f95413c = jSONObject.getString("wl2x_url");
                        if ((java.lang.System.currentTimeMillis() / 1000) - optLong <= 7200) {
                            z17 = false;
                        }
                        kVar2.f95417g = z17;
                        kVar2.f95414d = dt4.b.a(kVar2.f95411a);
                        kVar2.f95418h = jSONObject.optString("bank_name_pinyin", "");
                        kVar = kVar2;
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletBankLogoStorage", e17, "", new java.lang.Object[0]);
                    }
                }
            }
            map.put(c19091x9511676c.f69223x58802fcb, kVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i iVar = this.f262414c;
        if (iVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WalletBankCardSelectUI", "get logo callback: %s", java.lang.Integer.valueOf(map.size()));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.t0) iVar).f262154a.V6(map);
        }
        return null;
    }
}
