package dw3;

/* loaded from: classes5.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f325796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f325797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f325799g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dw3.l0 f325800h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f325801i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(yz5.l lVar, java.lang.String str, int i17, dw3.l0 l0Var, android.app.Activity activity, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325797e = lVar;
        this.f325798f = str;
        this.f325799g = i17;
        this.f325800h = l0Var;
        this.f325801i = activity;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dw3.r0(this.f325797e, this.f325798f, this.f325799g, this.f325800h, this.f325801i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dw3.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f325796d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f325796d = 1;
            obj = this.f325797e.mo146xb9724478(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        dw3.m0 m0Var = (dw3.m0) obj;
        dw3.u0 u0Var = dw3.u0.f325816a;
        u0Var.h(this.f325801i, u0Var.c(this.f325798f, m0Var.f325768a, this.f325799g, m0Var.f325769b, this.f325800h.a()));
        return jz5.f0.f384359a;
    }
}
