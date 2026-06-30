package kk5;

/* loaded from: classes8.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.i1 f390164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390165e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(kk5.i1 i1Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f390164d = i1Var;
        this.f390165e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kk5.d1(this.f390164d, this.f390165e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kk5.d1 d1Var = (kk5.d1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        d1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        kk5.i1 i1Var = this.f390164d;
        i1Var.m80379x76847179().grantUriPermission(this.f390165e, (android.net.Uri) ((jz5.n) i1Var.f390191i).mo141623x754a37bb(), 193);
        return jz5.f0.f384359a;
    }
}
