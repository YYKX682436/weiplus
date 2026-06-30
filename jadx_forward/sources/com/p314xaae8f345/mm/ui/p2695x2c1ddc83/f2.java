package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes15.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f2 f289197a = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f289198b;

    /* renamed from: c, reason: collision with root package name */
    public static long f289199c;

    /* renamed from: d, reason: collision with root package name */
    public static long f289200d;

    /* renamed from: e, reason: collision with root package name */
    public static long f289201e;

    /* renamed from: f, reason: collision with root package name */
    public static long f289202f;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f289198b = hashMap;
        hashMap.put("notifymessage", new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e2());
    }

    public final void a(int i17, int i18, java.lang.String str, int i19, int i27, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6682x9f3903 c6682x9f3903 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6682x9f3903();
        c6682x9f3903.f140195d = i17;
        c6682x9f3903.f140196e = i18;
        java.lang.String str2 = "";
        c6682x9f3903.f140197f = c6682x9f3903.b("Content", str != null ? r26.i0.t(str, ",", "", false) : null, true);
        c6682x9f3903.f140198g = i19;
        c6682x9f3903.f140199h = i27;
        try {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(msg.j(), "msg", null);
            java.lang.String str3 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username");
            if (str3 == null) {
                str3 = "";
            }
            c6682x9f3903.f140200i = c6682x9f3903.b("finderUsername", str3, true);
            java.lang.String str4 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
            if (str4 == null) {
                str4 = "";
            }
            c6682x9f3903.f140201j = c6682x9f3903.b("feedId", str4, true);
            java.lang.String str5 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id");
            if (str5 == null) {
                str5 = "";
            }
            c6682x9f3903.f140202k = c6682x9f3903.b("liveId", str5, true);
            java.lang.String str6 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_type");
            if (str6 == null) {
                str6 = "";
            }
            c6682x9f3903.f140206o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str6, 0);
            java.lang.String str7 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.sessionbuffer");
            if (str7 == null) {
                str7 = "";
            }
            c6682x9f3903.f140209r = c6682x9f3903.b("sessionBuffer", str7, true);
            c6682x9f3903.f140207p = i28 > 0 ? 1L : 0L;
            c6682x9f3903.f140208q = i28;
            if (i17 == 1) {
                long j17 = f289199c == msg.I0() ? 0L : 1L;
                c6682x9f3903.f140203l = j17;
                f289200d = j17;
            } else {
                c6682x9f3903.f140203l = f289200d;
            }
            java.lang.String str8 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.msg_type");
            if (str8 != null) {
                str2 = str8;
            }
            c6682x9f3903.f140204m = c6682x9f3903.b("msgType", str2, true);
            c6682x9f3903.f140205n = c6682x9f3903.b("msgId", pm0.v.u(msg.I0()), true);
            c6682x9f3903.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvItemExposureHelper", "report 22611, " + c6682x9f3903.n());
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConvItemExposureHelper", e17, "reportLiveTips", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConvItemExposureHelper", th6, "reportLiveTips", new java.lang.Object[0]);
        }
    }

    public final void b(int i17, int i18, java.lang.String str, int i19, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, int i27, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6860x7fba6576 c6860x7fba6576 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6860x7fba6576();
        c6860x7fba6576.f141781d = i17;
        c6860x7fba6576.f141786i = i18;
        c6860x7fba6576.f141782e = java.lang.System.currentTimeMillis() / 1000;
        c6860x7fba6576.f141785h = c6860x7fba6576.b("Content", str != null ? r26.i0.t(str, ",", "", false) : null, true);
        c6860x7fba6576.f141788k = o17 ? 1L : 0L;
        c6860x7fba6576.f141787j = i19;
        c6860x7fba6576.f141797t = c6860x7fba6576.b(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, str2, true);
        try {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(msg.j(), "msg", null);
            java.lang.String str3 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username");
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_type");
            if (str4 == null) {
                str4 = "";
            }
            c6860x7fba6576.f141790m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str4, 0);
            long j17 = 0;
            c6860x7fba6576.f141791n = i27 > 0 ? 1L : 0L;
            c6860x7fba6576.f141792o = i27;
            if (i17 == 1) {
                long j18 = f289199c == msg.I0() ? 0L : 1L;
                c6860x7fba6576.f141789l = j18;
                f289201e = j18;
            } else {
                c6860x7fba6576.f141789l = f289201e;
            }
            c6860x7fba6576.f141784g = c6860x7fba6576.b("MsgId", pm0.v.u(msg.I0()), true);
            java.lang.String str5 = (java.lang.String) d17.get(".msg.appmsg.template_id");
            if (str5 == null) {
                str5 = "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && (str5 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.templateid")) == null) {
                str5 = "";
            }
            c6860x7fba6576.f141794q = c6860x7fba6576.b("TemplatelD", str5, true);
            java.lang.String str6 = (java.lang.String) d17.get(".msg.fromusername");
            if (str6 == null) {
                str6 = "";
            }
            c6860x7fba6576.f141783f = c6860x7fba6576.b("UserName", str6, true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                c6860x7fba6576.f141783f = c6860x7fba6576.b("UserName", str3, true);
            }
            java.lang.String str7 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
            if (str7 == null) {
                str7 = "";
            }
            c6860x7fba6576.f141796s = c6860x7fba6576.b("feedId", str7, true);
            java.lang.String str8 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id");
            if (str8 == null) {
                str8 = "";
            }
            c6860x7fba6576.f141795r = c6860x7fba6576.b("liveId", str8, true);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6860x7fba6576.f141783f)) {
                j17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qg.c(c6860x7fba6576.f141783f);
            }
            c6860x7fba6576.f141793p = j17;
            c6860x7fba6576.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvItemExposureHelper", "report 32753, " + c6860x7fba6576.n());
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConvItemExposureHelper", e17, "reportServiceNotifyBox", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConvItemExposureHelper", th6, "reportServiceNotifyBox", new java.lang.Object[0]);
        }
    }
}
