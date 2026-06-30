package ij5;

/* loaded from: classes.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.t f373313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f373314e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ij5.t tVar, wi5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373313d = tVar;
        this.f373314e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ij5.l(this.f373313d, this.f373314e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ij5.l lVar = (ij5.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        lVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ij5.t tVar = this.f373313d;
        android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(tVar.m158354x19263085());
        wi5.o oVar = this.f373314e;
        android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ccg, (android.view.ViewGroup) oVar.f527865c, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        oVar.f527864b.mo146xb9724478(inflate);
        java.lang.String str = (java.lang.String) ((jz5.n) tVar.f373339n).mo141623x754a37bb();
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_g);
                textView.setVisibility(0);
                textView.setText(str);
            }
        }
        return jz5.f0.f384359a;
    }
}
