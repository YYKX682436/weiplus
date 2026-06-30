package ho1;

/* loaded from: classes11.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364260f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f364261g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f364262h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f364263i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f364264m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f364265n;

    public j1(java.lang.String str, long j17, long j18, long j19, ho1.q1 q1Var, long j27, long j28, int i17) {
        this.f364258d = str;
        this.f364259e = j17;
        this.f364260f = j18;
        this.f364261g = j19;
        this.f364262h = q1Var;
        this.f364263i = j27;
        this.f364264m = j28;
        this.f364265n = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm5.v1.a("getChatPackageAsync " + this.f364258d, new ho1.i1(this.f364259e, this.f364258d, this.f364260f, this.f364261g, this.f364262h, this.f364263i, this.f364264m, this.f364265n));
    }
}
