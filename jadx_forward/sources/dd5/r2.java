package dd5;

/* loaded from: classes9.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b15.c f310809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310810e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(b15.c cVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f310809d = cVar;
        this.f310810e = f9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dd5.r2(this.f310809d, this.f310810e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dd5.r2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6255xde73125b c6255xde73125b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6255xde73125b();
        am.y10 y10Var = c6255xde73125b.f136504g;
        b15.c cVar = this.f310809d;
        y10Var.f89954a = cVar.y();
        c6255xde73125b.e();
        int A0 = this.f310810e.A0();
        boolean z17 = true;
        am.z10 z10Var = c6255xde73125b.f136505h;
        if (A0 == 1) {
            z17 = z10Var.f90039b;
        } else if (z10Var.f90039b) {
            z17 = false;
        }
        int i17 = z10Var.f90038a;
        boolean z18 = i17 != -2 ? z17 : false;
        if (i17 <= 0) {
            i17 = cVar.t();
        }
        return new jz5.l(java.lang.Boolean.valueOf(z18), new java.lang.Integer(i17));
    }
}
