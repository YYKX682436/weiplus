package un;

/* loaded from: classes.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.p0 f510842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f510843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f510844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f510845g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(un.p0 p0Var, wi5.o oVar, java.lang.String str, wi5.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f510842d = p0Var;
        this.f510843e = oVar;
        this.f510844f = str;
        this.f510845g = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new un.m0(this.f510842d, this.f510843e, this.f510844f, this.f510845g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        un.m0 m0Var = (un.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        m0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        un.p0 p0Var = this.f510842d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = p0Var.m158354x19263085();
        wi5.o oVar = this.f510843e;
        android.view.View inflate = android.view.LayoutInflater.from(m158354x19263085).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c5m, (android.view.ViewGroup) oVar.f527865c, false);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(this.f510844f);
        inflate.setOnClickListener(new un.l0(p0Var, this.f510845g));
        yz5.l lVar = oVar.f527864b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        lVar.mo146xb9724478(inflate);
        return jz5.f0.f384359a;
    }
}
