package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static long f93167a;

    /* renamed from: b, reason: collision with root package name */
    public static long f93168b;

    public static final void a(int i17, int i18, int i19) {
        if (i18 == 1) {
            f93168b = java.lang.System.currentTimeMillis();
        }
        int currentTimeMillis = (i18 == 2 || i18 == 3) ? (int) (java.lang.System.currentTimeMillis() - f93168b) : 0;
        java.util.List list = com.tencent.mm.plugin.ball.service.s.H0().f93215a;
        kotlin.jvm.internal.o.f(list, "getBallInfoListSync(...)");
        b(list, i17, i18, 1, i19, currentTimeMillis);
    }

    public static final void b(java.util.List ballList, int i17, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(ballList, "ballList");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (i18 == 2 || i18 == 3) {
            hashMap.put("float_list_time_ms", java.lang.Integer.valueOf(i28));
        }
        hashMap.put("float_win_type", java.lang.Integer.valueOf(i19));
        if (i19 == 1) {
            hashMap.put("action_direction", java.lang.Integer.valueOf(i27));
            hashMap.put("float_win_cnt", java.lang.Integer.valueOf(((java.util.Vector) qp1.w.f(ballList)).size()));
            hashMap.put("float_list_act", java.lang.Integer.valueOf(i17));
        } else {
            hashMap.put("float_win_cnt", java.lang.Integer.valueOf(((java.util.Vector) qp1.w.g(ballList)).size()));
        }
        hashMap.put("view_id", "float_win_list");
        java.util.Iterator it = ballList.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
            if (!ballInfo.f93045J) {
                if (!qp1.w.r(ballInfo) || i19 != 1) {
                    if ((ballInfo.f93048f == 2) && i19 == 2) {
                    }
                }
                if (str.length() > 0) {
                    str = str.concat("#");
                }
                str = str + com.tencent.mm.plugin.ball.model.BallReportInfo.a(ballInfo.f93046d) + '_' + com.tencent.mm.plugin.ball.model.BallReportInfo.b(ballInfo.H);
            }
        }
        hashMap.put("bizname_statetype_list", str);
        hashMap.put("float_list_act_result", java.lang.Integer.valueOf(i18));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("float_win_list_action", hashMap, 33488);
    }

    public static final void c(com.tencent.mm.plugin.ball.model.BallInfo target, java.util.List ballList, int i17) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(ballList, "ballList");
        boolean r17 = qp1.w.r(target);
        boolean z17 = target.f93048f == 2;
        if (r17 || z17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("float_win_type", java.lang.Integer.valueOf(r17 ? 1 : 2));
            hashMap.put("view_id", "float_win");
            hashMap.put("float_win_id", target.f93046d + '_' + target.f93049g);
            if (r17) {
                hashMap.put("float_win_cnt", java.lang.Integer.valueOf(((java.util.Vector) qp1.w.f(ballList)).size()));
            } else {
                hashMap.put("float_win_cnt", java.lang.Integer.valueOf(((java.util.Vector) qp1.w.g(ballList)).size()));
            }
            hashMap.put("state_type", java.lang.Integer.valueOf(com.tencent.mm.plugin.ball.model.BallReportInfo.b(target.H)));
            java.lang.String a17 = com.tencent.mm.plugin.ball.model.BallReportInfo.a(target.f93046d);
            kotlin.jvm.internal.o.f(a17, "getKV33488ReportBizName(...)");
            hashMap.put("bizname", a17);
            hashMap.put("float_win_action", java.lang.Integer.valueOf(i17));
            hashMap.put("float_win_add_ms", java.lang.Long.valueOf(target.C));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("float_win_action", hashMap, 33488);
        }
    }

    public static final void d(int i17) {
        if (i17 == 1) {
            f93167a = java.lang.System.currentTimeMillis();
        }
        int currentTimeMillis = i17 == 2 ? (int) (java.lang.System.currentTimeMillis() - f93167a) : 0;
        java.util.List list = com.tencent.mm.plugin.ball.service.s.H0().f93215a;
        kotlin.jvm.internal.o.f(list, "getBallInfoListSync(...)");
        b(list, 0, i17, 2, 0, currentTimeMillis);
    }
}
