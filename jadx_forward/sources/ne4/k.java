package ne4;

/* loaded from: classes9.dex */
public class k implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d50.p f418091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f418092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ iu5.e f418093c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f418094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f418095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ne4.n f418096f;

    public k(ne4.n nVar, d50.p pVar, int i17, iu5.e eVar, boolean z17, int i18) {
        this.f418096f = nVar;
        this.f418091a = pVar;
        this.f418092b = i17;
        this.f418093c = eVar;
        this.f418094d = z17;
        this.f418095e = i18;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c cVar = (eu5.c) eVar;
        java.lang.String str = cVar.f557139b;
        int i17 = cVar.f557138a;
        if (i17 == 1003) {
            str = re4.g0.f476069b;
        } else if (i17 == 1004) {
            str = re4.g0.f476070c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterManager", "prepare callback result: %s, %s", java.lang.Integer.valueOf(i17), cVar.f557139b);
        boolean a17 = cVar.a();
        d50.p pVar = this.f418091a;
        int i18 = this.f418092b;
        if (a17) {
            re4.g0.g(0);
            if (pVar != null) {
                pVar.c(cVar);
            }
        } else {
            if (i18 >= 2) {
                if (pVar != null) {
                    pVar.b(cVar);
                }
                m05.i.f404103a.a("5", "2", java.lang.String.valueOf(cVar.f557138a), str);
            } else {
                if (i18 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterManager", "need remove ask");
                    wt5.a.r();
                }
                if (pVar != null) {
                    pVar.a(i18);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterManager", "do prepare authkey retry: %s", java.lang.Integer.valueOf(i18));
                java.lang.Object obj = this.f418093c;
                if (obj instanceof com.p314xaae8f345.mm.p944x882e457a.m1) {
                    ((com.p314xaae8f345.mm.p944x882e457a.m1) obj).m48013x6761d4f();
                }
                this.f418096f.b(this.f418091a, this.f418094d, this.f418095e, this.f418093c, i18 + 1);
            }
            re4.n.c(2, cVar.f557138a, 1L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17806, java.lang.Integer.valueOf(cVar.f557138a), str, java.lang.Integer.valueOf(i18));
    }
}
