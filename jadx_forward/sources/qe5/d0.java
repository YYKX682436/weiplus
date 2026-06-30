package qe5;

/* loaded from: classes12.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f443617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe5.m0 f443618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, qe5.m0 m0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443617d = f9Var;
        this.f443618e = m0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qe5.d0(this.f443617d, this.f443618e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qe5.d0 d0Var = (qe5.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        d0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f443617d;
        java.lang.String Q0 = f9Var.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        h40.f fVar = new h40.f(Q0, f9Var.I0());
        fVar.f360275c = this.f443618e.f443678d;
        fVar.f360278f = h40.b.f360255g;
        ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).aj(fVar);
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).Ai(f9Var);
        return jz5.f0.f384359a;
    }
}
