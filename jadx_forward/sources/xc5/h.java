package xc5;

/* loaded from: classes12.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf3.a f534994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc5.l f534995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f534996f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qf3.a aVar, xc5.l lVar, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f534994d = aVar;
        this.f534995e = lVar;
        this.f534996f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc5.h(this.f534994d, this.f534995e, this.f534996f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xc5.h hVar = (xc5.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ((lf3.c0) this.f534994d).W6(this.f534995e.f535055d, new java.util.ArrayList(this.f534996f));
        return jz5.f0.f384359a;
    }
}
