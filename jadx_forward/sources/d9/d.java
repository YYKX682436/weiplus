package d9;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r9.n f308844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f308845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f308846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f308847g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f308848h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f308849i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f308850m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f308851n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f308852o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f308853p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f308854q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.io.IOException f308855r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f308856s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d9.g f308857t;

    public d(d9.g gVar, r9.n nVar, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28, java.io.IOException iOException, boolean z17) {
        this.f308857t = gVar;
        this.f308844d = nVar;
        this.f308845e = i17;
        this.f308846f = i18;
        this.f308847g = c1601x7dc4e417;
        this.f308848h = i19;
        this.f308849i = obj;
        this.f308850m = j17;
        this.f308851n = j18;
        this.f308852o = j19;
        this.f308853p = j27;
        this.f308854q = j28;
        this.f308855r = iOException;
        this.f308856s = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        d9.g gVar = this.f308857t;
        gVar.f308883b.r(this.f308844d, this.f308845e, this.f308846f, this.f308847g, this.f308848h, this.f308849i, d9.g.a(gVar, this.f308850m), d9.g.a(gVar, this.f308851n), this.f308852o, this.f308853p, this.f308854q, this.f308855r, this.f308856s);
    }
}
