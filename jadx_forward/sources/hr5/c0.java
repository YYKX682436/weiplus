package hr5;

/* loaded from: classes15.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f365843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f365844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f365845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f365846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f365847h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f365848i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f365849m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f365850n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f365851o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f365852p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f365853q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ zq5.v f365854r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ zq5.v f365855s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(float f17, float f18, float f19, long j17, long j18, long j19, hr5.a1 a1Var, long j27, float f27, long j28, float f28, zq5.v vVar, zq5.v vVar2) {
        super(0);
        this.f365843d = f17;
        this.f365844e = f18;
        this.f365845f = f19;
        this.f365846g = j17;
        this.f365847h = j18;
        this.f365848i = j19;
        this.f365849m = a1Var;
        this.f365850n = j27;
        this.f365851o = f27;
        this.f365852p = j28;
        this.f365853q = f28;
        this.f365854r = vVar;
        this.f365855s = vVar2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float f17 = this.f365843d;
        float f18 = this.f365844e;
        float f19 = this.f365845f;
        long j17 = this.f365846g;
        long j18 = this.f365847h;
        long d17 = zq5.l.d(j17, j18);
        long j19 = this.f365848i;
        return this.f365849m.f365811b + ". gestureTransform. centroid=" + zq5.m.e(this.f365850n) + ", zoomChange=" + zq5.b.c(this.f365851o, 4) + ", userScale=" + zq5.b.c(f18, 4) + " -> " + zq5.b.c(f17, 4) + '(' + zq5.b.c(f17 - f18, 4) + ") -> " + zq5.b.c(f19, 4) + '(' + zq5.b.c(f19 - f18, 4) + "), panChange=" + zq5.m.e(this.f365852p) + ", userOffset=" + zq5.m.e(j18) + " -> " + zq5.m.e(j17) + '(' + zq5.m.e(d17) + ") -> " + zq5.m.e(j19) + '(' + zq5.m.e(zq5.l.d(j19, j18)) + "), rotationChange=" + zq5.b.c(this.f365853q, 4) + ". userTransform=" + zq5.w.c(this.f365854r) + " -> " + zq5.w.c(this.f365855s);
    }
}
