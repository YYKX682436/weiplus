package df2;

/* loaded from: classes3.dex */
public final class oz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f312556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xb2 f312557f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz(df2.a00 a00Var, r45.xb2 xb2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312556e = a00Var;
        this.f312557f = xb2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.oz(this.f312556e, this.f312557f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.oz) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312555d;
        r45.xb2 xb2Var = this.f312557f;
        df2.a00 a00Var = this.f312556e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f312555d = 1;
            if (df2.a00.a7(a00Var, xb2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c76 = a00Var.c7();
        if (!(c76 != null && c76.getVisibility() == 0)) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.f4 f4Var = ml2.f4.V;
            cl0.g gVar = new cl0.g();
            r45.bb7 bb7Var = (r45.bb7) xb2Var.m75936x14adae67(0);
            gVar.h("extra_report_json", bb7Var != null ? bb7Var.m75945x2fec8307(4) : null);
            ml2.r0.Dj(r0Var, f4Var, null, null, null, null, null, 0, 0L, gVar, null, null, null, false, null, 16126, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c77 = a00Var.c7();
            if (c77 != null) {
                c77.e();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c78 = a00Var.c7();
            if (c78 != null) {
                c78.d();
            }
        }
        return jz5.f0.f384359a;
    }
}
