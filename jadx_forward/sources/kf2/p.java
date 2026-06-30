package kf2;

/* loaded from: classes.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f388816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf2.r f388817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f388818f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f388819g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, kf2.r rVar, long j17, int i17) {
        super(2, interfaceC29045xdcb5ca57);
        this.f388816d = hVar;
        this.f388817e = rVar;
        this.f388818f = j17;
        this.f388819g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kf2.p(this.f388816d, interfaceC29045xdcb5ca57, this.f388817e, this.f388818f, this.f388819g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kf2.p pVar = (kf2.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.x71 x71Var = (r45.x71) ((xg2.i) this.f388816d).f535926b;
        this.f388817e.c(this.f388818f, this.f388819g, x71Var);
        return jz5.f0.f384359a;
    }
}
