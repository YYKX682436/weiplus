package ip;

/* loaded from: classes11.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f375078a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f375079b = "";

    /* renamed from: c, reason: collision with root package name */
    public static android.content.SharedPreferences f375080c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f375081d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f375082e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f375083f;

    public static boolean a() {
        return v().getBoolean("settings_show_detail", true);
    }

    public static boolean b() {
        boolean z17 = v().getBoolean("settings_sound", true);
        if (!fp.h.c(26)) {
            return z17;
        }
        if (f375078a == 1) {
            return c();
        }
        boolean e17 = e();
        if (z17 != e17) {
            ip.l.o(e17);
        }
        return e17;
    }

    public static boolean c() {
        android.content.SharedPreferences v17 = v();
        return v17.getBoolean("settings_special_scene_sound", v17.getBoolean("settings_sound", true));
    }

    public static boolean d() {
        android.content.SharedPreferences v17 = v();
        boolean z17 = v17.getBoolean("settings_voip_scene_sound", b());
        if (!f375082e) {
            f375082e = true;
            v17.edit().putBoolean("settings_voip_scene_sound", z17).commit();
        }
        return z17;
    }

    public static boolean e() {
        if (!fp.h.c(26)) {
            int b17 = z2.g1.b(new z2.n1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f551038b);
            return b17 >= 3 || b17 == -1000;
        }
        android.app.NotificationChannel notificationChannel = ((android.app.NotificationManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(android.app.NotificationManager.class)).getNotificationChannel(l());
        if (notificationChannel == null || notificationChannel.getImportance() >= 3) {
            return notificationChannel == null || notificationChannel.getSound() != null;
        }
        return false;
    }

    public static boolean f() {
        if (!fp.h.c(26)) {
            int b17 = z2.g1.b(new z2.n1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f551038b);
            return b17 >= 3 || b17 == -1000;
        }
        android.app.NotificationChannel notificationChannel = ((android.app.NotificationManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(android.app.NotificationManager.class)).getNotificationChannel(l());
        if (notificationChannel != null) {
            return notificationChannel.getImportance() >= 3 && notificationChannel.shouldVibrate();
        }
        return true;
    }

    public static boolean g(java.lang.String str) {
        if (!fp.h.b(28)) {
            return true;
        }
        android.app.NotificationChannel notificationChannel = ((android.app.NotificationManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(android.app.NotificationManager.class)).getNotificationChannel(str);
        if (notificationChannel == null || notificationChannel.getImportance() >= 3) {
            return notificationChannel == null || notificationChannel.getSound() != null;
        }
        return false;
    }

    public static boolean h(java.lang.String str) {
        android.app.NotificationChannel notificationChannel;
        if (!fp.h.b(28) || (notificationChannel = ((android.app.NotificationManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(android.app.NotificationManager.class)).getNotificationChannel(str)) == null) {
            return true;
        }
        return notificationChannel.getImportance() >= 3 && notificationChannel.shouldVibrate();
    }

    public static boolean i() {
        boolean z17 = v().getBoolean("settings_shake", true);
        if (!fp.h.c(26)) {
            return z17;
        }
        if (f375078a == 1) {
            return j();
        }
        boolean f17 = f();
        if (f17 != z17) {
            ip.l.k(f17);
        }
        return f17;
    }

    public static boolean j() {
        android.content.SharedPreferences v17 = v();
        return v17.getBoolean("settings_special_scene_shake", v17.getBoolean("settings_shake", true));
    }

    public static boolean k() {
        android.content.SharedPreferences v17 = v();
        boolean z17 = v17.getBoolean("settings_voip_scene_shake", i());
        if (!f375083f) {
            f375083f = true;
            v17.edit().putBoolean("settings_voip_scene_shake", z17).commit();
        }
        return z17;
    }

    public static java.lang.String l() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f375079b)) {
            f375079b = gm0.m.v().getString("message_channel_id", "message_channel_new_id");
        }
        return f375079b;
    }

    public static java.lang.String m(android.content.Context context, int i17) {
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571997vs);
        switch (i17) {
            case -1:
            case 0:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571997vs);
            case 1:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574519ik2);
            case 2:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ik8);
            case 3:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ik7);
            case 4:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574522ik5);
            case 5:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574520ik3);
            case 6:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574521ik4);
            case 7:
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ik6);
            default:
                return string;
        }
    }

    public static java.lang.String n(int i17) {
        java.lang.String str = "";
        if (i17 == 0 || i17 == -1) {
            return "";
        }
        switch (i17) {
            case 1:
                str = "Toys";
                break;
            case 2:
                str = "Cupid";
                break;
            case 3:
                str = "Celestial";
                break;
            case 4:
                str = "Delight";
                break;
            case 5:
                str = "Crystals";
                break;
            case 6:
                str = "Fairy";
                break;
            case 7:
                str = "Elegance";
                break;
        }
        return lp0.b.e() + "newmsgringtone/" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ik9, str);
    }

    public static int o() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("setting_notification");
        if (M != null) {
            return M.o("settings.ringtone.wechat", -1);
        }
        return -1;
    }

    public static void p() {
        f375078a = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseNotificationConfig", "iniSpecialSceneSwitchEnable() mSpecialSceneSwitchEnable:%s", 1);
    }

    public static boolean q(int i17, int i18, android.content.Context context) {
        if (r()) {
            return true;
        }
        int i19 = v().getInt("settings_active_begin_time_hour", 8);
        int i27 = v().getInt("settings_active_begin_time_min", 0);
        int i28 = v().getInt("settings_active_end_time_hour", 23);
        int i29 = v().getInt("settings_active_end_time_min", 0);
        if (i19 == i28 && i27 == i29) {
            return false;
        }
        if (i19 == i28 && i27 < i29) {
            return i17 == i19 && i18 > i27 && i18 < i29;
        }
        if (i28 > i19) {
            if (i17 > i19 && i17 < i28) {
                return true;
            }
            if (i17 != i19 || i18 <= i27) {
                return i17 == i28 && i18 < i29;
            }
            return true;
        }
        if (i28 >= i19 && (i19 != i28 || i27 <= i29)) {
            return true;
        }
        if (i17 > i19 && i17 <= 23) {
            return true;
        }
        if (i17 == i19 && i18 > i27) {
            return true;
        }
        if (i17 != i28 || i18 >= i29) {
            return i17 > 0 && i17 < i28;
        }
        return true;
    }

    public static boolean r() {
        if (j62.e.g().i("clicfg_dnd_mode_switch_new", 0, true, false) == 0) {
            return true;
        }
        return v().getBoolean("settings_active_time_full", true);
    }

    public static boolean s() {
        return v().getBoolean("settings_new_msg_notification", true);
    }

    public static boolean t() {
        return v().getBoolean("settings_new_voip_msg_notification", true);
    }

    public static boolean u() {
        android.app.NotificationChannel notificationChannel;
        if (new z2.n1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).a()) {
            return !fp.h.c(26) || (notificationChannel = ((android.app.NotificationManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(android.app.NotificationManager.class)).getNotificationChannel(l())) == null || notificationChannel.getImportance() >= 1;
        }
        return false;
    }

    public static android.content.SharedPreferences v() {
        android.content.SharedPreferences sharedPreferences = f375080c;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        android.content.SharedPreferences v17 = gm0.m.v();
        f375080c = v17;
        return v17;
    }
}
