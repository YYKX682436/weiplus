package p05;

/* loaded from: classes5.dex */
public final class q1 implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisModelMgr", "sysMsg consume: " + str + ", " + kz5.n0.g0(values.keySet(), null, null, null, 0, null, p05.o1.f432163d, 31, null) + ", " + kz5.n0.g0(values.values(), null, null, null, 0, null, p05.p1.f432170d, 31, null));
        java.lang.String str2 = (java.lang.String) values.get(".sysmsg.mmcvswitch.retry");
        int D1 = str2 == null || str2.length() == 0 ? 0 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str2, 0);
        if (D1 != 1) {
            if (D1 != 2) {
                return null;
            }
            p05.v2.f432237d.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7142x175d408b c7142x175d408b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7142x175d408b();
            if (tq5.i.f502802a == 0) {
                tq5.i.f502802a = 2014500;
            }
            c7142x175d408b.f144512d = tq5.i.f502802a;
            c7142x175d408b.f144514f = 3;
            c7142x175d408b.k();
            new p05.b().l().K(p05.t2.f432225a);
            return null;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7133xa3508982 c7133xa3508982 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7133xa3508982();
        if (tq5.i.f502802a == 0) {
            tq5.i.f502802a = 2014500;
        }
        c7133xa3508982.f144459d = tq5.i.f502802a;
        c7133xa3508982.f144464i = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Bi();
        c7133xa3508982.f144462g = 3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisionModelReporter", "reportSysMsgCgi: " + c7133xa3508982.n());
        c7133xa3508982.k();
        p05.p3.f432172a.d(0L);
        return null;
    }
}
