package mx0;

/* loaded from: classes5.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.r1 f413764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f413765e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(mx0.r1 r1Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413764d = r1Var;
        this.f413765e = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.q1(this.f413764d, this.f413765e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.q1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f413764d.f413812g = this.f413765e;
        mx0.r1 r1Var = this.f413764d;
        boolean z17 = r1Var.f413813h;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17) {
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.p6(m7Var, null), 3, null);
            return f0Var;
        }
        if (r1Var.f413812g) {
            yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            p3325xe03a0797.p3326xc267989b.l.d(m7Var2.Di(), null, null, new yy0.z5(m7Var2, null), 3, null);
        } else {
            yy0.m7 m7Var3 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            p3325xe03a0797.p3326xc267989b.l.d(m7Var3.Di(), null, null, new yy0.q6(m7Var3, null), 3, null);
        }
        this.f413764d.a(this.f413765e);
        return f0Var;
    }
}
