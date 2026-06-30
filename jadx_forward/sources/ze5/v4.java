package ze5;

/* loaded from: classes9.dex */
public final class v4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.y4 f553781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f553783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(ze5.y4 y4Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, rd5.d dVar, yb5.d dVar2) {
        super(1);
        this.f553781d = y4Var;
        this.f553782e = f9Var;
        this.f553783f = dVar;
        this.f553784g = dVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.t4 it = (ze5.t4) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f553781d.Z(it, this.f553782e.P0() < 2, true);
        ze5.y4 y4Var = this.f553781d;
        rd5.d dVar = this.f553783f;
        yb5.d dVar2 = this.f553784g;
        y4Var.V(it, dVar, dVar2.t(), dVar2.D(), this.f553784g, this.f553781d);
        return jz5.f0.f384359a;
    }
}
