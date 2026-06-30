package o45;

/* loaded from: classes12.dex */
public abstract class ag {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f424425a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f424426b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_info_key_prefs", 4).getBoolean("auth_info_prefs_use_net_ml_cert", false);

    /* renamed from: c, reason: collision with root package name */
    public static int f424427c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static byte[] f424428d = null;

    /* renamed from: e, reason: collision with root package name */
    public static byte[] f424429e = null;

    /* renamed from: f, reason: collision with root package name */
    public static int f424430f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f424431g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static byte[] f424432h;

    /* renamed from: i, reason: collision with root package name */
    public static byte[] f424433i;

    /* renamed from: j, reason: collision with root package name */
    public static long f424434j;

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcdhMgr", "summerauths USE_ECDH[%s] USE_ML[%s]", java.lang.Boolean.valueOf(f424425a), java.lang.Boolean.valueOf(f424426b));
        h();
        f424434j = 0L;
    }

    public static int a() {
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_info_key_prefs", 4);
        int i17 = sharedPreferences.getInt("auth_info_prefs_test_ecdh_version", 0);
        if (i17 == 1) {
            sharedPreferences.edit().remove("auth_info_prefs_test_ecdh_version").commit();
        }
        if (i17 == 1) {
            return 10010;
        }
        return f424430f;
    }

    public static byte[] b() {
        int i17 = f424431g;
        try {
            i17 = gm0.j1.n().f354821b.f152297d.e0();
        } catch (java.lang.AssertionError | java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcdhMgr", e17.getLocalizedMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcdhMgr", "getEcdhKey cert region " + i17 + " current: " + f424431g);
        if (i17 != f424431g) {
            f424431g = i17;
            g(i17);
        }
        return f424428d;
    }

    public static boolean c() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_info_key_prefs", 4).getInt("auth_info_prefs_test_ecdh_skip_aak", 0) == 1;
    }

    public static long d(byte[] bArr) {
        int i17 = f424427c;
        byte[] b17 = b();
        int i18 = f424431g;
        try {
            i18 = gm0.j1.n().f354821b.f152297d.e0();
        } catch (java.lang.AssertionError | java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcdhMgr", e17.getLocalizedMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcdhMgr", "getEcdsaKey cert region " + i18 + " current: " + f424431g + " " + f424430f);
        if (i18 != f424431g) {
            f424431g = i18;
            g(i18);
        }
        long m46292xd1ea477d = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46292xd1ea477d(i17, b17, f424429e, bArr);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Long.valueOf(m46292xd1ea477d);
        objArr[1] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
        objArr[2] = java.lang.Integer.valueOf(f424427c);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[3] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcdhMgr", "summerauths getHybridEcdhCryptoEngine engine[%s] autoauth_key[%s] nid[%s] stack[%s]", objArr);
        return m46292xd1ea477d;
    }

    public static byte[] e() {
        int i17 = f424431g;
        try {
            i17 = gm0.j1.n().f354821b.f152297d.e0();
        } catch (java.lang.AssertionError | java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcdhMgr", e17.getLocalizedMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcdhMgr", "getEcdhKey cert region " + i17 + " current: " + f424431g);
        if (i17 != f424431g) {
            f424431g = i17;
            g(i17);
        }
        return f424432h;
    }

    public static byte[] f() {
        int i17 = f424431g;
        try {
            i17 = gm0.j1.n().f354821b.f152297d.e0();
        } catch (java.lang.AssertionError | java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcdhMgr", e17.getLocalizedMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcdhMgr", "getEcdsaKey cert region " + i17 + " current: " + f424431g + " " + f424430f);
        if (i17 != f424431g) {
            f424431g = i17;
            g(i17);
        }
        return f424433i;
    }

    public static void g(int i17) {
        if (i17 == 1) {
            h();
            return;
        }
        if (i17 != 2) {
            return;
        }
        f424430f = 50017;
        f424427c = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60864x51861c8c;
        f424428d = android.util.Base64.decode("BIabf6ipoVluK1TfAMW9bKsu1oOXauwuVm8oNUy3jdRu9pUud3P4g3GuovZA2GfQuGOkwXjaM/vaBbnMX9KtE04=", 0);
        f424429e = android.util.Base64.decode("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFdjZHTy9HSmxyWGZVVUxxNXpoWVJKRUJVVllTeQpxaHcwSHowZi91OUVFUHhYMkdQVVBNUU1ReFg2RlA3WkNTdkpjbGdjOGdpUk8rWjg4U25WV1U4bGp3PT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==", 0);
        f424432h = "BIabf6ipoVluK1TfAMW9bKsu1oOXauwuVm8oNUy3jdRu9pUud3P4g3GuovZA2GfQuGOkwXjaM/vaBbnMX9KtE04=".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        f424433i = "LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFdjZHTy9HSmxyWGZVVUxxNXpoWVJKRUJVVllTeQpxaHcwSHowZi91OUVFUHhYMkdQVVBNUU1ReFg2RlA3WkNTdkpjbGdjOGdpUk8rWjg4U25WV1U4bGp3PT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public static void h() {
        if (f424426b) {
            f424430f = 10001;
            f424427c = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60864x51861c8c;
            f424428d = android.util.Base64.decode("BJO0cjvgelbYHm8ZlKVVl63oMbeMYLjIqaWtZWvBBTSm7PzWslBMy8loLcnG9dITvDzD6YpddZdH1PnHxG8Kpvo=", 0);
            f424429e = android.util.Base64.decode("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFQ0JvQVdmMC84ZVJEL0NKeWIxU3RKckhPeVcyVwo2Z3ZjaUh1TTZOZk82cWhLNDJKTjZSRmxucEtZbVAyTlBYbnd3L05VVFpMM05Qa3FZVEh2Q1AwSmtnPT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==", 0);
            f424432h = "BJO0cjvgelbYHm8ZlKVVl63oMbeMYLjIqaWtZWvBBTSm7PzWslBMy8loLcnG9dITvDzD6YpddZdH1PnHxG8Kpvo=".getBytes(java.nio.charset.StandardCharsets.UTF_8);
            f424433i = "LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFQ0JvQVdmMC84ZVJEL0NKeWIxU3RKckhPeVcyVwo2Z3ZjaUh1TTZOZk82cWhLNDJKTjZSRmxucEtZbVAyTlBYbnd3L05VVFpMM05Qa3FZVEh2Q1AwSmtnPT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==".getBytes(java.nio.charset.StandardCharsets.UTF_8);
            return;
        }
        f424430f = 10024;
        f424427c = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60864x51861c8c;
        f424428d = android.util.Base64.decode("BFftFqzpQHuTwKZusMZ/cUbitBZPbpx/SmA+S20UPC1G9jYFrQ+RTkifV7uFPrIlKjjtlowasV+G3wRfgFWCoZQ=", 0);
        f424429e = android.util.Base64.decode("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFU2lsQ2ZsUVIwNlpIU1V4ZVlSK1FLbHA1SHZ6VgpDVE1aSHNwTUEvZ1gyRG9rUUlOQkpmZUxlN3EyTjdubjVOVE9MYUo4QlVJZHN5TDUwN3B2N2VocU1RPT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==", 0);
        f424432h = "BFftFqzpQHuTwKZusMZ/cUbitBZPbpx/SmA+S20UPC1G9jYFrQ+RTkifV7uFPrIlKjjtlowasV+G3wRfgFWCoZQ=".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        f424433i = "LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFU2lsQ2ZsUVIwNlpIU1V4ZVlSK1FLbHA1SHZ6VgpDVE1aSHNwTUEvZ1gyRG9rUUlOQkpmZUxlN3EyTjdubjVOVE9MYUo4QlVJZHN5TDUwN3B2N2VocU1RPT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public static void i(long j17) {
        com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46303xb55c8008(j17);
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcdhMgr", "summerauths releaseHybridEcdhCryptoEngine engine[%s] stack[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    public static void j(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_info_key_prefs", 4).edit().putInt("auth_info_prefs_test_ecdh_skip_aak", i17).commit();
    }

    public static void k(int i17) {
        f424430f = i17;
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_info_key_prefs", 4);
        sharedPreferences.edit().putInt("auth_info_prefs_test_ecdh_version", 1).commit();
        sharedPreferences.getInt("auth_info_prefs_test_ecdh_version", 0);
    }

    public static synchronized boolean l() {
        synchronized (o45.ag.class) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcdhMgr", "summerauths switchCert LAST_SWITCH_TIME[%s] old USE_ML[%s] stack[%s]", java.lang.Long.valueOf(f424434j), java.lang.Boolean.valueOf(f424426b), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = f424434j;
            if (600000 >= elapsedRealtime - j17 && j17 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcdhMgr", "summerauths switchCert LAST_SWITCH_TIME freq limit [%s]ms ret false", java.lang.Long.valueOf(elapsedRealtime - j17));
                return false;
            }
            f424434j = android.os.SystemClock.elapsedRealtime();
            f424426b = !f424426b;
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_info_key_prefs", 4);
            boolean commit = sharedPreferences.edit().putBoolean("auth_info_prefs_use_net_ml_cert", f424426b).commit();
            sharedPreferences.getBoolean("auth_info_prefs_use_net_ml_cert", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcdhMgr", "summerauths switchCert to [%s] save sp[%s]", java.lang.Boolean.valueOf(f424426b), java.lang.Boolean.valueOf(commit));
            h();
            return commit;
        }
    }

    public static void m() {
        f424426b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_info_key_prefs", 4).getBoolean("auth_info_prefs_use_net_ml_cert", false);
        int i17 = f424431g;
        try {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? gm0.j1.n().f354821b.f152297d.e0() : com.p314xaae8f345.mm.p971x6de15a2e.x2.c().e0();
        } catch (java.lang.AssertionError | java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcdhMgr", e17.getLocalizedMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcdhMgr", "getMMtlsRegion error %s", e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcdhMgr", "summerauths USE_ECDH[%s] USE_ML[%s] ECDH_REGION[%s] certRegion[%s]", java.lang.Boolean.valueOf(f424425a), java.lang.Boolean.valueOf(f424426b), java.lang.Integer.valueOf(f424431g), java.lang.Integer.valueOf(i17));
        g(i17);
    }
}
