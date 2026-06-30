package dx0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f325961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dx0.g f325962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f325963f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, dx0.g gVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325961d = c4181x2248e1a3;
        this.f325962e = gVar;
        this.f325963f = c3971x241f78;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dx0.e(this.f325961d, this.f325962e, this.f325963f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dx0.e eVar = (dx0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        eVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dx0.g gVar = this.f325962e;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.o0 c17 = com.p314xaae8f345.p457x3304c6.p479x4179489f.o0.c(this.f325961d, gVar.f325968b, true);
        ex0.a0 a0Var = gVar.f325967a;
        a0Var.getClass();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = this.f325963f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        a0Var.D.put(segmentID, c17);
        gVar.b(segmentID);
        return jz5.f0.f384359a;
    }
}
