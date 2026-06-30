package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes8.dex */
public final class j5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.j5 f183816a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.j5();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f183817b;

    public void a(android.content.Context context, zy2.h9 h9Var) {
        if (h9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderOpenSdkApi", "openProfile params null");
            return;
        }
        if (h9Var.f558942j) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209170c8).mo141623x754a37bb()).r()).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderOpenSdkApi", "Xlab config(clicfg_finder_sscheme_open_feed) disable opening feed from URL scheme");
                return;
            }
        }
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderOpenSdkApi", "openFeed context null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderOpenSdkApi", "openFeed params:" + h9Var);
        boolean z17 = h9Var.f558940h == 0;
        int i17 = h9Var.f558936d;
        if (i17 <= 0) {
            i17 = 39;
        }
        int i18 = h9Var.f558939g;
        if (i18 <= 0) {
            i18 = 8;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_user", c01.z1.r());
        intent.putExtra("feed_encrypted_object_id", h9Var.f558933a);
        intent.putExtra("feed_object_nonceId", h9Var.f558934b);
        intent.putExtra("key_need_related_list", z17);
        intent.putExtra("key_comment_scene", 39);
        intent.putExtra("key_reuqest_scene", 0);
        intent.putExtra("key_open_feed_interaction_action_type", h9Var.f558941i);
        intent.putExtra("key_session_id", "");
        intent.putExtra("key_extra_info", "");
        java.lang.String Bj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, i18, i17, intent);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h9Var.f558935c) && !h9Var.f558942j) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21140, Bj, h9Var.f558935c, h9Var.f558933a, "");
        }
        intent.putExtra("report_scene", 0);
        if (!h9Var.f558942j) {
            intent.putExtra("tab_type", 9);
        }
        if (hz2.d.f367846a.b("entrance") != 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).kl(context);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).uk(context, intent, false);
            w04.l.INSTANCE.b(540999685);
        }
    }

    public void b(android.content.Context context, java.lang.String appid, java.lang.String feedId, java.lang.String nonceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderOpenSdkApi", "openLive context null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderOpenSdkApi", "openLive appid:" + appid + ", feedId:" + feedId + ", nonceId:" + nonceId);
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(11, 8, 65);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(new java.lang.String[0])) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = Gj == null ? "" : Gj;
            objArr[1] = appid;
            objArr[2] = "";
            objArr[3] = "";
            g0Var.d(21140, objArr);
        }
        ml2.r0 r0Var = (ml2.r0) ((c50.c1) i95.n0.c(c50.c1.class));
        r0Var.getClass();
        r0Var.H1 = appid;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(Gj);
        vd2.t3.k(vd2.t3.f517454a, null, "", feedId, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e5.f183655a, nonceId, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f5.f183695a, Gj, appid, null, 0L, null, null, null, 15872, null);
    }

    public void c(android.content.Context context, zy2.i9 i9Var) {
        if (i9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderOpenSdkApi", "openProfile params null");
            return;
        }
        int i17 = i9Var.f558956d;
        if (i17 <= 0) {
            i17 = 8;
        }
        int i18 = i9Var.f558955c;
        if (i18 <= 0) {
            i18 = 11;
        }
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderOpenSdkApi", "openProfile context null");
            return;
        }
        java.lang.String str = i9Var.f558953a;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderOpenSdkApi", "export_username is null");
            return;
        }
        java.lang.String str2 = i9Var.f558953a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderOpenSdkApi", "openProfile params:" + i9Var);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = f183817b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        f183817b = null;
        if (context2 != null) {
            f183817b = db5.e1.Q(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i5.f183797d);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        new db2.z3(str2, 17, "", 0, 0L, 24, null).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g5(context, i9Var, i17, i18));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Context r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.j5.d(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
