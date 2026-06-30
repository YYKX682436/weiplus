package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f290828b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f290829c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f290830d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f290831e = "";

    /* renamed from: f, reason: collision with root package name */
    public static int f290832f;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e f290827a = new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e();

    /* renamed from: g, reason: collision with root package name */
    public static volatile java.util.Map f290833g = kz5.q0.f395534d;

    public static final int b(java.lang.String str) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "filehelper") ? 10 : 1;
    }

    public static final int d(int i17, java.lang.String str) {
        if (i17 == 7) {
            return 3;
        }
        switch (i17) {
            case 11:
                return 4;
            case 12:
                return 5;
            case 13:
                return 6;
            default:
                return ((str == null || str.length() == 0) || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) ? 1 : 2;
        }
    }

    public static final int k(int i17) {
        switch (i17) {
            case 0:
            case 2:
            default:
                return 1;
            case 1:
                return 9;
            case 3:
                return 10;
            case 4:
                return 11;
            case 5:
                return 4;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 3;
            case 10:
                return 12;
            case 11:
                return 14;
            case 12:
                return 15;
            case 13:
                return 16;
        }
    }

    public static final void l(java.lang.Long l17, java.lang.Long l18, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6624x3822c56e c6624x3822c56e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6624x3822c56e();
        c6624x3822c56e.f139764e = l18 != null ? l18.longValue() : 0L;
        c6624x3822c56e.f139763d = l17 != null ? l17.longValue() : 0L;
        c6624x3822c56e.f139765f = num != null ? num.intValue() : 0;
        c6624x3822c56e.f139766g = num2 != null ? num2.intValue() : 0L;
        c6624x3822c56e.f139767h = num3 != null ? num3.intValue() : 0L;
        c6624x3822c56e.f139768i = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE) ? 1 : 0;
        c6624x3822c56e.k();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c6624x3822c56e.g());
        java.lang.String n17 = c6624x3822c56e.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "report%s %s", valueOf, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
    }

    public static final void m(co.a aVar, int i17, int i18, int i19) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_wegov_popup", "view_clk", kz5.c1.m(f290827a.a(aVar, i17, i19), kz5.c1.k(new jz5.l("popup_action_type", java.lang.Integer.valueOf(i18)), new jz5.l("share_type", 15))), 32337);
    }

    public static final void n(co.a aVar, int i17, int i18, int i19) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_wecom_popup", "view_clk", kz5.c1.m(f290827a.a(aVar, i17, i19), kz5.c1.k(new jz5.l("popup_action_type", java.lang.Integer.valueOf(i18)), new jz5.l("share_type", 14))), 32337);
    }

    public static final void p(int i17, java.lang.String str) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("forward_recent_order", java.lang.Integer.valueOf(i17));
        lVarArr[1] = new jz5.l("forward_sid", f290828b);
        if (str == null) {
            str = "";
        }
        lVarArr[2] = new jz5.l("click_username", str);
        ((cy1.a) rVar).Hj("remove_recent_frowrad_chats", "view_clk", kz5.c1.k(lVarArr), 32337);
    }

    public static final void q(int i17, java.lang.String str) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("forward_recent_order", java.lang.Integer.valueOf(i17));
        lVarArr[1] = new jz5.l("forward_sid", f290828b);
        if (str == null) {
            str = "";
        }
        lVarArr[2] = new jz5.l("click_username", str);
        ((cy1.a) rVar).Hj("remove_recent_frowrad_chats", "view_exp", kz5.c1.k(lVarArr), 32337);
    }

    public static final void r(int i17, java.lang.String str) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("forward_sid", f290828b);
        lVarArr[1] = new jz5.l("forward_del_sid", f290829c);
        if (str == null) {
            str = "";
        }
        lVarArr[2] = new jz5.l("click_username", str);
        ((cy1.a) rVar).Hj("forward_real_del", "view_clk", kz5.c1.k(lVarArr), 32337);
    }

    public static final void s() {
        f290828b = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(gm0.j1.b().j()) + c01.id.c();
    }

    public static final void t() {
        f290829c = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(gm0.j1.b().j()) + c01.id.c();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_del_bnt", "view_clk", kz5.c1.k(new jz5.l("forward_sid", f290828b), new jz5.l("forward_del_sid", f290829c)), 32337);
    }

    public final java.util.Map a(co.a aVar, int i17, int i18) {
        java.lang.String str;
        int c17 = c(aVar, i18);
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("forward_sid", f290828b);
        lVarArr[1] = new jz5.l("forwarding_lists_state", java.lang.Integer.valueOf(e()));
        lVarArr[2] = new jz5.l("selected_msg_list", h(aVar));
        lVarArr[3] = new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(g(aVar)));
        if (aVar == null || (str = aVar.m75945x2fec8307(aVar.f125235d + 1)) == null) {
            str = "";
        }
        lVarArr[4] = new jz5.l("chat_username", str);
        lVarArr[5] = new jz5.l("forward_msgtype", java.lang.Integer.valueOf(c17));
        lVarArr[6] = new jz5.l("forward_from_scene", java.lang.Integer.valueOf(k(i17)));
        lVarArr[7] = new jz5.l("forward_source_scene", java.lang.Integer.valueOf(d(i17, aVar != null ? aVar.m75945x2fec8307(aVar.f125235d + 1) : null)));
        return kz5.c1.k(lVarArr);
    }

    public final int c(co.a aVar, int i17) {
        if (aVar instanceof ld5.b) {
            return 2;
        }
        if (aVar instanceof ld5.a) {
            return 3;
        }
        if ((aVar instanceof ne5.a) && ((ne5.a) aVar).k()) {
            return 5;
        }
        if (i17 > 0) {
            return i17;
        }
        return 1;
    }

    public final int e() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("message_fold_config2").o("fold_button_status_int_sync", 65536) != 65536) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536) == 131072 ? 2 : 3;
        }
        return 1;
    }

    public final java.lang.String f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.List list, long j17) {
        if (f9Var == null || list.isEmpty()) {
            return "{\"msg_type\": 0; \"inner_msg_type\": 0; \"send_time\": " + j17 + "; \"toUserid\": 0}";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = f9Var.mo78013xfb85f7b0();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        if (f9Var.k2()) {
            f0Var.f391649d = 49;
            r05.k kVar = new r05.k();
            java.lang.String j18 = f9Var.j();
            if (j18 == null) {
                j18 = "";
            }
            kVar.m126728xdc93280d(j18);
            f0Var2.f391649d = kVar.m75939xb282bd08(kVar.f449898d + 6);
        }
        return kz5.n0.g0(list, "#", null, null, 0, null, new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.c(f0Var, f0Var2, j17), 30, null);
    }

    public final int g(co.a aVar) {
        if (aVar == null) {
            return 0;
        }
        if (aVar instanceof ld5.b) {
            java.util.LinkedList k17 = ((ld5.b) aVar).k();
            if (k17 != null) {
                return k17.size();
            }
            return 0;
        }
        if (!(aVar instanceof ld5.a)) {
            return aVar.m75942xfb822ef2(aVar.f125235d + 0) > 0 ? 1 : 0;
        }
        java.util.LinkedList j17 = ((ld5.a) aVar).j();
        if (j17 != null) {
            return j17.size();
        }
        return 0;
    }

    public final java.lang.String h(co.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (aVar instanceof ld5.b) {
            ld5.b bVar = (ld5.b) aVar;
            java.util.LinkedList k17 = bVar.k();
            if (k17 != null) {
                java.util.Iterator it = k17.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k18 = pt0.f0.f439742b1.k(bVar.m75945x2fec8307(bVar.f125235d + 1), ((java.lang.Number) it.next()).longValue());
                    if (k18 != null) {
                        arrayList.add(k18);
                    }
                }
            }
        } else if (aVar instanceof ld5.a) {
            ld5.a aVar2 = (ld5.a) aVar;
            java.util.LinkedList j17 = aVar2.j();
            if (j17 != null) {
                java.util.Iterator it6 = j17.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k19 = pt0.f0.f439742b1.k(aVar2.m75945x2fec8307(aVar2.f125235d + 1), ((java.lang.Number) it6.next()).longValue());
                    if (k19 != null) {
                        arrayList.add(k19);
                    }
                }
            }
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k27 = pt0.f0.f439742b1.k(aVar != null ? aVar.m75945x2fec8307(aVar.f125235d + 1) : null, aVar != null ? aVar.m75942xfb822ef2(aVar.f125235d + 0) : 0L);
            if (k27 != null) {
                arrayList.add(k27);
            }
        }
        return kz5.n0.g0(arrayList, "#", null, null, 0, null, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.d.f290816d, 30, null);
    }

    public final java.lang.String i() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return c01.z1.r();
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.a.class);
        java.lang.String str = c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : null;
        return str == null ? "" : str;
    }

    public final int j(java.lang.String toUser, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(toUser)) {
            return 4;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(toUser, str)) {
            return 1;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(toUser, "filehelper") ? 2 : 3;
    }

    public final void o(java.lang.String str, int i17) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_profile", "view_clk", kz5.c1.m(f290833g, kz5.c1.k(new jz5.l("forward_sid", f290828b), new jz5.l("forw_confirm_screen_from", java.lang.Integer.valueOf(f290830d)), new jz5.l("forward_ack_profile_clk_type", java.lang.Integer.valueOf(i17)), new jz5.l("forward_obj_list", f290831e))), 32337);
    }
}
