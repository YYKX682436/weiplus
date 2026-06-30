package wq3;

/* loaded from: classes15.dex */
public class o extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f530109d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f530110e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f530111f;

    /* renamed from: g, reason: collision with root package name */
    public wq3.t f530112g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f530113h;

    public o(wq3.t tVar, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nl3();
        lVar.f152198b = new r45.ol3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getproductdetail";
        lVar.f152200d = 553;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f530110e = a17;
        r45.nl3 nl3Var = (r45.nl3) a17.f152243a.f152217a;
        this.f530111f = str;
        nl3Var.f463015d = str;
        nl3Var.f463016e = i17;
        this.f530112g = tVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f530109d = u0Var;
        return mo9409x10f9447a(sVar, this.f530110e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 553;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27;
        r45.ol3 ol3Var = (r45.ol3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ol3Var.f463873d)) {
            this.f530112g = wq3.t.b(this.f530112g, ol3Var.f463873d);
        }
        if (i19 == 0 && (i27 = ol3Var.f463874e) != 0) {
            str = ol3Var.f463875f;
            i19 = i27;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ol3Var.f463876g)) {
            java.lang.String str2 = ol3Var.f463876g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONObject(str2).getJSONArray("group_list");
                int length = jSONArray.length();
                for (int i28 = 0; i28 < length; i28++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i28);
                    wq3.v vVar = new wq3.v();
                    vVar.f530144a = jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    org.json.JSONArray jSONArray2 = jSONObject.getJSONArray(ya.b.f77483x2837e24a);
                    int length2 = jSONArray2.length();
                    for (int i29 = 0; i29 < length2; i29++) {
                        org.json.JSONObject jSONObject2 = jSONArray2.getJSONObject(i29);
                        wq3.u uVar = new wq3.u();
                        uVar.f530139a = jSONObject2.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                        uVar.f530141c = jSONObject2.getInt("jump_type");
                        uVar.f530143e = jSONObject2.getString("native_url_args");
                        uVar.f530140b = jSONObject2.getString("icon_url");
                        uVar.f530142d = jSONObject2.getString("h5_url");
                        ((java.util.ArrayList) vVar.f530145b).add(uVar);
                    }
                    arrayList.add(vVar);
                }
            } catch (java.lang.Exception unused) {
                arrayList = null;
            }
            this.f530113h = arrayList;
        }
        this.f530109d.mo815x76e0bfae(i18, i19, str, this);
    }
}
