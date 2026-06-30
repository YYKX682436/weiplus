package ut;

/* loaded from: classes12.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f512276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f512277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f512278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f512279g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var, p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var2, ut.q0 q0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512277e = n2Var;
        this.f512278f = n2Var2;
        this.f512279g = q0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ut.t(this.f512277e, this.f512278f, this.f512279g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f512276d;
        if (i17 != 0) {
            if (i17 == 1) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                throw new jz5.d();
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            throw new jz5.d();
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ut.q0 q0Var = this.f512279g;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var = this.f512277e;
        if (n2Var != null) {
            ut.r rVar = new ut.r(q0Var);
            this.f512276d = 1;
            if (n2Var.a(rVar, this) == aVar) {
                return aVar;
            }
            throw new jz5.d();
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var2 = this.f512278f;
        if (n2Var2 == null) {
            return jz5.f0.f384359a;
        }
        ut.s sVar = new ut.s(q0Var);
        this.f512276d = 2;
        if (n2Var2.a(sVar, this) == aVar) {
            return aVar;
        }
        throw new jz5.d();
    }
}
