package q61;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final q61.j f441794a = new q61.j();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f441795b = false;

    /* renamed from: c, reason: collision with root package name */
    public static r45.nf5 f441796c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f441797d = false;

    /* renamed from: e, reason: collision with root package name */
    public static p3325xe03a0797.p3326xc267989b.z f441798e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f441799f = false;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f441800g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f441801h = "";

    public static final java.util.HashMap d() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("login_sessionid", f441800g);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k());
        java.lang.String a17 = c01.b9.f118602c.a("login_user_name", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getLoginInfo(...)");
        hashMap.put("wx_username", a17);
        return hashMap;
    }

    public static final void e(java.lang.String login_ticket_id, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(login_ticket_id, "login_ticket_id");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReportPushLoginURLMainDevice", "reportLoginAssistEnd");
        java.util.HashMap d17 = d();
        d17.put("login_ticket_id", login_ticket_id);
        d17.put("login_assist_device_type", java.lang.Integer.valueOf(i17));
        d17.put("login_assist_result", java.lang.Integer.valueOf(i18));
        d17.put("login_assist_cancel_type", java.lang.Integer.valueOf(i19));
        d17.put("login_assist_error_code", java.lang.Integer.valueOf(i27));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("login_assist_end", d17, 34575);
    }

    public static final void f(java.lang.String login_ticket_id, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(login_ticket_id, "login_ticket_id");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReportPushLoginURLMainDevice", "reportLoginAssistSend");
        java.util.HashMap d17 = d();
        d17.put("login_ticket_id", login_ticket_id);
        d17.put("login_assist_device_type", java.lang.Integer.valueOf(i17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("login_assist_send", d17, 34575);
    }

    public static final void g(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReportPushLoginURLMainDevice", "reportLoginUseOtherDevice");
        java.util.HashMap d17 = d();
        d17.put("page_id", "50272");
        d17.put("page_name", "AccountLoginPage");
        if (i17 == 0) {
            d17.put("view_id", "login_use_other_device");
        } else {
            d17.put("view_id", "login_use_other_device_more");
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(i18 == 0 ? "view_exp" : "view_clk", d17, 34575);
    }

    public static final void h() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        f441800g = wo.w0.k() + '_' + elapsedRealtime;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLoginPageSessionId: ");
        sb6.append(f441800g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReportPushLoginURLMainDevice", sb6.toString());
    }

    public static final void i(java.lang.String mid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mid, "mid");
        f441801h = mid;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReportPushLoginURLMainDevice", "updateLoginTicketId: " + f441801h);
    }

    public final boolean a() {
        java.lang.String a17 = c01.b9.f118602c.a("login_weixin_username", "");
        js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        if (!((is.f) r0Var).Vi(a17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushLoginURLMainDeviceCGI", "!isFSEnable expt");
            return false;
        }
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_info_key_prefs", 4);
        if (sharedPreferences == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushLoginURLMainDeviceCGI", "sp == null");
            return false;
        }
        java.lang.String string = sharedPreferences.getString("_auth_key", "");
        if (string == null || string.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushLoginURLMainDeviceCGI", "aak.isNullOrEmpty()");
            return false;
        }
        java.lang.String string2 = sharedPreferences.getString("server_id", "");
        if (!(string2 == null || string2.length() == 0)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushLoginURLMainDeviceCGI", "oldCookie.isNullOrEmpty()");
        return false;
    }

    public final void b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 act, q61.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(act, "act");
        if (a()) {
            if (f441797d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PushLoginURLTAG3MainDeviceCGI", "hasCheck");
            } else {
                f441797d = true;
                android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_info_key_prefs", 4);
                if (sharedPreferences != null) {
                    java.lang.String string = sharedPreferences.getString("_auth_key", "");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    java.lang.String a17 = c01.b9.f118602c.a("login_weixin_username", "");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getLoginInfo(...)");
                    byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(string);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sharedPreferences.getString("server_id", ""));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PushLoginURLTAG3MainDeviceCGI", "checkLoginURLMainDeviceStatus only once");
                    p3325xe03a0797.p3326xc267989b.z a18 = p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null);
                    f441798e = a18;
                    p3325xe03a0797.p3326xc267989b.l.d(v65.m.f515113a, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new q61.g(a17, h17, a18, null), 2, null);
                }
            }
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(act), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new q61.e(act, kVar, null), 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r9, java.lang.String r10, byte[] r11, q61.k r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q61.j.c(int, java.lang.String, byte[], q61.k, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
