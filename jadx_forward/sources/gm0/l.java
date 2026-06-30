package gm0;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f354760d = true;

    /* renamed from: a, reason: collision with root package name */
    public int f354761a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f354762b = false;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.j3 f354763c;

    public static int a(gm0.l lVar) {
        int i17;
        synchronized (lVar) {
            if (!lVar.f354762b) {
                synchronized (lVar) {
                    iz5.a.d(null, lVar.f354763c);
                    lVar.f354761a = c(lVar.f354763c);
                    lVar.f354762b = true;
                }
            }
            i17 = lVar.f354761a;
        }
        return i17;
    }

    public static void b(gm0.l lVar, int i17) {
        synchronized (lVar) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreAccount", "Uin From %s To %s hash:%d thread:%d[%s] stack:%s", kk.v.a(lVar.f354761a), kk.v.a(i17), java.lang.Integer.valueOf(kk.m.b(i17, 100)), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Thread.currentThread().getName(), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            iz5.a.d(null, lVar.f354763c);
            e(lVar.f354763c, i17);
            lVar.f354761a = i17;
        }
    }

    public static int c(com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var) {
        if (j3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreAccount", "summer read detault uin exception sysCfg is null!");
            return 0;
        }
        java.lang.Integer num = (java.lang.Integer) j3Var.a(1);
        if (num == null) {
            if (j3Var.f276576c) {
                jx3.f.INSTANCE.mo68477x336bdfd8(148L, 40L, 1L, false);
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(d());
            if (valueOf != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreAccount", "summer read detault uin[%d], bakUin[%d] sysCfg.isOpenException[%b]", num, valueOf, java.lang.Boolean.valueOf(j3Var.f276576c));
                if (f354760d) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreAccount", "summer read detault uin exception backup uin[%d], stack[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                    jx3.f.INSTANCE.d(11911, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(valueOf)));
                    f354760d = false;
                }
                e(j3Var, valueOf.intValue());
                num = valueOf;
            }
        } else if (num.intValue() != 0) {
            int d17 = d();
            if (!num.equals(java.lang.Integer.valueOf(d17))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreAccount", "bak uin(%s) != uin(%s), reset it.", java.lang.Integer.valueOf(d17), num);
                e(j3Var, num.intValue());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreAccount", "summer getDefaultUin uin[%d]", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(num)));
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(num);
    }

    public static int d() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 4).getInt("default_uin", 0);
    }

    public static void e(com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var, int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreAccount", "setSysUin uin: %d, stack: %s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 4).edit().putInt("default_uin", i17).commit()) {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 150L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreAccount", "uin_sp save fail");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("system_config_prefs").A("default_uin", i17);
        j3Var.f(1, java.lang.Integer.valueOf(i17));
        j3Var.k();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("system_config_prefs");
        M.A("default_uin_timely", i17);
        M.G("has_uin_timely", true);
    }
}
