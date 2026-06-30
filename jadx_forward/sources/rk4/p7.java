package rk4;

/* loaded from: classes11.dex */
public final class p7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f478433d;

    /* renamed from: e, reason: collision with root package name */
    public int f478434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f478435f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f478436g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f478437h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f478438i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ il4.e f478439m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f478440n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(rk4.k8 k8Var, android.content.Context context, boolean z17, bw5.lp0 lp0Var, il4.e eVar, android.os.Bundle bundle, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478435f = k8Var;
        this.f478436g = context;
        this.f478437h = z17;
        this.f478438i = lp0Var;
        this.f478439m = eVar;
        this.f478440n = bundle;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.p7(this.f478435f, this.f478436g, this.f478437h, this.f478438i, this.f478439m, this.f478440n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.p7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478434e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rk4.k8 k8Var = this.f478435f;
            this.f478434e = 1;
            obj = rk4.k8.m(k8Var, false, false, this, 3, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        rk4.k8 k8Var2 = this.f478435f;
        android.content.Context context = this.f478436g;
        boolean z17 = this.f478437h;
        bw5.lp0 lp0Var = this.f478438i;
        il4.e eVar = this.f478439m;
        android.os.Bundle bundle = this.f478440n;
        this.f478433d = obj;
        this.f478434e = 2;
        if (k8Var2.I((pi0.l1) obj, context, z17, lp0Var, eVar, bundle, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
