package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes2.dex */
public final class ta {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ta f187412a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ta();

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ta taVar, int i17, boolean z17, int i18, yz5.l lVar, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            z17 = true;
        }
        if ((i19 & 4) != 0) {
            i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.K() ? ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "视频号外部收到timeline tab红点丢弃策略", e42.d0.clicfg_finder_tab_red_dot_drop_outer, 0, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ji0.f208547d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.M).mo141623x754a37bb()).r()).intValue();
        }
        taVar.a(i17, z17, i18, lVar);
    }

    public final void a(int i17, boolean z17, int i18, yz5.l action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTimelineRedDotHelper", "dropTimeLineRedDotByExpt targetTab:" + i17 + " controlValue:" + i18);
        if (i17 == 1) {
            d(i18, 4, "TLFollow", action);
            d(i18, 8, "finder_tl_hot_tab", action);
            d(i18, 128, "finder_tl_city_tab", action);
            return;
        }
        if (i17 == 35) {
            d(i18, 512, "TLRecommendTab", action);
            d(i18, 1024, "TLFollow", action);
            d(i18, 2048, "finder_tl_hot_tab", action);
        } else if (i17 == 3) {
            d(i18, 1, "TLRecommendTab", action);
            d(i18, 2, "finder_tl_hot_tab", action);
            d(i18, 64, "finder_tl_city_tab", action);
        } else {
            if (i17 != 4) {
                return;
            }
            d(i18, 32, "TLRecommendTab", action);
            d(i18, 16, "TLFollow", action);
            d(i18, 256, "finder_tl_city_tab", action);
        }
    }

    public final int c(java.lang.String tag, zy2.fa redDotManager, java.lang.String redDotPath) {
        r45.j03 j03Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotManager, "redDotManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotPath, "redDotPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = redDotManager.L0(redDotPath);
        java.lang.Object obj = null;
        r45.f03 I0 = L0 != null ? L0.I0(redDotPath) : null;
        if (I0 != null) {
            if (I0.f455432s == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "[getAliveTabType] cacheChangeTabOption=" + I0.f455438y + ",ext_tab_type=" + L0.N.m75939xb282bd08(9));
                int i17 = I0.f455438y;
                if (i17 == 0) {
                    return -100;
                }
                if (i17 == 1) {
                    return L0.T0();
                }
                if (i17 == 2) {
                    return L0.N.m75939xb282bd08(9);
                }
            }
            int m75939xb282bd08 = L0.N.m75939xb282bd08(9);
            int m75939xb282bd082 = L0.N.m75939xb282bd08(13);
            int i18 = m75939xb282bd08 != -1 ? m75939xb282bd08 : m75939xb282bd082 != 2 ? m75939xb282bd082 != 3 ? m75939xb282bd082 != 4 ? -1 : 4 : 3 : 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "[getAliveTabType] -- displayTabType: " + m75939xb282bd08 + " enterAction: " + m75939xb282bd082 + "  tabType:" + i18);
            if (i18 != -1) {
                return i18;
            }
        }
        if (I0 != null && L0.I0("finder_private_msg_entrance") == null) {
            int T0 = L0.T0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "[getAliveTabType] getTabTypeInCtrlInfo=" + T0);
            if (T0 != -1) {
                return T0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "[getAliveTabType] TAB_TYPE_INVALID");
            return -1;
        }
        int i19 = ((ey2.t0) pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class)).f339041n;
        int i27 = 0;
        if ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.K() ? ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "发现页没红点，是否默认跳热门", e42.d0.clicfg_finder_is_jump_hot_without_entrance_reddot, 0, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.qi0.f208969d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207993n).mo141623x754a37bb()).r()).intValue()) == 1 && i19 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "[getAliveTabType] IS_HARD_JUMP_HOT_WITHOUT_ENTRANCE_REDDOT = true");
            return 4;
        }
        mc2.a aVar = mc2.b.f407148c;
        java.util.List<mc2.b> i28 = kz5.c0.i(aVar.a(1, redDotManager), aVar.a(3, redDotManager), aVar.a(4, redDotManager));
        java.util.Iterator it = i28.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int i29 = ((mc2.b) obj).f407150b.f458998d;
                do {
                    java.lang.Object next = it.next();
                    int i37 = ((mc2.b) next).f407150b.f458998d;
                    if (i29 < i37) {
                        obj = next;
                        i29 = i37;
                    }
                } while (it.hasNext());
            }
        }
        mc2.b bVar = (mc2.b) obj;
        int i38 = bVar != null ? bVar.f407149a : -1;
        if (bVar != null && (j03Var = bVar.f407150b) != null) {
            i27 = j03Var.f458998d;
        }
        int i39 = i27 > 0 ? i38 : -1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getAliveTabType] aliveType=");
        sb6.append(i39);
        sb6.append(" maxPriorityTabType=");
        sb6.append(i38);
        sb6.append(' ');
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i28, 10));
        for (mc2.b bVar2 : i28) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(bVar2.f407149a);
            sb7.append('=');
            sb7.append(bVar2.f407150b.f458998d);
            arrayList.add(sb7.toString());
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, sb6.toString());
        return i39;
    }

    public final void d(int i17, int i18, java.lang.String str, yz5.l lVar) {
        if ((i17 & i18) == i18) {
            lVar.mo146xb9724478(str);
        }
    }
}
