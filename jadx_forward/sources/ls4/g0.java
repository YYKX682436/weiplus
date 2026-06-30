package ls4;

/* loaded from: classes8.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f402590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr4.o f402591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ls4.n0 f402592f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, pr4.o oVar, ls4.n0 n0Var) {
        super(1);
        this.f402590d = interfaceC29045xdcb5ca57;
        this.f402591e = oVar;
        this.f402592f = n0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pr4.n it = (pr4.n) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int ordinal = it.f439572a.ordinal();
        pr4.o oVar = this.f402591e;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f402590d;
        if (ordinal == 0) {
            ot5.g.c("WeCoinSubscribeMemberLogic", "fail");
            this.f402592f.b();
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new pr4.f(pr4.g.f439530d, oVar)));
        } else if (ordinal == 1) {
            ot5.g.c("WeCoinSubscribeMemberLogic", "cancel");
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new pr4.f(pr4.g.f439531e, oVar)));
        } else if (ordinal == 2) {
            ot5.g.c("WeCoinSubscribeMemberLogic", ya.b.f77504xbb80cbe3);
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new pr4.f(pr4.g.f439532f, oVar)));
        }
        return jz5.f0.f384359a;
    }
}
