package yw;

/* loaded from: classes9.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f547959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yw.y f547960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f547961f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yw.y yVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f547960e = yVar;
        this.f547961f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw.q(this.f547960e, this.f547961f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f547959d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2621x8fb0427b.v9 v9Var = com.p314xaae8f345.mm.p2621x8fb0427b.w9.f277846a;
            this.f547959d = 1;
            obj = v9Var.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.q(new yw.p(this.f547960e, this.f547961f, (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l1) obj));
        return jz5.f0.f384359a;
    }
}
