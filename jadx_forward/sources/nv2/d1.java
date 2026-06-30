package nv2;

/* loaded from: classes2.dex */
public final class d1 {

    /* renamed from: b, reason: collision with root package name */
    public static final nv2.d1 f422008b = new nv2.d1();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g2 f422009a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g2(30);

    public static void a(nv2.d1 d1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feed, boolean z17, int i17, r45.qt2 contextObj, int i18, java.lang.String str, r45.t21 t21Var, r45.bc1 bc1Var, int i19, java.lang.Object obj) {
        int i27 = (i19 & 16) != 0 ? 0 : i18;
        java.lang.String str2 = (i19 & 32) != 0 ? null : str;
        r45.t21 newLifeReportInfo = (i19 & 64) != 0 ? new r45.t21() : t21Var;
        r45.bc1 bc1Var2 = (i19 & 128) != 0 ? null : bc1Var;
        d1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newLifeReportInfo, "newLifeReportInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.InteractActionMgr", "modFavStatus id:" + ((java.lang.Object) jz5.x.a(feed.m59251x5db1b11())) + ' ' + feed.m59299x6bf53a6c() + ' ' + z17);
        int m59235xb80ecc2a = feed.m59235xb80ecc2a();
        int m59236xfdaf34f1 = feed.m59236xfdaf34f1();
        d1Var.d(feed, z17);
        nv2.m0 m0Var = new nv2.m0(feed, m59236xfdaf34f1, m59235xb80ecc2a, z17, contextObj, d1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g2.a(d1Var.f422009a, 600L, "feedFav_" + feed.m59251x5db1b11() + '_' + feed.m59276x6c285d75() + '_' + i17, new nv2.l0(feed, z17, contextObj, str2, i17, i27, newLifeReportInfo, bc1Var2, m0Var), null, p3325xe03a0797.p3326xc267989b.q1.f392103c, 8, null);
    }

