package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s3 f184056a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s3();

    public final void a(ml2.t1 clickId, java.lang.Integer num) {
        java.lang.String str;
        r45.nw1 nw1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickId, "clickId");
        jz5.l[] lVarArr = new jz5.l[3];
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var == null || (str = c1Var.f410385o) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_username", str);
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        lVarArr[1] = new jz5.l("liveid", ((e1Var == null || (nw1Var = e1Var.f410521r) == null) ? "" : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0))).toString());
        mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
        lVarArr[2] = new jz5.l("feedid", e1Var2 != null ? pm0.v.u(e1Var2.f410516m) : "");
        java.util.Map l17 = kz5.c1.l(lVarArr);
        if (num != null) {
            l17.put("switch_states", java.lang.String.valueOf(num.intValue()));
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.q1 q1Var = ml2.q1.f409345e;
        zy2.zb.T8(zbVar, clickId, l17, null, "temp_30", null, null, false, 52, null);
    }

    public final void b(ml2.u1 ExposeId) {
        java.lang.String str;
        r45.nw1 nw1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ExposeId, "ExposeId");
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        jz5.l[] lVarArr = new jz5.l[3];
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var == null || (str = c1Var.f410385o) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_username", str);
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        lVarArr[1] = new jz5.l("liveid", ((e1Var == null || (nw1Var = e1Var.f410521r) == null) ? "" : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0))).toString());
        mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
        lVarArr[2] = new jz5.l("feedid", e1Var2 != null ? pm0.v.u(e1Var2.f410516m) : "");
        java.util.Map l17 = kz5.c1.l(lVarArr);
        ml2.q1 q1Var = ml2.q1.f409345e;
        zy2.zb.I8(zbVar, ExposeId, l17, null, "temp_30", null, null, false, 52, null);
    }
}
