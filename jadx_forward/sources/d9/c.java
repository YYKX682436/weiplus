package d9;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r9.n f308814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f308815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f308816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f308817g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f308818h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f308819i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f308820m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f308821n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f308822o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f308823p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f308824q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d9.g f308825r;

    public c(d9.g gVar, r9.n nVar, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
        this.f308825r = gVar;
        this.f308814d = nVar;
        this.f308815e = i17;
        this.f308816f = i18;
        this.f308817g = c1601x7dc4e417;
        this.f308818h = i19;
        this.f308819i = obj;
        this.f308820m = j17;
        this.f308821n = j18;
        this.f308822o = j19;
        this.f308823p = j27;
        this.f308824q = j28;
    }

    @Override // java.lang.Runnable
    public void run() {
        d9.g gVar = this.f308825r;
        gVar.f308883b.v(this.f308814d, this.f308815e, this.f308816f, this.f308817g, this.f308818h, this.f308819i, d9.g.a(gVar, this.f308820m), d9.g.a(gVar, this.f308821n), this.f308822o, this.f308823p, this.f308824q);
    }
}
