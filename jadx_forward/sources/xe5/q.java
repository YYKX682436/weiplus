package xe5;

/* loaded from: classes10.dex */
public final class q implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.g0 f535613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xe5.i f535614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f535616g;

    public q(xe5.g0 g0Var, xe5.i iVar, java.lang.String str, yb5.d dVar) {
        this.f535613d = g0Var;
        this.f535614e = iVar;
        this.f535615f = str;
        this.f535616g = dVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.zh2 req = (r45.zh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        xe5.g0.b(this.f535613d, ret, this.f535614e, this.f535615f, this.f535616g);
    }
}
