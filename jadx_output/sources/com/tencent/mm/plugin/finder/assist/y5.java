package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class y5 {

    /* renamed from: a */
    public static final com.tencent.mm.plugin.finder.assist.y5 f102716a = new com.tencent.mm.plugin.finder.assist.y5();

    public static /* synthetic */ void e(com.tencent.mm.plugin.finder.assist.y5 y5Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, long j17, boolean z17, java.lang.String str, java.lang.String str2, int i17, in5.s0 s0Var, yz5.l lVar, int i18, java.lang.Object obj) {
        y5Var.d(appCompatActivity, baseFinderFeed, j17, (i18 & 8) != 0 ? true : z17, (i18 & 16) != 0 ? "" : str, (i18 & 32) != 0 ? "" : str2, (i18 & 64) != 0 ? 0 : i17, (i18 & 128) != 0 ? null : s0Var, lVar);
    }

    public final int a() {
        long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_TODAY_REMIND_COUNT_LONG_SYNC, 0L);
        if (t17 == 0) {
            return 0;
        }
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format((java.lang.Object) new java.util.Date());
        kotlin.jvm.internal.o.d(format);
        long parseLong = java.lang.Long.parseLong(format);
        long j17 = t17 / 1000;
        long j18 = j17 == parseLong ? t17 % parseLong : 0L;
        com.tencent.mars.xlog.Log.i("Finder.FinderRingToneManager", "getTodayRemindCount today:" + parseLong + " formatToday:" + j17 + " formatCount:" + t17 + " remindCount:" + j18);
        return (int) j18;
    }

    public final boolean b(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = feed.getFeedObject().getFinderObject();
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        if (objectDesc == null || feed.getFeedObject().isMemberFeed()) {
            return false;
        }
        ed0.d1 d1Var = (ed0.d1) i95.n0.c(ed0.d1.class);
        com.tencent.mm.protocal.protobuf.FinderMedia first = objectDesc.getMedia().getFirst();
        kotlin.jvm.internal.o.f(first, "getFirst(...)");
        vx3.i wi6 = ((dd0.u0) d1Var).wi(finderObject, first);
        ((dd0.i0) ((ed0.u0) i95.n0.c(ed0.u0.class))).getClass();
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        vx3.i j17 = mx3.i0.j(r17);
        if (wi6.f441287d == null) {
            int i17 = wi6.f441300q;
            if (i17 == 0 || j17.f441300q != i17) {
                return false;
            }
        } else if (j17.f441298o != wi6.f441298o) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((dd0.q0) ((ed0.w0) i95.n0.c(ed0.w0.class))).getClass();
        vx3.i i17 = mx3.i0.i("");
        long j17 = i17 != null ? i17.f441302s : 0L;
        return j17 != 0 && currentTimeMillis - j17 <= 7776000000L;
    }

    public final void d(androidx.appcompat.app.AppCompatActivity context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, long j17, boolean z17, java.lang.String str, java.lang.String reportJson, int i17, in5.s0 s0Var, yz5.l feedOp) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(reportJson, "reportJson");
        kotlin.jvm.internal.o.g(feedOp, "feedOp");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = feed.getFeedObject().getFinderObject();
        if (finderObject == null || (objectDesc = finderObject.getObjectDesc()) == null) {
            return;
        }
        ed0.d1 d1Var = (ed0.d1) i95.n0.c(ed0.d1.class);
        com.tencent.mm.protocal.protobuf.FinderMedia first = objectDesc.getMedia().getFirst();
        kotlin.jvm.internal.o.f(first, "getFirst(...)");
        vx3.i wi6 = ((dd0.u0) d1Var).wi(finderObject, first);
        ed0.t0 t0Var = (ed0.t0) i95.n0.c(ed0.t0.class);
        long id6 = finderObject.getId();
        ((dd0.k0) t0Var).getClass();
        vx3.i a17 = qx3.d.a(id6);
        if (a17 != null) {
            wi6.l(a17.f441291h);
            java.lang.String str2 = a17.f441292i;
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            wi6.f441292i = str2;
            java.lang.String str3 = a17.f441293j;
            kotlin.jvm.internal.o.g(str3, "<set-?>");
            wi6.f441293j = str3;
        }
        java.lang.String stringExtra = context.getIntent().getStringExtra("KEY_RINGTONE_TO_USERNAME");
        java.lang.String str4 = stringExtra == null ? "" : stringExtra;
        int intExtra = context.getIntent().getIntExtra("KEY_RINGTONE_CHANNEL", 11);
        int intExtra2 = context.getIntent().getIntExtra("KEY_RINGTONE_CHOOSE_SCENE", 0);
        java.lang.String stringExtra2 = context.getIntent().getStringExtra("KEY_RINGTONE_REC_REQUEST_ID");
        java.lang.String str5 = stringExtra2 == null ? "" : stringExtra2;
        boolean booleanExtra = context.getIntent().getBooleanExtra("KEY_IS_VIDEO_STREAM", false);
        i95.m c17 = i95.n0.c(ed0.u0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.lifecycle.o mo133getLifecycle = context.mo133getLifecycle();
        kotlin.jvm.internal.o.f(mo133getLifecycle, "getLifecycle(...)");
        cy3.q.a(context, mo133getLifecycle, str4, wi6, j17, intExtra, intExtra2, str5, booleanExtra, true, null, new com.tencent.mm.plugin.finder.assist.x5(context, s0Var, finderObject, str, z17, reportJson, i17, feedOp, feed));
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (V6 != null) {
            com.tencent.mm.plugin.finder.report.l0.f125109a.b(V6, feed, 44);
        }
    }
}
