package cj5;

/* loaded from: classes.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f123775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f123776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cj5.a0 f123777f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.o f123778g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(wi5.n0 n0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, cj5.a0 a0Var, wi5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123775d = n0Var;
        this.f123776e = h0Var;
        this.f123777f = a0Var;
        this.f123778g = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cj5.u(this.f123775d, this.f123776e, this.f123777f, this.f123778g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cj5.u uVar = (cj5.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        uVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        wi5.n0 n0Var = this.f123775d;
        boolean e17 = n0Var.e();
        wi5.o oVar = this.f123778g;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f123776e;
        if (e17) {
            android.view.View view = (android.view.View) h0Var.f391656d;
            if (view != null) {
                oVar.f527864b.mo146xb9724478(view);
            }
            h0Var.f391656d = null;
        } else {
            cj5.a0 a0Var = this.f123777f;
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(a0Var.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569690ip, (android.view.ViewGroup) oVar.f527865c, false);
            inflate.setOnClickListener(new cj5.t(a0Var, n0Var));
            oVar.f527864b.mo146xb9724478(inflate);
            h0Var.f391656d = inflate;
        }
        return jz5.f0.f384359a;
    }
}
