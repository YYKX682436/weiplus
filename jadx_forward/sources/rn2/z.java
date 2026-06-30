package rn2;

/* loaded from: classes.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f479463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f479464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479463d = hVar;
        this.f479464e = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rn2.z(this.f479463d, interfaceC29045xdcb5ca57, this.f479464e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rn2.z zVar = (rn2.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        zVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.oz1 oz1Var = (r45.oz1) ((xg2.i) this.f479463d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderLiveMakeLotteryOrderRequest] sucess, pb = ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oz1Var);
        sb6.append(pm0.b0.g(oz1Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryGiftCreate", sb6.toString());
        this.f479464e.f391656d = oz1Var;
        return jz5.f0.f384359a;
    }
}
