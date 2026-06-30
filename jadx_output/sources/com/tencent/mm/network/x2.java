package com.tencent.mm.network;

/* loaded from: classes12.dex */
public final class x2 {

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mm.network.x2[] f72169j = {null};

    /* renamed from: k, reason: collision with root package name */
    public static boolean f72170k = false;

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.List f72171l = new java.util.ArrayList(8);

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.network.y2 f72172a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.network.a3 f72173b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f72174c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f72175d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f72176e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.network.g1[] f72177f = {null};

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.network.q2 f72178g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.network.m2 f72179h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.network.l2 f72180i;

    public static void a() {
        if (!f72170k) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) j();
            long j17 = o4Var.getLong("wakeup_alarm_last_tick", 0L);
            int i17 = o4Var.getInt("wakeup_alarm_last_cnt", 0);
            if (j17 == 0 || j17 > java.lang.System.currentTimeMillis()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMPushCore", "dealWithOnCreate, invalid time, thisCnt:%d", java.lang.Integer.valueOf(i17));
                o4Var.putLong("wakeup_alarm_last_tick", java.lang.System.currentTimeMillis()).commit();
                o4Var.putInt("wakeup_alarm_last_cnt", 1).commit();
                return;
            } else if (java.lang.System.currentTimeMillis() - j17 > 86400000) {
                o4Var.putInt("wakeup_alarm_launch_cnt", i17).commit();
                o4Var.putLong("wakeup_alarm_last_tick", java.lang.System.currentTimeMillis()).commit();
                o4Var.putInt("wakeup_alarm_last_cnt", 1).commit();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMPushCore", "dealWithOnCreate, statistics cycle expire, thisCnt:%d", java.lang.Integer.valueOf(i17));
            } else {
                int i18 = i17 + 1;
                o4Var.putInt("wakeup_alarm_last_cnt", i18).commit();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMPushCore", "dealWithOnCreate, add up launch count to:%d", java.lang.Integer.valueOf(i18));
            }
        }
        f72170k = true;
    }

    public static boolean b(com.tencent.mm.network.g1 g1Var, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPushCore", "[+] MMAutoAuth was injected, run this scene now: %s, funcId: %s", m1Var, java.lang.Integer.valueOf(m1Var.getType()));
        m1Var.doScene(g1Var, new com.tencent.mm.network.v2());
        return true;
    }

    public static com.tencent.mm.network.g1 c() {
        com.tencent.mm.network.g1 g1Var;
        com.tencent.mm.network.x2 k17 = k();
        synchronized (k17.f72177f) {
            g1Var = k17.f72177f[0];
        }
        return g1Var;
    }

    public static android.content.Context d() {
        return k().f72174c;
    }

    public static com.tencent.mm.sdk.platformtools.n3 e() {
        return k().f72175d;
    }

    public static com.tencent.mm.network.m2 f() {
        return k().f72179h;
    }

    public static com.tencent.mm.network.y2 g() {
        return k().f72172a;
    }

    public static com.tencent.mm.network.q2 h() {
        return k().f72178g;
    }

    public static com.tencent.mm.network.a3 i() {
        return k().f72173b;
    }

    public static android.content.SharedPreferences j() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("notify_key_pref_no_account");
        if (!com.tencent.mm.sdk.platformtools.o4.V("notify_key_pref_no_account")) {
            com.tencent.mm.sdk.platformtools.o4.Z(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("notify_key_pref_no_account", 4), M);
        }
        java.lang.String string = M.getString("login_weixin_username", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            string = c01.b9.f37069c.a("login_weixin_username", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("notify_key_pref_no_account");
                if (!com.tencent.mm.sdk.platformtools.o4.V("notify_key_pref_no_account")) {
                    com.tencent.mm.sdk.platformtools.o4.Z(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("notify_key_pref_no_account", 4), M2);
                }
                M2.getClass();
                M2.putString("login_weixin_username", string);
            }
        }
        if (string != null) {
            string = string.replace("[\\/\\\\]", "#").trim();
        }
        java.lang.String str = "notify_key_pref" + string;
        com.tencent.mm.sdk.platformtools.o4 M3 = com.tencent.mm.sdk.platformtools.o4.M(str);
        if (!com.tencent.mm.sdk.platformtools.o4.V(str)) {
            com.tencent.mm.sdk.platformtools.o4.Z(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(str, 4), M3);
        }
        return M3;
    }

    public static com.tencent.mm.network.x2 k() {
        com.tencent.mm.network.x2[] x2VarArr = f72169j;
        if (x2VarArr[0] == null) {
            synchronized (x2VarArr) {
                if (x2VarArr[0] == null) {
                    x2VarArr[0] = new com.tencent.mm.network.x2();
                }
            }
        }
        return x2VarArr[0];
    }

    public static void l(android.content.Context context, boolean z17, java.lang.String str, java.lang.String str2) {
        java.util.Iterator it = ((java.util.ArrayList) k().f72176e).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.network.w2) it.next()).a(context, z17, str, str2);
        }
    }

    public static void m(com.tencent.mm.network.g1 g1Var) {
        java.util.ArrayList arrayList;
        com.tencent.mm.network.x2 k17 = k();
        synchronized (k17.f72177f) {
            k17.f72177f[0] = g1Var;
            java.util.List list = f72171l;
            arrayList = new java.util.ArrayList(list);
            ((java.util.ArrayList) list).clear();
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b(g1Var, (com.tencent.mm.modelbase.m1) it.next());
        }
    }
}
