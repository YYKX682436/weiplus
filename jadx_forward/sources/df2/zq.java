package df2;

/* loaded from: classes3.dex */
public final class zq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lv1 f313518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lv1 f313519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.ar f313520f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(r45.lv1 lv1Var, r45.lv1 lv1Var2, df2.ar arVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313518d = lv1Var;
        this.f313519e = lv1Var2;
        this.f313520f = arVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.zq(this.f313518d, this.f313519e, this.f313520f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.zq zqVar = (df2.zq) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        zqVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.lv1 lv1Var = this.f313518d;
        this.f313520f.g7(lv1Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lv1Var.m75945x2fec8307(8), this.f313519e.m75945x2fec8307(8)));
        return jz5.f0.f384359a;
    }
}
