package f0;

/* loaded from: classes10.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f339716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f339717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f339718f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(f0.r1 r1Var, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f339716d = r1Var;
        this.f339717e = i17;
        this.f339718f = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new f0.p1(this.f339716d, this.f339717e, this.f339718f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        f0.p1 p1Var = (f0.p1) mo148xaf65a0fc((b0.p2) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        p1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f339716d.h(this.f339717e, this.f339718f);
        return jz5.f0.f384359a;
    }
}
