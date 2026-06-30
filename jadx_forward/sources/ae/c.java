package ae;

/* loaded from: classes7.dex */
public class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f84875a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f84876b;

    /* renamed from: c, reason: collision with root package name */
    public final long f84877c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f84878d = false;

    /* renamed from: e, reason: collision with root package name */
    public cl.k1 f84879e = null;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f84880f = new java.util.concurrent.atomic.AtomicInteger(2);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f84881g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ae.a f84882h;

    public c(ae.a aVar, java.lang.String str, java.lang.String str2, long j17, int i17, boolean z17) {
        this.f84882h = aVar;
        this.f84881g = i17;
        this.f84877c = j17;
        this.f84875a = str;
        this.f84876b = str2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c3
    public void a(cl.k1 k1Var) {
        this.f84879e = k1Var;
        c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandGameServiceLogicImp", "Inject SDK WAGame Script Failed: %s", str);
        this.f84882h.getClass();
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(778L, 14L, 1L, false);
        this.f84878d = false;
        c();
    }

    public final void c() {
        if (this.f84880f.decrementAndGet() == 0) {
            cl.k1 k1Var = this.f84879e;
            long j17 = k1Var == null ? this.f84877c : k1Var.f124208a;
            long currentTimeMillis = k1Var == null ? java.lang.System.currentTimeMillis() : k1Var.f124209b;
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n nVar = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n();
            java.lang.String str = this.f84875a;
            nVar.f128885i = str;
            java.lang.String str2 = this.f84876b;
            nVar.f128886j = str2;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            nVar.f128887k = str2.length();
            ae.a aVar = this.f84882h;
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) aVar.F();
            if (yVar != null) {
                yVar.H1(nVar, this.f84878d, j17, currentTimeMillis, this.f84879e);
            }
            aVar.J0(this.f84878d, str, this.f84879e);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    /* renamed from: onSuccess */
    public void mo1150xe05b4124(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "Inject SDK WAGame Script suc: %s, filelen: %d", str, java.lang.Integer.valueOf(this.f84881g));
        this.f84882h.getClass();
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(778L, 15L, 1L, false);
        this.f84878d = true;
        c();
    }
}
