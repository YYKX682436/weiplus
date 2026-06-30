package rp4;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839 f480204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f480205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw3.o0 f480206f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f480207g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f480208h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839 c18821x16ce7839, java.lang.String str, dw3.o0 o0Var, java.lang.Integer num, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480204d = c18821x16ce7839;
        this.f480205e = str;
        this.f480206f = o0Var;
        this.f480207g = num;
        this.f480208h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rp4.m(this.f480204d, this.f480205e, this.f480206f, this.f480207g, this.f480208h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rp4.m mVar = (rp4.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        mVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dw3.u0 u0Var = dw3.u0.f325816a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839 c18821x16ce7839 = this.f480204d;
        android.content.Context context = c18821x16ce7839.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        u0Var.f(context, new rp4.l(c18821x16ce7839, null), this.f480205e, dw3.j0.f325751a.b(), new dw3.l0(null, c18821x16ce7839.M, this.f480206f, null, this.f480207g, 9, null), this.f480208h);
        return jz5.f0.f384359a;
    }
}
