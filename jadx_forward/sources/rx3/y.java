package rx3;

/* loaded from: classes10.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f482613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f482614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rx3.z f482615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f482616g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z17, rx3.z zVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f482614e = z17;
        this.f482615f = zVar;
        this.f482616g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        rx3.y yVar = new rx3.y(this.f482614e, this.f482615f, this.f482616g, interfaceC29045xdcb5ca57);
        yVar.f482613d = obj;
        return yVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        return p3325xe03a0797.p3326xc267989b.l.b((p3325xe03a0797.p3326xc267989b.y0) this.f482613d, null, null, new rx3.x(this.f482614e, this.f482615f, this.f482616g, null), 3, null);
    }
}
