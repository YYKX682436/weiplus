package uc5;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f508028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f508029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc5.n f508030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f508031g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f508032h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ uc5.r0 f508033i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.View view, java.lang.String str, uc5.n nVar, android.content.Context context, java.lang.Object obj, uc5.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f508028d = view;
        this.f508029e = str;
        this.f508030f = nVar;
        this.f508031g = context;
        this.f508032h = obj;
        this.f508033i = r0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new uc5.i(this.f508028d, this.f508029e, this.f508030f, this.f508031g, this.f508032h, this.f508033i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((uc5.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Object tag = this.f508028d.getTag(com.p314xaae8f345.mm.R.id.uhn);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag instanceof java.lang.String ? (java.lang.String) tag : null, this.f508029e);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!b17) {
            return f0Var;
        }
        android.content.Context context = this.f508031g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        uc5.r0 r0Var = this.f508033i;
        uc5.n nVar = this.f508030f;
        java.lang.Object obj2 = this.f508032h;
        nVar.s(context, obj2, r0Var);
        uc5.f fVar = nVar.f508065h;
        java.lang.String str = fVar != null ? fVar.f508015a : null;
        if (str == null) {
            str = "";
        }
        if (!r26.n0.N(str)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            nVar.n(context, obj2, str);
        }
        return f0Var;
    }
}
