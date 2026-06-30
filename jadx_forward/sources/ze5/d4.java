package ze5;

/* loaded from: classes9.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.g4 f553408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f553410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553411g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(ze5.g4 g4Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, rd5.d dVar, yb5.d dVar2) {
        super(1);
        this.f553408d = g4Var;
        this.f553409e = f9Var;
        this.f553410f = dVar;
        this.f553411g = dVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.b4 it = (ze5.b4) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f553408d.Z(it, this.f553409e.P0() < 2, true);
        ze5.g4 g4Var = this.f553408d;
        rd5.d dVar = this.f553410f;
        yb5.d dVar2 = this.f553411g;
        g4Var.V(it, dVar, dVar2.t(), dVar2.D(), this.f553411g, this.f553408d);
        return jz5.f0.f384359a;
    }
}
