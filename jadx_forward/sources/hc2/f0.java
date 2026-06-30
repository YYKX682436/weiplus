package hc2;

/* loaded from: classes2.dex */
public abstract class f0 {
    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, boolean z17, int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Oc).mo141623x754a37bb()).r()).intValue();
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_COMMENT_EMOTICON_SWITCH_INT_SYNC, 0);
        if (intValue == -1) {
            intValue = r17;
        }
        if (z17) {
            return intValue == 1 && (32768 & i17) > 0;
        }
        boolean m59338xecb5e178 = c14994x9b99c079 != null ? c14994x9b99c079.m59338xecb5e178() : false;
        if (intValue != 1 || m59338xecb5e178) {
            return false;
        }
        return (((c14994x9b99c079 == null || (feedObject = c14994x9b99c079.getFeedObject()) == null) ? 0 : feedObject.m76810x98d986d1()) & 1024) == 0;
    }

    public static final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, boolean z17, int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Rc).mo141623x754a37bb()).r()).intValue();
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_COMMENT_IMAGE_SWITCH_INT_SYNC, 0);
        if (intValue == -1) {
            intValue = r17;
        }
        if (z17) {
            return intValue == 1 && (i17 & 16384) > 0;
        }
        boolean m59338xecb5e178 = c14994x9b99c079 != null ? c14994x9b99c079.m59338xecb5e178() : false;
        if (intValue != 1 || m59338xecb5e178) {
            return false;
        }
        return (((c14994x9b99c079 == null || (feedObject = c14994x9b99c079.getFeedObject()) == null || (m76806xdef68064 = feedObject.m76806xdef68064()) == null) ? 0L : m76806xdef68064.m75942xfb822ef2(30)) & 4096) == 0;
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, android.content.Intent intent, android.content.Context context) {
        r45.ze2 m76960xed29dd2b;
        r45.o21 m76947x84f51d21;
        java.util.LinkedList<r45.cw2> m76976x275e039f;
        r45.cw2 cw2Var;
        java.lang.String m75945x2fec8307;
        r45.zw0 m76943xbb439a28;
        r45.e21 e21Var;
        java.lang.String str;
        java.lang.String m76175x6d346f39;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14994x9b99c079, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int mediaType = c14994x9b99c079.getMediaType();
        if (mediaType == 2 || mediaType == 4) {
            intent.putExtra("postType", c14994x9b99c079.getMediaType());
        } else {
            intent.removeExtra("postType");
        }
        intent.putExtra("isLongVideoPost", c14994x9b99c079.m59314x4d5c4d55());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        if (m76802x2dd01666 != null && (m76943xbb439a28 = m76802x2dd01666.m76943xbb439a28()) != null && (e21Var = (r45.e21) m76943xbb439a28.m75936x14adae67(1)) != null) {
            intent.putExtra("saveActivity", true);
            intent.putExtra("key_activity_type", e21Var.m75939xb282bd08(14) == 0 ? 101 : 102);
            java.lang.String str2 = "";
            if (e21Var.m75939xb282bd08(14) == 0) {
                str = xy2.c.e(context);
            } else {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
                if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                    str = "";
                }
            }
            intent.putExtra("key_user_name", str);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
            intent.putExtra("key_nick_name", c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76184x8010e5e4() : null);
            intent.putExtra("key_cover_url", e21Var.m75945x2fec8307(5));
            intent.putExtra("key_activity_display_mask", e21Var.m75942xfb822ef2(17));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
            if (c19782x23db1cfa3 != null && (m76175x6d346f39 = c19782x23db1cfa3.m76175x6d346f39()) != null) {
                str2 = m76175x6d346f39;
            }
            intent.putExtra("key_avatar_url", str2);
            intent.putExtra("key_topic_id", e21Var.m75942xfb822ef2(0));
            intent.putExtra("key_activity_name", e21Var.m75945x2fec8307(2));
            intent.putExtra("key_activity_desc", e21Var.m75945x2fec8307(3));
            intent.putExtra("key_activity_end_time", e21Var.m75942xfb822ef2(13));
            intent.putExtra("key_activity_src_type", "key_scene_from_profile");
        }
        intent.putExtra("saveDesc", c14994x9b99c079.m59226x730bcac6());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        if (m76802x2dd016662 != null && (m76976x275e039f = m76802x2dd016662.m76976x275e039f()) != null && (cw2Var = (r45.cw2) kz5.n0.Z(m76976x275e039f)) != null && (m75945x2fec8307 = cw2Var.m75945x2fec8307(0)) != null) {
            if (m75945x2fec8307.length() > 0) {
                intent.putExtra("saveShortTitle", m75945x2fec8307);
            }
        }
        intent.putExtra("ORIGIN_POST_FLAG", c14994x9b99c079.getFeedObject().m76830x805d0e64() ? 1L : 0L);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        if ((m76802x2dd016663 != null ? m76802x2dd016663.m76960xed29dd2b() : null) == null) {
            intent.putExtra("saveLocation", false);
        } else {
            intent.putExtra("saveLocation", true);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016664 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
            if (m76802x2dd016664 != null && (m76960xed29dd2b = m76802x2dd016664.m76960xed29dd2b()) != null) {
                intent.putExtra("get_poi_name", m76960xed29dd2b.m75945x2fec8307(3));
                intent.putExtra("get_city", m76960xed29dd2b.m75945x2fec8307(2));
                intent.putExtra("get_lat", m76960xed29dd2b.m75938x746dc8a6(1));
                intent.putExtra("get_lng", m76960xed29dd2b.m75938x746dc8a6(0));
                intent.putExtra("get_poi_address", m76960xed29dd2b.m75945x2fec8307(4));
                intent.putExtra("get_poi_classify_id", m76960xed29dd2b.m75945x2fec8307(5));
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016665 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        if (m76802x2dd016665 == null || (m76947x84f51d21 = m76802x2dd016665.m76947x84f51d21()) == null) {
            return;
        }
        intent.putExtra("saveExtendReadingLink", m76947x84f51d21.m75945x2fec8307(0));
        intent.putExtra("saveExtendReadingTitle", m76947x84f51d21.m75945x2fec8307(1));
        intent.putExtra("saveExtendReadingStyle", m76947x84f51d21.m75939xb282bd08(3));
    }

    public static final java.util.List d(java.util.List list, java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (clazz.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final r45.xk e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        java.util.LinkedList<r45.zv0> m76161xc7f988ba;
        java.lang.Object obj;
        r45.fw0 fw0Var;
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14994x9b99c079, "<this>");
        r45.nw1 m59258xd0557130 = c14994x9b99c079.m59258xd0557130();
        if (!pm0.v.z(m59258xd0557130 != null ? m59258xd0557130.m75939xb282bd08(37) : 0, 64) || (m76760x76845fea = c14994x9b99c079.getFeedObject().m76760x76845fea()) == null || (m76161xc7f988ba = m76760x76845fea.m76161xc7f988ba()) == null) {
            return null;
        }
        java.util.Iterator<T> it = m76161xc7f988ba.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.zv0) obj).m75939xb282bd08(0) == 4) {
                break;
            }
        }
        r45.zv0 zv0Var = (r45.zv0) obj;
        if (zv0Var == null || (fw0Var = (r45.fw0) zv0Var.m75936x14adae67(4)) == null || (m75941xfb821914 = fw0Var.m75941xfb821914(0)) == null) {
            return null;
        }
        return (r45.xk) kz5.n0.Z(m75941xfb821914);
    }

    public static final boolean f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14994x9b99c079, "<this>");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = c14994x9b99c079.m59240x7c94657b();
        jz5.g gVar = hc2.o0.f361869a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m59240x7c94657b, "<this>");
        if (!((m59240x7c94657b.m76810x98d986d1() & 8) == 0)) {
            return false;
        }
        r45.ls2 ls2Var = (r45.ls2) g92.b.f351302e.k2().d().m75936x14adae67(26);
        if (ls2Var != null && ls2Var.m75939xb282bd08(0) == 1) {
            return false;
        }
        if (c14994x9b99c079.m59314x4d5c4d55()) {
            return true;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        r45.el2 m76948xfa25bce2 = m76802x2dd01666 != null ? m76802x2dd01666.m76948xfa25bce2() : null;
        boolean z17 = m76948xfa25bce2 != null && m76948xfa25bce2.m75939xb282bd08(2) == 1;
        boolean z18 = (m76948xfa25bce2 != null ? (r45.zi2) m76948xfa25bce2.m75936x14adae67(0) : null) != null;
        java.lang.String m75945x2fec8307 = m76948xfa25bce2 != null ? m76948xfa25bce2.m75945x2fec8307(1) : null;
        boolean z19 = !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0);
        int mediaType = c14994x9b99c079.getMediaType();
        if (mediaType != 2) {
            if (mediaType != 4) {
                return false;
            }
            if (m76948xfa25bce2 != null && !z17) {
                return false;
            }
        } else if (!z17 || !z18 || !z19) {
            return false;
        }
        return true;
    }

    public static final boolean g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, boolean z17) {
        return z17 ? i(c14994x9b99c079) || h(c14994x9b99c079) : i(c14994x9b99c079);
    }

    public static final boolean h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        java.util.LinkedList<r45.mb4> m59264x7efe73ec;
        r45.mb4 mb4Var;
        if (c14994x9b99c079 != null && (m59264x7efe73ec = c14994x9b99c079.m59264x7efe73ec()) != null && (mb4Var = (r45.mb4) kz5.n0.Z(m59264x7efe73ec)) != null) {
            float m75938x746dc8a6 = mb4Var.m75938x746dc8a6(4);
            float m75938x746dc8a62 = mb4Var.m75938x746dc8a6(5);
            if (m75938x746dc8a6 > m75938x746dc8a62) {
                return false;
            }
            r45.gn2 gn2Var = (r45.gn2) mb4Var.m75936x14adae67(45);
            if (gn2Var != null) {
                if (!(!gn2Var.m75933x41a8a7f2(2) && gn2Var.m75933x41a8a7f2(1))) {
                    gn2Var = null;
                }
                if (gn2Var != null) {
                    m75938x746dc8a62 = a06.d.b(m75938x746dc8a62 * (gn2Var.m75938x746dc8a6(4) - gn2Var.m75938x746dc8a6(3)));
                }
            }
            if (m75938x746dc8a6 > m75938x746dc8a62) {
                return true;
            }
        }
        return false;
    }

    public static final boolean i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        java.util.LinkedList<r45.mb4> m59264x7efe73ec;
        r45.mb4 mb4Var;
        return (c14994x9b99c079 == null || (m59264x7efe73ec = c14994x9b99c079.m59264x7efe73ec()) == null || (mb4Var = (r45.mb4) kz5.n0.Z(m59264x7efe73ec)) == null || mb4Var.m75938x746dc8a6(4) <= mb4Var.m75938x746dc8a6(5)) ? false : true;
    }

    public static final boolean j(android.app.Activity activity) {
        if (activity == null) {
            return false;
        }
        cq.k1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209569y6).mo141623x754a37bb()).r()).booleanValue()) {
            boolean z17 = com.p314xaae8f345.mm.ui.fj.b(activity) || com.p314xaae8f345.mm.ui.bk.z(activity.getTaskId());
            if (!((com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A()) && com.p314xaae8f345.mm.ui.bk.v0() && (com.p314xaae8f345.mm.ui.bk.P(activity) || com.p314xaae8f345.mm.ui.bk.N(activity.getTaskId()) || (com.p314xaae8f345.mm.ui.bk.O(activity.getContentResolver()) && !activity.isInMultiWindowMode()))) || z17) {
                return false;
            }
        } else {
            java.lang.System.nanoTime();
            boolean z18 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z18) {
                return false;
            }
        }
        return true;
    }

    public static final boolean k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        java.util.LinkedList<r45.mb4> m59264x7efe73ec;
        r45.mb4 mb4Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        if (g(c14994x9b99c079, !((c14994x9b99c079 == null || (feedObject = c14994x9b99c079.getFeedObject()) == null) ? false : hc2.o0.D(feedObject, true)))) {
            return !(c14994x9b99c079 != null && (m59264x7efe73ec = c14994x9b99c079.m59264x7efe73ec()) != null && (mb4Var = (r45.mb4) kz5.n0.Z(m59264x7efe73ec)) != null && hc2.l0.b(mb4Var) == 1);
        }
        return false;
    }

    public static final boolean l(android.app.Activity activity) {
        if (activity == null) {
            return false;
        }
        return ((com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A()) && ((com.p314xaae8f345.mm.ui.bk.P(activity) || com.p314xaae8f345.mm.ui.bk.N(activity.getTaskId()) || (com.p314xaae8f345.mm.ui.bk.O(activity.getContentResolver()) && !activity.isInMultiWindowMode())) || (com.p314xaae8f345.mm.ui.fj.b(activity) || com.p314xaae8f345.mm.ui.bk.z(activity.getTaskId())))) ? false : true;
    }
}
