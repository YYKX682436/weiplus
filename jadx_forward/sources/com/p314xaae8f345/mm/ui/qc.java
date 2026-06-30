package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public abstract class qc {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f291082a;

    public static boolean a(android.app.Activity activity) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b c17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b.c();
        if (c17 != null) {
            c17.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMErrorProcessor", "alpha download in silence.");
            return true;
        }
        if (i95.n0.c(mi3.f.class) == null) {
            return false;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2038x6f2fbec7.C17257xe7367bc8) ((mi3.f) i95.n0.c(mi3.f.class))).getClass();
        int i17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9.f273855o;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()).commit();
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(34);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 50L, 1L, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater", "updater silence");
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9 c20973x553f78a9 = new com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9(activity);
        c20973x553f78a9.c();
        c20973x553f78a9.f273860h = true;
        c20973x553f78a9.f(2);
        return true;
    }

    public static boolean b(android.app.Activity activity, int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMErrorProcessor", "updateRequired [%d,%d] current version:%d  channel:%d updateMode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(o45.wf.f424562g), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273971a));
        if (i17 != 4) {
            return false;
        }
        if (i18 != -17) {
            if (i18 != -16 || i95.n0.c(mi3.f.class) == null) {
                return false;
            }
            mi3.e Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p2038x6f2fbec7.C17257xe7367bc8) ((mi3.f) i95.n0.c(mi3.f.class))).Ai(activity, com.p314xaae8f345.mm.R.C30867xcad56011.k3j, new com.p314xaae8f345.mm.ui.nc(activity), false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 36L, 1L, true);
            ((com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9) Ai).f(1);
            return true;
        }
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0).getLong("recomended_update_ignore", -1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMErrorProcessor", "updateRequired last:%d  now:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(j17)));
        if ((j17 != -1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(j17) < 86400) || (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273971a & 2) != 0) {
            return true;
        }
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SilentDownloadApkAtWiFi");
        boolean z17 = ((((java.lang.Integer) c01.d9.b().p().l(7, 0)).intValue() & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) == 0) && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(d17, 0) == 0);
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273971a & 1) != 0) {
            z17 = false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(d17, 0);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 40L, 1L, true);
            return a(activity);
        }
        if (i95.n0.c(mi3.f.class) == null) {
            return false;
        }
        mi3.e Ai2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2038x6f2fbec7.C17257xe7367bc8) ((mi3.f) i95.n0.c(mi3.f.class))).Ai(activity, com.p314xaae8f345.mm.R.C30867xcad56011.k3k, new com.p314xaae8f345.mm.ui.cc(intent, activity), true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 38L, 1L, true);
        ((com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9) Ai2).f(2);
        return true;
    }
}
