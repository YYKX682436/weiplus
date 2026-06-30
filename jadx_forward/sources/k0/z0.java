package k0;

/* loaded from: classes14.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f384526d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f384527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0.l3 f384528f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(j0.l3 l3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f384528f = l3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        k0.z0 z0Var = new k0.z0(this.f384528f, interfaceC29045xdcb5ca57);
        z0Var.f384527e = obj;
        return z0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((k0.z0) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f384526d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p1.a0 a0Var = (p1.a0) this.f384527e;
            this.f384526d = 1;
            java.lang.Object f17 = p3325xe03a0797.p3326xc267989b.z0.f(new j0.m2(a0Var, this.f384528f, null), this);
            if (f17 != aVar) {
                f17 = f0Var;
            }
            if (f17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
