package dl4;

/* loaded from: classes3.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f317037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317039f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o11.g f317040g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 f317041h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p11.k f317042i;

    public z0(long j17, java.lang.String str, java.lang.String str2, o11.g gVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var, p11.k kVar) {
        this.f317037d = j17;
        this.f317038e = str;
        this.f317039f = str2;
        this.f317040g = gVar;
        this.f317041h = w1Var;
        this.f317042i = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dl4.d1 d1Var = dl4.d1.f316916a;
        long j17 = this.f317037d;
        java.lang.String str = this.f317038e;
        java.lang.String str2 = this.f317039f;
        o11.g gVar = this.f317040g;
        dl4.d1.b(d1Var, j17, str, str2, gVar, new dl4.y0(j17, str, str2, gVar, this.f317041h, this.f317042i));
    }
}
