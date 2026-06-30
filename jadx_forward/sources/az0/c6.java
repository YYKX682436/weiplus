package az0;

/* loaded from: classes5.dex */
public final class c6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 f96920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f96921g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ az0.b0 f96922h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f96923i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4, az0.n7 n7Var, az0.b0 b0Var, long j17) {
        super(2);
        this.f96918d = str;
        this.f96919e = str2;
        this.f96920f = c4069xbe747ef4;
        this.f96921g = n7Var;
        this.f96922h = b0Var;
        this.f96923i = j17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onProgress = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress) obj;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onProgress, "onProgress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("export to ");
        sb6.append(this.f96918d);
        sb6.append(", realPath: ");
        sb6.append(this.f96919e);
        sb6.append(", dimen:");
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4 = this.f96920f;
        sb6.append(c4069xbe747ef4.m33188xf0ad77e3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef42 = this.f96920f;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33451x40ea16c = this.f96921g.f97275a.m33451x40ea16c(this.f96919e, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16109x79d591a3, c4069xbe747ef42, onProgress, new az0.b6(c4069xbe747ef42, this.f96918d, this.f96922h, this.f96923i, onComplete));
        if ((m33451x40ea16c != null ? m33451x40ea16c.f129637a : null) != null) {
            bz0.f fVar = bz0.f.f118268a;
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b error = m33451x40ea16c.f129637a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(error, "error");
            fVar.a(error);
            py0.a0 a0Var = py0.a0.f440499a;
            rg.c a17 = rg.c.a(c4069xbe747ef4.m33188xf0ad77e3());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "valueOf(...)");
            a0Var.b(a17);
        }
        return m33451x40ea16c;
    }
}
