package vr0;

/* loaded from: classes14.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f521031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 f521032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vr0.z f521033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nr0.x f521034g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nr0.y f521035h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42, vr0.z zVar, nr0.x xVar, nr0.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f521032e = c0569x83ae3d42;
        this.f521033f = zVar;
        this.f521034g = xVar;
        this.f521035h = yVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vr0.q(this.f521032e, this.f521033f, this.f521034g, this.f521035h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vr0.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f521031d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            vr0.p pVar = new vr0.p(this.f521032e, this.f521033f, this.f521034g, this.f521035h, null);
            this.f521031d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, pVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
