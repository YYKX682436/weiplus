package zh5;

/* loaded from: classes12.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f554532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf3.g f554533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf3.j f554534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf3.i f554535g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(boolean z17, sf3.g gVar, sf3.j jVar, sf3.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f554532d = z17;
        this.f554533e = gVar;
        this.f554534f = jVar;
        this.f554535g = iVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zh5.b0(this.f554532d, this.f554533e, this.f554534f, this.f554535g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zh5.b0 b0Var = (zh5.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        sf3.g gVar = this.f554533e;
        gVar.c();
        this.f554534f.a(gVar, this.f554535g);
        return jz5.f0.f384359a;
    }
}
