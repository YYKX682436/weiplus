package dk2;

/* loaded from: classes3.dex */
public final class j3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f315169e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(dk2.r4 r4Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(5);
        this.f315168d = r4Var;
        this.f315169e = qVar;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.lang.String str;
        km2.b bVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.lang.String errMsg = (java.lang.String) obj4;
        r45.pf2 pf2Var = (r45.pf2) obj5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        if (booleanValue) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(pf2Var, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderManualCloseLiveResp");
            dk2.r4 r4Var = this.f315168d;
            r4Var.getClass();
            str = errMsg;
            bVar = new km2.b(pf2Var.m75939xb282bd08(1), pf2Var.m75939xb282bd08(2), pf2Var.m75942xfb822ef2(9), pf2Var.m75939xb282bd08(4), zl2.r4.f555483a.F0(((mm2.e1) r4Var.m(mm2.e1.class)).f410521r), pf2Var.m75939xb282bd08(5), pf2Var.m75939xb282bd08(6), ((mm2.e1) r4Var.m(mm2.e1.class)).f410521r.m75942xfb822ef2(50), pf2Var.m75939xb282bd08(7), 0L, 0L, false, 0L, 0L, null, pf2Var.m75939xb282bd08(8), null, pf2Var.m75939xb282bd08(10), null, null, (r45.sl1) pf2Var.m75936x14adae67(13), null, pf2Var, 2979840, null);
        } else {
            str = errMsg;
            bVar = null;
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        ((p3325xe03a0797.p3326xc267989b.r) this.f315169e).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new dk2.r0(booleanValue, intValue, intValue2, str, bVar)));
        return jz5.f0.f384359a;
    }
}
