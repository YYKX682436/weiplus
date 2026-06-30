package dj3;

/* loaded from: classes14.dex */
public class u implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ai().f231475n == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ai().f231475n = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t1();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ai().f231475n.getClass();
        java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459094h);
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        er4.b bVar = er4.b.CONF_NOTIFY_FROM_NEW_SYNC;
        r45.j4 j4Var = p0Var.f152259a;
        if (oVar != null && oVar.ib()) {
            r45.du5 du5Var = j4Var.f459091e;
            oVar.e9("voipmt", g17, j4Var.f459098o, du5Var != null ? du5Var.f454289d : "", bVar);
            return;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        if (((java.lang.String) d17.get(".sysmsg.multivoip.notfriendnotifydata")) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive notfriendnotifydata msg:" + g17);
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.voipmt.invite");
        if (str != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            byte[] decode = android.util.Base64.decode(str.getBytes(), 0);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
            c6229x2bb765fe.e();
            boolean z18 = c6229x2bb765fe.f136476g.f89780c || iq.b.E();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "parseMTInvite inVoIP %b inIlinkVoip %b inSystemCall %b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(((jp5.o) i95.n0.c(jp5.o.class)).ie()), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi()));
            if (z18) {
                ((jp5.o) i95.n0.c(jp5.o.class)).e9("voipmt", g17, j4Var.f459098o, j4Var.f459091e.f454289d, bVar);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive invite " + x51.j1.g(j4Var.f459094h) + " buffer len " + decode.length);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
            i4Var.N((long) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().f354681a.a(1)), c01.z1.r());
            i4Var.L(decode, decode.length);
            return;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.voipmt.cancelinvite");
        if (str2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "parseMTCancelInvite");
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            byte[] decode2 = android.util.Base64.decode(str2.getBytes(), 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
            int length = decode2.length;
            i4Var2.getClass();
            r45.l07 l07Var = new r45.l07();
            try {
                l07Var.mo11468x92b714fd(decode2);
                if (l07Var.f460597d == 0 && l07Var.f460598e == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkService", "invalid cancelInviteMsg, ignore");
                    return;
                } else {
                    byte[] bArr = l07Var.f460598e.f273689a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m120001xd82634ef(bArr, bArr.length, i4Var2.f231190y1);
                    return;
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Multitalk.ILinkService", e17, "hy: unable to parse from data", new java.lang.Object[0]);
                return;
            }
        }
        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.voipmt.banner");
        if (str3 != null) {
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            byte[] decode3 = android.util.Base64.decode(str3.getBytes(), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive banner " + x51.j1.g(j4Var.f459094h) + " buffer len " + decode3.length);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
            i4Var3.N((long) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().f354681a.a(1)), c01.z1.r());
            r45.k07 k07Var = new r45.k07();
            try {
                k07Var.mo11468x92b714fd(decode3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "got banner msg from wxgroupid %s sdkgroupid %s roomid %d seq %d status %d", k07Var.f459809d, k07Var.f459811f, java.lang.Long.valueOf(k07Var.f459810e), java.lang.Long.valueOf(k07Var.f459813h), java.lang.Integer.valueOf(k07Var.f459814i));
                java.lang.String str4 = k07Var.f459811f;
                if ((str4 == null || str4.equals("")) && k07Var.f459814i != 0) {
                    return;
                }
                java.util.Iterator it = k07Var.f459812g.iterator();
                while (it.hasNext()) {
                    r45.y07 y07Var = ((r45.z07) it.next()).f473109d;
                    i4Var3.f231156f.f(y07Var.f472222d, y07Var.f472223e, 0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().O(k07Var.f459809d, 2);
                i4Var3.Y.d(k07Var);
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Multitalk.ILinkService", e18, "hy: unable to parse from data", new java.lang.Object[0]);
            }
        }
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
