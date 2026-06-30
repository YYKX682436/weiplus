package dz0;

/* loaded from: classes5.dex */
public final class t0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.yb f326543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f326544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.e f326545g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326546h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(az0.yb ybVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, az0.e eVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f326543e = ybVar;
        this.f326544f = h0Var;
        this.f326545g = eVar;
        this.f326546h = str;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dz0.t0 t0Var = new dz0.t0(this.f326543e, this.f326544f, this.f326545g, this.f326546h, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        t0Var.f326542d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        t0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f326543e.f97623a = ((java.lang.Throwable) this.f326542d) == null && this.f326544f.f391656d == null;
        az0.e eVar = this.f326545g;
        if (eVar != null) {
            ((mz0.w1) eVar).b(this.f326546h);
        }
        return jz5.f0.f384359a;
    }
}
