package oh1;

/* loaded from: classes5.dex */
public enum z0 implements vg3.q4 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public boolean f426859d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f426860e = false;

    z0() {
    }

    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (str == null || !str.equals("PCWxaLaunchNotify")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PCWxaLaunchAppNotifyHandler", "subType is err, return");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaLaunchAppNotifyHandler", "consumeNewXml subType:%s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x51.j1.g(p0Var.f152259a.f459094h))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PCWxaLaunchAppNotifyHandler", "msg content is null");
            return null;
        }
        if (map.get(".sysmsg.PCWxaLaunchNotify") == null) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.path");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.appid");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.version_type"), 0);
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.system_popup_text");
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.scene_note");
        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.notification_content");
        boolean y17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y((java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.need_notification"), false);
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.expire_time"), 0L);
        long b17 = c01.id.b();
        boolean z17 = (b17 / 1000) - V > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaLaunchAppNotifyHandler", "appId:%s, expireTime:%d, path:%s, currentServerTime:%d, expire:%b", str3, java.lang.Long.valueOf(V), str2, java.lang.Long.valueOf(b17), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaLaunchAppNotifyHandler", "needNotification:%b, notificationContent:%s, systemPopupText:%s", java.lang.Boolean.valueOf(y17), str6, str4);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !z17) {
            boolean mo40975xf7b3660d = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d();
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = str3;
            b1Var.f398549c = P;
            b1Var.f398567l = str5;
            b1Var.f398555f = str2;
            b1Var.f398565k = 1392;
            b1Var.f398560h0 = str4;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaLaunchAppNotifyHandler", "launchCommon2");
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.plugin.appbrand.message.ui.PCWxaLaunchNotifyProxyActivity");
            intent.putExtra("appid", str3);
            intent.putExtra("enter_path", str2);
            intent.putExtra("version_type", P);
            intent.putExtra("sceneNote", str5);
            intent.putExtra("system_popup_text", str4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaLaunchAppNotifyHandler", "isForeground:%b", java.lang.Boolean.valueOf(mo40975xf7b3660d));
            if (y17 && !mo40975xf7b3660d) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new oh1.x0(this, str6, intent), 2000L);
                return null;
            }
        }
        return null;
    }
}
