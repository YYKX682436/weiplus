package cr0;

/* loaded from: classes12.dex */
public final class r extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f303258d;

    /* renamed from: e, reason: collision with root package name */
    public final rh.x2 f303259e;

    /* renamed from: f, reason: collision with root package name */
    public final rh.x2 f303260f;

    public r(java.lang.String name, int i17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f303258d = name;
        this.f303259e = rh.x2.b(java.lang.Integer.valueOf(i17));
        this.f303260f = rh.x2.b(java.lang.Long.valueOf(j17));
    }

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        cr0.r bgn = (cr0.r) d3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgn, "bgn");
        return new cr0.q(bgn, this);
    }
}
