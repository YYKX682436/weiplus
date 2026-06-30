package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class rf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f186001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f186002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f186004g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f186005h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar, in5.s0 s0Var, so2.h1 h1Var, r45.qt2 qt2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f186002e = zfVar;
        this.f186003f = s0Var;
        this.f186004g = h1Var;
        this.f186005h = qt2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rf(this.f186002e, this.f186003f, this.f186004g, this.f186005h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f186001d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ae2.in inVar = ae2.in.f85221a;
            long intValue = ((java.lang.Number) ae2.in.S3.r()).intValue();
            this.f186001d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(intValue, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = this.f186002e;
        in5.s0 s0Var = this.f186003f;
        so2.h1 h1Var = this.f186004g;
        zfVar.F(s0Var, h1Var, true);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.u1 u1Var = ml2.u1.D2;
        jz5.l[] lVarArr = new jz5.l[2];
        r45.nw1 m59258xd0557130 = h1Var.getFeedObject().m59258xd0557130();
        if (m59258xd0557130 == null || (str = new java.lang.Long(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        lVarArr[1] = new jz5.l("button_status", "2");
        java.util.HashMap i18 = kz5.c1.i(lVarArr);
        r45.qt2 qt2Var = this.f186005h;
        zy2.zb.I8(zbVar, u1Var, i18, qt2Var != null ? qt2Var.m75945x2fec8307(1) : null, qt2Var != null ? new java.lang.Integer(qt2Var.m75939xb282bd08(5)).toString() : null, null, null, false, 112, null);
        return jz5.f0.f384359a;
    }
}
