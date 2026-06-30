package wb5;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb5.i f525969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f525970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wb5.i iVar, wi5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f525969d = iVar;
        this.f525970e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wb5.c(this.f525969d, this.f525970e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        wb5.c cVar = (wb5.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        wb5.i iVar = this.f525969d;
        android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(iVar.m158354x19263085());
        wi5.o oVar = this.f525970e;
        android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bik, (android.view.ViewGroup) oVar.f527865c, false);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(iVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571455fj));
        inflate.setOnClickListener(new wb5.a(iVar));
        yz5.l lVar = oVar.f527864b;
        lVar.mo146xb9724478(inflate);
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(iVar.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bik, (android.view.ViewGroup) oVar.f527865c, false);
        ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(iVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.me9));
        inflate2.setOnClickListener(new wb5.b(iVar));
        lVar.mo146xb9724478(inflate2);
        return jz5.f0.f384359a;
    }
}
