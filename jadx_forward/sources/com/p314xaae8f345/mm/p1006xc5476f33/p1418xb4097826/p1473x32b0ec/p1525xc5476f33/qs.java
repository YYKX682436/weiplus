package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class qs implements ek2.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f195576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195577b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f195578c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f195579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195580e;

    public qs(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, java.lang.String str, boolean z17, long j17, java.lang.String str2) {
        this.f195576a = etVar;
        this.f195577b = str;
        this.f195578c = z17;
        this.f195579d = j17;
        this.f195580e = str2;
    }

    @Override // ek2.p0
    public void a(int i17, int i18, java.lang.String str, r45.wp2 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.G1(this.f195576a, i17, i18, this.f195577b, resp.m75945x2fec8307(1), null, 16, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f195576a;
        if (etVar.f193981p.mo11219xd0598cf8() == 0 && i17 == 0 && i18 == 0) {
            km2.z zVar = ((on2.z2) ((mm2.c1) etVar.P0(mm2.c1.class)).m147920xbba4bfc0(on2.z2.class)).f428625m;
            java.lang.String str2 = this.f195577b;
            if (zVar != null && zVar.f390762a == 1) {
                r45.cz1 cz1Var = zVar.f390765d;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, cz1Var != null ? cz1Var.m75945x2fec8307(4) : null)) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_reply_lucky_comment", etVar.f193997z, null, 25561);
                }
            }
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.ek((ml2.r0) c17, ml2.p4.f409330h, this.f195577b, null, 0, null, 28, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.y1(etVar, this.f195578c, this.f195579d, str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rt rtVar = etVar.S;
        if (rtVar != null) {
            rtVar.a("sendFastCommentMsg", this.f195580e, i17, i18);
        }
    }
}
