package vn2;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vn2.u0 f519920a = new vn2.u0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f519921b = false;

    /* renamed from: c, reason: collision with root package name */
    public static int f519922c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f519923d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f519924e;

    /* renamed from: f, reason: collision with root package name */
    public static jz5.l f519925f;

    /* renamed from: g, reason: collision with root package name */
    public static jz5.l f519926g;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        f519923d = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.E7).mo141623x754a37bb()).r()).intValue() == 1;
    }

    public final boolean a(java.lang.String str, java.lang.String source, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, boolean z17, boolean z18, float f17) {
        boolean z19;
        r45.qt2 V6;
        boolean Ni;
        r45.yu2 yu2Var;
        java.lang.String tag = str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        float f18 = f17 * 100;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = feed.getFeedObject().getFeedObject();
        r45.dm2 m76806xdef68064 = feed.getFeedObject().getFeedObject().m76806xdef68064();
        if (m76806xdef68064 == null) {
            m76806xdef68064 = new r45.dm2();
        }
        feedObject.m76899x71cce6d8(m76806xdef68064);
        r45.dm2 m76806xdef680642 = feed.getFeedObject().getFeedObject().m76806xdef68064();
        if (m76806xdef680642 != null) {
            r45.dm2 m76806xdef680643 = feed.getFeedObject().getFeedObject().m76806xdef68064();
            if (m76806xdef680643 == null || (yu2Var = (r45.yu2) m76806xdef680643.m75936x14adae67(35)) == null) {
                yu2Var = new r45.yu2();
            }
            m76806xdef680642.set(35, yu2Var);
        }
        r45.dm2 m76806xdef680644 = feed.getFeedObject().getFeedObject().m76806xdef68064();
        r45.yu2 yu2Var2 = m76806xdef680644 != null ? (r45.yu2) m76806xdef680644.m75936x14adae67(35) : null;
        if (yu2Var2 != null) {
            java.lang.Number valueOf = java.lang.Integer.valueOf(c01.id.e());
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf == null) {
                valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
            }
            yu2Var2.set(1, java.lang.Integer.valueOf(valueOf.intValue()));
        }
        boolean z27 = f519921b;
        pf5.u uVar = pf5.u.f435469a;
        if (z27) {
            try {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                    V6 = nyVar != null ? nyVar.V6() : null;
                    ((ey2.g1) uVar.e(c61.l7.class).a(ey2.g1.class)).Q6(feed);
                    java.lang.Object a17 = uVar.b(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
                    if (e27 != null) {
                        e27.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.d1(feed, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c1.f202441d));
                    }
                    p012xc85e97e9.p093xedfae76a.c1 a18 = uVar.b(activity).a(um3.b.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                    pf5.e.m158343xd39de650((pf5.e) a18, null, null, new vn2.t(V6, feed, tag, null), 3, null);
                    Ni = ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ni();
                } catch (java.lang.Throwable unused) {
                    z19 = false;
                    return z19;
                }
                try {
                    activity.getWindow().getDecorView().postDelayed(new vn2.w(activity, z18, Ni, feed, V6), 100L);
                    if (z17) {
                        n(V6, feed, f18);
                    }
                    tag = str;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, source + " addSeeLaterToNative " + feed.mo2128x1ed62e84() + ' ' + feed.getFeedObject().m59273x80025a04() + ' ' + hc2.o0.l(feed.getFeedObject().getFeedObject()) + ",isTopStoryShow:" + Ni + ", playPercent:" + f18 + ", needClickAction:" + z18 + ",reportMenuClick:" + z17);
                    z19 = true;
                } catch (java.lang.Exception e17) {
                    e = e17;
                    tag = str;
                    hc2.c.a(e, tag.concat("_addSeeLater"));
                    z19 = false;
                    return z19;
                }
            } catch (java.lang.Exception e18) {
                e = e18;
            }
            return z19;
        }
        boolean Ni2 = ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ni();
        r45.td4 td4Var = (r45.td4) ((ey2.g1) uVar.e(c61.l7.class).a(ey2.g1.class)).f338911g.m75936x14adae67(0);
        java.lang.String m75945x2fec8307 = td4Var != null ? td4Var.m75945x2fec8307(0) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, source + " addSeeLaterToLiteApp appId:" + m75945x2fec8307 + ',' + feed.mo2128x1ed62e84() + ' ' + feed.getFeedObject().m59273x80025a04() + ' ' + hc2.o0.l(feed.getFeedObject().getFeedObject()) + ",isTopStoryShow:" + Ni2 + ",playPercent:" + f18 + ", needClickAction:" + z18);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            return false;
        }
        ((ey2.g1) uVar.e(c61.l7.class).a(ey2.g1.class)).Q6(feed);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("feed_id", pm0.v.u(feed.mo2128x1ed62e84()));
        hashMap.put("session_buffer", feed.g0());
        hashMap.put("comment_scene", java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar.b(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n));
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MegaVideoManager", "dispatchStore appId:" + m75945x2fec8307 + ",actionName:finderAddFeedSeeLater,params:" + hashMap + '!');
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MegaVideoManager", "dispatchStore fail,appId:" + m75945x2fec8307 + '!');
        } else if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(m75945x2fec8307)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj(m75945x2fec8307, "finderAddFeedSeeLater", hashMap);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(m75945x2fec8307, 60, false, 10L, new vn2.i0(m75945x2fec8307, "finderAddFeedSeeLater", hashMap));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V62 = nyVar2 != null ? nyVar2.V6() : null;
        activity.getWindow().getDecorView().postDelayed(new vn2.w(activity, z18, Ni2, feed, V62), 100L);
        if (z17) {
            n(V62, feed, f18);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if ((r2 - (new java.util.GregorianCalendar(r13.get(1), r13.get(2), r13.get(5)).getTimeInMillis() - (6 * 86400000))) < 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(zn2.c r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 1
            if (r13 == 0) goto L25
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.getFeedObject()
            if (r13 == 0) goto L25
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            if (r13 == 0) goto L25
            r45.dm2 r13 = r13.m76806xdef68064()
            if (r13 == 0) goto L25
            r2 = 35
            com.tencent.mm.protobuf.f r13 = r13.m75936x14adae67(r2)
            r45.yu2 r13 = (r45.yu2) r13
            if (r13 == 0) goto L25
            int r13 = r13.m75939xb282bd08(r1)
            goto L26
        L25:
            r13 = r0
        L26:
            long r2 = (long) r13
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r4 = 0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 > 0) goto L31
            goto L59
        L31:
            java.util.GregorianCalendar r13 = new java.util.GregorianCalendar
            r13.<init>()
            java.util.GregorianCalendar r6 = new java.util.GregorianCalendar
            int r7 = r13.get(r1)
            r8 = 2
            int r8 = r13.get(r8)
            r9 = 5
            int r13 = r13.get(r9)
            r6.<init>(r7, r8, r13)
            long r6 = r6.getTimeInMillis()
            r13 = 6
            long r8 = (long) r13
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 * r10
            long r6 = r6 - r8
            long r2 = r2 - r6
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 >= 0) goto L5a
        L59:
            r0 = r1
        L5a:
            r13 = r0 ^ 1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: vn2.u0.b(zn2.c):boolean");
    }

    public final void c(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        activity.getWindow().getDecorView().postDelayed(new vn2.h0(activity), 100L);
    }

    public final void d(java.lang.String tag, android.content.Context context, r45.qt2 qt2Var, ym5.q1 q1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca loader, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, boolean z17, boolean z18) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        java.util.List<E> m56392xfc5c33e5 = loader.m56392xfc5c33e5(so2.j5.class);
        int indexOf = m56392xfc5c33e5.indexOf(feed);
        if (indexOf >= 0) {
            e(context, feed.mo2128x1ed62e84(), feed.g0(), z17, qt2Var, new vn2.m0(feed, loader, qt2Var, z18, context, q1Var, null), new vn2.o0(context, tag, null));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "deleteSeeLater pos error=" + indexOf + ", feed=" + feed + ", dataList=" + m56392xfc5c33e5);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("view_id", "remove_watch_later_card");
        if (qt2Var == null || (str = qt2Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str);
        lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : "");
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(feed.mo2128x1ed62e84()));
        ((cy1.a) rVar).yj("view_clk", null, kz5.c1.k(lVarArr), 1, true);
    }

    public final void e(android.content.Context context, long j17, java.lang.String str, boolean z17, r45.qt2 qt2Var, yz5.p pVar, yz5.p pVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(um3.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        pf5.e.m158343xd39de650((pf5.e) a17, null, null, new vn2.p0(context, j17, str, z17, qt2Var, pVar, pVar2, null), 3, null);
    }

    public final boolean g() {
        int i17 = f519922c;
        return i17 == 1 || i17 == 2;
    }

    public final boolean h() {
        return f519922c == 1;
    }

    public final java.lang.String i(int i17) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        java.lang.Number valueOf = java.lang.Integer.valueOf(c01.id.e());
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
        }
        int intValue = (valueOf.intValue() - i17) * 1000;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (intValue < 0) {
            return "";
        }
        if (intValue < 14400000) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572915lt1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        long j17 = i17 * 1000;
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        long timeInMillis = j17 - gregorianCalendar2.getTimeInMillis();
        if (timeInMillis >= 0 && timeInMillis < 86400000) {
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572916lt2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            return string2;
        }
        if (j17 - (gregorianCalendar2.getTimeInMillis() - 86400000) >= 0) {
            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572917lt3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            return string3;
        }
        if (j17 - (gregorianCalendar2.getTimeInMillis() - 172800000) >= 0) {
            java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572918lt4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
            return string4;
        }
        if (j17 - (gregorianCalendar2.getTimeInMillis() - 518400000) < 0) {
            return "";
        }
        java.lang.String string5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lt6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
        return string5;
    }

    public final long j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        if (((r45.mb4) kz5.n0.Z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.b(feedObject).m59135x7efe73ec())) == null) {
            return 0L;
        }
        return cu2.x.c(cu2.x.f303982a, ds2.h.f324399a.c(feedObject.m59251x5db1b11(), r0, false).n(), false, false, false, 14, null).f68986xa6baeca6 * ((float) r0.m75942xfb822ef2(24));
    }

    public final boolean k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209588z7).mo141623x754a37bb()).r()).intValue() == 2;
    }

    public final void l(java.lang.String tag, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    public final void m(java.lang.String tag, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "MegaVideoPath\t".concat(msg));
    }

    public final void n(r45.qt2 qt2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, float f17) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("view_id", "watch_later_in_forward_menu");
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        lVarArr[2] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
        lVarArr[3] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null);
        lVarArr[4] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
        java.lang.String m76829x97edf6c0 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76829x97edf6c0();
        if (m76829x97edf6c0 == null) {
            m76829x97edf6c0 = "";
        }
        lVarArr[5] = new jz5.l("session_buffer", m76829x97edf6c0);
        lVarArr[6] = new jz5.l("click_playpercent", java.lang.Float.valueOf(f17));
        ((cy1.a) rVar).yj("view_clk", null, kz5.c1.k(lVarArr), 1, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(android.content.Context r17, long r18, java.lang.String r20, boolean r21, r45.qt2 r22, yz5.p r23, yz5.p r24, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r25) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn2.u0.o(android.content.Context, long, java.lang.String, boolean, r45.qt2, yz5.p, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
