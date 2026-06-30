package t21;

/* loaded from: classes12.dex */
public class l0 {

    /* renamed from: l, reason: collision with root package name */
    public static final long f496352l = ip.c.l();

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f496353a = null;

    /* renamed from: b, reason: collision with root package name */
    public t21.k0 f496354b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f496355c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f496356d = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Intent f496357e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f496358f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f496359g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f496360h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f496361i = null;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f496362j = null;

    /* renamed from: k, reason: collision with root package name */
    public final android.os.AsyncTask f496363k = new t21.j0(this);

    public void a(android.content.Context context, android.content.Intent intent, java.lang.String str, boolean z17, t21.k0 k0Var) {
        this.f496353a = context;
        this.f496357e = intent;
        kk.l lVar = t21.w2.f496589c;
        this.f496358f = t21.c3.a(str);
        this.f496359g = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, this.f496358f, true);
        this.f496360h = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, this.f496358f, true);
        if (z17) {
            this.f496361i = this.f496358f + ya.b.f77495x8b74a326;
            this.f496362j = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104103r, this.f496361i, true);
        }
        this.f496354b = k0Var;
        this.f496363k.execute(new java.lang.String[0]);
    }
}
