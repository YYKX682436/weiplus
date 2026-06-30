package ze5;

/* loaded from: classes9.dex */
public final class h4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f553494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.y f553496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f553497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(rd5.d dVar, yb5.d dVar2, z01.y yVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var) {
        super(1);
        this.f553494d = dVar;
        this.f553495e = dVar2;
        this.f553496f = yVar;
        this.f553497g = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.b4 it = (ze5.b4) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22085xd1dcc07d c22085xd1dcc07d = it.f553370b;
        yb5.d dVar = this.f553495e;
        if (c22085xd1dcc07d != null) {
            c22085xd1dcc07d.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(this.f553494d, dVar.D(), it, dVar.x()));
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var = this.f553497g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r0 w17 = a0Var.w(dVar);
        z01.y yVar = this.f553496f;
        yVar.f550722i = w17;
        yVar.f550723m = a0Var.u(dVar);
        sb5.z zVar = (sb5.z) dVar.f542241c.a(sb5.z.class);
        yVar.f550724n = zVar != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).B1 : null;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22085xd1dcc07d c22085xd1dcc07d2 = it.f553370b;
        if (c22085xd1dcc07d2 != null) {
            c22085xd1dcc07d2.m48330xfcfee142(yVar);
        }
        return jz5.f0.f384359a;
    }
}
