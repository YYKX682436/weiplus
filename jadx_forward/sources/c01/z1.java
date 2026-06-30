package c01;

/* loaded from: classes9.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static int f119111a = -1;

    public static boolean A() {
        gm0.j1.i();
        gm0.j1.u().c().i(true);
        return m() == 4;
    }

    public static boolean B() {
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_USER_STATUS_INT_SYNC, 0);
        boolean z17 = (r17 & 8) == 8;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigStorageLogic", "extUserStatus: " + r17 + ", isNeedRegisterPostVerify: " + z17);
        return z17;
    }

    public static boolean C() {
        return (n() & 8192) == 0;
    }

    public static boolean D() {
        return (n() & 65536) == 0;
    }

    public static boolean E() {
        return (n() & 524288) == 0;
    }

    public static boolean F() {
        com.p314xaae8f345.mm.p2621x8fb0427b.ja m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ka) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com");
        return m07 != null && m07.c();
    }

    public static boolean G() {
        return (o() & 32768) != 0;
    }

    public static java.lang.Boolean H() {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigStorageLogic", "mmcore has not ready");
            return java.lang.Boolean.FALSE;
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        gm0.j1.i();
        if (!java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1((java.lang.Boolean) gm0.j1.u().c().l(340241, null))).booleanValue() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return java.lang.Boolean.FALSE;
        }
        return (str.startsWith("+") ? com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.c(str) : "86") == "86" ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public static boolean I() {
        gm0.j1.i();
        gm0.j1.u().c().i(true);
        return m() == 1;
    }

    public static boolean J(java.lang.String str) {
        if (str != null && str.length() > 0) {
            java.lang.String r17 = r();
            if (r17 != null && r17.length() > 0) {
                return r17.equals(str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigStorageLogic", "get userinfo fail");
        }
        return false;
    }

    public static boolean K() {
        return (o() & 8192) != 0;
    }

    public static void L(int i17, java.util.Map map) {
        map.clear();
        gm0.j1.i();
        if (gm0.j1.u() != null) {
            gm0.j1.i();
            if (gm0.j1.u().c() == null) {
                return;
            }
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(i17, null);
            if (str == null) {
                return;
            }
            java.lang.String[] split = str.split("\n");
            if (split.length % 2 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigStorageLogic", "key and value not match, len: " + java.lang.String.valueOf(split.length));
            } else {
                for (int i18 = 0; i18 < split.length; i18 += 2) {
                    map.put(split[i18], split[i18 + 1]);
                }
            }
        }
    }

    public static void M() {
        int o17 = o() | 32768;
        gm0.j1.i();
        gm0.j1.u().c().w(40, java.lang.Integer.valueOf(o17));
    }

    public static void N(int i17, boolean z17) {
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigStorageLogic", "setAuthDeviceFlag:%s, isPersist:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
            f119111a = i17;
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.ConfigStorageLogic", "[setAuthDeviceFlag] flag=%s", java.lang.Integer.valueOf(i17));
        f119111a = i17;
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AUTH_DEVICE_FLAG_INT_SYNC, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putInt("PREF_KEY_LAST_AUTH_FLAG", i17);
    }

    public static void O(int i17, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        L(i17, hashMap);
        hashMap.put(str, str2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            sb6.append(java.lang.String.format(java.util.Locale.US, "%s\n%s\n", entry.getKey(), entry.getValue()));
        }
        gm0.j1.i();
        if (gm0.j1.u() != null) {
            gm0.j1.i();
            if (gm0.j1.u().c() != null) {
                gm0.j1.i();
                gm0.j1.u().c().w(i17, sb6.toString());
            }
        }
    }

    public static void P(long j17) {
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
        bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", j17);
    }

    public static void Q(java.lang.Long l17) {
        gm0.j1.i();
        gm0.j1.u().c().w(147457, l17);
    }

    public static void R(boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_USER_STATUS_INT_SYNC;
        int r17 = c17.r(u3Var, 0);
        int i17 = z17 ? r17 | 8 : r17 & (-9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigStorageLogic", "setIsNeedRegisterPostVerify: " + i17 + ", isNeedRegisterPostVerify: " + z17);
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(i17));
    }

    public static void S(boolean z17) {
        long i17 = i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigStorageLogic", "updateExtStatus2Values, lastExtStatus2:" + i17 + " isOpen:" + z17);
        long j17 = !z17 ? i17 & (-129) : i17 | 128;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
        bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", j17);
    }

    public static boolean a(java.lang.String str, java.lang.String str2, boolean z17) {
        boolean z18 = false;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigStorageLogic", "canSendRawImage, invalid argument");
            return false;
        }
        if (str2 != null && str2.length() > 0 && (com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(str2) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(str2))) {
            return false;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigStorageLogic", "isSmallImg, invalid argument");
        } else {
            if (com.p314xaae8f345.mm.vfs.w6.k(str) >= 65536) {
                options.inJustDecodeBounds = true;
                com.p314xaae8f345.mm.p786x600aa8b.e.d(str, options);
                double d17 = options.outWidth;
                double d18 = options.outHeight;
                if (d17 < 100.0d && d18 < 100.0d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigStorageLogic", "isSmallImg : true, width = " + d17 + ", height = " + d18);
                }
            }
            z18 = true;
        }
        if (!z18) {
            return !z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigStorageLogic", "canSendRawImage : true. isSmallImg");
        return true;
    }

    public static java.lang.String b() {
        java.lang.String c17 = c();
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17) ? c17 : r();
    }

    public static java.lang.String c() {
        gm0.j1.i();
        return (java.lang.String) gm0.j1.u().c().l(42, null);
    }

    public static int d() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("AssociateChatRoomDisableFuncFlag", 255);
    }

    public static int e() {
        int i17 = f119111a;
        if (-1 != i17) {
            return (i17 & 1) != 0 ? 0 : 1;
        }
        try {
            gm0.j1.i();
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AUTH_DEVICE_FLAG_INT_SYNC, -1);
            if (r17 == -1) {
                return -1;
            }
            return (r17 & 1) != 0 ? 0 : 1;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConfigStorageLogic", th6, "getAuthDeviceFlagErr", new java.lang.Object[0]);
            return -1;
        }
    }

    public static int f() {
        gm0.j1.i();
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(9, null);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.z3 g() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(r(), true);
        if (n17 != null && ((int) n17.E2) > 0) {
            return n17;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(4, null);
        z3Var.X1(str);
        z3Var.M1(str2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(z3Var);
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
    }

    public static long h() {
        gm0.j1.i();
        java.lang.Long l17 = (java.lang.Long) gm0.j1.u().c().l(147458, null);
        if (l17 == null) {
            return 0L;
        }
        return l17.longValue();
    }

    public static long i() {
        gm0.j1.i();
        java.lang.Long l17 = (java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, null);
        if (l17 == null) {
            return 0L;
        }
        return l17.longValue();
    }

    public static long j() {
        gm0.j1.i();
        java.lang.Long l17 = (java.lang.Long) gm0.j1.u().c().l(147457, null);
        if (l17 == null) {
            return 0L;
        }
        return l17.longValue();
    }

    public static java.lang.String k() {
        gm0.j1.i();
        return gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MY_FINDER_ALIAS_MSG_USERNAME_STRING_SYNC, "").toString();
    }

    public static java.lang.String l() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(4, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    public static int m() {
        gm0.j1.i();
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(339975, null);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static int n() {
        gm0.j1.i();
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(34, null);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static int o() {
        gm0.j1.i();
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(40, null);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static int p() {
        gm0.j1.i();
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(7, null);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static java.util.Map q() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("login_weixin_username", r());
        hashMap.put("last_login_alias", c());
        c01.b9 b9Var = c01.b9.f118602c;
        hashMap.put("login_user_name", b9Var.a("login_user_name", ""));
        hashMap.put("last_login_nick_name", l());
        hashMap.put("last_login_uin", gm0.j1.b().j());
        gm0.j1.i();
        hashMap.put("last_avatar_path", (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LAST_LOGIN_AVATAR_PATH_STRING, null));
        gm0.j1.i();
        hashMap.put("last_login_bind_mobile", (java.lang.String) gm0.j1.u().c().l(6, null));
        gm0.j1.i();
        hashMap.put("last_login_bind_email", (java.lang.String) gm0.j1.u().c().l(5, null));
        gm0.j1.i();
        hashMap.put("last_login_bind_qq", java.lang.String.valueOf(gm0.j1.u().c().l(9, null)));
        gm0.j1.i();
        hashMap.put("last_login_use_voice", java.lang.String.valueOf(gm0.j1.u().c().l(40, null)));
        hashMap.put("last_bind_info", b9Var.a("last_bind_info", ""));
        return hashMap;
    }

    public static java.lang.String r() {
        return (java.lang.String) gm0.j1.u().c().l(2, null);
    }

    public static boolean s() {
        gm0.j1.i();
        return new kk.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(9, null))).longValue() != 0;
    }

    public static boolean t() {
        return (j() & Long.MIN_VALUE) != 0;
    }

    public static boolean u() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(65825, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.equals("0")) {
            return false;
        }
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1(java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str, 0L))) != 0;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static boolean v() {
        return (i() & 128) != 0;
    }

    public static boolean w() {
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, -1)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigStorageLogic", "isCNPayWalletRegion() walletRegion:%s", java.lang.Integer.valueOf(intValue));
        return intValue == 0 || intValue == 1;
    }

    public static boolean x() {
        return e() == 0;
    }

    public static boolean y() {
        boolean z17 = (p() & 262144) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigStorageLogic", "isGooglePay: %s  User Status: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(p()));
        return z17;
    }

    public static boolean z() {
        gm0.j1.i();
        gm0.j1.u().c().i(true);
        return m() == 2;
    }
}
