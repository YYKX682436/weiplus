package xe2;

/* loaded from: classes3.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg2.b f535463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug2.a f535464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe2.b0 f535465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f535466g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yg2.b bVar, ug2.a aVar, xe2.b0 b0Var, java.lang.Integer num, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535463d = bVar;
        this.f535464e = aVar;
        this.f535465f = b0Var;
        this.f535466g = num;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xe2.z(this.f535463d, this.f535464e, this.f535465f, this.f535466g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xe2.z zVar = (xe2.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        zVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.l.c(this.f535463d, p3325xe03a0797.p3326xc267989b.q1.f392103c, p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED, new xe2.y(this.f535464e, this.f535465f, this.f535466g, null));
        return jz5.f0.f384359a;
    }
}
