package zl2;

/* loaded from: classes2.dex */
public final class k2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f555389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f555391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f555392g;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.content.Context context, r45.qt2 qt2Var, int i17) {
        this.f555389d = abstractC14490x69736cb5;
        this.f555390e = context;
        this.f555391f = qt2Var;
        this.f555392g = i17;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        boolean z17;
        r45.qw1 qw1Var;
        zl2.r4 r4Var = zl2.r4.f555483a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f555389d;
        ya2.b2 contact = abstractC14490x69736cb5.getContact();
        java.lang.String str = contact != null ? contact.f69347xdec927b : null;
        android.content.Context context = this.f555390e;
        if (r26.i0.q(str, xy2.c.e(context), false, 2, null)) {
            z17 = true;
        } else {
            zl2.q4 q4Var = zl2.q4.f555466a;
            boolean C = q4Var.C(abstractC14490x69736cb5);
            r45.qt2 qt2Var = this.f555391f;
            if (C) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g4Var);
                q4Var.a(g4Var);
                i95.m c17 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.T2, kz5.c1.i(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "8")), qt2Var != null ? qt2Var.m75945x2fec8307(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)).toString() : null, null, null, false, 112, null);
            }
            int i17 = this.f555392g;
            if (i17 != 3 && i17 != 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g4Var);
                y4Var.h(context, g4Var, abstractC14490x69736cb5);
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.u1 u1Var = ml2.u1.S1;
                jz5.l[] lVarArr = new jz5.l[4];
                r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
                lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null));
                lVarArr[1] = new jz5.l("feedId", java.lang.String.valueOf(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()));
                lVarArr[2] = new jz5.l("panel_sence", i17 == 1005 ? "2" : "4");
                lVarArr[3] = new jz5.l("sessionBuffer", abstractC14490x69736cb5.g0());
                zy2.zb.I8(zbVar, u1Var, kz5.c1.l(lVarArr), qt2Var != null ? qt2Var.m75945x2fec8307(1) : null, java.lang.String.valueOf(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null), null, null, false, 112, null);
            }
            i95.m c19 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c19;
            ml2.u1 u1Var2 = ml2.u1.T1;
            jz5.l[] lVarArr2 = new jz5.l[3];
            r45.nw1 m59258xd05571302 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
            lVarArr2[0] = new jz5.l("liveid", java.lang.String.valueOf(m59258xd05571302 != null ? java.lang.Long.valueOf(m59258xd05571302.m75942xfb822ef2(0)) : null));
            z17 = true;
            lVarArr2[1] = new jz5.l("feedid", pm0.v.u(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()));
            lVarArr2[2] = new jz5.l("panel_sence", i17 != 1005 ? "4" : "2");
            zy2.zb.I8(zbVar2, u1Var2, kz5.c1.l(lVarArr2), qt2Var != null ? qt2Var.m75945x2fec8307(1) : null, java.lang.String.valueOf(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null), null, null, false, 112, null);
            g4Var.g(101, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gys), com.p314xaae8f345.mm.R.raw.f80290xd9c5d1ec);
        }
        r45.dm2 m76806xdef68064 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
        java.lang.String m75945x2fec8307 = (m76806xdef68064 == null || (qw1Var = (r45.qw1) m76806xdef68064.m75936x14adae67(14)) == null) ? null : qw1Var.m75945x2fec8307(0);
        if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) ? z17 : false) {
            return;
        }
        g4Var.g(211, "统计(内部)", com.p314xaae8f345.mm.R.raw.f80194x8f1a8525);
    }
}
