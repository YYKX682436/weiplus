package yt3;

/* loaded from: classes5.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.c1 f546883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dw3.o0 f546884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw3.k0 f546885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f546886g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f546887h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(yt3.c1 c1Var, dw3.o0 o0Var, dw3.k0 k0Var, java.lang.Integer num, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f546883d = c1Var;
        this.f546884e = o0Var;
        this.f546885f = k0Var;
        this.f546886g = num;
        this.f546887h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yt3.b1(this.f546883d, this.f546884e, this.f546885f, this.f546886g, this.f546887h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yt3.b1 b1Var = (yt3.b1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dw3.u0 u0Var = dw3.u0.f325816a;
        yt3.c1 c1Var = this.f546883d;
        android.content.Context context = c1Var.f546912f.getContext();
        yt3.a1 a1Var = new yt3.a1(c1Var, null);
        int b17 = dw3.j0.f325751a.b();
        dw3.l0 l0Var = new dw3.l0(null, c1Var.f546921r, this.f546884e, this.f546885f, this.f546886g, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        u0Var.f(context, a1Var, this.f546887h, b17, l0Var, null);
        return jz5.f0.f384359a;
    }
}
