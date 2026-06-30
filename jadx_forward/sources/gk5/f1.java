package gk5;

/* loaded from: classes.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f354184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk5.k1 f354185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.o f354186f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(wi5.n0 n0Var, gk5.k1 k1Var, wi5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f354184d = n0Var;
        this.f354185e = k1Var;
        this.f354186f = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gk5.f1(this.f354184d, this.f354185e, this.f354186f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gk5.f1 f1Var = (gk5.f1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        f1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        gk5.k1 k1Var;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (g95.e.f351334a.a()) {
            wi5.n0 n0Var = this.f354184d;
            if (!((n0Var.H & 4) > 0) && (O6 = (k1Var = this.f354185e).O6()) != null) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(O6, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new gk5.e1(k1Var, this.f354186f, n0Var, null), 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
