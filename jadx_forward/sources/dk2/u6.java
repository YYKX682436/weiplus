package dk2;

/* loaded from: classes3.dex */
public final class u6 {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.u6 f315704a = new dk2.u6();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Runnable f315705b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f315706c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f315707d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f315708e;

    /* renamed from: f, reason: collision with root package name */
    public static long f315709f;

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f315710g;

    /* renamed from: h, reason: collision with root package name */
    public static r45.hc1 f315711h;

    /* renamed from: i, reason: collision with root package name */
    public static byte[] f315712i;

    /* renamed from: j, reason: collision with root package name */
    public static long f315713j;

    static {
        ae2.in inVar = ae2.in.f85221a;
        f315706c = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85385q3).mo141623x754a37bb()).r()).intValue();
        f315707d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("FinderLiveFeedFlowReporter::Timer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new dk2.t6(), false);
        f315708e = jz5.h.b(dk2.o6.f315370d);
    }

    public final boolean a(android.content.Context context) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        boolean z17 = true;
        if (abstractActivityC21394xb3d2c0cf != null && !abstractActivityC21394xb3d2c0cf.m78542x6d20d943() && !abstractActivityC21394xb3d2c0cf.isFinishing()) {
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "[checkIfBackground] isBackGround = " + z17);
        return z17;
    }

    public final void b(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.hc1 hc1Var, r45.qt2 qt2Var, long j17, boolean z17, byte[] bArr) {
        byte[] bArr2;
        if (a(context) && !z17) {
            e(context, c19792x256d2725, qt2Var, true);
            return;
        }
        if (bArr == null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = hc1Var.m75934xbce7f2f(1);
            bArr2 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
        } else {
            bArr2 = bArr;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getLiveMsg]， liveid = ");
        r45.nw1 nw1Var = (r45.nw1) hc1Var.m75936x14adae67(3);
        sb6.append(nw1Var != null ? nw1Var.m75942xfb822ef2(0) : -1L);
        sb6.append(", offLine = ");
        sb6.append(z17);
        sb6.append(", delay = ");
        sb6.append(j17);
        sb6.append(", usingCookie = ");
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        sb6.append(new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr3, 0, bArr3.length).i());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", sb6.toString());
        if (pm0.v.z(hc1Var.m75939xb282bd08(47), 32)) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) f315708e).mo141623x754a37bb()).mo50297x7c4d7ca2(new dk2.m6(context, z17, c19792x256d2725, qt2Var, hc1Var, bArr2), j17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "svr said not need getMsg");
        }
    }

    public final void c(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.qt2 qt2Var) {
        java.lang.String str;
        dk2.x4 x4Var;
        r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
        if (m76794xd0557130 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "[jonLiveInternal]， liveid = " + m76794xd0557130.m75942xfb822ef2(0));
        long m75942xfb822ef2 = m76794xd0557130.m75942xfb822ef2(0);
        java.lang.String e17 = xy2.c.e(context);
        long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
        java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        java.lang.String m75945x2fec8307 = m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null;
        java.lang.String m76829x97edf6c0 = c19792x256d2725.m76829x97edf6c0();
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        java.lang.String str2 = w0Var != null ? w0Var.Z : null;
        km2.n nVar = dk2.ef.H;
        if (nVar == null || (x4Var = nVar.f390688g) == null || (str = x4Var.f315865z) == null) {
            str = "";
        }
        new ek2.e0(m75942xfb822ef2, null, e17, m76784x5db1b11, 2, m76803x6c285d75, m75945x2fec8307, m76829x97edf6c0, null, 0, qt2Var, 3, null, str2, str, 0, null, null, 0L, 0, null, null, null, false, 0, 33526528, null).l().K(new dk2.p6(m76794xd0557130, c19792x256d2725, context, qt2Var));
    }

    public final void d(r45.hc1 hc1Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject) {
        java.lang.String str;
        r45.nw1 nw1Var;
        r45.pm2 pm2Var;
        r45.wm2 wm2Var;
        r45.nw1 nw1Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6460xac48e0d9 c6460xac48e0d9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6460xac48e0d9();
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        int i17 = 0;
        long m75942xfb822ef2 = (hc1Var == null || (nw1Var2 = (r45.nw1) hc1Var.m75936x14adae67(3)) == null) ? 0L : nw1Var2.m75942xfb822ef2(0);
        ((m30.m) rVar).getClass();
        c6460xac48e0d9.f138020d = c6460xac48e0d9.b("LiveID", b52.b.q(m75942xfb822ef2), true);
        n30.r rVar2 = (n30.r) i95.n0.c(n30.r.class);
        long m76784x5db1b11 = finderObject.m76784x5db1b11();
        ((m30.m) rVar2).getClass();
        c6460xac48e0d9.f138021e = c6460xac48e0d9.b("FeedID", b52.b.q(m76784x5db1b11), true);
        c6460xac48e0d9.f138022f = c6460xac48e0d9.b("UserName", finderObject.m76836x6c03c64c(), true);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = finderObject.m76802x2dd01666();
        if (m76802x2dd01666 == null || (str = m76802x2dd01666.m76944x730bcac6()) == null) {
            str = "";
        }
        c6460xac48e0d9.f138023g = c6460xac48e0d9.b("Topic", java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), true);
        c6460xac48e0d9.f138024h = c6460xac48e0d9.b("CommentScene", "", true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        c6460xac48e0d9.f138026j = c6460xac48e0d9.b("ContextId", b17, true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        c6460xac48e0d9.f138027k = c6460xac48e0d9.b("ClickTabContextId", c17, true);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6460xac48e0d9.f138028l = c6460xac48e0d9.b("SessionID", Ri, true);
        cl0.g gVar = new cl0.g();
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m76793xbd916e4b = finderObject.m76793xbd916e4b();
        if (!(!(m76793xbd916e4b == null || m76793xbd916e4b.isEmpty()))) {
            m76793xbd916e4b = null;
        }
        if (m76793xbd916e4b == null) {
            r45.dm2 m76806xdef68064 = finderObject.m76806xdef68064();
            m76793xbd916e4b = (m76806xdef68064 == null || (pm2Var = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) == null || (wm2Var = (r45.wm2) pm2Var.m75936x14adae67(10)) == null) ? null : wm2Var.m75941xfb821914(3);
        }
        if (m76793xbd916e4b != null) {
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> linkedList = m76793xbd916e4b.isEmpty() ^ true ? m76793xbd916e4b : null;
            if (linkedList != null) {
                gVar.h("friend_wx_username", kz5.n0.g0(linkedList, "#", null, null, 0, null, dk2.q6.f315476d, 30, null));
            }
        }
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        c6460xac48e0d9.D = c6460xac48e0d9.b("chnl_extra", r26.i0.t(gVar2, ",", ";", false), true);
        c6460xac48e0d9.f138029m = c6460xac48e0d9.b("SessionBuffer", finderObject.m76829x97edf6c0(), true);
        c6460xac48e0d9.f138031o = currentTimeMillis;
        if (hc1Var != null && (nw1Var = (r45.nw1) hc1Var.m75936x14adae67(3)) != null) {
            i17 = nw1Var.m75939xb282bd08(4);
        }
        long j17 = currentTimeMillis - i17;
        if (j17 <= 0) {
            j17 = 0;
        }
        c6460xac48e0d9.f138032p = j17;
        ml2.v1 v1Var = ml2.v1.f409673e;
        c6460xac48e0d9.f138035s = 1L;
        c6460xac48e0d9.f138036t = currentTimeMillis;
        ml2.b4 b4Var = ml2.b4.f408757e;
        c6460xac48e0d9.f138037u = ce1.f.f4364x366c91de;
        c6460xac48e0d9.f138039w = 0L;
        ml2.t3 t3Var = ml2.t3.f409548e;
        c6460xac48e0d9.f138040x = 1;
        c6460xac48e0d9.G = c6460xac48e0d9.b("CouponId", "", true);
        c6460xac48e0d9.H = c6460xac48e0d9.b("switch_extra", ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck(), true);
        c6460xac48e0d9.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "reportJoinLive, liveId=" + c6460xac48e0d9.f138020d + ", feedId=" + c6460xac48e0d9.f138021e + ", username=" + c6460xac48e0d9.f138022f + ", topic=" + c6460xac48e0d9.f138023g + ", commentScene=" + c6460xac48e0d9.f138024h + ", isPrivate=" + c6460xac48e0d9.f138025i + ", contextId=" + c6460xac48e0d9.f138026j + ", clickTabContextId=" + c6460xac48e0d9.f138027k + ", sessionId=" + c6460xac48e0d9.f138028l + ", sessionBuffer=" + c6460xac48e0d9.f138029m + ", shopPermit=" + c6460xac48e0d9.f138030n + ", enterSessionId=" + c6460xac48e0d9.f138031o + ", liveTime=" + c6460xac48e0d9.f138032p + ", floatDuration=" + c6460xac48e0d9.f138034r + ", fullDuration=" + c6460xac48e0d9.f138033q + ", enterStatus=" + c6460xac48e0d9.f138035s + ", actionTS=" + c6460xac48e0d9.f138036t + ", action=" + c6460xac48e0d9.f138037u + ", enterIconType=" + c6460xac48e0d9.f138039w + ", pageType=" + c6460xac48e0d9.f138040x + ", adData=" + c6460xac48e0d9.f138041y + ", scenenote=" + c6460xac48e0d9.f138042z + ", identityType=" + c6460xac48e0d9.A + ", request_id=" + c6460xac48e0d9.B + ", actionStyle=" + c6460xac48e0d9.F + ", actionResult=" + c6460xac48e0d9.f138038v + ", couponId=" + c6460xac48e0d9.G + ", chnlExtra=" + c6460xac48e0d9.D);
    }

    public final void e(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.qt2 qt2Var, boolean z17) {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "stopPlayLiveOnFeedFlow, needOffLineMsg = " + z17);
        f315705b = null;
        f315707d.d();
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) f315708e).mo141623x754a37bb()).mo50302x6b17ad39(null);
        if (z17) {
            r45.hc1 hc1Var = f315711h;
            if (hc1Var != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = c19792x256d2725 == null ? f315710g : c19792x256d2725;
                f0Var = jz5.f0.f384359a;
                if (c19792x256d27252 != null) {
                    byte[] bArr = f315712i;
                    dk2.u6 u6Var = f315704a;
                    f315710g = null;
                    f315711h = null;
                    f315709f = 0L;
                    f315713j = 0L;
                    f315712i = null;
                    u6Var.b(context, c19792x256d27252, hc1Var, qt2Var, 0L, true, bArr);
                    f0Var2 = f0Var;
                } else {
                    f0Var2 = null;
                }
                if (f0Var2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "[stopPlayLiveOnFeedFlow] no finderObject, return");
                }
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "[stopPlayLiveOnFeedFlow] no joinlive resp, no need offline");
            }
        }
        f315710g = null;
        f315711h = null;
        f315709f = 0L;
        f315713j = 0L;
        f315712i = null;
    }
}
