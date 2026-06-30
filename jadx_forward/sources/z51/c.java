package z51;

/* loaded from: classes10.dex */
public final class c extends z51.x {

    /* renamed from: f, reason: collision with root package name */
    public a61.c f551707f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f551708g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f551709h;

    /* renamed from: i, reason: collision with root package name */
    public aq.u0 f551710i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y51.a pcContext) {
        super(pcContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
    }

    @Override // z51.x
    public java.lang.String c() {
        return "MicroMsg.LivePhotoLocalSourcePc";
    }

    @Override // z51.x
    public void d(a61.a config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        super.d(config);
        a61.c cVar = config.f83251b;
        this.f551707f = cVar;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
            throw null;
        }
        this.f551709h = cVar.f83253b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isParsed: ");
        a61.c cVar2 = this.f551707f;
        if (cVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
            throw null;
        }
        sb6.append(cVar2.f83253b);
        sb6.append(" mediaId: ");
        a61.c cVar3 = this.f551707f;
        if (cVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
            throw null;
        }
        sb6.append(cVar3.f83255d);
        f(sb6.toString());
    }

    @Override // z51.x
    public void j() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f551708g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        super.j();
    }
}
