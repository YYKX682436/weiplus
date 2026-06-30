package hr5;

/* loaded from: classes15.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f365881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zq5.l f365882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f365883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f365884g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f365885h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zq5.n f365886i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f365887m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zq5.v f365888n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ zq5.v f365889o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(hr5.a1 a1Var, zq5.l lVar, float f17, float f18, float f19, zq5.n nVar, long j17, zq5.v vVar, zq5.v vVar2) {
        super(0);
        this.f365881d = a1Var;
        this.f365882e = lVar;
        this.f365883f = f17;
        this.f365884g = f18;
        this.f365885h = f19;
        this.f365886i = nVar;
        this.f365887m = j17;
        this.f365888n = vVar;
        this.f365889o = vVar2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f365881d.f365811b);
        sb6.append(". rollback. focus=");
        zq5.l lVar = this.f365882e;
        sb6.append(lVar != null ? zq5.m.e(lVar.f556613a) : null);
        sb6.append(". currentScale=");
        sb6.append(zq5.b.c(this.f365883f, 4));
        sb6.append(", minScale=");
        sb6.append(zq5.b.c(this.f365884g, 4));
        sb6.append(", maxScale=");
        sb6.append(zq5.b.c(this.f365885h, 4));
        sb6.append(", userOffsetBoundsRect=");
        sb6.append(zq5.o.e(this.f365886i));
        sb6.append(", currentUserOffset=");
        sb6.append(zq5.m.e(this.f365887m));
        sb6.append(", currentUserTransform=");
        sb6.append(zq5.w.c(this.f365888n));
        sb6.append(", newUserTransform=");
        sb6.append(zq5.w.c(this.f365889o));
        return sb6.toString();
    }
}
