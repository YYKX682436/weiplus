package wb5;

/* loaded from: classes.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb5.i f525975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f525976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f525977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f525978g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(wb5.i iVar, wi5.o oVar, java.lang.String str, wi5.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f525975d = iVar;
        this.f525976e = oVar;
        this.f525977f = str;
        this.f525978g = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wb5.f(this.f525975d, this.f525976e, this.f525977f, this.f525978g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        wb5.f fVar = (wb5.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        wb5.i iVar = this.f525975d;
        android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(iVar.m158354x19263085());
        wi5.o oVar = this.f525976e;
        android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bik, (android.view.ViewGroup) oVar.f527865c, false);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(this.f525977f);
        inflate.setOnClickListener(new wb5.e(iVar, this.f525978g));
        oVar.f527864b.mo146xb9724478(inflate);
        return jz5.f0.f384359a;
    }
}
