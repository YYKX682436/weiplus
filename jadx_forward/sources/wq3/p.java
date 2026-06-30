package wq3;

/* loaded from: classes4.dex */
public class p extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f530114d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f530115e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f530116f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f530117g;

    public p(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pl3();
        lVar.f152198b = new r45.ql3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getproductdiscount";
        lVar.f152200d = nd1.j2.f72947x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f530115e = a17;
        r45.pl3 pl3Var = (r45.pl3) a17.f152243a.f152217a;
        pl3Var.f464687d = str;
        this.f530117g = str2;
        pl3Var.f464688e = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f530114d = u0Var;
        return mo9409x10f9447a(sVar, this.f530115e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return nd1.j2.f72947x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27;
        r45.ql3 ql3Var = (r45.ql3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0 && ql3Var.f465618e == 0) {
            try {
                org.json.JSONArray optJSONArray = new org.json.JSONObject(ql3Var.f465617d).optJSONArray("discount_list");
                if (optJSONArray != null) {
                    this.f530116f = new java.util.LinkedList();
                    int length = optJSONArray.length();
                    for (int i28 = 0; i28 < length; i28++) {
                        org.json.JSONObject jSONObject = optJSONArray.getJSONObject(i28);
                        r45.we0 we0Var = new r45.we0();
                        we0Var.f470615d = jSONObject.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                        we0Var.f470616e = jSONObject.getInt("fee");
                        this.f530116f.add(we0Var);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (i19 == 0 && (i27 = ql3Var.f465618e) != 0) {
            str = ql3Var.f465619f;
            i19 = i27;
        }
        this.f530114d.mo815x76e0bfae(i18, i19, str, this);
    }
}
