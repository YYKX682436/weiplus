package kf2;

/* loaded from: classes.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f388787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf2.l0 f388788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f388789f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f388790g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, kf2.l0 l0Var, long j17, int i17) {
        super(2, interfaceC29045xdcb5ca57);
        this.f388787d = hVar;
        this.f388788e = l0Var;
        this.f388789f = j17;
        this.f388790g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kf2.j0(this.f388787d, interfaceC29045xdcb5ca57, this.f388788e, this.f388789f, this.f388790g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kf2.j0 j0Var = (kf2.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f388788e.b(this.f388789f, this.f388790g);
        return jz5.f0.f384359a;
    }
}
