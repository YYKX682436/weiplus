package yx0;

/* loaded from: classes5.dex */
public final class q5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265 f549113e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(yx0.b8 b8Var, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265 c4019xd47cd265, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549112d = b8Var;
        this.f549113e = c4019xd47cd265;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.q5(this.f549112d, this.f549113e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.q5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.o5(this.f549112d, null), 1, null);
        yx0.v vVar = this.f549112d.f548725s;
        yx0.v vVar2 = yx0.v.f549228f;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (vVar == vVar2 || this.f549112d.f548725s == yx0.v.f549230h) {
            p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.p5(this.f549112d, this.f549113e, null), 1, null);
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "setExposureCheck >> but state is " + this.f549112d.f548725s);
        return f0Var;
    }
}
