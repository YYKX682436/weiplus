package ze5;

/* loaded from: classes9.dex */
public final class f6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f553455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.k f553457f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ze5.g6 f553458g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(rd5.d dVar, yb5.d dVar2, z01.k kVar, ze5.g6 g6Var) {
        super(1);
        this.f553455d = dVar;
        this.f553456e = dVar2;
        this.f553457f = kVar;
        this.f553458g = g6Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.m6 it = (ze5.m6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 m80081x76847043 = it.c().m80081x76847043();
        yb5.d dVar = this.f553456e;
        m80081x76847043.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(this.f553455d, dVar.D(), it, dVar.t()));
        ze5.g6 g6Var = this.f553458g;
        if (g6Var.f286808t == null) {
            g6Var.f286808t = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sk(dVar);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sk skVar = g6Var.f286808t;
        z01.k kVar = this.f553457f;
        kVar.f550616d = skVar;
        kVar.f550617e = g6Var.u(dVar);
        sb5.z zVar = (sb5.z) dVar.f542241c.a(sb5.z.class);
        kVar.f550618f = zVar != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).B1 : null;
        it.c().m48330xfcfee142(kVar);
        return jz5.f0.f384359a;
    }
}
