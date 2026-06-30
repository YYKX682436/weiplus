package bj5;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f102706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f102707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bj5.n f102708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.o f102709g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wi5.n0 n0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, bj5.n nVar, wi5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f102706d = n0Var;
        this.f102707e = h0Var;
        this.f102708f = nVar;
        this.f102709g = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bj5.d(this.f102706d, this.f102707e, this.f102708f, this.f102709g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bj5.d dVar = (bj5.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        wi5.n0 n0Var = this.f102706d;
        boolean e17 = n0Var.e();
        wi5.o oVar = this.f102709g;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f102707e;
        if (e17) {
            android.view.View view = (android.view.View) h0Var.f391656d;
            if (view != null) {
                oVar.f527864b.mo146xb9724478(view);
            }
            h0Var.f391656d = null;
        } else {
            bj5.n nVar = this.f102708f;
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(nVar.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569690ip, (android.view.ViewGroup) oVar.f527865c, false);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.v2a);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            inflate.setOnClickListener(new bj5.c(nVar, n0Var));
            oVar.f527864b.mo146xb9724478(inflate);
            h0Var.f391656d = inflate;
        }
        return jz5.f0.f384359a;
    }
}
