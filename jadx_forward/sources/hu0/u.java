package hu0;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f366592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f366593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(hu0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f366593e = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hu0.u(this.f366593e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu0.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f366592d;
        hu0.a0 a0Var = this.f366593e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gu0.k2 S6 = a0Var.S6();
            if (S6 != null) {
                this.f366592d = 1;
                obj = S6.n(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return new io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a(a0Var.m158354x19263085());
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        return new io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a(a0Var.m158354x19263085());
    }
}
