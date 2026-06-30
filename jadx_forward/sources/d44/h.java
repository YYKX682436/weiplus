package d44;

/* loaded from: classes4.dex */
public abstract class h {
    public static vd2.h5 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        if (((zy2.b6) i95.n0.c(zy2.b6.class)) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
            return null;
        }
        vd2.t3 t3Var = vd2.t3.f517454a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        return t3Var;
    }

    public static void b(android.content.Context context, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("promptResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FinderLivingRequest", "promptResult, errCode=" + i17);
        } catch (java.lang.Throwable unused) {
        }
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("promptResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
            return;
        }
        if (i17 == 0) {
            db5.t7.h(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j7_));
        } else if (i17 == -200045) {
            db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j78));
        } else if (i17 == -200023) {
            db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j77));
        } else {
            db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j79));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("promptResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.String str3, d44.b bVar) {
        vd2.h5 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestLivingNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
            a17 = a();
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderLivingRequest", "requestLivingNoticeState is failed: sns id = " + str);
        }
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderLivingRequest", "the IFinderUtilApi is null in requestLivingNoticeState, is there something wrong in wechat??!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestLivingNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        } else {
            ((vd2.t3) a17).c(str2, str3, new d44.f(str, 1, bVar), new d44.e(str, 1, bVar));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestLivingNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.String str3, d44.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestLivingState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderLivingRequest", "requestLivingState is failed: sns id = " + str);
        }
        if (a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderLivingRequest", "the IFinderUtilApi is null in requestLivingState, is there something wrong in wechat??!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestLivingState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
            return;
        }
        d44.f fVar = new d44.f(str, 3, bVar);
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str3);
        if (E1 != 0) {
            i95.m c17 = i95.n0.c(s40.w0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            s40.w0.u9((s40.w0) c17, E1, false, null, new vd2.p3(fVar), 0, null, null, null, 246, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderLivingRequest", "is the liveId not number in requestLivingState????, liveId=" + str3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestLivingState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
    }

    public static void e(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, java.lang.String str5, d44.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var;
        vd2.h5 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showLivingRoom", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
            g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(1837, 6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FinderLivingRequest", "showLivingRoom, liveId=" + str2 + ", username=" + str + ", snsId=" + str5);
            a17 = a();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderLivingRequest", "showLivingRoom is failed! sns id = " + str5 + ", exp=" + th6.toString());
            if (bVar != null) {
                try {
                    bVar.a(str5, 4, -1, null);
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderLivingRequest", "the IFinderUtilApi is null in showLivingRoom, is there something wrong in wechat??!!, snsId=" + str5);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLivingRoom", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
            return;
        }
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str2);
        if (E1 != 0) {
            ((vd2.t3) a17).m(context, str, E1, str3, str4, map, new d44.g(str5, 4, bVar), new d44.e(str5, 4, bVar));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderLivingRequest", "is the liveId not number in showLivingRoom????, snsId=" + str5 + ", livingId=" + E1);
            g0Var.A(1837, 5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLivingRoom", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.String str3, d44.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderLivingRequest", "subscribeLivingNotice is failed: sns id = " + str);
        }
        if (a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderLivingRequest", "the IFinderUtilApi is null in subscribeLivingNotice, is there something wrong in wechat??!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
            return;
        }
        d44.g gVar = new d44.g(str, 2, bVar);
        d44.e eVar = new d44.e(str, 2, bVar);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && str2 != null && str3 != null) {
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ri(str2, str3, 1, null, 1).l().K(new vd2.s3(gVar, eVar));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        }
        eVar.a(-1000);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
    }
}
