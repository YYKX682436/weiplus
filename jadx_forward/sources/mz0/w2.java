package mz0;

/* loaded from: classes5.dex */
public final class w2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f414607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.x2 f414608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(boolean z17, mz0.x2 x2Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414607d = z17;
        this.f414608e = x2Var;
        this.f414609f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mz0.w2(this.f414607d, this.f414608e, this.f414609f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mz0.w2 w2Var = (mz0.w2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        w2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f414607d;
        mz0.x2 x2Var = this.f414608e;
        if (z17) {
            x2Var.I7(this.f414609f, false);
        } else {
            x2Var.f7().dismiss();
        }
        return jz5.f0.f384359a;
    }
}
