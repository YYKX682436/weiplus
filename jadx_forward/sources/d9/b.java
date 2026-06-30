package d9;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r9.n f308799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f308800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f308801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f308802g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f308803h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f308804i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f308805m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f308806n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f308807o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f308808p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f308809q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d9.g f308810r;

    public b(d9.g gVar, r9.n nVar, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
        this.f308810r = gVar;
        this.f308799d = nVar;
        this.f308800e = i17;
        this.f308801f = i18;
        this.f308802g = c1601x7dc4e417;
        this.f308803h = i19;
        this.f308804i = obj;
        this.f308805m = j17;
        this.f308806n = j18;
        this.f308807o = j19;
        this.f308808p = j27;
        this.f308809q = j28;
    }

    @Override // java.lang.Runnable
    public void run() {
        d9.g gVar = this.f308810r;
        gVar.f308883b.f(this.f308799d, this.f308800e, this.f308801f, this.f308802g, this.f308803h, this.f308804i, d9.g.a(gVar, this.f308805m), d9.g.a(gVar, this.f308806n), this.f308807o, this.f308808p, this.f308809q);
    }
}
