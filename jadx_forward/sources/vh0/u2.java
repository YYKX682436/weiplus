package vh0;

/* loaded from: classes8.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh0.d1 f518505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f518507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(vh0.d1 d1Var, java.lang.String str, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f518505d = d1Var;
        this.f518506e = str;
        this.f518507f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vh0.u2(this.f518505d, this.f518506e, this.f518507f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vh0.u2 u2Var = (vh0.u2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        u2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ((vh0.f2) this.f518505d).Ni(this.f518506e, this.f518507f, true);
        return jz5.f0.f384359a;
    }
}
