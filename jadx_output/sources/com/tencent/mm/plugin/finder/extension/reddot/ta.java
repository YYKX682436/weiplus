package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class ta {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.ta f105879a = new com.tencent.mm.plugin.finder.extension.reddot.ta();

    public static void b(com.tencent.mm.plugin.finder.extension.reddot.ta taVar, int i17, boolean z17, int i18, yz5.l lVar, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            z17 = true;
        }
        if ((i19 & 4) != 0) {
            i18 = com.tencent.mm.plugin.finder.storage.aj0.f126440a.K() ? ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "视频号外部收到timeline tab红点丢弃策略", e42.d0.clicfg_finder_tab_red_dot_drop_outer, 0, false, com.tencent.mm.plugin.finder.storage.ji0.f127014d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.M).getValue()).r()).intValue();
        }
        taVar.a(i17, z17, i18, lVar);
    }

    public final void a(int i17, boolean z17, int i18, yz5.l action) {
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mars.xlog.Log.i("FinderTimelineRedDotHelper", "dropTimeLineRedDotByExpt targetTab:" + i17 + " controlValue:" + i18);
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
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(redDotManager, "redDotManager");
        kotlin.jvm.internal.o.g(redDotPath, "redDotPath");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = redDotManager.L0(redDotPath);
        java.lang.Object obj = null;
        r45.f03 I0 = L0 != null ? L0.I0(redDotPath) : null;
        if (I0 != null) {
            if (I0.f373899s == 1) {
                com.tencent.mars.xlog.Log.i(tag, "[getAliveTabType] cacheChangeTabOption=" + I0.f373905y + ",ext_tab_type=" + L0.N.getInteger(9));
                int i17 = I0.f373905y;
                if (i17 == 0) {
                    return -100;
                }
                if (i17 == 1) {
                    return L0.T0();
                }
                if (i17 == 2) {
                    return L0.N.getInteger(9);
                }
            }
            int integer = L0.N.getInteger(9);
            int integer2 = L0.N.getInteger(13);
            int i18 = integer != -1 ? integer : integer2 != 2 ? integer2 != 3 ? integer2 != 4 ? -1 : 4 : 3 : 1;
            com.tencent.mars.xlog.Log.i(tag, "[getAliveTabType] -- displayTabType: " + integer + " enterAction: " + integer2 + "  tabType:" + i18);
            if (i18 != -1) {
                return i18;
            }
        }
        if (I0 != null && L0.I0("finder_private_msg_entrance") == null) {
            int T0 = L0.T0();
            com.tencent.mars.xlog.Log.i(tag, "[getAliveTabType] getTabTypeInCtrlInfo=" + T0);
            if (T0 != -1) {
                return T0;
            }
            com.tencent.mars.xlog.Log.i(tag, "[getAliveTabType] TAB_TYPE_INVALID");
            return -1;
        }
        int i19 = ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).f257508n;
        int i27 = 0;
        if ((com.tencent.mm.plugin.finder.storage.aj0.f126440a.K() ? ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "发现页没红点，是否默认跳热门", e42.d0.clicfg_finder_is_jump_hot_without_entrance_reddot, 0, false, com.tencent.mm.plugin.finder.storage.qi0.f127436d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.f126460n).getValue()).r()).intValue()) == 1 && i19 == 4) {
            com.tencent.mars.xlog.Log.i(tag, "[getAliveTabType] IS_HARD_JUMP_HOT_WITHOUT_ENTRANCE_REDDOT = true");
            return 4;
        }
        mc2.a aVar = mc2.b.f325615c;
        java.util.List<mc2.b> i28 = kz5.c0.i(aVar.a(1, redDotManager), aVar.a(3, redDotManager), aVar.a(4, redDotManager));
        java.util.Iterator it = i28.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int i29 = ((mc2.b) obj).f325617b.f377465d;
                do {
                    java.lang.Object next = it.next();
                    int i37 = ((mc2.b) next).f325617b.f377465d;
                    if (i29 < i37) {
                        obj = next;
                        i29 = i37;
                    }
                } while (it.hasNext());
            }
        }
        mc2.b bVar = (mc2.b) obj;
        int i38 = bVar != null ? bVar.f325616a : -1;
        if (bVar != null && (j03Var = bVar.f325617b) != null) {
            i27 = j03Var.f377465d;
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
            sb7.append(bVar2.f325616a);
            sb7.append('=');
            sb7.append(bVar2.f325617b.f377465d);
            arrayList.add(sb7.toString());
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        return i39;
    }

    public final void d(int i17, int i18, java.lang.String str, yz5.l lVar) {
        if ((i17 & i18) == i18) {
            lVar.invoke(str);
        }
    }
}
