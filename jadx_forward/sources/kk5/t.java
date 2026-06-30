package kk5;

/* loaded from: classes.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f390217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk5.w f390218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.o f390219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f390220g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z17, kk5.w wVar, wi5.o oVar, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f390217d = z17;
        this.f390218e = wVar;
        this.f390219f = oVar;
        this.f390220g = z18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kk5.t(this.f390217d, this.f390218e, this.f390219f, this.f390220g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kk5.t tVar = (kk5.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        tVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f390217d;
        wi5.o oVar = this.f390219f;
        kk5.w wVar = this.f390218e;
        if (z17) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(wVar.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bik, (android.view.ViewGroup) oVar.f527865c, false);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(wVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571443f6));
            inflate.setOnClickListener(new kk5.r(wVar));
            oVar.f527864b.mo146xb9724478(inflate);
        }
        if (this.f390220g) {
            android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(wVar.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bik, (android.view.ViewGroup) oVar.f527865c, false);
            ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(wVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jbu));
            inflate2.setOnClickListener(new kk5.s(wVar));
            oVar.f527864b.mo146xb9724478(inflate2);
        }
        return jz5.f0.f384359a;
    }
}
