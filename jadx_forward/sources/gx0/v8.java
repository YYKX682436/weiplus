package gx0;

/* loaded from: classes5.dex */
public final class v8 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f358599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(gx0.w8 w8Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f358598d = w8Var;
        this.f358599e = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.v8(this.f358598d, this.f358599e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        gx0.v8 v8Var = (gx0.v8) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj);
        jz5.f0 f0Var = jz5.f0.f384359a;
        v8Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f358598d.V.d(this.f358599e);
        return jz5.f0.f384359a;
    }
}
