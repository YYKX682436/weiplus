package rn2;

/* loaded from: classes5.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f479186d;

    /* renamed from: e, reason: collision with root package name */
    public int f479187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f479188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(rn2.c1 c1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479188f = c1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rn2.b1(this.f479188f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.b1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        rn2.c1 c1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f479187e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rn2.c1 c1Var2 = this.f479188f;
            if (c1Var2.B == null) {
                this.f479186d = c1Var2;
                this.f479187e = 1;
                java.lang.Object i18 = c1Var2.i(false, this);
                if (i18 == aVar) {
                    return aVar;
                }
                c1Var = c1Var2;
                obj = i18;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c1Var = (rn2.c1) this.f479186d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        c1Var.B = (r45.qa1) obj;
        return jz5.f0.f384359a;
    }
}
