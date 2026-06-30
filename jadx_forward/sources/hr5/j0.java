package hr5;

/* loaded from: classes15.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f365895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f365896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f365897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f365898g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f365899h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f365900i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f365901m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f365902n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f365903o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f365904p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f365905q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ zq5.v f365906r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ zq5.v f365907s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(float f17, float f18, float f19, long j17, long j18, long j19, hr5.a1 a1Var, float f27, long j27, boolean z17, long j28, zq5.v vVar, zq5.v vVar2) {
        super(0);
        this.f365895d = f17;
        this.f365896e = f18;
        this.f365897f = f19;
        this.f365898g = j17;
        this.f365899h = j18;
        this.f365900i = j19;
        this.f365901m = a1Var;
        this.f365902n = f27;
        this.f365903o = j27;
        this.f365904p = z17;
        this.f365905q = j28;
        this.f365906r = vVar;
        this.f365907s = vVar2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float f17 = this.f365895d;
        float f18 = this.f365896e;
        float f19 = f17 - f18;
        float f27 = this.f365897f - f18;
        long j17 = this.f365898g;
        long j18 = this.f365899h;
        return this.f365901m.f365811b + ". scale. targetScale=" + zq5.b.c(this.f365902n, 4) + ", centroidContentPoint=" + zq5.m.e(this.f365903o) + ", animated=" + this.f365904p + ". touchPoint=" + zq5.m.e(this.f365905q) + ", targetUserScale=" + zq5.b.c(f17, 4) + ", addUserScale=" + zq5.b.c(f19, 4) + " -> " + zq5.b.c(f27, 4) + ", addUserOffset=" + zq5.m.e(zq5.l.d(j17, j18)) + " -> " + zq5.m.e(zq5.l.d(this.f365900i, j18)) + ", userTransform=" + zq5.w.c(this.f365906r) + " -> " + zq5.w.c(this.f365907s);
    }
}
