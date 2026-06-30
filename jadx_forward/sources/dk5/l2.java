package dk5;

/* loaded from: classes9.dex */
public final class l2 {
    public l2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        java.lang.String m75945x2fec8307;
        if (str == null || f9Var == null) {
            return;
        }
        if (z17) {
            long o17 = c01.w9.o(f9Var.Q0());
            f9Var.e1(o17 == f9Var.mo78012x3fdd41df() ? 1 + o17 : o17);
            f9Var.r1(1);
            int s17 = pt0.f0.f439742b1.s(f9Var.Q0(), f9Var.m124847x74d37ac6(), f9Var);
            if (s17 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.RecordRetransmitLogic", "update resend msgInfo " + f9Var.m124847x74d37ac6() + ' ' + f9Var.Q0() + " fail ret:" + s17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.RecordRetransmitLogic", "resend msgInfo createTime " + f9Var.m124847x74d37ac6() + ' ' + f9Var.Q0() + " from:" + k35.m1.e(o17) + " to:" + k35.m1.e(f9Var.mo78012x3fdd41df()));
        }
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        java.lang.String str2 = "";
        if (U1 == null) {
            U1 = "";
        }
        cVar.m126728xdc93280d(U1);
        gu.k kVar = new gu.k(str, cVar);
        if (z17) {
            kVar.f357149s = "resend_record";
            kVar.f493718g = true;
            kVar.f357152v = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(f9Var);
            s15.w wVar = new s15.w();
            v05.b k17 = cVar.k();
            if (k17 != null && (m75945x2fec8307 = k17.m75945x2fec8307(k17.f513848e + 44)) != null) {
                str2 = m75945x2fec8307;
            }
            wVar.m126728xdc93280d(str2);
            kVar.f357153w = wVar;
        } else {
            kVar.f357149s = "forward_record";
            kVar.f357150t = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(f9Var);
        }
        v05.b k18 = cVar.k();
        if ((k18 != null && k18.m75939xb282bd08(k18.f449898d + 6) == 24) && kVar.f357150t != null) {
            i95.m c17 = i95.n0.c(qx.d0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            qx.d0 d0Var = (qx.d0) c17;
            java.lang.String str3 = kVar.f357147q;
            oi3.g gVar = kVar.f357150t;
            java.lang.String m75945x2fec83072 = gVar != null ? gVar.m75945x2fec8307(gVar.f427150d + 3) : null;
            oi3.g gVar2 = kVar.f357150t;
            if (((px.a) d0Var).Ni(str3, m75945x2fec83072, gVar2 != null ? gVar2.m75942xfb822ef2(gVar2.f427150d + 0) : 0L, null)) {
                return;
            }
        }
        ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).getClass();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j d17 = qi3.x.f445294a.d(new ru.u(kVar));
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new dk5.k2(d17, null), 1, null);
        }
    }
}
