package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2 f197173a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2();

    public static com.p314xaae8f345.p2926x359365.C25484xcc963946 b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2 n2Var, java.lang.String source, boolean z17, r45.nw1 nw1Var, r45.ka4 ka4Var, int i17, int i18, int i19, java.lang.Object obj) {
        r45.ma4 ma4Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        boolean z18 = false;
        if ((i19 & 2) != 0) {
            z17 = false;
        }
        if ((i19 & 4) != 0) {
            nw1Var = null;
        }
        if ((i19 & 8) != 0) {
            ka4Var = null;
        }
        if ((i19 & 16) != 0) {
            ae2.in inVar = ae2.in.f85221a;
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_visitor_max_retry_count, 100);
        }
        if ((i19 & 32) != 0) {
            ae2.in inVar2 = ae2.in.f85221a;
            i18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_visitor_retry_interval, 3);
        }
        n2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p2926x359365.C25484xcc963946 c25484xcc963946 = new com.p314xaae8f345.p2926x359365.C25484xcc963946();
        c25484xcc963946.m94497x94c7f38f(i17);
        c25484xcc963946.m94498x8be3245(i18);
        ae2.in inVar3 = ae2.in.f85221a;
        boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_sei_enable_switch, 1) == 1;
        c25484xcc963946.m94500xcbdaebc2(z19);
        boolean z27 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85453x5).mo141623x754a37bb()).r()).intValue() == 1;
        if (z17) {
            if (z27) {
                c25484xcc963946.m94495x228612f(true);
                c25484xcc963946.m94506x3bb0e441(1.0f);
                c25484xcc963946.m94505xe33b97ef(5.0f);
                if (ka4Var == null) {
                    if (nw1Var != null && (ma4Var = (r45.ma4) nw1Var.m75936x14adae67(23)) != null && (gVar = ma4Var.f461833m) != null) {
                        r45.na4 na4Var = new r45.na4();
                        try {
                            na4Var.mo11468x92b714fd(gVar.g());
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                            na4Var = null;
                        }
                        if (na4Var != null) {
                            ka4Var = na4Var.f462730f;
                        }
                    }
                    ka4Var = null;
                }
                if (ka4Var != null) {
                    if (ka4Var.f460086x > 0 && ka4Var.f460085w > 0) {
                        z18 = true;
                    }
                    if ((z18 ? ka4Var : null) != null) {
                        c25484xcc963946.m94506x3bb0e441(r1.f460085w / 1000.0f);
                        c25484xcc963946.m94505xe33b97ef(r1.f460086x / 1000.0f);
                    }
                }
            } else {
                c25484xcc963946.m94506x3bb0e441(1.0f);
                c25484xcc963946.m94505xe33b97ef(1.0f);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveUtil", "getLivePlayConfig: source=" + source + ", connectRetryCount=" + i17 + ", connectRetryInterval=" + i18 + ", isEnableMessage=" + z19 + ", miniCache=" + z17 + ", minAutoAdjustCacheTime=" + c25484xcc963946.m94487x96d4835() + ", maxAutoAdjustCacheTime=" + c25484xcc963946.m94486xb0f7fbe3() + ", newLogicEnable=" + z27);
        return c25484xcc963946;
    }

    public final java.util.LinkedList a() {
        java.lang.Object obj;
        r45.pf1 pf1Var;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            try {
                obj = null;
                java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_ALIAS_LIST1_STRING_SYNC, null);
                pf1Var = new r45.pf1();
                if (str != null) {
                    byte[] bytes = str.getBytes(r26.c.f450400c);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                    pf1Var.mo11468x92b714fd(bytes);
                }
                m75941xfb821914 = pf1Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getAlias_info(...)");
            } catch (java.lang.Exception e17) {
                e = e17;
            }
            try {
                m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
                if (I1 != null) {
                    java.util.Iterator it = m75941xfb821914.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (((r45.of1) next).m75939xb282bd08(2) == 3) {
                            obj = next;
                            break;
                        }
                    }
                    r45.of1 of1Var = (r45.of1) obj;
                    if (of1Var != null) {
                        of1Var.set(0, I1.f68710x21f9b213);
                        of1Var.set(1, I1.f68693x81118c51);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveUtil", "getAliasInfoList result:" + pm0.b0.g(pf1Var));
                return m75941xfb821914;
            } catch (java.lang.Exception e18) {
                e = e18;
                linkedList = m75941xfb821914;
                hc2.c.a(e, "getAliasInfoList:" + e.getMessage());
                return linkedList;
            } catch (java.lang.Throwable unused) {
                return m75941xfb821914;
            }
        } catch (java.lang.Throwable unused2) {
            return linkedList;
        }
    }

    public final boolean c(long j17) {
        boolean z17 = pm0.v.z((int) j17, 2);
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        zl2.r4 r4Var = zl2.r4.f555483a;
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("xlab");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveUtil", "giftFuncEnableBySwitchFlag isTeenMode:" + mo168058x74219ae7 + " pagEnable:true enableGiftBySwitchFlag:" + z17 + " switchFlag:" + j17);
        return z17 && !mo168058x74219ae7;
    }

    public final void d(r45.a73 a73Var, java.lang.String TAG) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a73Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TAG, "TAG");
        java.util.LinkedList<r45.z63> m75941xfb821914 = a73Var.m75941xfb821914(0);
        if (m75941xfb821914 != null) {
            for (r45.z63 z63Var : m75941xfb821914) {
                if (z63Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "GameRankSwitch appid:" + z63Var.m75945x2fec8307(0) + ", name:" + z63Var.m75945x2fec8307(1) + ", enable:" + z63Var.m75939xb282bd08(2));
                }
            }
        }
    }

    public final void e(java.lang.String tag, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "check AnchorStatus1, tag:" + tag + ", status:" + i17 + ", BAN_COMMENT:" + pm0.v.z(i17, 8) + ", SHOPPING:" + pm0.v.z(i17, 16) + ", GIFT:" + pm0.v.z(i17, 128) + ", BAN_LIKE:" + pm0.v.z(i17, 512) + ", LINK_MIC:" + pm0.v.z(i17, 64) + ", SING_SONG:" + pm0.v.z(i17, 32768) + ", ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "check AnchorStatus2, tag:" + tag + ", status:" + i17 + ", ENTER_BACKGROUND:" + pm0.v.z(i17, 1) + ", CALL_INTERRUPTION:" + pm0.v.z(i17, 2) + ", RECORD_SCREEN_ON:" + pm0.v.z(i17, 4) + ", BREAK_LIVE_RULE:" + pm0.v.z(i17, 32) + ", AUDIO_MODE:" + pm0.v.z(i17, 256) + ", SCREEN_SHARE:" + pm0.v.z(i17, 1024) + ", HIDE_AUDIENCE_NICKNAME:" + pm0.v.z(i17, 8192) + ", DISABLE_SHOW_BIZ:" + pm0.v.z(i17, 4096) + ", ENABLE_ANCHOR_DATA_PANEL:" + pm0.v.z(i17, 8388608) + ", ");
    }
}
