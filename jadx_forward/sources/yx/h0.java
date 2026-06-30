package yx;

/* loaded from: classes3.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f548560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f548561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f548562f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f548563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f548564h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(boolean z17, p3325xe03a0797.p3326xc267989b.r2 r2Var, p3325xe03a0797.p3326xc267989b.y0 y0Var, yz5.a aVar, n0.v2 v2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548560d = z17;
        this.f548561e = r2Var;
        this.f548562f = y0Var;
        this.f548563g = aVar;
        this.f548564h = v2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx.h0(this.f548560d, this.f548561e, this.f548562f, this.f548563g, this.f548564h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yx.h0 h0Var = (yx.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        h0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f548560d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f548561e;
        if (z17) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            p3325xe03a0797.p3326xc267989b.l.d(this.f548562f, null, null, new yx.g0(this.f548563g, this.f548564h, null), 3, null);
        } else {
            r2Var.mo143976x68ac462();
        }
        return jz5.f0.f384359a;
    }
}
