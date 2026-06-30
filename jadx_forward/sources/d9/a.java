package d9;

/* loaded from: classes15.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r9.n f308789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f308790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f308791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f308792g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f308793h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f308794i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f308795m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f308796n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f308797o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d9.g f308798p;

    public a(d9.g gVar, r9.n nVar, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i19, java.lang.Object obj, long j17, long j18, long j19) {
        this.f308798p = gVar;
        this.f308789d = nVar;
        this.f308790e = i17;
        this.f308791f = i18;
        this.f308792g = c1601x7dc4e417;
        this.f308793h = i19;
        this.f308794i = obj;
        this.f308795m = j17;
        this.f308796n = j18;
        this.f308797o = j19;
    }

    @Override // java.lang.Runnable
    public void run() {
        d9.g gVar = this.f308798p;
        gVar.f308883b.w(this.f308789d, this.f308790e, this.f308791f, this.f308792g, this.f308793h, this.f308794i, d9.g.a(gVar, this.f308795m), d9.g.a(gVar, this.f308796n), this.f308797o);
    }
}
