package ae;

/* loaded from: classes7.dex */
public class c implements com.tencent.mm.plugin.appbrand.utils.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3342a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f3343b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3344c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3345d = false;

    /* renamed from: e, reason: collision with root package name */
    public cl.k1 f3346e = null;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f3347f = new java.util.concurrent.atomic.AtomicInteger(2);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3348g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ae.a f3349h;

    public c(ae.a aVar, java.lang.String str, java.lang.String str2, long j17, int i17, boolean z17) {
        this.f3349h = aVar;
        this.f3348g = i17;
        this.f3344c = j17;
        this.f3342a = str;
        this.f3343b = str2;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c3
    public void a(cl.k1 k1Var) {
        this.f3346e = k1Var;
        c();
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("Luggage.AppBrandGameServiceLogicImp", "Inject SDK WAGame Script Failed: %s", str);
        this.f3349h.getClass();
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(778L, 14L, 1L, false);
        this.f3345d = false;
        c();
    }

    public final void c() {
        if (this.f3347f.decrementAndGet() == 0) {
            cl.k1 k1Var = this.f3346e;
            long j17 = k1Var == null ? this.f3344c : k1Var.f42675a;
            long currentTimeMillis = k1Var == null ? java.lang.System.currentTimeMillis() : k1Var.f42676b;
            com.tencent.luggage.sdk.jsapi.component.n nVar = new com.tencent.luggage.sdk.jsapi.component.n();
            java.lang.String str = this.f3342a;
            nVar.f47352i = str;
            java.lang.String str2 = this.f3343b;
            nVar.f47353j = str2;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            nVar.f47354k = str2.length();
            ae.a aVar = this.f3349h;
            com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) aVar.F();
            if (yVar != null) {
                yVar.H1(nVar, this.f3345d, j17, currentTimeMillis, this.f3346e);
            }
            aVar.J0(this.f3345d, str, this.f3346e);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void onSuccess(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "Inject SDK WAGame Script suc: %s, filelen: %d", str, java.lang.Integer.valueOf(this.f3348g));
        this.f3349h.getClass();
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(778L, 15L, 1L, false);
        this.f3345d = true;
        c();
    }
}
