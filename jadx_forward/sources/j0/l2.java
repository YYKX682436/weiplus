package j0;

/* loaded from: classes14.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f377960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1.a0 f377961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0.l3 f377962f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(p1.a0 a0Var, j0.l3 l3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377961e = a0Var;
        this.f377962f = l3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j0.l2(this.f377961e, this.f377962f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.l2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f377960d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f377960d = 1;
            j0.l3 l3Var = this.f377962f;
            j0.r2 r2Var = new j0.r2(l3Var);
            j0.s2 s2Var = new j0.s2(l3Var);
            j0.t2 t2Var = new j0.t2(l3Var);
            j0.u2 u2Var = new j0.u2(l3Var);
            float f17 = b0.p0.f98003a;
            java.lang.Object b17 = b0.u1.b(this.f377961e, new b0.h0(r2Var, u2Var, t2Var, s2Var, null), this);
            if (b17 != aVar) {
                b17 = f0Var;
            }
            if (b17 != aVar) {
                b17 = f0Var;
            }
            if (b17 == aVar) {
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
