package xe5;

/* loaded from: classes10.dex */
public final class m implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.g0 f535599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xe5.i f535600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f535602g;

    public m(xe5.g0 g0Var, xe5.i iVar, java.lang.String str, yb5.d dVar) {
        this.f535599d = g0Var;
        this.f535600e = iVar;
        this.f535601f = str;
        this.f535602g = dVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ph2 req = (r45.ph2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        xe5.g0.c(this.f535599d, ret, this.f535600e, this.f535601f, this.f535602g);
    }
}
