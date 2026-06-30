package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class rs implements ek2.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f195713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f195715c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f195716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195717e;

    public rs(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, java.lang.String str, boolean z17, long j17, java.lang.String str2) {
        this.f195713a = etVar;
        this.f195714b = str;
        this.f195715c = z17;
        this.f195716d = j17;
        this.f195717e = str2;
    }

    @Override // ek2.p0
    public void a(int i17, int i18, java.lang.String str, r45.wp2 resp) {
        r45.xy1 xy1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f195713a;
        java.lang.String str2 = this.f195714b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.G1(etVar, i17, i18, str2.toString(), resp.m75945x2fec8307(1), null, 16, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar2 = this.f195713a;
        if (etVar2.f193981p.mo11219xd0598cf8() == 0 && i17 == 0 && i18 == 0) {
            km2.z zVar = ((on2.z2) etVar2.P0(on2.z2.class)).f428625m;
            if (zVar != null && zVar.f390762a == 1) {
                r45.cz1 cz1Var = zVar.f390765d;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, (cz1Var == null || (xy1Var = (r45.xy1) cz1Var.m75936x14adae67(5)) == null) ? null : xy1Var.m75945x2fec8307(1))) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_reply_lucky_comment", etVar2.f193997z, null, 25561);
                }
            }
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.ek((ml2.r0) c17, ml2.p4.f409330h, str2.toString(), null, 0, null, 28, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.y1(etVar2, this.f195715c, this.f195716d, str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rt rtVar = etVar2.S;
        if (rtVar != null) {
            rtVar.a("sendNormalMsg", this.f195717e, i17, i18);
        }
    }
}
