package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public final class k7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k7 f245900a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k7();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f245901b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f245902c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f245903d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f245904e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f245905f;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsWsFoldManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        f245901b = M;
        f245902c = 2;
        f245903d = 604800000L;
        f245904e = 604800000L;
        f245905f = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clickWsFriendDetails", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        if (e(snsInfo, "clickWsFriendDetails")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickWsFriendDetails", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return;
        }
        java.lang.String m70374x6bf53a6c = snsInfo.m70374x6bf53a6c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m70374x6bf53a6c);
        java.lang.String d17 = d(m70374x6bf53a6c);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = f245901b;
        java.lang.String string = o4Var2.getString(d17, "");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (android.text.TextUtils.isEmpty(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + m70374x6bf53a6c + ", first clickWsFriendDetails and record, now = " + currentTimeMillis);
            long j17 = snsInfo.f68891x29d1292e;
            java.lang.String h17 = ca4.z0.h(c01.id.c());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "[clickWsFriendDetails] report27795 feedId = " + snsInfo.f68891x29d1292e + ", userName = " + m70374x6bf53a6c + ", scene = " + i17 + ", session = " + h17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27795, 2, java.lang.Long.valueOf(snsInfo.f68891x29d1292e), m70374x6bf53a6c, h17, java.lang.Integer.valueOf(i17), 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            o4Var2.D(d17, m70374x6bf53a6c + ',' + currentTimeMillis + ",-1,0," + j17 + ",2");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + m70374x6bf53a6c + ", second clickWsFriendDetails and record, now = " + currentTimeMillis);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8.f245635g.a(string);
            if (currentTimeMillis - a17.b() > f245904e) {
                java.lang.String h18 = ca4.z0.h(c01.id.c());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[clickWsFriendDetails] report27795 feedId = ");
                str = d17;
                o4Var = o4Var2;
                sb6.append(snsInfo.f68891x29d1292e);
                sb6.append(", userName = ");
                sb6.append(m70374x6bf53a6c);
                sb6.append(", scene = ");
                sb6.append(i17);
                sb6.append(", session = ");
                sb6.append(h18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27795, 2, java.lang.Long.valueOf(snsInfo.f68891x29d1292e), m70374x6bf53a6c, h18, java.lang.Integer.valueOf(i17), 1);
            } else {
                str = d17;
                o4Var = o4Var2;
            }
            a17.c(currentTimeMillis);
            a17.e(snsInfo.f68891x29d1292e);
            a17.d(2);
            o4Var.D(str, a17.m70023x9616526c());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickWsFriendDetails", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doWsFriendInteractive", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        if (e(snsInfo, "doWsFriendInteractive")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWsFriendInteractive", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return;
        }
        java.lang.String m70374x6bf53a6c = snsInfo.m70374x6bf53a6c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m70374x6bf53a6c);
        java.lang.String d17 = d(m70374x6bf53a6c);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = f245901b;
        java.lang.String string = o4Var2.getString(d17, "");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (android.text.TextUtils.isEmpty(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + m70374x6bf53a6c + ", first doWsFriendInteractive and record, now = " + currentTimeMillis);
            long j17 = snsInfo.f68891x29d1292e;
            java.lang.String h17 = ca4.z0.h(c01.id.c());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "[doWsFriendInteractive] report27795 feedId = " + snsInfo.f68891x29d1292e + ", userName = " + m70374x6bf53a6c + ", scene = " + i17 + ", session = " + h17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27795, 3, java.lang.Long.valueOf(snsInfo.f68891x29d1292e), m70374x6bf53a6c, h17, java.lang.Integer.valueOf(i17), 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            o4Var2.D(d17, m70374x6bf53a6c + ',' + currentTimeMillis + ",-1,0," + j17 + ",3");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + m70374x6bf53a6c + ", second doWsFriendInteractive and record, now = " + currentTimeMillis);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8.f245635g.a(string);
            if (currentTimeMillis - a17.b() > f245904e) {
                java.lang.String h18 = ca4.z0.h(c01.id.c());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doWsFriendInteractive] report27795 feedId = ");
                str = d17;
                o4Var = o4Var2;
                sb6.append(snsInfo.f68891x29d1292e);
                sb6.append(", userName = ");
                sb6.append(m70374x6bf53a6c);
                sb6.append(", scene = ");
                sb6.append(i17);
                sb6.append(", session = ");
                sb6.append(h18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27795, 3, java.lang.Long.valueOf(snsInfo.f68891x29d1292e), m70374x6bf53a6c, h18, java.lang.Integer.valueOf(i17), 1);
            } else {
                str = d17;
                o4Var = o4Var2;
            }
            a17.c(currentTimeMillis);
            a17.e(snsInfo.f68891x29d1292e);
            a17.d(3);
            o4Var.D(str, a17.m70023x9616526c());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWsFriendInteractive", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8 b8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("forwardWsFriendContent", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        if (e(snsInfo, "forwardWsFriendContent")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("forwardWsFriendContent", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return;
        }
        java.lang.String m70374x6bf53a6c = snsInfo.m70374x6bf53a6c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m70374x6bf53a6c);
        java.lang.String d17 = d(m70374x6bf53a6c);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f245901b;
        java.lang.String string = o4Var.getString(d17, "");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (android.text.TextUtils.isEmpty(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + m70374x6bf53a6c + ", first forwardWsFriendContent and record, now = " + currentTimeMillis);
            long j17 = snsInfo.f68891x29d1292e;
            java.lang.String h17 = ca4.z0.h(c01.id.c());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "[doWsFriendInteractive] report27795 feedId = " + snsInfo.f68891x29d1292e + ", userName = " + m70374x6bf53a6c + ", scene = " + i17 + ", session = " + h17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27795, 4, java.lang.Long.valueOf(snsInfo.f68891x29d1292e), m70374x6bf53a6c, h17, java.lang.Integer.valueOf(i17), 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            o4Var.D(d17, m70374x6bf53a6c + ',' + currentTimeMillis + ",-1,0," + j17 + ",4");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8.f245635g.a(string);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + m70374x6bf53a6c + ", first forwardWsFriendContent and record, now = " + currentTimeMillis);
            if (currentTimeMillis - a17.b() > f245904e) {
                java.lang.String h18 = ca4.z0.h(c01.id.c());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "[doWsFriendInteractive] report27795 feedId = " + snsInfo.f68891x29d1292e + ", userName = " + m70374x6bf53a6c + ", scene = " + i17 + ", session = " + h18);
                b8Var = a17;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27795, 4, java.lang.Long.valueOf(snsInfo.f68891x29d1292e), m70374x6bf53a6c, h18, java.lang.Integer.valueOf(i17), 1);
            } else {
                b8Var = a17;
            }
            b8Var.c(currentTimeMillis);
            b8Var.e(snsInfo.f68891x29d1292e);
            b8Var.d(4);
            o4Var.D(d17, b8Var.m70023x9616526c());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("forwardWsFriendContent", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
    }

    public final java.lang.String d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("generateMMKVKey", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        java.lang.String str2 = "key_prefix_username_" + str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateMMKVKey", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        return str2;
    }

    public final boolean e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsInfoInValid", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsWsFoldManager", "[" + str + "] snsInfo empty and return function");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsInfoInValid", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return true;
        }
        if (!c17933xe8d1b226.m70432xa2b6bdbe()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsWsFoldManager", "[" + str + "] snsInfo is not wsFeedType and return function");
        }
        if (!android.text.TextUtils.isEmpty(c17933xe8d1b226.m70374x6bf53a6c())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsInfoInValid", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsWsFoldManager", "[" + str + "] userName empty and return function");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsInfoInValid", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        return true;
    }
}
