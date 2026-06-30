package kd1;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f388234c = lp0.b.X() + "files/wxofflinevoicenew/";

    /* renamed from: d, reason: collision with root package name */
    public static kd1.e f388235d;

    /* renamed from: a, reason: collision with root package name */
    public java.util.Set f388236a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f388237b = new java.lang.Object();

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("voice_offline_res_new");
    }

    public static kd1.e b() {
        if (f388235d == null) {
            f388235d = new kd1.e();
        }
        return f388235d;
    }

    public static java.lang.String c(java.lang.String str) {
        return a().getString(str + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130909u, "");
    }

    public static void f(java.lang.String str) {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICE_OFFLINE_RES_ID_STRING_SYNC, str);
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5869x52e0a426().e();
    }

    public final void d() {
        if (this.f388236a == null) {
            this.f388236a = new java.util.HashSet();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICE_OFFLINE_RES_IDS_STRING_SYNC, "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            for (java.lang.String str2 : str.split(",")) {
                this.f388236a.add(str2);
            }
        }
    }

    public boolean e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        synchronized (this.f388237b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.VoiceOffLineHelper", "saveVoiceOfflineLanguageResId, resId :%s、path:%s、md5:%s,version:%s", str, str2, str3, str4);
            d();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = a();
            a17.getClass();
            a17.putString(str, str2).commit();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "0")) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = a();
                a18.getClass();
                a18.putString("0-1_md5", str3).commit();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a19 = a();
                a19.getClass();
                if (str4 == null) {
                    str4 = "";
                }
                a19.putString("0-1_version", str4).commit();
                return true;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a27 = a();
            a27.getClass();
            a27.putString(str + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130909u, str3).commit();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a28 = a();
            a28.getClass();
            java.lang.String str5 = str + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130908t;
            if (str4 == null) {
                str4 = "";
            }
            a28.putString(str5, str4).commit();
            if (((java.util.HashSet) this.f388236a).contains(str)) {
                return true;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICE_OFFLINE_RES_IDS_STRING_SYNC;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder((java.lang.String) c17.m(u3Var, ""));
            if (((java.util.HashSet) this.f388236a).size() <= 0) {
                sb6.append(str);
            } else {
                sb6.append(",");
                sb6.append(str);
            }
            gm0.j1.u().c().x(u3Var, sb6.toString());
            return ((java.util.HashSet) this.f388236a).add(str);
        }
    }
}
