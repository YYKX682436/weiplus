package xt2;

/* loaded from: classes.dex */
public final class i6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f538336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.k6 f538337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f538338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f538339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f538340h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(xt2.k6 k6Var, java.lang.String str, android.content.Context context, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f538337e = k6Var;
        this.f538338f = str;
        this.f538339g = context;
        this.f538340h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xt2.i6(this.f538337e, this.f538338f, this.f538339g, this.f538340h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.i6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f538336d;
        xt2.k6 k6Var = this.f538337e;
        java.lang.String str = this.f538338f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f538336d = 1;
            obj = xt2.k6.e(k6Var, str, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        cl0.g gVar = new cl0.g(str);
        xt2.u1 u1Var = new xt2.u1(this.f538339g, gVar.optLong("productId"), gVar.optInt("reqScene"), new xt2.h6(k6Var, str, null));
        u1Var.f((r45.s42) obj);
        this.f538340h.mo146xb9724478(u1Var.d());
        return jz5.f0.f384359a;
    }
}
