package jr2;

/* loaded from: classes10.dex */
public final class v implements vg3.q4 {

    /* renamed from: d, reason: collision with root package name */
    public volatile int f382919d;

    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        if (!gm0.j1.a()) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) values.get(".sysmsg.finderliveclosenotifymsg.revoke_id");
        ce2.l D0 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Pj().D0(str2);
        java.lang.String str3 = (java.lang.String) values.get(".sysmsg.finderliveclosenotifymsg.functionmsgid");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyRevokeConsumer", "get close live notify, revokeID = " + str2 + " rowId = " + D0.f72763xa3c65b86 + " exposure = " + D0.f68159xbc5c91be + " , funcMsgId =  " + str3 + " ,msdId = " + D0.f68165x297eb4f7);
        if (D0.f72763xa3c65b86 != -1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(D0.f68168x114ef53e, D0.f68165x297eb4f7);
            if (n17.m124847x74d37ac6() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyRevokeConsumer", "msg info not exist, id = " + D0.f68165x297eb4f7);
                return null;
            }
            java.lang.String j17 = n17.j();
            int L = j17 != null ? r26.n0.L(j17, "<status>", 0, false, 6, null) : 0;
            java.lang.String j18 = n17.j();
            int L2 = j18 != null ? r26.n0.L(j18, "</status>", 0, false, 6, null) : 0;
            if (L == -1 || L2 == -1) {
                pm0.z.b(xy2.b.f539688b, "FinderLiveNotifyRevokeConsumer", false, null, null, false, false, new jr2.u(n17), 60, null);
            } else {
                java.lang.String j19 = n17.j();
                n17.d1(j19 != null ? r26.n0.b0(j19, L + 8, L2, "0").toString() : null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(n17.m124847x74d37ac6(), n17, true);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Pj().L0(n17.m124847x74d37ac6(), 0);
                if (c01.id.e() > this.f382919d) {
                    if (str3 == null) {
                        str3 = "";
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyRevokeConsumer", "[requestLiveNotify] funcMsgId:".concat(str3));
                    if (str3.length() > 0) {
                        this.f382919d = c01.id.e() + 1;
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveNotifyFuncMsgExtension", "requestOnLiveClose");
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put(".sysmsg.functionmsg.cgi", "/cgi-bin/micromsg-bin/findergetlivetips");
                        hashMap.put(".sysmsg.functionmsg.cmdid", "6407");
                        hashMap.put(".sysmsg.functionmsg.functionmsgid", str3);
                        hashMap.put(".sysmsg.functionmsg.businessid", java.lang.String.valueOf(70001L));
                        ic2.u.f371905f = (java.lang.String) hashMap.get(".sysmsg.functionmsg.functionmsgid");
                        ((rj.p) ((qk.w7) i95.n0.c(qk.w7.class))).getClass();
                        xr.a.f537660a.b(new r45.j4(), hashMap, "requestOnLiveClose");
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyRevokeConsumer", "funcMsgId：" + str3 + " but Frequency limit");
                }
            }
        }
        return null;
    }
}
