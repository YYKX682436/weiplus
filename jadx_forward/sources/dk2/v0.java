package dk2;

/* loaded from: classes.dex */
public final class v0 implements ek2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f315756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f315757c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek2.f f315758d;

    public v0(dk2.r4 r4Var, r45.xn1 xn1Var, int i17, ek2.f fVar) {
        this.f315755a = r4Var;
        this.f315756b = xn1Var;
        this.f315757c = i17;
        this.f315758d = fVar;
    }

    @Override // ek2.f
    public void a(r45.ng1 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        pm0.v.X(new dk2.u0(this.f315755a, this.f315756b, resp, this.f315757c, this.f315758d));
    }

    @Override // ek2.f
    public void b(int i17, int i18, java.lang.String str) {
        pm0.v.X(new dk2.t0(this.f315758d, i17, i18, str));
    }
}
