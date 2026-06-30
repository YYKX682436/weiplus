package ip;

/* loaded from: classes11.dex */
public abstract class l {
    public static int a(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        Di.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select sum(atCount) from rconversation where unReadCount > 0");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            sb6.append(" and username = '");
            sb6.append(str);
            sb6.append("'");
        }
        sb6.append(" and ");
        sb6.append(Di.O());
        android.database.Cursor f17 = Di.f276650d.f(sb6.toString(), null, 2);
        if (f17 != null) {
            r0 = f17.moveToFirst() ? f17.getInt(0) : 0;
            f17.close();
        }
        return r0;
    }

    public static int b() {
        if (gm0.j1.a()) {
            return c01.h2.c(1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NotificationConfig", "getUnReadMsgCoun, but mmcore not ready");
        return 0;
    }

    public static int c() {
        if (gm0.j1.a()) {
            return ((java.util.HashMap) c01.h2.e(c01.e2.f118654e)).size();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NotificationConfig", "getUnReadTalkerCount, but mmcore not ready");
        return 0;
    }

    public static boolean d(java.lang.String str) {
        return c01.e2.Q(str) || (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) && !c01.e2.I(str)) || (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(str) && !c01.e2.I(str));
    }

    public static boolean e() {
        return ip.b.u();
    }

    public static boolean f(java.lang.String str) {
        int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
        return str.equals("voip_content_voice") || str.equals("voip_content_video");
    }

    public static boolean g(java.lang.String str) {
        int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
        if (str.equals("voip_content_video")) {
            return true;
        }
        if (str.equals("voip_content_voice")) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
        am.y00 y00Var = c6231x4f3054ba.f136478g;
        y00Var.f89948b = 1;
        y00Var.f89947a = str;
        c6231x4f3054ba.e();
        return c6231x4f3054ba.f136479h.f90033a == 2;
    }

    public static boolean h(java.lang.String str) {
        int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
        if (str.equals("voip_content_voice")) {
            return true;
        }
        if (str.equals("voip_content_video")) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
        am.y00 y00Var = c6231x4f3054ba.f136478g;
        y00Var.f89948b = 1;
        y00Var.f89947a = str;
        c6231x4f3054ba.e();
        return c6231x4f3054ba.f136479h.f90033a == 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if (r4.getCursor() != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        ip.b.f375081d = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        r4.getCursor().close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r4.getCursor() == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair i() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ip.l.i():android.util.Pair");
    }

    public static void j(boolean z17) {
        ip.b.v().edit().putBoolean("settings_ringtone_allow_hear", z17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : KEY_RINGTONE_CAN_HEAR: %B", java.lang.Boolean.valueOf(z17));
    }

    public static void k(boolean z17) {
        ip.b.v().edit().putBoolean("settings_shake", z17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsShake: %B", java.lang.Boolean.valueOf(z17));
    }

    public static void l(boolean z17) {
        ip.b.v().edit().putBoolean("settings_special_scene_shake", z17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsShakeInSpecialScene: %B", java.lang.Boolean.valueOf(z17));
    }

    public static void m(boolean z17) {
        ip.b.v().edit().putBoolean("settings_voip_scene_shake", z17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsShakeInVoip: %B", java.lang.Boolean.valueOf(z17));
    }

    public static void n(boolean z17) {
        ip.b.v().edit().putBoolean("settings_show_detail", z17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsShowDetail: %B", java.lang.Boolean.valueOf(z17));
    }

    public static void o(boolean z17) {
        ip.b.v().edit().putBoolean("settings_sound", z17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsSound: %B", java.lang.Boolean.valueOf(z17));
    }

    public static void p(boolean z17) {
        ip.b.v().edit().putBoolean("settings_special_scene_sound", z17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsSoundInSpecialScene: %B", java.lang.Boolean.valueOf(z17));
    }

    public static void q(boolean z17) {
        ip.b.v().edit().putBoolean("settings_voip_scene_sound", z17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsSoundInVoip: %B", java.lang.Boolean.valueOf(z17));
    }

    public static void r(boolean z17) {
        ip.b.v().edit().putBoolean("settings_new_msg_notification", z17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveNewMsgNotification: %B", java.lang.Boolean.valueOf(z17));
    }

    public static void s(boolean z17) {
        ip.b.v().edit().putBoolean("settings_new_voip_msg_notification", z17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveNewVoIPMsgNotification: %B", java.lang.Boolean.valueOf(z17));
    }

    public static void t(int i17) {
        ip.b.v().edit().putInt("notification.status.webonline.push.open", i17).commit();
    }
}
