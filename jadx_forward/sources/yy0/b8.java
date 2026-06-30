package yy0;

/* loaded from: classes4.dex */
public final class b8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.ib f549566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(dm.ib ibVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549566d = ibVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yy0.b8(this.f549566d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yy0.b8 b8Var = (yy0.b8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b8Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        g65.a aVar2 = (g65.a) i95.n0.c(g65.a.class);
        dm.ib ibVar = this.f549566d;
        java.lang.String str = ibVar.f67036xcf7ab2c4;
        long j17 = ibVar.f67023xca7c3d7;
        long j18 = ibVar.f67022x74f6b689;
        long j19 = ibVar.f67033xa01243b5;
        long j27 = ibVar.f67029xfc6b13f4;
        int i17 = ibVar.f67025x5b8aa02d;
        int i18 = ibVar.f67035xdb968d56;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        g65.a.hg(aVar2, 34, 4, str, 0, 0, i18, j19, j27, j17, j18, i17, null, null, null, null, 30744, null);
        fe0.p4 p4Var = (fe0.p4) i95.n0.c(fe0.p4.class);
        java.lang.String field_post_session_id = ibVar.f67028xd402bb1e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_post_session_id, "field_post_session_id");
        ((ec4.h0) p4Var).wi(6, field_post_session_id, 0L, 0L);
        return jz5.f0.f384359a;
    }
}
