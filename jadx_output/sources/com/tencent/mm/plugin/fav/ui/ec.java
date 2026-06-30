package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public abstract class ec {
    public static void a(android.app.Activity activity, java.util.List list, com.tencent.mm.plugin.fav.ui.dc dcVar, int i17, java.util.Map map) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FavoriteMenuHelper", "batchDelFavItems() :%s", java.lang.Integer.valueOf(list.size()));
        gm0.j1.e().j(new com.tencent.mm.plugin.fav.ui.bc(list, i17, map, dcVar, db5.e1.Q(activity, "", activity.getString(com.tencent.mm.R.string.c_l), true, false, null)));
    }

    public static void b(android.app.Activity activity, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (list == null || list.isEmpty() || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        o72.b3 b3Var = new o72.b3();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            o72.r2 r2Var = (o72.r2) it.next();
            if (!b3Var.c(r2Var, true, true)) {
                linkedList.add(r2Var);
            }
        }
        if (linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i(str3, "after filter, nothing");
            db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.cck));
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(activity, "", activity.getString(com.tencent.mm.R.string.cax), true, false, null);
        com.tencent.mm.plugin.fav.ui.f6 f6Var = new com.tencent.mm.plugin.fav.ui.f6();
        f6Var.f100848b = str2;
        f6Var.f100849c = str;
        f6Var.f100851e = linkedList;
        com.tencent.mm.plugin.fav.ui.x5.h(activity, f6Var, new com.tencent.mm.plugin.fav.ui.cc(Q, activity, str2, linkedList));
    }

    public static int c(int i17) {
        if (i17 == 1) {
            return 4;
        }
        if (i17 == 2) {
            return 0;
        }
        if (i17 == 16) {
            return 11;
        }
        if (i17 == 4) {
            return 1;
        }
        if (i17 == 14) {
            return 13;
        }
        if (i17 == 6) {
            return 9;
        }
        return i17 == 8 ? 3 : 2;
    }

    public static void d(android.app.Activity activity, android.content.Intent intent) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(43, 34, 188, intent);
        }
        o72.x1.L0(activity, ".ui.FavFinderFilterUI", intent, null);
    }

    public static void e(android.app.Activity activity, boolean z17, android.content.Intent intent) {
        android.os.Bundle bundle = !com.tencent.mm.ui.bk.C() ? android.app.ActivityOptions.makeSceneTransitionAnimation(activity, new android.util.Pair[0]).toBundle() : null;
        if (!z17) {
            o72.x1.L0(activity, ".ui.FavSearchUI", intent, bundle);
        } else {
            intent.putExtra("key_search_type", 2);
            o72.x1.M0(activity, ".ui.FavSearchUI", intent, 4103, bundle);
        }
    }

    public static void f(android.content.Context context, java.lang.String str, java.util.List list, boolean z17) {
        r45.bq0 bq0Var;
        r45.kv2 shareObj;
        if (str == null || list == null) {
            return;
        }
        long j17 = !z17 ? 2L : 1L;
        r45.qt2 qt2Var = null;
        if (context instanceof com.tencent.mm.plugin.fav.ui.FavFinderFilterUI) {
            java.lang.Object obj = ((com.tencent.mm.plugin.fav.ui.FavFinderFilterUI) context).f100350f;
            if (obj == null) {
                kotlin.jvm.internal.o.o("mGlobalFavFragment");
                throw null;
            }
            androidx.fragment.app.Fragment fragment = obj instanceof androidx.fragment.app.Fragment ? (androidx.fragment.app.Fragment) obj : null;
            if (fragment != null) {
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                if (nyVar != null) {
                    qt2Var = nyVar.V6();
                }
            }
        }
        r45.qt2 qt2Var2 = qt2Var;
        java.lang.String receiver = str.replace(',', ';');
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            o72.r2 r2Var = (o72.r2) it.next();
            if (r2Var.field_type == 20 && (bq0Var = r2Var.field_favProto) != null && (shareObj = bq0Var.M) != null) {
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                kotlin.jvm.internal.o.g(shareObj, "shareObj");
                kotlin.jvm.internal.o.g(receiver, "receiver");
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Uj(shareObj, 9, j17, receiver, qt2Var2, 1L);
            }
        }
    }

    public static boolean g(android.content.Context context, int i17, com.tencent.mm.plugin.fav.ui.adapter.c cVar, o72.r2 r2Var) {
        co.a a17;
        co.a a18;
        com.tencent.mm.plugin.fav.ui.i3 i3Var = com.tencent.mm.plugin.fav.ui.i3.f101160a;
        if (i17 != 4105) {
            if (i17 != 4106) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("scene_from", 1);
            intent.putExtra("mutil_select_is_ret", true);
            if (r2Var != null) {
                intent.putExtra("select_fav_local_id", r2Var.field_localId);
                if (r2Var.B1) {
                    intent.putExtra("select_fav_fake_local_id", r2Var.D1);
                }
                if (r2Var.field_type == 19) {
                    intent.putExtra("appbrand_params", com.tencent.mm.plugin.fav.ui.b0.c(r2Var));
                }
                ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(r2Var.field_localId));
            }
            if (r2Var != null && c(r2Var.field_type) != -1) {
                intent.putExtra("Retr_Msg_Type", c(r2Var.field_type));
                if (i3Var.c(r2Var) && (a17 = i3Var.a(r2Var)) != null) {
                    n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
                    n13.r a19 = n13.r.a(4106);
                    a19.f334120d.f334139a = 6;
                    ((dk5.b0) b0Var).Bi(context, a17, a19);
                    return true;
                }
            }
            intent.putExtra("scene_from", 1);
            o72.r3.c(intent, r2Var);
            if (r2Var != null && r2Var.field_favProto != null && !com.tencent.mm.sdk.platformtools.t8.K0(r2Var.field_xml) && r2Var.field_type == 18) {
                mc0.k kVar = (mc0.k) i95.n0.c(mc0.k.class);
                r45.bq0 bq0Var = r2Var.field_favProto;
                intent.putExtra("Retr_Msg_content", ((zs3.z) kVar).Zi(bq0Var.f370972q, bq0Var.f370974s, bq0Var));
                intent.putExtra("content_type_forward_to_wework", 13);
            }
            j45.l.v(context, ".ui.transmit.SelectConversationUI", intent, 4106);
            return true;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Select_Conv_Type", 3);
        intent2.putExtra("scene_from", 1);
        intent2.putExtra("mutil_select_is_ret", true);
        if (cVar.l() == 1) {
            o72.r2 r2Var2 = (o72.r2) ((java.util.LinkedList) cVar.k(false)).get(0);
            intent2.putExtra("select_fav_local_id", r2Var2.field_localId);
            if (r2Var2.B1) {
                intent2.putExtra("select_fav_fake_local_id", r2Var2.D1);
            }
            if (c(r2Var2.field_type) != -1) {
                intent2.putExtra("Retr_Msg_Type", c(r2Var2.field_type));
            }
            ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(r2Var2.field_localId));
            if (((java.util.LinkedList) cVar.k(false)).get(0) != null && ((o72.r2) ((java.util.LinkedList) cVar.k(false)).get(0)).field_type == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteMenuHelper", "[shareFavToFriRequest] select first is FAV_ITEM_TYPE_VOICE");
                db5.e1.T(context, context.getString(com.tencent.mm.R.string.cck));
                return false;
            }
            if (i3Var.c(r2Var2) && (a18 = i3Var.a(r2Var2)) != null) {
                n13.b0 b0Var2 = (n13.b0) i95.n0.c(n13.b0.class);
                n13.r a27 = n13.r.a(4105);
                a27.f334120d.f334139a = 6;
                ((dk5.b0) b0Var2).Bi(context, a18, a27);
                return true;
            }
        } else {
            intent2.putExtra("Retr_Msg_Type", 17);
            o72.b3 b3Var = new o72.b3();
            int i18 = 0;
            for (o72.r2 r2Var3 : cVar.k(false)) {
                if (!b3Var.c(r2Var3, true, true)) {
                    i18++;
                    if (r2Var3 != null) {
                        ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(r2Var3.field_localId));
                    }
                }
            }
            intent2.putExtra("select_count", i18);
        }
        o72.r3.c(intent2, r2Var);
        j45.l.v(context, ".ui.transmit.SelectConversationUI", intent2, 4105);
        return true;
    }

    public static boolean h(android.content.Context context, int i17, java.util.List list) {
        co.a a17;
        co.a a18;
        com.tencent.mm.plugin.fav.ui.i3 i3Var = com.tencent.mm.plugin.fav.ui.i3.f101160a;
        if (i17 != 4105) {
            if (i17 != 4106) {
                return false;
            }
            o72.r2 r2Var = (o72.r2) list.get(0);
            if (i3Var.c(r2Var) && (a17 = i3Var.a(r2Var)) != null) {
                n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
                n13.r a19 = n13.r.a(4106);
                a19.f334120d.f334139a = 6;
                ((dk5.b0) b0Var).Bi(context, a17, a19);
                return true;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("scene_from", 1);
            intent.putExtra("mutil_select_is_ret", true);
            if (r2Var != null) {
                intent.putExtra("select_fav_local_id", r2Var.field_localId);
                if (r2Var.B1) {
                    intent.putExtra("select_fav_fake_local_id", r2Var.D1);
                }
                if (r2Var.field_type == 19) {
                    intent.putExtra("appbrand_params", com.tencent.mm.plugin.fav.ui.b0.c(r2Var));
                }
                ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(r2Var.field_localId));
            }
            if (r2Var != null && c(r2Var.field_type) != -1) {
                intent.putExtra("Retr_Msg_Type", c(r2Var.field_type));
            }
            intent.putExtra("scene_from", 1);
            j45.l.v(context, ".ui.transmit.SelectConversationUI", intent, 4106);
            return true;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Select_Conv_Type", 3);
        intent2.putExtra("scene_from", 1);
        intent2.putExtra("mutil_select_is_ret", true);
        if (list.size() == 1) {
            o72.r2 r2Var2 = (o72.r2) list.get(0);
            intent2.putExtra("select_fav_local_id", r2Var2.field_localId);
            if (r2Var2.B1) {
                intent2.putExtra("select_fav_fake_local_id", r2Var2.D1);
            }
            if (c(r2Var2.field_type) != -1) {
                intent2.putExtra("Retr_Msg_Type", c(r2Var2.field_type));
            }
            ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(r2Var2.field_localId));
            if (list.get(0) != null && ((o72.r2) list.get(0)).field_type == 3) {
                db5.e1.T(context, context.getString(com.tencent.mm.R.string.cck));
                return false;
            }
            if (i3Var.c(r2Var2) && (a18 = i3Var.a(r2Var2)) != null) {
                n13.b0 b0Var2 = (n13.b0) i95.n0.c(n13.b0.class);
                n13.r a27 = n13.r.a(4105);
                a27.f334120d.f334139a = 6;
                ((dk5.b0) b0Var2).Bi(context, a18, a27);
                return true;
            }
        } else {
            intent2.putExtra("Retr_Msg_Type", 17);
            o72.b3 b3Var = new o72.b3();
            java.util.Iterator it = list.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                o72.r2 r2Var3 = (o72.r2) it.next();
                if (!b3Var.c(r2Var3, false, false)) {
                    i18++;
                    if (r2Var3 != null) {
                        ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(r2Var3.field_localId));
                    }
                }
            }
            intent2.putExtra("select_count", i18);
        }
        j45.l.v(context, ".ui.transmit.SelectConversationUI", intent2, 4105);
        return true;
    }
}
