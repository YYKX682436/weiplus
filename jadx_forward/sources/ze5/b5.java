package ze5;

/* loaded from: classes9.dex */
public final class b5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f553371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.b0 f553373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f553374g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553375h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(rd5.d dVar, yb5.d dVar2, z01.b0 b0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(1);
        this.f553371d = dVar;
        this.f553372e = dVar2;
        this.f553373f = b0Var;
        this.f553374g = a0Var;
        this.f553375h = f9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.t4 it = (ze5.t4) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22088xa3cc645c c22088xa3cc645c = it.f553736b;
        yb5.d dVar = this.f553372e;
        if (c22088xa3cc645c != null) {
            c22088xa3cc645c.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(this.f553371d, dVar.D(), it, dVar.x()));
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h0 h0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h0(dVar, new ze5.a5(dVar, this.f553375h));
        z01.b0 b0Var = this.f553373f;
        b0Var.f550488g = h0Var;
        b0Var.f550489h = this.f553374g.u(dVar);
        sb5.z zVar = (sb5.z) dVar.f542241c.a(sb5.z.class);
        b0Var.f550490i = zVar != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).B1 : null;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22088xa3cc645c c22088xa3cc645c2 = it.f553736b;
        if (c22088xa3cc645c2 != null) {
            c22088xa3cc645c2.m48330xfcfee142(b0Var);
        }
        return jz5.f0.f384359a;
    }
}
