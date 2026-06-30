package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes5.dex */
public final class qb {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.qb f105792a = new com.tencent.mm.plugin.finder.extension.reddot.qb();

    public final long a() {
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_CURRENT_FAST_ENTER_LEVEL_INT_SYNC, 0);
        if (r17 == 1) {
            return (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderNewFeedTipsFastEnterFirstTimeInterval", 86400) * 1000) / p();
        }
        if (r17 == 2) {
            return (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderNewFeedTipsFastEnterSecondTimeInterval", 172800) * 1000) / p();
        }
        if (r17 != 3) {
            return 0L;
        }
        return (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderNewFeedTipsFastEnterThirdTimeInterval", 604800) * 1000) / p();
    }

    public final int b() {
        boolean z17;
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        com.tencent.mm.plugin.finder.storage.z70 z70Var = com.tencent.mm.plugin.finder.storage.z70.f128432a;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        e42.c0 c0Var = e42.c0.clicfg_finder_red_dot_fix_remaining_timeline_cache_interval;
        boolean z18 = false;
        if (((java.lang.Boolean) t70Var.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(z70Var, t70Var, "修复remaining_timeline_cache_interval语义错误", c0Var, java.lang.Boolean.valueOf(z18), false, com.tencent.mm.plugin.finder.storage.gg0.f126837d, 8, null)).booleanValue()) {
            return (int) ((c01.id.c() - gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, 0L)) / 1000);
        }
        cq.k1.a();
        long intValue = ((java.lang.Number) t70Var.P1().r()).intValue();
        long c17 = c01.id.c() - gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, 0L);
        if (c17 < 0) {
            c17 = 0;
        }
        long j17 = intValue - c17;
        return (int) ((j17 >= 0 ? j17 : 0L) / 1000);
    }

    public final long c() {
        return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_square_red_dot_interval, 7200) * 1000) / p()) + a();
    }

    public final long d() {
        return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ultron_discovery_live_on_finder_reddot_tips_interval, 300) * 1000) / p()) + a();
    }

    public final long e() {
        return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_more_tab_follow_entrance_red_dot_interval, 7200) * 1000) / p()) + a();
    }

    public final long f() {
        return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_more_tab_follow_tab_red_dot_interval, 0) * 1000) / p()) + a();
    }

    public final long g() {
        return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_more_tab_friend_tab_red_dot_interval, 7200) * 1000) / p()) + a();
    }

    public final long h() {
        return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_more_tab_friend_post_tab_red_dot_interval, 7200) * 1000) / p()) + a();
    }

    public final long i() {
        return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_more_tab_hot_tab_red_dot_interval, 7200) * 1000) / p()) + a();
    }

    public final long j() {
        return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_more_tab_live_tab_red_dot_interval, 7200) * 1000) / p()) + a();
    }

    public final long k() {
        return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_more_tab_nearby_red_dot_interval, 7200) * 1000) / p()) + a();
    }

    public final long l() {
        return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_more_tab_news_tab_red_dot_interval, 7200) * 1000) / p()) + a();
    }

    public final long m() {
        return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_new_msg_tips_enter_interval, 7200) * 1000) / p()) + a();
    }

    public final long n() {
        return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ultron_discovery_share_finder_reddot_tips_interval, 300) * 1000) / p()) + a();
    }

    public final long o() {
        return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ultron_discovery_social_hot_spot_reddot_tips_interval, 300) * 1000) / p()) + a();
    }

    public final int p() {
        boolean z17;
        boolean z18;
        int intValue;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (!z18) {
            return 1;
        }
        if (com.tencent.mm.plugin.finder.storage.aj0.f126440a.K()) {
            com.tencent.mm.plugin.finder.storage.z70 z70Var = com.tencent.mm.plugin.finder.storage.z70.f128432a;
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            com.tencent.mm.plugin.finder.storage.l80 l80Var = new com.tencent.mm.plugin.finder.storage.l80("USERINFO_FINDER_TEST_RED_DOT_FACTOR_INT_SYNC", kz5.c0.i(1, 1000000000), kz5.c0.i("默认", "无限制"));
            l80Var.f127120e = "常用";
            intValue = ((java.lang.Number) z70Var.d(t70Var, "红点是否限频", 1, l80Var)).intValue();
        } else {
            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.f126459m).getValue()).r()).intValue();
        }
        return intValue;
    }
}
