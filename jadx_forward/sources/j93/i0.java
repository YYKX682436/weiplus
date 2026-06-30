package j93;

/* loaded from: classes.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f379938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f379939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j93.r0 r0Var, wi5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f379938d = r0Var;
        this.f379939e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j93.i0(this.f379938d, this.f379939e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        j93.i0 i0Var = (j93.i0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        j93.r0 r0Var = this.f379938d;
        android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(r0Var.m158354x19263085());
        wi5.o oVar = this.f379939e;
        android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bik, (android.view.ViewGroup) oVar.f527865c, false);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(r0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573844mb1));
        inflate.setOnClickListener(new j93.h0(r0Var));
        oVar.f527864b.mo146xb9724478(inflate);
        return jz5.f0.f384359a;
    }
}
