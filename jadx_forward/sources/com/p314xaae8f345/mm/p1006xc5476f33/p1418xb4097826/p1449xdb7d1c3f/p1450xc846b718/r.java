package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class r implements ya2.x1 {
    public final void a(r45.hx0 hx0Var) {
        r45.r21 r21Var = new r45.r21();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = hx0Var.m75934xbce7f2f(1);
        r21Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
        java.lang.String m75945x2fec8307 = r21Var.m75945x2fec8307(2);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountSyncHandler", "[processFansCount] finderUsername=" + m75945x2fec8307 + " fansCount " + r21Var.m75939xb282bd08(0) + " fansAddCount:" + r21Var.m75939xb282bd08(1));
        g92.b bVar = g92.b.f351302e;
        if (bVar.v(m75945x2fec8307)) {
            m92.c cVar = new m92.c(m75945x2fec8307);
            cVar.u0().set(20, java.lang.Integer.valueOf(r21Var.m75939xb282bd08(0)));
            if (r21Var.m75939xb282bd08(1) != 0) {
                cVar.f68699xd28c4ff3 = r21Var.m75939xb282bd08(1);
            }
            bVar.C(cVar, m92.j.B);
        }
        int m75939xb282bd08 = r21Var.m75939xb282bd08(1);
        if (m75939xb282bd08 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountSyncHandler", "[notifyFinderFansAddCount] server error.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountSyncHandler", "[notifyFinderFansAddCount] count = " + m75939xb282bd08);
        r45.vs2 vs2Var = new r45.vs2();
        vs2Var.f470023h = java.lang.String.valueOf(c01.id.c());
        vs2Var.f470019d = 100000;
        vs2Var.f470020e = 2;
        r45.f03 f03Var = new r45.f03();
        f03Var.f455420d = 2;
        f03Var.f455424h = 1;
        f03Var.f455425i = "AuthorProfileFans";
        f03Var.f455421e = m75939xb282bd08;
        vs2Var.f470022g.add(f03Var);
        zy2.fa.D(((c61.l7) i95.n0.c(c61.l7.class)).nk(), vs2Var, "notifyFinderFansAddCount", null, true, null, 20, null);
    }

    public final void b(r45.hx0 hx0Var) {
        r45.dg2 dg2Var = new r45.dg2();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = hx0Var.m75934xbce7f2f(1);
        dg2Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountSyncHandler", "[processGetMemberMentionCount] finderUsername=" + dg2Var.m75945x2fec8307(0) + ", msg like count:" + dg2Var.m75939xb282bd08(2) + ", mentionCommentCount:" + dg2Var.m75939xb282bd08(3) + ", followCount:" + dg2Var.m75939xb282bd08(5) + ",  updatetime:" + dg2Var.m75942xfb822ef2(1));
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        int m75939xb282bd08 = dg2Var.m75939xb282bd08(2);
        int m75939xb282bd082 = dg2Var.m75939xb282bd08(3);
        int m75939xb282bd083 = dg2Var.m75939xb282bd08(5);
        java.lang.String m75945x2fec8307 = dg2Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        nk6.m(m75939xb282bd08, m75939xb282bd082, m75939xb282bd083, m75945x2fec8307);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(r45.hx0 r21) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.r.c(r45.hx0):void");
    }

    public final void d(r45.hx0 hx0Var) {
        r45.mj2 mj2Var = new r45.mj2();
        boolean z17 = true;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = hx0Var.m75934xbce7f2f(1);
        mj2Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountSyncHandler", "[processMyAccountSync] finderUsername=" + mj2Var.m75945x2fec8307(1));
        java.lang.String m75945x2fec8307 = mj2Var.m75945x2fec8307(1);
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        pm0.z.b(xy2.b.f539688b, "processMyAccountSync", false, null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.q(mj2Var), 60, null);
    }

    public final void e(r45.hx0 hx0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountSyncHandler", "[processReInit] ...");
        r45.fs2 fs2Var = new r45.fs2();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = hx0Var.m75934xbce7f2f(1);
        if (m75934xbce7f2f != null) {
            fs2Var.mo11468x92b714fd(m75934xbce7f2f.g());
            if (fs2Var.m75939xb282bd08(2) != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1279L, 20L, 1L);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fs2Var.m75941xfb821914(0), "getSelf(...)");
                if (!r3.isEmpty()) {
                    java.util.LinkedList m75941xfb821914 = fs2Var.m75941xfb821914(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSelf(...)");
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                    java.util.Iterator it = m75941xfb821914.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next()).m76197x6c03c64c());
                    }
                    java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ";");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountSyncHandler", "replace new finder username %s", c17);
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC, c17);
                } else {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC, "");
                }
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_REINIT_USER_VERSION_INT_SYNC, java.lang.Integer.valueOf(fs2Var.m75939xb282bd08(1)));
                int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_USER_VERSION_INT_SYNC, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountSyncHandler", "[processReInit] userVersion=" + r17 + " userVersion=" + fs2Var.m75939xb282bd08(1));
                if (r17 == fs2Var.m75939xb282bd08(1) || fs2Var.m75939xb282bd08(1) == 0) {
                    return;
                }
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_USER_HARD_REINIT_INT_SYNC, 1);
            }
        }
    }

    @Override // ya2.x1
    public void j7(r45.hx0 cmdItem, int i17, int i18) {
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdItem, "cmdItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountSyncHandler", "[handleCmd] cmdId=" + cmdItem.m75939xb282bd08(0) + " selector=" + i17 + " scene=" + i18 + ", " + cmdItem.m75945x2fec8307(2));
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            int m75939xb282bd08 = cmdItem.m75939xb282bd08(0);
            if (m75939xb282bd08 == 101) {
                c(cmdItem);
            } else if (m75939xb282bd08 == 106) {
                a(cmdItem);
            } else if (m75939xb282bd08 == 118) {
                r45.of1 of1Var = new r45.of1();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = cmdItem.m75934xbce7f2f(1);
                of1Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
                ((c61.l7) i95.n0.c(c61.l7.class)).Vk(of1Var, true, "FinderAccountSyncHandler");
            } else if (m75939xb282bd08 == 121) {
                b(cmdItem);
            } else if (m75939xb282bd08 == 110) {
                e(cmdItem);
            } else if (m75939xb282bd08 == 111) {
                d(cmdItem);
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.AccountSyncHandler", m143898xd4a2fc34, "", new java.lang.Object[0]);
            pm0.z.b(xy2.b.f539688b, "Finder.AccountSyncHandler", false, null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p(cmdItem, i17, i18), 60, null);
        }
    }
}
