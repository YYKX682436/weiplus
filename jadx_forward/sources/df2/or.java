package df2;

/* loaded from: classes10.dex */
public final class or extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f312531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.h f312532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f312533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.lt f312534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f312535h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(java.util.Set set, dk2.h hVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var, df2.lt ltVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        super(0);
        this.f312531d = set;
        this.f312532e = hVar;
        this.f312533f = o4Var;
        this.f312534g = ltVar;
        this.f312535h = c19792x256d2725;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.bm1 bm1Var;
        dk2.h hVar = this.f312532e;
        java.util.Set set = this.f312531d;
        if (set != null) {
            set.add((hVar == null || (bm1Var = hVar.f315078h) == null) ? null : bm1Var.m75945x2fec8307(0));
        }
        java.lang.String str = df2.lt.W;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f312533f;
        o4Var.putStringSet(str, set);
        df2.lt ltVar = this.f312534g;
        ltVar.getClass();
        if (hVar != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = hVar.f315074d;
            if (c19786x6a1e2862.m76503x92bc3c07() == 3) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0();
                java.lang.Integer valueOf = m76506x42318aa0 != null ? java.lang.Integer.valueOf(m76506x42318aa0.m77224x4236b52c()) : null;
                if (valueOf != null && valueOf.intValue() == 28) {
                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = ltVar.E;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(ltVar, null, null, new df2.dt(ltVar, c1073x7e08a787 != null ? (android.view.ViewGroup) c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.r2k) : null, null), 3, null);
                    i95.m c17 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c17;
                    ml2.u1 u1Var = ml2.u1.C1;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                    java.lang.String b17 = b52.b.b();
                    if (b17 == null) {
                        b17 = "";
                    }
                    zy2.zb.I8(zbVar, u1Var, linkedHashMap, b17, null, null, null, false, 120, null);
                } else if (valueOf != null) {
                    valueOf.intValue();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(this.f312535h, 16384);
        a17.m59367x7b6790db(((mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class)).f410319c3);
        o4Var.H(df2.lt.X, a17.m59239x1309d228().mo14344x5f01b1f6());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "mmkv liveinfo : " + a17.m59239x1309d228().m75945x2fec8307(0) + ", " + a17.m59239x1309d228().m75945x2fec8307(12) + ", " + a17.m59239x1309d228().m75945x2fec8307(3) + " , " + a17.m59239x1309d228().m75945x2fec8307(4));
        return jz5.f0.f384359a;
    }
}
