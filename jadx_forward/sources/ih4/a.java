package ih4;

/* loaded from: classes16.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public long f373131a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f373132b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f373133c = 0;

    public int a(int i17) {
        if (i17 == 1) {
            return 1;
        }
        if (i17 == 2) {
            return 4;
        }
        if (i17 == 3) {
            return 6;
        }
        if (i17 == 4) {
            return 5;
        }
        if (i17 == 6) {
            return 10;
        }
        if (i17 == 25) {
            return 8;
        }
        if (i17 != 21) {
            return i17 != 22 ? 0 : 8;
        }
        return 9;
    }

    public void b(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58) {
        int i59;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11711x54208329 c11711x54208329;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TaskBarReporter", "reportTaskBarAppear actionType:%d, weappCount:%d, commUsedWeAppCount:%d, myWeAppCount:%d，enterSource:%d， isRefreshData:%d, taskBarVersion:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i58), java.lang.Integer.valueOf(this.f373133c));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6315x5f75f161 c6315x5f75f161 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6315x5f75f161();
        c6315x5f75f161.f136704d = c6315x5f75f161.b("session_id", this.f373132b, true);
        c6315x5f75f161.f136705e = i17;
        c6315x5f75f161.f136706f = i18;
        c6315x5f75f161.f136707g = i19;
        c6315x5f75f161.f136708h = i27;
        c6315x5f75f161.f136709i = i28;
        c6315x5f75f161.f136710j = i29;
        c6315x5f75f161.f136711k = i37;
        c6315x5f75f161.f136712l = i38;
        c6315x5f75f161.f136713m = i39;
        c6315x5f75f161.f136714n = i47;
        c6315x5f75f161.f136719s = i48;
        c6315x5f75f161.f136715o = i49;
        c6315x5f75f161.f136716p = 0L;
        c6315x5f75f161.f136717q = 0L;
        c6315x5f75f161.f136718r = i57;
        c6315x5f75f161.f136720t = i58;
        if (i48 > 0) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c0) ((ft.j) i95.n0.c(ft.j.class))).Ai();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11710x63f82843 c11710x63f82843 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158012m;
            java.lang.String str = c11710x63f82843.f157876f;
            if (str == null) {
                str = "";
            }
            c6315x5f75f161.f136726z = c6315x5f75f161.b("commuse_extra_data", str, true);
            if (c11710x63f82843.f157874d) {
                c6315x5f75f161.f136725y = c6315x5f75f161.b("ssid_hash", c11710x63f82843.f157878h, true);
                c6315x5f75f161.f136724x = c6315x5f75f161.b("bssid_hash", c11710x63f82843.f157877g, true);
            }
            if (c11710x63f82843.f157875e && (c11711x54208329 = c11710x63f82843.f157879i) != null && c11711x54208329.a()) {
                c6315x5f75f161.f136722v = c6315x5f75f161.b("latitude", "" + c11710x63f82843.f157879i.f157880d, true);
                c6315x5f75f161.f136721u = c6315x5f75f161.b("longitude", "" + c11710x63f82843.f157879i.f157881e, true);
                c6315x5f75f161.f136723w = c6315x5f75f161.b("accuracy", "" + c11710x63f82843.f157879i.f157884h, true);
            }
        }
        if (i49 == 1 && (i59 = this.f373133c) > 0) {
            c6315x5f75f161.A = i59;
        }
        c6315x5f75f161.k();
    }

    public void c(int i17, int i18, int i19, java.lang.String str, int i27, int i28, int i29, int i37, java.lang.String str2, int i38) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TaskBarReporter", "reportTaskBarFeedAddDelete actionType:%d, actionChannel:%d, contentType:%d, contentId:%s, username:%s, appType:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, str2, java.lang.Integer.valueOf(i38));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6318x7ea61477 c6318x7ea61477 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6318x7ea61477();
        c6318x7ea61477.f136745d = c6318x7ea61477.b("session_id", this.f373132b, true);
        c6318x7ea61477.f136746e = c6318x7ea61477.b("action_type", java.lang.String.valueOf(i17), true);
        c6318x7ea61477.f136747f = i18;
        c6318x7ea61477.f136748g = i19;
        c6318x7ea61477.f136749h = c6318x7ea61477.b("content_id", str, true);
        c6318x7ea61477.f136750i = i27;
        c6318x7ea61477.f136751j = i28;
        c6318x7ea61477.f136752k = i29;
        c6318x7ea61477.f136753l = i37;
        c6318x7ea61477.f136755n = c6318x7ea61477.b("app_username", str2, true);
        c6318x7ea61477.f136756o = i38;
        c6318x7ea61477.k();
    }

    public void d(int i17, int i18, java.lang.String str, int i19, java.lang.String str2, java.lang.String str3, int i27, int i28, java.lang.String str4, int i29) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6319x450a1b4 c6319x450a1b4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6319x450a1b4();
        c6319x450a1b4.f136757d = c6319x450a1b4.b("session_id", this.f373132b, true);
        c6319x450a1b4.f136758e = i17;
        c6319x450a1b4.f136759f = i18;
        c6319x450a1b4.f136760g = c6319x450a1b4.b("conent_list", str, true);
        c6319x450a1b4.f136761h = i19;
        c6319x450a1b4.f136766m = c6319x450a1b4.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13301xac1d9648, str3, true);
        c6319x450a1b4.f136764k = i27;
        c6319x450a1b4.f136769p = c6319x450a1b4.b(dm.i4.f66875xa013b0d5, str4, true);
        c6319x450a1b4.f136767n = this.f373131a;
        if (i18 == 14) {
            c6319x450a1b4.f136768o = i28;
        }
        c6319x450a1b4.f136765l = i29;
        if (str2 != null) {
            c6319x450a1b4.f136762i = c6319x450a1b4.b("icon_appid", str2, true);
        }
        c6319x450a1b4.k();
    }

    public void e(int i17, int i18, java.lang.String str, int i19, java.lang.String str2, java.lang.String str3, int i27, java.lang.String str4, int i28) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TaskBarReporter", "reportTaskBarFeedClick pageType:%d, pageFeedIndex:%d, contentId:%s, extraData:%s, isRefreshData:%d, username:%s, appType:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str3, java.lang.Integer.valueOf(i27), str4, java.lang.Integer.valueOf(i28));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6316x11ac3906 c6316x11ac3906 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6316x11ac3906();
        c6316x11ac3906.f136727d = c6316x11ac3906.b("session_id", this.f373132b, true);
        c6316x11ac3906.f136728e = i17;
        c6316x11ac3906.f136729f = i18;
        c6316x11ac3906.f136730g = c6316x11ac3906.b("content_id", str, true);
        c6316x11ac3906.f136731h = i19;
        c6316x11ac3906.f136735l = c6316x11ac3906.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13301xac1d9648, str3, true);
        c6316x11ac3906.f136736m = java.lang.System.currentTimeMillis();
        if (i17 == 14) {
            c6316x11ac3906.f136737n = i27;
        }
        c6316x11ac3906.f136738o = c6316x11ac3906.b(dm.i4.f66875xa013b0d5, str4, true);
        if (str2 != null) {
            c6316x11ac3906.f136732i = c6316x11ac3906.b("icon_appid", str2, true);
        }
        c6316x11ac3906.f136734k = i28;
        c6316x11ac3906.k();
    }
}
