package su4;

/* loaded from: classes.dex */
public class o1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494556d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494557e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.z97 f494558f;

    /* renamed from: g, reason: collision with root package name */
    public r45.aa7 f494559g;

    /* renamed from: h, reason: collision with root package name */
    public final su4.r1 f494560h;

    public o1(su4.r1 r1Var) {
        this.f494560h = r1Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1161;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/searchsuggestion";
        lVar.f152197a = new r45.z97();
        lVar.f152198b = new r45.aa7();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494557e = a17;
        r45.z97 z97Var = (r45.z97) a17.f152243a.f152217a;
        this.f494558f = z97Var;
        z97Var.f473355e = r1Var.f494595b;
        z97Var.f473357g = r1Var.f494597d;
        int i17 = r1Var.H;
        z97Var.f473358h = i17 == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(6) : i17;
        z97Var.f473354d = r1Var.f494594a;
        z97Var.f473359i = su4.r2.i();
        z97Var.f473361n = r1Var.f494599f;
        z97Var.A = r1Var.f494615v;
        z97Var.G = su4.r2.g();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) r1Var.f494605l);
            z97Var.f473367t = new java.util.LinkedList();
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                this.f494558f.f473367t.add(java.net.URLDecoder.decode(jSONArray.getString(i18), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            }
        } catch (java.lang.Exception e17) {
            int i19 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.NetSceneMMWebSuggest", e17, "decode json error", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494556d = u0Var;
        return mo9409x10f9447a(sVar, this.f494557e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1161;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneMMWebSuggest", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        this.f494559g = (r45.aa7) this.f494557e.f152244b.f152233a;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f494556d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
