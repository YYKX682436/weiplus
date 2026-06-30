package ml2;

/* loaded from: classes3.dex */
public final class m5 {

    /* renamed from: b, reason: collision with root package name */
    public static ml2.l5 f409252b;

    /* renamed from: a, reason: collision with root package name */
    public static final ml2.m5 f409251a = new ml2.m5();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f409253c = new java.util.HashSet();

    public final void a(long j17) {
        if (f409253c.isEmpty()) {
            ml2.l5 l5Var = f409252b;
            if (l5Var != null) {
                if (j17 <= 0) {
                    j17 = c01.id.c();
                }
                long j18 = j17 - l5Var.f409240d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveStayTimeReporter", "report stayTime:" + j18 + ", commentScene:" + l5Var.f409238b);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6535x39d1b5e1 c6535x39d1b5e1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6535x39d1b5e1();
                c6535x39d1b5e1.f138908d = c6535x39d1b5e1.b("Contextid", l5Var.f409237a, true);
                c6535x39d1b5e1.f138909e = c6535x39d1b5e1.b("CommentScene", l5Var.f409238b, true);
                c6535x39d1b5e1.f138910f = j18;
                c6535x39d1b5e1.f138911g = c6535x39d1b5e1.b("RedDotTipsID", l5Var.f409239c, true);
                c6535x39d1b5e1.f138912h = l5Var.f409240d;
                c6535x39d1b5e1.f138913i = j17;
                c6535x39d1b5e1.f138914j = c6535x39d1b5e1.b("ExtraInfo", "", true);
                c6535x39d1b5e1.k();
            }
            f409252b = null;
        }
    }

    public final void b() {
        if (f409252b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveStayTimeReporter", "enterFloatBall");
            f409253c.add("floatBall");
        }
        or2.a aVar = or2.a.f429140a;
        or2.a.f429148i = true;
        long j17 = or2.a.f429143d;
        int i17 = or2.a.f429146g + 1;
        or2.a.f429146g = i17;
        if (i17 >= 1) {
            aVar.c(true, false, j17, true);
        }
    }

    public final void c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, java.lang.String commentScene) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        ml2.l5 l5Var = f409252b;
        java.util.HashSet hashSet = f409253c;
        if (l5Var == null) {
            hashSet.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveEntrance");
            ml2.l5 l5Var2 = new ml2.l5();
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getFinderContextId(...)");
            l5Var2.f409237a = b17;
            if (commentScene.length() == 0) {
                ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
                str = a52.a.f83117l;
                if (str == null) {
                    str = "";
                }
            } else {
                str = commentScene;
            }
            l5Var2.f409238b = str;
            l5Var2.f409240d = c01.id.c();
            java.lang.String str2 = L0 != null ? L0.f65880x11c19d58 : null;
            l5Var2.f409239c = str2 != null ? str2 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveStayTimeReporter", "enter activity:" + activity + ", contextId:" + l5Var2.f409237a + ", commentScene:" + l5Var2.f409238b + ", commentSceneParams:" + commentScene + "enterTimeMs:" + l5Var2.f409240d + ", redDotTipsId:" + l5Var2.f409239c + ", extraInfo:");
            f409252b = l5Var2;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveStayTimeReporter", "enter activity:" + activity);
        }
        hashSet.add("activity_" + activity.hashCode());
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14042xca648648) {
            e();
        }
    }

    public final void d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveStayTimeReporter", "exit finishTime:" + j17);
        f409253c.remove("activity_" + activity.hashCode());
        a(j17);
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveStayTimeReporter", "exitFloatBall");
        f409253c.remove("floatBall");
        a(0L);
        or2.a aVar = or2.a.f429140a;
        if (or2.a.f429148i) {
            or2.a.f429148i = false;
            long j17 = or2.a.f429143d;
            if (!aVar.a()) {
                aVar.e();
            }
            if (or2.a.f429146g <= 0 || or2.a.f429143d == j17) {
                return;
            }
            or2.a.f429143d = j17;
            aVar.e();
        }
    }

    public final void f(java.lang.String commentScene) {
        ml2.l5 l5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modifyCommentScene ");
        sb6.append(commentScene);
        sb6.append(", floatBall:");
        java.util.HashSet hashSet = f409253c;
        sb6.append(hashSet.contains("floatBall"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveStayTimeReporter", sb6.toString());
        if (!(commentScene.length() > 0) || hashSet.contains("floatBall") || (l5Var = f409252b) == null) {
            return;
        }
        l5Var.f409238b = commentScene;
    }
}
