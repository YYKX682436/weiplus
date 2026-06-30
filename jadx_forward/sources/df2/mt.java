package df2;

/* loaded from: classes3.dex */
public final class mt extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.x42 f312337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.nt f312338f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt(r45.x42 x42Var, df2.nt ntVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312337e = x42Var;
        this.f312338f = ntVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.mt(this.f312337e, this.f312338f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.mt) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312336d;
        r45.x42 x42Var = this.f312337e;
        df2.nt ntVar = this.f312338f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long m75939xb282bd08 = x42Var.m75939xb282bd08(1) * 1000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ntVar.f312415m, "launch delay job, delay = " + m75939xb282bd08);
            this.f312336d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(m75939xb282bd08, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ntVar.f312415m, "doReportInternal after " + x42Var.m75939xb282bd08(1) + "s, report size = " + ntVar.f312416n.size());
        ntVar.b7("after delay");
        return jz5.f0.f384359a;
    }
}
