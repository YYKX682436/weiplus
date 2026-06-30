package id2;

/* loaded from: classes.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f372284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f372286f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, id2.v1 v1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372284d = hVar;
        this.f372285e = v1Var;
        this.f372286f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.q0(this.f372284d, interfaceC29045xdcb5ca57, this.f372285e, this.f372286f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        id2.q0 q0Var = (id2.q0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        q0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.mf2 mf2Var = (r45.mf2) ((xg2.i) this.f372284d).f535926b;
        java.lang.String str = this.f372285e.f372367d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderMakePackageOrderRequest] sucess, pb = ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mf2Var);
        sb6.append(pm0.b0.g(mf2Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        this.f372286f.f391656d = mf2Var;
        return jz5.f0.f384359a;
    }
}
