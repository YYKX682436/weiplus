package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3 f206511a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f206512b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b3.f206499d);

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y2 f206513c;

    public final void a(int i17, r45.qt2 qt2Var, so2.j5 j5Var, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2 c17 = c(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RefreshReporter", "tab_" + i17 + ",tab刷新文案点击（刷新次数：" + c17.f207019c + "）,playPercent=" + i18 + ',' + b(j5Var));
        if (c17.f207019c == 0) {
            c17.a(i17);
        }
        d(qt2Var, j5Var, i18, c17.f207019c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a3.f206477g);
        c17.f207017a = false;
        c17.f207018b = null;
        c17.a(i17);
        f206513c = null;
    }

    public final java.lang.String b(so2.j5 j5Var) {
        if (!(j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
            return "NULL";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
        sb6.append(pm0.v.u(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11()));
        sb6.append(" nick:");
        sb6.append(abstractC14490x69736cb5.getFeedObject().m59273x80025a04());
        return sb6.toString();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2 c(int i17) {
        jz5.g gVar = f206512b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2 z2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2) ((java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
        if (z2Var != null) {
            return z2Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2 z2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2(false, null, 0, 7, null);
        ((java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb()).put(java.lang.Integer.valueOf(i17), z2Var2);
        return z2Var2;
    }

    public final void d(r45.qt2 qt2Var, so2.j5 j5Var, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a3 a3Var) {
        jz5.f0 f0Var = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
        if (qt2Var != null && abstractC14490x69736cb5 != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("finder_timeline_top_refresh", null, kz5.c1.k(new jz5.l("finder_tab_context_id", qt2Var.m75945x2fec8307(2)), new jz5.l("finder_context_id", qt2Var.m75945x2fec8307(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5))), new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84())), new jz5.l("session_buffer", abstractC14490x69736cb5.g0()), new jz5.l("timeline_top_refresh_type", java.lang.Integer.valueOf(a3Var.f206479d)), new jz5.l("top_refresh_max_playpercent", java.lang.Integer.valueOf(i17)), new jz5.l("top_refresh_count", java.lang.Integer.valueOf(i18))), 1, false);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RefreshReporter", "finder_timeline_top_refresh report fail,reporterContext=" + qt2Var + ",curFeed=" + j5Var);
        }
    }
}
