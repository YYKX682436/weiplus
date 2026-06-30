package ls4;

/* loaded from: classes8.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls4.n0 f402607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f402608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pr4.o f402609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ls4.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, pr4.o oVar) {
        super(1);
        this.f402607d = n0Var;
        this.f402608e = interfaceC29045xdcb5ca57;
        this.f402609f = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pr4.a it = (pr4.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ot5.g.c("WeCoinSubscribeMemberLogic", "fail");
        if (it.f439518a != pr4.j.f439547f) {
            this.f402607d.b();
        }
        try {
            p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f402608e;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new pr4.f(pr4.g.f439530d, this.f402609f)));
        } catch (java.lang.IllegalStateException e17) {
            ot5.g.a("WeCoinSubscribeMemberLogic", e17);
        }
        return jz5.f0.f384359a;
    }
}
