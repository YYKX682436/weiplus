package gk5;

/* loaded from: classes.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.k1 f354197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f354198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f354200g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(gk5.k1 k1Var, wi5.o oVar, java.lang.String str, wi5.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f354197d = k1Var;
        this.f354198e = oVar;
        this.f354199f = str;
        this.f354200g = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gk5.h1(this.f354197d, this.f354198e, this.f354199f, this.f354200g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gk5.h1 h1Var = (gk5.h1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        h1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        gk5.k1 k1Var = this.f354197d;
        android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(k1Var.m158354x19263085());
        wi5.o oVar = this.f354198e;
        android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bik, (android.view.ViewGroup) oVar.f527865c, false);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(this.f354199f);
        inflate.setOnClickListener(new gk5.g1(k1Var, this.f354200g));
        oVar.f527864b.mo146xb9724478(inflate);
        return jz5.f0.f384359a;
    }
}
