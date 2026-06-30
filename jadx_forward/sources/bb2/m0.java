package bb2;

/* loaded from: classes10.dex */
public final class m0 {

    /* renamed from: a */
    public static final bb2.m0 f100451a = new bb2.m0();

    public static /* synthetic */ void b(bb2.m0 m0Var, android.content.Context context, r45.qt2 qt2Var, java.lang.String str, boolean z17, org.json.JSONObject jSONObject, boolean z18, int i17, int i18, java.lang.Object obj) {
        m0Var.a(context, qt2Var, str, z17, jSONObject, (i18 & 32) != 0 ? false : z18, (i18 & 64) != 0 ? -1 : i17);
    }

    public final void a(android.content.Context context, r45.qt2 qt2Var, java.lang.String eid, boolean z17, org.json.JSONObject udfKv, boolean z18, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eid, "eid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udfKv, "udfKv");
        if (i17 == 0) {
            udfKv.put("bullet_screen_belong", "other");
        } else if (i17 == 1) {
            udfKv.put("bullet_screen_belong", "my");
        } else if (i17 == 2) {
            udfKv.put("bullet_screen_belong", "author");
        }
        udfKv.put("sub_obj_type", z18 ? 1 : 0);
        udfKv.put("screen_type", context.getResources().getConfiguration().orientation != 2 ? 2 : 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, qt2Var, eid, z17 ? 1 : 0, udfKv, false, null, 48, null);
    }

    public final void c(android.content.Context context, r45.oo bulletInfo, so2.u1 feedObject, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletInfo, "bulletInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6468xc45edb9d c6468xc45edb9d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6468xc45edb9d();
        c6468xc45edb9d.f138113d = c6468xc45edb9d.b("bs_id", pm0.v.u(bulletInfo.m75942xfb822ef2(0)), true);
        c6468xc45edb9d.f138114e = c6468xc45edb9d.b("feed_id", pm0.v.u(feedObject.mo2128x1ed62e84()), true);
        c6468xc45edb9d.f138115f = c6468xc45edb9d.b("bs_content", bulletInfo.m75945x2fec8307(2), true);
        c6468xc45edb9d.f138116g = z17 ? 1 : 2;
        c6468xc45edb9d.f138117h = bulletInfo.m75939xb282bd08(4);
        c6468xc45edb9d.f138118i = i17;
        c6468xc45edb9d.f138119j = context.getResources().getConfiguration().orientation == 2 ? 1 : 2;
        c6468xc45edb9d.f138120k = 1;
        c6468xc45edb9d.f138121l = ((ey2.v2) pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class)).O6(feedObject.mo2128x1ed62e84()) + 1;
        c6468xc45edb9d.f138122m = bulletInfo.m75942xfb822ef2(14) == 0 ? 1 : 2;
        java.lang.Long valueOf = java.lang.Long.valueOf(bulletInfo.m75942xfb822ef2(14));
        if (!(valueOf.longValue() != 0)) {
            valueOf = null;
        }
        c6468xc45edb9d.f138123n = c6468xc45edb9d.b("bs_follow_button_id", valueOf != null ? pm0.v.u(valueOf.longValue()) : null, true);
        if (z17) {
            java.lang.String a17 = hc2.k.a(kz5.c1.k(new jz5.l("bs_id", c6468xc45edb9d.f138113d), new jz5.l("feed_id", c6468xc45edb9d.f138114e), new jz5.l("bs_content", c6468xc45edb9d.f138115f), new jz5.l("bs_status", java.lang.Integer.valueOf(c6468xc45edb9d.f138116g)), new jz5.l("bs_createtime", java.lang.Long.valueOf(c6468xc45edb9d.f138117h)), new jz5.l("post_play_sec", java.lang.Long.valueOf(c6468xc45edb9d.f138118i)), new jz5.l("screen_type", java.lang.Integer.valueOf(c6468xc45edb9d.f138119j)), new jz5.l("bs_type", java.lang.Integer.valueOf(c6468xc45edb9d.f138120k)), new jz5.l("post_play_times", java.lang.Integer.valueOf(c6468xc45edb9d.f138121l)), new jz5.l("bs_post_type", java.lang.Integer.valueOf(c6468xc45edb9d.f138122m)), new jz5.l("bs_follow_button_id", c6468xc45edb9d.f138123n)));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.h(l0Var, nyVar != null ? nyVar.V6() : null, feedObject.getFeedObject(), 50, hc2.k.a(kz5.c1.k(new jz5.l("feedActionType", 50), new jz5.l("strValue", a17))), 0, null, 48, null);
        }
        c6468xc45edb9d.k();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6468xc45edb9d);
    }

    public final void d(android.view.View targetView, android.content.Context context, r45.oo bulletInfo, long j17, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletInfo, "bulletInfo");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[9];
        lVarArr[0] = new jz5.l("view_id", "bs_agree_button");
        lVarArr[1] = new jz5.l("bs_id", pm0.v.u(bulletInfo.m75942xfb822ef2(0)));
        lVarArr[2] = new jz5.l("bs_content", bulletInfo.m75945x2fec8307(2));
        lVarArr[3] = new jz5.l("bs_status", java.lang.Integer.valueOf(z17 ? 1 : 2));
        lVarArr[4] = new jz5.l("post_play_sec", java.lang.Long.valueOf(i17));
        lVarArr[5] = new jz5.l("screen_type", java.lang.Integer.valueOf(context.getResources().getConfiguration().orientation == 2 ? 1 : 2));
        lVarArr[6] = new jz5.l("bs_type", 1);
        lVarArr[7] = new jz5.l("post_play_times", java.lang.Integer.valueOf(((ey2.v2) pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class)).O6(j17) + 1));
        lVarArr[8] = new jz5.l("feed_id", pm0.v.u(j17));
        ((cy1.a) rVar).Cj("post_bs", targetView, kz5.c1.k(lVarArr), 25496);
    }
}
