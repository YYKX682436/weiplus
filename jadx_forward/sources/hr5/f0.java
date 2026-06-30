package hr5;

/* loaded from: classes15.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zq5.v f365866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zq5.v f365867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f365868f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365869g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365870h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f365871i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hr5.n f365872m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f365873n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hr5.p f365874o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ hr5.m f365875p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(zq5.v vVar, zq5.v vVar2, hr5.a1 a1Var, java.lang.String str, java.lang.String str2, boolean z17, hr5.n nVar, boolean z18, hr5.p pVar, hr5.m mVar) {
        super(0);
        this.f365866d = vVar;
        this.f365867e = vVar2;
        this.f365868f = a1Var;
        this.f365869g = str;
        this.f365870h = str2;
        this.f365871i = z17;
        this.f365872m = nVar;
        this.f365873n = z18;
        this.f365874o = pVar;
        this.f365875p = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zq5.v vVar = this.f365866d;
        zq5.v vVar2 = this.f365867e;
        zq5.v b17 = zq5.w.b(vVar, vVar2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        hr5.a1 a1Var = this.f365868f;
        sb6.append(a1Var.f365811b);
        sb6.append(". reset:");
        sb6.append(this.f365869g);
        sb6.append(". ");
        sb6.append(this.f365870h);
        sb6.append(". ");
        sb6.append(this.f365871i ? "skipped. " : "");
        sb6.append("containerSize=");
        hr5.n nVar = this.f365872m;
        sb6.append(zq5.h.f(nVar.f365947a));
        sb6.append(", contentSize=");
        sb6.append(zq5.h.f(nVar.f365948b));
        sb6.append(", contentOriginSize=");
        sb6.append(zq5.h.f(nVar.f365949c));
        sb6.append(", contentScale=");
        sb6.append(gr5.o.a(nVar.f365951e));
        sb6.append(", alignment=");
        sb6.append(gr5.c.a(nVar.f365952f));
        sb6.append(", rtlLayoutDirection=");
        sb6.append(nVar.f365953g);
        sb6.append(", rotation=");
        sb6.append(nVar.f365950d);
        sb6.append(", scalesCalculator=");
        sb6.append(nVar.f365955i);
        sb6.append(", readMode=");
        sb6.append(nVar.f365954h);
        sb6.append(". keepTransform=false. hasUserActions=");
        sb6.append(this.f365873n);
        sb6.append(". diffResult=");
        sb6.append(this.f365874o);
        sb6.append(", animationRunning=(");
        fr5.p0 p0Var = (fr5.p0) a1Var.f365812c;
        fr5.j jVar = p0Var.f347541b;
        sb6.append(jVar != null && jVar.f347509j);
        sb6.append(',');
        fr5.h hVar = p0Var.f347542c;
        sb6.append(hVar != null && hVar.f347491i);
        sb6.append("). minScale=");
        hr5.m mVar = this.f365875p;
        sb6.append(zq5.b.c(mVar.f365940a, 4));
        sb6.append(", mediumScale=");
        sb6.append(zq5.b.c(mVar.f365941b, 4));
        sb6.append(", maxScale=");
        sb6.append(zq5.b.c(mVar.f365942c, 4));
        sb6.append(", baseTransform=");
        sb6.append(zq5.w.c(vVar));
        sb6.append(", userTransform=");
        sb6.append(zq5.w.c(vVar2));
        sb6.append(", transform=");
        sb6.append(zq5.w.c(b17));
        return sb6.toString();
    }
}
