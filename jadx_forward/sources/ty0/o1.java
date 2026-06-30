package ty0;

/* loaded from: classes14.dex */
public final class o1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f504468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f504469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f504470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f504471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(int i17, n0.v2 v2Var, boolean z17, long j17) {
        super(2);
        this.f504468d = i17;
        this.f504469e = v2Var;
        this.f504470f = z17;
        this.f504471g = j17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        s1.l2 SubcomposeLayout = (s1.l2) obj;
        long j17 = ((p2.c) obj2).f432910a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(SubcomposeLayout, "$this$SubcomposeLayout");
        float h17 = p2.c.h(j17) / this.f504468d;
        return s1.v0.b(SubcomposeLayout, p2.c.h(j17), p2.c.g(j17), null, new ty0.l1(((s1.r0) kz5.n0.X(((s1.l0) SubcomposeLayout).b(0, u0.j.c(1758179946, true, new ty0.n1(this.f504469e, this.f504468d, this.f504470f, 0.1f, p2.c.g(j17) / 2.0f, this.f504471g, h17, h17 * 0.2f))))).m(j17)), 4, null);
    }
}
