package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class q90 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f195507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f195508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 f195509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f195510g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f195511h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f195512i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q90(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var, cm2.m0 m0Var, l81.b1 b1Var, r45.y23 y23Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195508e = z17;
        this.f195509f = ea0Var;
        this.f195510g = m0Var;
        this.f195511h = b1Var;
        this.f195512i = y23Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q90(this.f195508e, this.f195509f, this.f195510g, this.f195511h, this.f195512i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q90) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f195507d;
        cm2.m0 m0Var = this.f195510g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var = this.f195509f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (!this.f195508e) {
                s40.a1 a1Var = (s40.a1) i95.n0.c(s40.a1.class);
                android.content.Context context = ea0Var.f446856d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                r45.y23 y23Var = m0Var.f124901v;
                this.f195507d = 1;
                if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5) a1Var).aj(context, y23Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        dk2.q4 q4Var = dk2.q4.f315471a;
        android.content.Context context2 = ea0Var.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        q4Var.n(context2, ea0Var.S0(), this.f195511h, ea0Var.Y0());
        android.content.Context context3 = ea0Var.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        q4Var.b(context3, ea0Var.S0(), m0Var.f124902w);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 R0 = ea0Var.R0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = R0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) R0 : null;
        r45.qt2 reportObj = c14353xe7c1f419 != null ? c14353xe7c1f419.getReportObj() : null;
        zl2.r4 r4Var = zl2.r4.f555483a;
        gk2.e S0 = ea0Var.S0();
        r45.y23 y23Var2 = this.f195512i;
        ((c61.p2) ybVar).Kj(reportObj, 18054, zl2.r4.k0(r4Var, S0, 25, pm0.v.u(y23Var2.m75942xfb822ef2(0)), 0, y23Var2.m75945x2fec8307(50), 8, null));
        return jz5.f0.f384359a;
    }
}
