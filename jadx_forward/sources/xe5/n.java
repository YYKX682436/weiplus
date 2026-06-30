package xe5;

/* loaded from: classes10.dex */
public final class n implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.g0 f535603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xe5.i f535604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f535606g;

    public n(xe5.g0 g0Var, xe5.i iVar, java.lang.String str, yb5.d dVar) {
        this.f535603d = g0Var;
        this.f535604e = iVar;
        this.f535605f = str;
        this.f535606g = dVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.zh2 req = (r45.zh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        xe5.g0.c(this.f535603d, ret, this.f535604e, this.f535605f, this.f535606g);
    }
}
