package ay1;

/* loaded from: classes2.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ay1.l f96733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f96734e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ay1.l lVar, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f96733d = lVar;
        this.f96734e = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ay1.b(this.f96733d, this.f96734e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ay1.b bVar = (ay1.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        bVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ay1.m mVar = (ay1.m) this.f96734e.mo152xb9724478();
        ay1.l lVar = this.f96733d;
        lVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVar, "<set-?>");
        lVar.f96759b = mVar;
        return jz5.f0.f384359a;
    }
}
