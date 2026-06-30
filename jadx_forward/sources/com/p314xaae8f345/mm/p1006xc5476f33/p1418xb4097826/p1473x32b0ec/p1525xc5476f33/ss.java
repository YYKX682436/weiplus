package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ss extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f195836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f195838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f195839g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f195840h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, java.lang.String str, boolean z17, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(4);
        this.f195836d = etVar;
        this.f195837e = str;
        this.f195838f = z17;
        this.f195839g = j17;
        this.f195840h = h0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String m75945x2fec8307;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.tp2 resp = (r45.tp2) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f195836d;
        java.lang.String str = this.f195837e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.G1(etVar, intValue, intValue2, str.toString(), resp.m75945x2fec8307(1), null, 16, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar2 = this.f195836d;
        if (intValue == 0 && intValue2 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.y1(etVar2, this.f195838f, this.f195839g, str);
        } else {
            r45.zm6 zm6Var = (r45.zm6) resp.m75936x14adae67(7);
            if (zm6Var != null && zm6Var.m75933x41a8a7f2(1)) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eby);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                zl2.q4 q4Var = zl2.q4.f555466a;
                r45.zm6 zm6Var2 = (r45.zm6) resp.m75936x14adae67(7);
                if (zm6Var2 != null && (m75945x2fec8307 = zm6Var2.m75945x2fec8307(0)) != null) {
                    string = m75945x2fec8307;
                }
                q4Var.P(string);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rt rtVar = etVar2.S;
        if (rtVar != null) {
            java.lang.String m75945x2fec83072 = ((r45.ch1) this.f195840h.f391656d).m75945x2fec8307(2);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            rtVar.a("sendReplyMsg", m75945x2fec83072, intValue, intValue2);
        }
        return jz5.f0.f384359a;
    }
}
