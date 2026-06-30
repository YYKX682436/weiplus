package xt1;

/* loaded from: classes4.dex */
public class d0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f537989d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f537990e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f537991f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f537992g;

    public d0(java.lang.String str, float f17, float f18, java.lang.String str2) {
        this.f537991f = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ou();
        lVar.f152198b = new r45.pu();
        lVar.f152199c = "/cgi-bin/micromsg-bin/cardshoplbs";
        lVar.f152200d = 1058;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f537989d = a17;
        r45.ou ouVar = (r45.ou) a17.f152243a.f152217a;
        ouVar.f464048d = str;
        ouVar.f464049e = f17;
        ouVar.f464050f = f18;
        ouVar.f464051g = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f537989d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.ou) oVar.f152243a.f152217a).f464048d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneCardShopLBS", "doScene fail, cardId is null");
            return -1;
        }
        this.f537990e = u0Var;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1058;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            java.lang.String str2 = ((r45.pu) this.f537989d.f152244b.f152233a).f464938d;
            if (android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd fail, json_ret is empty");
            }
            java.util.ArrayList arrayList = null;
            if (!android.text.TextUtils.isEmpty(str2)) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONObject(str2).getJSONArray("used_store_list");
                    if (jSONArray != null && jSONArray.length() != 0) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (int i27 = 0; i27 < jSONArray.length(); i27++) {
                            r45.nu a17 = lu1.j0.a(jSONArray.getJSONObject(i27));
                            if (a17 != null) {
                                arrayList2.add(a17);
                            }
                        }
                        arrayList = arrayList2;
                    }
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShopInfoItemParser", e17, "", new java.lang.Object[0]);
                }
            }
            this.f537992g = arrayList;
            if (arrayList != null) {
                arrayList.size();
            }
        }
        this.f537990e.mo815x76e0bfae(i18, i19, str, this);
    }
}
