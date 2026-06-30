package qn4;

/* loaded from: classes12.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.t f446803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn4.a f446804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f446805f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(qn4.t tVar, qn4.a aVar, java.lang.Throwable th6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f446803d = tVar;
        this.f446804e = aVar;
        this.f446805f = th6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qn4.r(this.f446803d, this.f446804e, this.f446805f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qn4.r rVar = (qn4.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        rVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f446803d.d();
        java.lang.String message = this.f446805f.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        ((qn4.w) this.f446804e).a(9999, message);
        return jz5.f0.f384359a;
    }
}
