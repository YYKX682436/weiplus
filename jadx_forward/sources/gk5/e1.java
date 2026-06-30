package gk5;

/* loaded from: classes.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.k1 f354179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f354180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f354181f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(gk5.k1 k1Var, wi5.o oVar, wi5.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f354179d = k1Var;
        this.f354180e = oVar;
        this.f354181f = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gk5.e1(this.f354179d, this.f354180e, this.f354181f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gk5.e1 e1Var = (gk5.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        gk5.k1 k1Var = this.f354179d;
        android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(k1Var.m158354x19263085());
        wi5.o oVar = this.f354180e;
        android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bik, (android.view.ViewGroup) oVar.f527865c, false);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(k1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571458fo));
        inflate.setOnClickListener(new gk5.d1(k1Var, this.f354181f));
        oVar.f527864b.mo146xb9724478(inflate);
        return jz5.f0.f384359a;
    }
}
