package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes9.dex */
public abstract class wm {
    public static final java.lang.String a(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 tlObj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMusicId", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tlObj, "tlObj");
        java.lang.String str = tlObj.Id + "_sns";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMusicId", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        return str;
    }

    public static final boolean b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPlaying", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        if (c19807x593d1720 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlaying", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
            return false;
        }
        boolean c17 = c(a(c19807x593d1720), d(c19807x593d1720).d().m13170xcc16feb8());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlaying", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        return c17;
    }

    public static final boolean c(java.lang.String musicId, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPlaying", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        i95.m c17 = i95.n0.c(qk.k6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        boolean i27 = qk.k6.i2((qk.k6) c17, musicId, null, str, null, null, 26, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlaying", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        return i27;
    }

    public static final bw5.lp0 d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 tlObj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseListenItemFromTimeLineObject", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tlObj, "tlObj");
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(new bw5.v70());
        lp0Var.g(a(tlObj));
        r45.a90 a90Var = tlObj.f39014x86965dde;
        r45.xs4 xs4Var = a90Var != null ? a90Var.f451385w : null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var != null ? xs4Var.m75945x2fec8307(19) : null)) {
            bw5.v70 c17 = rk4.l5.c(xs4Var != null ? xs4Var.m75945x2fec8307(19) : null);
            if (c17 != null) {
                lp0Var.j(c17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMusicPlayHelper", "parseListenItemFromTimeLineObject failed");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseListenItemFromTimeLineObject", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
            return lp0Var;
        }
        r45.a90 a90Var2 = tlObj.f39014x86965dde;
        if ((a90Var2 != null ? a90Var2.f451373h : null) == null || a90Var2.f451373h.size() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseListenItemFromTimeLineObject", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
            return lp0Var;
        }
        bw5.v70 v70Var = new bw5.v70();
        v70Var.y(1);
        r45.jj4 jj4Var = (r45.jj4) tlObj.f39014x86965dde.f451373h.get(0);
        if (jj4Var == null) {
            lp0Var.j(v70Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseListenItemFromTimeLineObject", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
            return lp0Var;
        }
        bw5.z90 z90Var = new bw5.z90();
        java.lang.String str = jj4Var.f459397o;
        if (str == null) {
            str = "";
        }
        z90Var.E(str);
        java.lang.String str2 = jj4Var.f459390f;
        if (str2 == null) {
            str2 = "";
        }
        z90Var.C(str2);
        java.lang.String str3 = tlObj.f39014x86965dde.f451372g;
        if (str3 == null) {
            str3 = "";
        }
        z90Var.B(str3);
        java.lang.String str4 = jj4Var.f459391g;
        if (str4 == null) {
            str4 = "";
        }
        z90Var.z(str4);
        java.lang.String str5 = tlObj.f39012x33e0f24f.f472379d;
        if (str5 == null) {
            str5 = "";
        }
        z90Var.y(str5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShowCoverUrl", "com.tencent.mm.modelsns.SnsMusicShareObjectUtils");
        java.lang.String a17 = m21.s.a(tlObj, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShowCoverUrl", "com.tencent.mm.modelsns.SnsMusicShareObjectUtils");
        z90Var.r(a17);
        if (xs4Var != null) {
            java.lang.String m75945x2fec8307 = xs4Var.m75945x2fec8307(15);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            z90Var.x(m75945x2fec8307);
            java.lang.String m75945x2fec83072 = xs4Var.m75945x2fec8307(4);
            if (!(m75945x2fec83072 == null || r26.n0.N(m75945x2fec83072))) {
                z90Var.C(xs4Var.m75945x2fec8307(4));
            }
            java.lang.String m75945x2fec83073 = xs4Var.m75945x2fec8307(11);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            z90Var.A(m75945x2fec83073);
            java.lang.String m75945x2fec83074 = xs4Var.m75945x2fec8307(9);
            if (m75945x2fec83074 == null) {
                m75945x2fec83074 = "";
            }
            z90Var.w(m75945x2fec83074);
            java.lang.String m75945x2fec83075 = xs4Var.m75945x2fec8307(6);
            if (m75945x2fec83075 == null) {
                m75945x2fec83075 = "";
            }
            z90Var.t(m75945x2fec83075);
            java.lang.String m75945x2fec83076 = xs4Var.m75945x2fec8307(5);
            if (m75945x2fec83076 == null) {
                m75945x2fec83076 = "";
            }
            z90Var.q(m75945x2fec83076);
            z90Var.s(xs4Var.m75939xb282bd08(10));
            java.lang.String m75945x2fec83077 = xs4Var.m75945x2fec8307(7);
            if (m75945x2fec83077 == null) {
                m75945x2fec83077 = "";
            }
            z90Var.u(m75945x2fec83077);
            z90Var.f117428r = xs4Var.m75942xfb822ef2(8);
            z90Var.f117436x1[12] = true;
        }
        v70Var.w(z90Var);
        java.lang.String l17 = v70Var.j().l();
        if (l17 == null) {
            l17 = "";
        }
        v70Var.p(l17);
        java.lang.String o17 = v70Var.j().o();
        if (o17 == null) {
            o17 = "";
        }
        v70Var.x(o17);
        java.lang.String c18 = v70Var.j().c();
        v70Var.q(c18 != null ? c18 : "");
        v70Var.r(v70Var.j().f117431u);
        v70Var.t(true);
        lp0Var.j(v70Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseListenItemFromTimeLineObject", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        return lp0Var;
    }

    public static final void e(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 tlObj, android.content.Context context, int i17) {
        jm4.i4 Zi;
        jm4.i4 Zi2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playWithTing", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tlObj, "tlObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String a17 = a(tlObj);
        bw5.lp0 d17 = d(tlObj);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(d17.d());
        lp0Var.g("ting_" + d17.d().e() + '_' + d17.d().m13170xcc16feb8());
        i95.m c17 = i95.n0.c(qk.k6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (qk.k6.i2((qk.k6) c17, a17, null, d17.d().m13170xcc16feb8(), null, null, 26, null)) {
            i95.m c18 = i95.n0.c(qk.k6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            if (qk.k6.w4((qk.k6) c18, d17.d().m13170xcc16feb8(), null, null, 6, null) != qk.p9.f445846e && (Zi2 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi()) != null) {
                ((jm4.k4) Zi2).e(lp0Var, bw5.ar0.TingScene_Moment, 0, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.um.f252121d);
            }
            i95.m c19 = i95.n0.c(qk.k6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            qk.k6.Xg((qk.k6) c19, null, d17.d().m13170xcc16feb8(), null, null, 13, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playWithTing", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
            return;
        }
        i95.m c27 = i95.n0.c(qk.k6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
        if (qk.k6.hi((qk.k6) c27, a17, null, d17.d().m13170xcc16feb8(), null, null, 26, null)) {
            i95.m c28 = i95.n0.c(qk.k6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
            qk.k6.Hb((qk.k6) c28, null, d17.d().m13170xcc16feb8(), null, null, 13, null);
        } else if (!iq.b.C(context) && !iq.b.v(context) && !iq.b.e(context)) {
            qk.k6 k6Var = (qk.k6) i95.n0.c(qk.k6.class);
            bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
            boolean z17 = i17 == 0;
            java.lang.String str = tlObj.Id;
            if (str == null) {
                str = "";
            }
            il4.e eVar = new il4.e(null, 0, v31.j.f77249x366c91de, false, null, null, 0, 0, false, z17, str, null, null, null, null, null, false, false, null, null, false, null, false, bw5.x2.BizAudioEnterScene_MomentsListen, false, 25164283, null);
            java.util.Map map = eVar.f373655s.f373665d;
            java.lang.String str2 = eVar.f373647k;
            if (str2 != null) {
                map.put("sns", str2);
            }
            java.lang.String str3 = tlObj.f39018xf3f56116;
            if (str3 != null) {
                map.put("sourceuser", str3);
            }
            if (tlObj.f39014x86965dde.f451370e != 47) {
                map.put("baseidissharedfrom3rd", 1);
            }
            ((rk4.a) k6Var).Ui(a17, d17, eVar);
        }
        i95.m c29 = i95.n0.c(qk.k6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c29, "getService(...)");
        if (qk.k6.w4((qk.k6) c29, d17.d().m13170xcc16feb8(), null, null, 6, null) != qk.p9.f445846e && (Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi()) != null) {
            ((jm4.k4) Zi).e(lp0Var, bw5.ar0.TingScene_Moment, 0, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vm.f252229d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playWithTing", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
    }
}
