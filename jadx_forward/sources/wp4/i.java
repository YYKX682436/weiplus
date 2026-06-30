package wp4;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.q0 f529945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(dm.q0 q0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f529945d = q0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wp4.i(this.f529945d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        wp4.i iVar = (wp4.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dm.q0 q0Var = this.f529945d;
        java.lang.String field_work_id = q0Var.f68034xcf7ab2c4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_work_id, "field_work_id");
        int i17 = q0Var.f68035xdb9e6ea3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeVideoTecReporter", "reportUploadAction >> workTagId: " + field_work_id + ", action: 11, lastWorkType: " + i17 + ", currentWorkType: 4010");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b c6893x57fb842b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b();
        c6893x57fb842b.p(field_work_id);
        c6893x57fb842b.f142084d = 11;
        c6893x57fb842b.f142087g = i17;
        c6893x57fb842b.f142088h = 4010;
        c6893x57fb842b.k();
        fe0.p4 p4Var = (fe0.p4) i95.n0.c(fe0.p4.class);
        java.lang.String field_post_session_id = q0Var.f68021xd402bb1e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_post_session_id, "field_post_session_id");
        ((ec4.h0) p4Var).wi(5, field_post_session_id, 0L, 0L);
        return jz5.f0.f384359a;
    }
}
