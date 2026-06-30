package zy2;

/* loaded from: classes8.dex */
public interface b6 extends i95.m {
    static /* synthetic */ void F1(zy2.b6 b6Var, android.app.Activity activity, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j18, android.graphics.Bitmap bitmap, android.graphics.Rect rect, int i17, long j19, java.lang.String str5, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFinderFeedItemToMultiTask");
        }
        ((c61.l7) b6Var).Di(activity, j17, str, str2, str3, str4, j18, (i18 & 128) != 0 ? null : bitmap, (i18 & 256) != 0 ? null : rect, (i18 & 512) != 0 ? 22 : i17, (i18 & 1024) != 0 ? 0L : j19, str5);
    }

    static boolean Mh(zy2.b6 b6Var, android.app.Activity activity, java.lang.String str, java.lang.String str2, zy2.i5 i5Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkHasRealName");
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        if ((i17 & 8) != 0) {
            i5Var = null;
        }
        ((c61.l7) b6Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int m75939xb282bd08 = g92.b.f351302e.k2().e().m75939xb282bd08(17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommonFeatureService", "check has realname userFlag %d", java.lang.Integer.valueOf(m75939xb282bd08));
        if ((m75939xb282bd08 & 1) == 0) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1279L, 35L, 1L);
        java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            string = java.lang.String.valueOf(str);
        }
        java.lang.String str3 = string;
        java.lang.String string2 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cno);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            string2 = java.lang.String.valueOf(str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p1.f183981a.a(activity, string2, str3, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3l), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new c61.g3(activity, i5Var), new c61.h3(i5Var), null);
        return false;
    }

    static void Pd(zy2.b6 b6Var, java.lang.String source, dm.y4 y4Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delAliasInfo");
        }
        if ((i17 & 2) != 0) {
            y4Var = null;
        }
        c61.l7 l7Var = (c61.l7) b6Var;
        l7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (y4Var == null || (y4Var instanceof so2.i4)) {
            ((ku5.t0) ku5.t0.f394148d).q(new c61.j4(y4Var, source, l7Var));
        }
    }

    static /* synthetic */ java.lang.Object Tf(zy2.b6 b6Var, long j17, java.lang.String str, int i17, long j18, zy2.g5 g5Var, zy2.ub ubVar, java.lang.String str2, boolean z17, com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i18, java.lang.Object obj) {
        if (obj == null) {
            return ((c61.l7) b6Var).Hj(j17, str, i17, j18, (i18 & 16) != 0 ? null : g5Var, ubVar, (i18 & 64) != 0 ? "" : str2, (i18 & 128) != 0 ? true : z17, (i18 & 256) != 0 ? null : e1Var, interfaceC29045xdcb5ca57);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateFinderVideoPlayer");
    }

    static /* synthetic */ java.lang.Object Wg(zy2.b6 b6Var, java.lang.String str, long j17, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiFinderUserPage");
        }
        if ((i18 & 2) != 0) {
            j17 = 0;
        }
        long j18 = j17;
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        return ((c61.l7) b6Var).Ui(str, j18, i17, interfaceC29045xdcb5ca57);
    }

    static void Yg(zy2.b6 b6Var, android.app.Activity activity, long j17, java.lang.String str, java.lang.String coverUrl, java.lang.String nickName, java.lang.String headUrl, long j18, int i17, long j19, java.lang.String str2, int i18, java.lang.Object obj) {
        boolean z17;
        android.view.Window window;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFinderFeedToMultiTask");
        }
        int i19 = (i18 & 128) != 0 ? 22 : i17;
        long j27 = (i18 & 256) != 0 ? 0L : j19;
        ((c61.l7) b6Var).getClass();
        java.lang.String title = str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headUrl, "headUrl");
        r45.yj4 yj4Var = new r45.yj4();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            title = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cw6, nickName);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(title);
        yj4Var.set(3, 0);
        java.util.LinkedList m75941xfb821914 = yj4Var.m75941xfb821914(1);
        if (m75941xfb821914 != null) {
            m75941xfb821914.clear();
        }
        java.util.LinkedList m75941xfb8219142 = yj4Var.m75941xfb821914(6);
        if (m75941xfb8219142 != null) {
            m75941xfb8219142.clear();
        }
        yj4Var.set(9, java.lang.Long.valueOf(j17));
        yj4Var.set(10, coverUrl);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(j17);
        if (h17 != null) {
            java.util.LinkedList m75941xfb8219143 = yj4Var.m75941xfb821914(6);
            if (m75941xfb8219143 != null) {
                m75941xfb8219143.add(h17.getFeedObject());
            }
            r45.hl2 m76756xf0f8a852 = h17.getFeedObject().m76756xf0f8a852();
            yj4Var.set(7, java.lang.Long.valueOf(m76756xf0f8a852 != null ? m76756xf0f8a852.m75942xfb822ef2(0) : c01.id.c()));
            h17.getFeedObject().m76835x9191e3f7();
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h(context, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.i(activity, null, (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView()));
        hVar.y(i19, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).nk());
        if (j27 == 0) {
            j27 = c01.id.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = hVar.f381610a;
        if (c16601x7ed0e40c != null) {
            c16601x7ed0e40c.f66791xc8a07680 = str2 == null || str2.length() == 0 ? pm0.v.u(j17) : str2;
            c16601x7ed0e40c.v0().set(1, title);
            c16601x7ed0e40c.v0().set(5, headUrl);
            c16601x7ed0e40c.f66790x225a93cf = yj4Var.mo14344x5f01b1f6();
            z17 = false;
            c16601x7ed0e40c.v0().set(0, nickName);
            c16601x7ed0e40c.v0().set(3, java.lang.Integer.valueOf((int) j18));
            c16601x7ed0e40c.f66789xac3be4e = j27;
        } else {
            z17 = false;
        }
        hVar.l(null, z17);
        int Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Di(pm0.v.u(j17), 22);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedid", pm0.v.u(j17));
        jSONObject.put("feed_index", Di + 1);
        jSONObject.put("import_time", j27);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var2, null, "float_feed_import", 1, jSONObject, false, null, 48, null);
    }

    static java.lang.Object b9(zy2.b6 b6Var, android.content.Context context, r45.br2 br2Var, yz5.l lVar, java.lang.String str, boolean z17, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareProductToConversation");
        }
        yz5.l lVar2 = (i17 & 4) != 0 ? null : lVar;
        java.lang.String str2 = (i17 & 8) != 0 ? "" : str;
        boolean z19 = (i17 & 16) != 0 ? true : z17;
        boolean z27 = (i17 & 32) != 0 ? true : z18;
        ((c61.l7) b6Var).getClass();
        java.lang.Object z28 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.z(context, br2Var, lVar2, str2, z19, z27, interfaceC29045xdcb5ca57);
        return z28 == pz5.a.f440719d ? z28 : jz5.f0.f384359a;
    }

    static float h3(zy2.b6 b6Var, java.lang.String source, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMaxMediaHWRadio");
        }
        ((c61.l7) b6Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        return bu2.z.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(finderObject, 0).m59264x7efe73ec(), "FinderFeedFullConvert", false, 2, null);
    }

    static /* synthetic */ java.lang.Object h7(zy2.b6 b6Var, android.content.Context context, r45.zc5 zc5Var, long j17, long j18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if (obj == null) {
            return ((c61.l7) b6Var).Ej(context, zc5Var, (i17 & 4) != 0 ? 0L : j17, (i17 & 8) != 0 ? 0L : j18, (i17 & 16) != 0 ? null : gVar, (i17 & 32) != 0 ? null : str, interfaceC29045xdcb5ca57);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finderPayFullWholeProcess");
    }

    static /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.i ji(zy2.b6 b6Var, java.lang.String str, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, r45.qt2 qt2Var, int i18, long j18, boolean z17, java.lang.Integer num, java.lang.Long l17, java.lang.String str2, yz5.p pVar, yz5.p pVar2, int i19, java.lang.Object obj) {
        if (obj == null) {
            return ((c61.l7) b6Var).Vi(str, (i19 & 2) != 0 ? 0L : j17, (i19 & 4) != 0 ? null : gVar, (i19 & 8) != 0 ? 0 : i17, qt2Var, (i19 & 32) != 0 ? 0 : i18, (i19 & 64) != 0 ? 0L : j18, (i19 & 128) != 0 ? false : z17, (i19 & 256) != 0 ? 0 : num, (i19 & 512) != 0 ? 0L : l17, (i19 & 1024) != 0 ? null : str2, pVar, pVar2);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiNetSceneFinderUserPage");
    }
}
