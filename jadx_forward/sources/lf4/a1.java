package lf4;

/* loaded from: classes4.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf4.j f399884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ if4.a f399885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f399886f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(nf4.j jVar, if4.a aVar, lf4.j1 j1Var) {
        super(0);
        this.f399884d = jVar;
        this.f399885e = aVar;
        this.f399886f = j1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nf4.j jVar = this.f399884d;
        if ((jVar == null || jVar.z0()) ? false : true) {
            gf4.l.f352887d.n(false, false);
        }
        if4.a aVar = this.f399885e;
        aVar.f372771f = false;
        java.util.Iterator it = aVar.f372773h.iterator();
        while (it.hasNext()) {
            ((gf4.a) it.next()).f352868f = false;
        }
        ((sf4.a1) this.f399886f.f399952f).d();
        return jz5.f0.f384359a;
    }
}
