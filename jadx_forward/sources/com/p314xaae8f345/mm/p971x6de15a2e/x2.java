package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public final class x2 {

    /* renamed from: j, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p971x6de15a2e.x2[] f153702j = {null};

    /* renamed from: k, reason: collision with root package name */
    public static boolean f153703k = false;

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.List f153704l = new java.util.ArrayList(8);

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.y2 f153705a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.a3 f153706b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f153707c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f153708d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f153709e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.g1[] f153710f = {null};

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.q2 f153711g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.m2 f153712h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.l2 f153713i;

    public static void a() {
        if (!f153703k) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) j();
            long j17 = o4Var.getLong("wakeup_alarm_last_tick", 0L);
            int i17 = o4Var.getInt("wakeup_alarm_last_cnt", 0);
            if (j17 == 0 || j17 > java.lang.System.currentTimeMillis()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPushCore", "dealWithOnCreate, invalid time, thisCnt:%d", java.lang.Integer.valueOf(i17));
                o4Var.putLong("wakeup_alarm_last_tick", java.lang.System.currentTimeMillis()).commit();
                o4Var.putInt("wakeup_alarm_last_cnt", 1).commit();
                return;
            } else if (java.lang.System.currentTimeMillis() - j17 > 86400000) {
                o4Var.putInt("wakeup_alarm_launch_cnt", i17).commit();
                o4Var.putLong("wakeup_alarm_last_tick", java.lang.System.currentTimeMillis()).commit();
                o4Var.putInt("wakeup_alarm_last_cnt", 1).commit();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPushCore", "dealWithOnCreate, statistics cycle expire, thisCnt:%d", java.lang.Integer.valueOf(i17));
            } else {
                int i18 = i17 + 1;
                o4Var.putInt("wakeup_alarm_last_cnt", i18).commit();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPushCore", "dealWithOnCreate, add up launch count to:%d", java.lang.Integer.valueOf(i18));
            }
        }
        f153703k = true;
    }

    public static boolean b(com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPushCore", "[+] MMAutoAuth was injected, run this scene now: %s, funcId: %s", m1Var, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        m1Var.mo807x6c193ac1(g1Var, new com.p314xaae8f345.mm.p971x6de15a2e.v2());
        return true;
    }

    public static com.p314xaae8f345.mm.p971x6de15a2e.g1 c() {
        com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var;
        com.p314xaae8f345.mm.p971x6de15a2e.x2 k17 = k();
        synchronized (k17.f153710f) {
            g1Var = k17.f153710f[0];
        }
        return g1Var;
    }

    public static android.content.Context d() {
        return k().f153707c;
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 e() {
        return k().f153708d;
    }

    public static com.p314xaae8f345.mm.p971x6de15a2e.m2 f() {
        return k().f153712h;
    }

    public static com.p314xaae8f345.mm.p971x6de15a2e.y2 g() {
        return k().f153705a;
    }

    public static com.p314xaae8f345.mm.p971x6de15a2e.q2 h() {
        return k().f153711g;
    }

    public static com.p314xaae8f345.mm.p971x6de15a2e.a3 i() {
        return k().f153706b;
    }

    public static android.content.SharedPreferences j() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("notify_key_pref_no_account");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.V("notify_key_pref_no_account")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.Z(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("notify_key_pref_no_account", 4), M);
        }
        java.lang.String string = M.getString("login_weixin_username", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            string = c01.b9.f118602c.a("login_weixin_username", "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("notify_key_pref_no_account");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.V("notify_key_pref_no_account")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.Z(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("notify_key_pref_no_account", 4), M2);
                }
                M2.getClass();
                M2.putString("login_weixin_username", string);
            }
        }
        if (string != null) {
            string = string.replace("[\\/\\\\]", "#").trim();
        }
        java.lang.String str = "notify_key_pref" + string;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.V(str)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.Z(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(str, 4), M3);
        }
        return M3;
    }

    public static com.p314xaae8f345.mm.p971x6de15a2e.x2 k() {
        com.p314xaae8f345.mm.p971x6de15a2e.x2[] x2VarArr = f153702j;
        if (x2VarArr[0] == null) {
            synchronized (x2VarArr) {
                if (x2VarArr[0] == null) {
                    x2VarArr[0] = new com.p314xaae8f345.mm.p971x6de15a2e.x2();
                }
            }
        }
        return x2VarArr[0];
    }

    public static void l(android.content.Context context, boolean z17, java.lang.String str, java.lang.String str2) {
        java.util.Iterator it = ((java.util.ArrayList) k().f153709e).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p971x6de15a2e.w2) it.next()).a(context, z17, str, str2);
        }
    }

    public static void m(com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p971x6de15a2e.x2 k17 = k();
        synchronized (k17.f153710f) {
            k17.f153710f[0] = g1Var;
            java.util.List list = f153704l;
            arrayList = new java.util.ArrayList(list);
            ((java.util.ArrayList) list).clear();
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b(g1Var, (com.p314xaae8f345.mm.p944x882e457a.m1) it.next());
        }
    }
}
