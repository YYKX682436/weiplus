package wp4;

/* loaded from: classes4.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.q0 f529970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(dm.q0 q0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f529970d = q0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wp4.s(this.f529970d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        wp4.s sVar = (wp4.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        sVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        dm.q0 info = this.f529970d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeVideoTecReporter", "reportWorkTimeOut, " + currentTimeMillis);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b c6893x57fb842b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b();
        c6893x57fb842b.f142084d = 4;
        c6893x57fb842b.f142089i = info.f68003xca7c3d7;
        c6893x57fb842b.f142090j = info.f68002x74f6b689;
        c6893x57fb842b.f142091k = info.f68028xa01243b5;
        c6893x57fb842b.f142092l = info.f68022xfc6b13f4;
        c6893x57fb842b.f142094n = c6893x57fb842b.b("EncodeConfig", r26.i0.v(new st3.r(info.f68007x36c1fe5c, info.f68006x87aed351, info.f68008x7b9ff765, 0, info.f68004x89a5c636, info.f68027x3b56087e, 0, 0, false, false, 0, 0, info.f68005xb932ff10, 0, 12232, null).m165238x9616526c(), ",", ";", false, 4, null), true);
        c6893x57fb842b.f142095o = info.f68015xc2162e31;
        c6893x57fb842b.f142097q = info.f68012x5b8aa02d;
        c6893x57fb842b.f142086f = info.f68033xdb968d56;
        c6893x57fb842b.f142098r = info.f68029x52df5673;
        c6893x57fb842b.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeVideoTecReporter", "reportWorkTimeOut >> " + c6893x57fb842b.f142089i + ", " + c6893x57fb842b.f142090j + ", " + c6893x57fb842b.f142091k + ", " + c6893x57fb842b.f142092l);
        fe0.p4 p4Var = (fe0.p4) i95.n0.c(fe0.p4.class);
        java.lang.String field_post_session_id = info.f68021xd402bb1e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_post_session_id, "field_post_session_id");
        ((ec4.h0) p4Var).wi(6, field_post_session_id, 0L, 0L);
        return jz5.f0.f384359a;
    }
}