    public static void b(nv2.d1 d1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feed, boolean z17, boolean z18, int i17, int i18, r45.qt2 contextObj, java.lang.String str, r45.bc1 bc1Var, int i19, java.lang.Object obj) {
        int i27 = (i19 & 16) != 0 ? 0 : i18;
        java.lang.String str2 = (i19 & 64) != 0 ? "" : str;
        r45.bc1 bc1Var2 = (i19 & 128) != 0 ? null : bc1Var;
        d1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        int m59254xf4204902 = feed.m59254xf4204902();
        int m59255xbd8ebd19 = feed.m59255xbd8ebd19();
        d1Var.e(feed, z17, z18);
        nv2.v0 v0Var = new nv2.v0(feed, m59255xbd8ebd19, m59254xf4204902, z17, contextObj, z18, d1Var);
        db2.c5 c5Var = new db2.c5(feed.m59251x5db1b11(), feed.m59229xb5af1dd5(), feed.m59276x6c285d75(), z17, z18, i17, i27, feed.getEncryptedObjectId(), str2, bc1Var2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g2.a(d1Var.f422009a, 600L, "feedLike_" + feed.m59251x5db1b11() + '_' + feed.m59276x6c285d75() + '_' + i17, new nv2.u0(c5Var, contextObj, v0Var), null, p3325xe03a0797.p3326xc267989b.q1.f392103c, 8, null);
    }

    public static void c(nv2.d1 d1Var, boolean z17, long j17, java.lang.String wxUsername, int i17, int i18, java.lang.String finderUsername, r45.qt2 qt2Var, boolean z18, r45.nv2 nv2Var, int i19, java.lang.Object obj) {
        boolean z19 = (i19 & 128) != 0 ? true : z18;
        r45.nv2 nv2Var2 = (i19 & 256) != 0 ? null : nv2Var;
        d1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUsername, "wxUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        db2.k6 k6Var = new db2.k6(z17, finderUsername, wxUsername, i17, i18, null, java.lang.Long.valueOf(j17), nv2Var2, 32, null);
        k6Var.a(false);
        if (z19) {
            new db2.t3(k6Var, qt2Var).l().K(new nv2.y0(k6Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g2.a(d1Var.f422009a, 600L, "{" + i17 + "}_" + j17, new nv2.a1(k6Var, qt2Var), null, null, 24, null);
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, boolean z17) {
        int m59235xb80ecc2a;
        int i17;
        r45.pm2 pm2Var;
        r45.ll2 ll2Var;
        r45.jn2 jn2Var;
        r45.pm2 pm2Var2;
        r45.ll2 ll2Var2;
        r45.jn2 jn2Var2;
        if (z17) {
            m59235xb80ecc2a = c14994x9b99c079.m59235xb80ecc2a();
            if (c14994x9b99c079.m59236xfdaf34f1() != 1) {
                i17 = 1;
            }
            i17 = 0;
        } else {
            m59235xb80ecc2a = c14994x9b99c079.m59235xb80ecc2a();
            if (c14994x9b99c079.m59236xfdaf34f1() == 1) {
                i17 = -1;
            }
            i17 = 0;
        }
        int i18 = m59235xb80ecc2a + i17;
        nv2.b1 b1Var = nv2.b1.f421989d;
        b1Var.mo147xb9724478(c14994x9b99c079, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(c14994x9b99c079.m59233x87980ca());
        if (h17 != null) {
            r45.dm2 m76806xdef68064 = h17.getFeedObject().m76806xdef68064();
            long j17 = -1;
            long m75942xfb822ef2 = (m76806xdef68064 == null || (pm2Var2 = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) == null || (ll2Var2 = (r45.ll2) pm2Var2.m75936x14adae67(0)) == null || (jn2Var2 = (r45.jn2) ll2Var2.m75936x14adae67(4)) == null) ? -1L : jn2Var2.m75942xfb822ef2(0);
            r45.dm2 m76806xdef680642 = c14994x9b99c079.getFeedObject().m76806xdef68064();
            if (m76806xdef680642 != null && (pm2Var = (r45.pm2) m76806xdef680642.m75936x14adae67(12)) != null && (ll2Var = (r45.ll2) pm2Var.m75936x14adae67(0)) != null && (jn2Var = (r45.jn2) ll2Var.m75936x14adae67(4)) != null) {
                j17 = jn2Var.m75942xfb822ef2(0);
            }
            if (m75942xfb822ef2 == j17) {
                b1Var.mo147xb9724478(h17, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(i18));
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
        long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
        am.ia iaVar = c5445x963cab3.f135785g;
        iaVar.f88451a = m59251x5db1b11;
        iaVar.f88453c = z17 ? 1 : 2;
        iaVar.f88454d = 1;
        iaVar.f88452b = 5;
        c5445x963cab3.e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0 c5795x6c1c62d0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0();
        java.lang.String u17 = pm0.v.u(c14994x9b99c079.m59251x5db1b11());
        am.qm qmVar = c5795x6c1c62d0.f136104g;
        qmVar.f89251a = u17;
        qmVar.f89255e = c14994x9b99c079.m59235xb80ecc2a();
        qmVar.f89254d = c14994x9b99c079.m59236xfdaf34f1() == 1;
        qmVar.f89253c = c14994x9b99c079.m59254xf4204902();
        qmVar.f89252b = c14994x9b99c079.m59255xbd8ebd19() != 0;
        c5795x6c1c62d0.e();
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, boolean z17, boolean z18) {
        int m59254xf4204902;
        int i17;
        java.lang.Object obj;
        if (z17) {
            m59254xf4204902 = c14994x9b99c079.m59254xf4204902();
            if (c14994x9b99c079.m59255xbd8ebd19() == 0) {
                i17 = 1;
            }
            i17 = 0;
        } else {
            m59254xf4204902 = c14994x9b99c079.m59254xf4204902();
            if (c14994x9b99c079.m59255xbd8ebd19() != 0) {
                i17 = -1;
            }
            i17 = 0;
        }
        c14994x9b99c079.m59385x50740976(m59254xf4204902 + i17);
        if (c14994x9b99c079.m59255xbd8ebd19() == 1 && (!z17 || z18)) {
            c14994x9b99c079.m59382x2d5669f8(c14994x9b99c079.m59247xf67fd084() - 1);
        } else if (c14994x9b99c079.m59255xbd8ebd19() != 1 && z17 && !z18) {
            c14994x9b99c079.m59382x2d5669f8(c14994x9b99c079.m59247xf67fd084() + 1);
        }
        if (!z17 || z18) {
            pm0.v.d0(c14994x9b99c079.m59256xbd916e4b(), nv2.c1.f422001d);
        } else {
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m59256xbd916e4b = c14994x9b99c079.m59256xbd916e4b();
            java.util.Iterator<T> it = m59256xbd916e4b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) obj).m76102x6c03c64c(), c01.z1.r())) {
                        break;
                    }
                }
            }
            if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) obj) == null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87();
                c19781xd1c47b87.m76153x66bc2758(c01.z1.r());
                c19781xd1c47b87.m76135x7ac946f0(c01.z1.l());
                c19781xd1c47b87.m76125xe0a5bcad("");
                m59256xbd916e4b.add(0, c19781xd1c47b87);
            }
        }
        c14994x9b99c079.m59386xb8471e25((z17 && z18) ? 2 : z17 ? 1 : 0);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
        long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
        am.ia iaVar = c5445x963cab3.f135785g;
        iaVar.f88451a = m59251x5db1b11;
        iaVar.f88455e = (z17 && z18) ? 2 : z17 ? 1 : 0;
        iaVar.f88456f = c14994x9b99c079.m59254xf4204902();
        iaVar.f88454d = 1;
        iaVar.f88452b = 4;
        c5445x963cab3.e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0 c5795x6c1c62d0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0();
        java.lang.String u17 = pm0.v.u(c14994x9b99c079.m59251x5db1b11());
        am.qm qmVar = c5795x6c1c62d0.f136104g;
        qmVar.f89251a = u17;
        qmVar.f89253c = c14994x9b99c079.m59254xf4204902();
        qmVar.f89252b = c14994x9b99c079.m59255xbd8ebd19() != 0;
        c5795x6c1c62d0.e();
    }
}
