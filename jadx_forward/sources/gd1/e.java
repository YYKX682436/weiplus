package gd1;

/* loaded from: classes7.dex */
public abstract class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f352025g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f352026h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f352027i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f352028m;

    public e(java.lang.String techName, java.lang.String function, java.lang.String resultKey, yz5.l retConverter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(techName, "techName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(function, "function");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultKey, "resultKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(retConverter, "retConverter");
        this.f352025g = techName;
        this.f352026h = function;
        this.f352027i = resultKey;
        this.f352028m = retConverter;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AbsJsApiNFCTechGetAsync", "invoke, env is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t1 t1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t1) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t1.class);
        if (t1Var != null && !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k5) t1Var).a()) {
            lVar.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(this, 13019, "fail:user is not authorized", kz5.c1.i(new jz5.l("errCode", 13019))));
            return;
        }
        hd1.w a17 = hd1.w.f361968c.a(lVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AbsJsApiNFCTechGetAsync", "invoke, appId: " + lVar.mo48798x74292566());
        java.lang.String techName = this.f352025g;
        java.lang.String function = this.f352026h;
        gd1.d dVar = new gd1.d(lVar, i17, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(techName, "techName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(function, "function");
        ((ku5.t0) ku5.t0.f394148d).h(new hd1.o(a17, dVar, techName, function, null), "NFC-IO");
    }
}
