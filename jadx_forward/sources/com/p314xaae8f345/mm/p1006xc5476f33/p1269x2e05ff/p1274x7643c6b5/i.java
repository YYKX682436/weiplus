package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static long f174700a;

    /* renamed from: b, reason: collision with root package name */
    public static long f174701b;

    public static final void a(int i17, int i18, int i19) {
        if (i18 == 1) {
            f174701b = java.lang.System.currentTimeMillis();
        }
        int currentTimeMillis = (i18 == 2 || i18 == 3) ? (int) (java.lang.System.currentTimeMillis() - f174701b) : 0;
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.H0().f174748a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getBallInfoListSync(...)");
        b(list, i17, i18, 1, i19, currentTimeMillis);
    }

    public static final void b(java.util.List ballList, int i17, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballList, "ballList");
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
            if (!c12886x91aa2b6d.f174578J) {
                if (!qp1.w.r(c12886x91aa2b6d) || i19 != 1) {
                    if ((c12886x91aa2b6d.f174581f == 2) && i19 == 2) {
                    }
                }
                if (str.length() > 0) {
                    str = str.concat("#");
                }
                str = str + com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81.a(c12886x91aa2b6d.f174579d) + '_' + com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81.b(c12886x91aa2b6d.H);
            }
        }
        hashMap.put("bizname_statetype_list", str);
        hashMap.put("float_list_act_result", java.lang.Integer.valueOf(i18));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("float_win_list_action", hashMap, 33488);
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d target, java.util.List ballList, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballList, "ballList");
        boolean r17 = qp1.w.r(target);
        boolean z17 = target.f174581f == 2;
        if (r17 || z17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("float_win_type", java.lang.Integer.valueOf(r17 ? 1 : 2));
            hashMap.put("view_id", "float_win");
            hashMap.put("float_win_id", target.f174579d + '_' + target.f174582g);
            if (r17) {
                hashMap.put("float_win_cnt", java.lang.Integer.valueOf(((java.util.Vector) qp1.w.f(ballList)).size()));
            } else {
                hashMap.put("float_win_cnt", java.lang.Integer.valueOf(((java.util.Vector) qp1.w.g(ballList)).size()));
            }
            hashMap.put("state_type", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81.b(target.H)));
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81.a(target.f174579d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getKV33488ReportBizName(...)");
            hashMap.put("bizname", a17);
            hashMap.put("float_win_action", java.lang.Integer.valueOf(i17));
            hashMap.put("float_win_add_ms", java.lang.Long.valueOf(target.C));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("float_win_action", hashMap, 33488);
        }
    }

    public static final void d(int i17) {
        if (i17 == 1) {
            f174700a = java.lang.System.currentTimeMillis();
        }
        int currentTimeMillis = i17 == 2 ? (int) (java.lang.System.currentTimeMillis() - f174700a) : 0;
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.H0().f174748a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getBallInfoListSync(...)");
        b(list, 0, i17, 2, 0, currentTimeMillis);
    }
}
