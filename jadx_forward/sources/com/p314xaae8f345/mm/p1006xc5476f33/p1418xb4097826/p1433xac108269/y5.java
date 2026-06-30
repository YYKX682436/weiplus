package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class y5 {

    /* renamed from: a */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5 f184249a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5();

    public static /* synthetic */ void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5 y5Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, long j17, boolean z17, java.lang.String str, java.lang.String str2, int i17, in5.s0 s0Var, yz5.l lVar, int i18, java.lang.Object obj) {
        y5Var.d(activityC0065xcd7aa112, abstractC14490x69736cb5, j17, (i18 & 8) != 0 ? true : z17, (i18 & 16) != 0 ? "" : str, (i18 & 32) != 0 ? "" : str2, (i18 & 64) != 0 ? 0 : i17, (i18 & 128) != 0 ? null : s0Var, lVar);
    }

    public final int a() {
        long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TODAY_REMIND_COUNT_LONG_SYNC, 0L);
        if (t17 == 0) {
            return 0;
        }
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format((java.lang.Object) new java.util.Date());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        long parseLong = java.lang.Long.parseLong(format);
        long j17 = t17 / 1000;
        long j18 = j17 == parseLong ? t17 % parseLong : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRingToneManager", "getTodayRemindCount today:" + parseLong + " formatToday:" + j17 + " formatCount:" + t17 + " remindCount:" + j18);
        return (int) j18;
    }

    public final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = feed.getFeedObject().m59240x7c94657b();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = m59240x7c94657b.m76802x2dd01666();
        if (m76802x2dd01666 == null || feed.getFeedObject().m59315x31740422()) {
            return false;
        }
        ed0.d1 d1Var = (ed0.d1) i95.n0.c(ed0.d1.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e first = m76802x2dd01666.m76962x74cd162e().getFirst();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "getFirst(...)");
        vx3.i wi6 = ((dd0.u0) d1Var).wi(m59240x7c94657b, first);
        ((dd0.i0) ((ed0.u0) i95.n0.c(ed0.u0.class))).getClass();
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        vx3.i j17 = mx3.i0.j(r17);
        if (wi6.f522820d == null) {
            int i17 = wi6.f522833q;
            if (i17 == 0 || j17.f522833q != i17) {
                return false;
            }
        } else if (j17.f522831o != wi6.f522831o) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((dd0.q0) ((ed0.w0) i95.n0.c(ed0.w0.class))).getClass();
        vx3.i i17 = mx3.i0.i("");
        long j17 = i17 != null ? i17.f522835s : 0L;
        return j17 != 0 && currentTimeMillis - j17 <= 7776000000L;
    }

    public final void d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, long j17, boolean z17, java.lang.String str, java.lang.String reportJson, int i17, in5.s0 s0Var, yz5.l feedOp) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportJson, "reportJson");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedOp, "feedOp");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = feed.getFeedObject().m59240x7c94657b();
        if (m59240x7c94657b == null || (m76802x2dd01666 = m59240x7c94657b.m76802x2dd01666()) == null) {
            return;
        }
        ed0.d1 d1Var = (ed0.d1) i95.n0.c(ed0.d1.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e first = m76802x2dd01666.m76962x74cd162e().getFirst();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "getFirst(...)");
        vx3.i wi6 = ((dd0.u0) d1Var).wi(m59240x7c94657b, first);
        ed0.t0 t0Var = (ed0.t0) i95.n0.c(ed0.t0.class);
        long m76784x5db1b11 = m59240x7c94657b.m76784x5db1b11();
        ((dd0.k0) t0Var).getClass();
        vx3.i a17 = qx3.d.a(m76784x5db1b11);
        if (a17 != null) {
            wi6.l(a17.f522824h);
            java.lang.String str2 = a17.f522825i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
            wi6.f522825i = str2;
            java.lang.String str3 = a17.f522826j;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
            wi6.f522826j = str3;
        }
        java.lang.String stringExtra = context.getIntent().getStringExtra("KEY_RINGTONE_TO_USERNAME");
        java.lang.String str4 = stringExtra == null ? "" : stringExtra;
        int intExtra = context.getIntent().getIntExtra("KEY_RINGTONE_CHANNEL", 11);
        int intExtra2 = context.getIntent().getIntExtra("KEY_RINGTONE_CHOOSE_SCENE", 0);
        java.lang.String stringExtra2 = context.getIntent().getStringExtra("KEY_RINGTONE_REC_REQUEST_ID");
        java.lang.String str5 = stringExtra2 == null ? "" : stringExtra2;
        boolean booleanExtra = context.getIntent().getBooleanExtra("KEY_IS_VIDEO_STREAM", false);
        i95.m c17 = i95.n0.c(ed0.u0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = context.mo273xed6858b4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo273xed6858b4, "getLifecycle(...)");
        cy3.q.a(context, mo273xed6858b4, str4, wi6, j17, intExtra, intExtra2, str5, booleanExtra, true, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x5(context, s0Var, m59240x7c94657b, str, z17, reportJson, i17, feedOp, feed));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (V6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.b(V6, feed, 44);
        }
    }
}
