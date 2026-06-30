package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class u extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f250533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        f250533d = O6(activity);
    }

    public final boolean O6(android.app.Activity activity) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        if (com.p314xaae8f345.mm.ui.bk.v0()) {
            z17 = fp.h.c(30) && com.p314xaae8f345.mm.ui.ee.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (activity != null) {
                z17 = ((!com.p314xaae8f345.mm.ui.bk.N(activity.getTaskId()) && (!com.p314xaae8f345.mm.ui.bk.O(activity.getContentResolver()) || activity.isInMultiWindowMode())) || com.p314xaae8f345.mm.ui.ee.b(activity.getTaskId())) ? z17 : true;
            }
        } else {
            z17 = false;
        }
        tc4.n1 n1Var = tc4.x1.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRightPanel_Max_Ava_Width", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateRightPanelMaxAvaWidth", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        int i17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        int a17 = n1Var.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvatar_Margin_Left", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAvatar_Margin_Left$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        jz5.g gVar = tc4.x1.T;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAvatar_Margin_Left$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        int intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatar_Margin_Left", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        int f17 = i17 - (((a17 + intValue) + n1Var.f()) + (n1Var.c() * 2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateRightPanelMaxAvaWidth", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRightPanel_Max_Ava_Width", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        boolean z18 = (!z17 || f17 > n1Var.d()) ? z17 : false;
        f250533d = z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.ConfigUIC", "enableLargeUI: " + z18 + ", firstCheck=" + z17 + ", RightPanelMaxAvaWidth=" + f17 + ", LargeRightPanelLayoutWidth=" + n1Var.d());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        return z18;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.ConfigUIC", "onConfigurationChanged:");
        f250533d = O6(m158354x19263085());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        ka4.n nVar = ka4.n.f387680a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTPPlayerConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        if (nVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadStrategy", "updateTPPlayerConfig");
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_switch_video_config, "", true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi, "getExpt(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPConfig", "updateTPConfig serverConfig:".concat(Zi));
            if (!android.text.TextUtils.isEmpty(Zi)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
                    ck4.a.f124060a = jSONObject.optInt("local_buffer_kb", ck4.a.f124060a);
                    ck4.a.f124061b = jSONObject.optInt("local_send_socket_kb", ck4.a.f124061b);
                    ck4.a.f124062c = jSONObject.optBoolean("switch_strategy_enable", ck4.a.f124062c);
                    ck4.a.f124063d = jSONObject.optLong("buffer_packet_ms", ck4.a.f124063d);
                    ck4.a.f124064e = jSONObject.optLong("left_packet_queue_ms", ck4.a.f124064e);
                    ck4.a.f124065f = jSONObject.optInt("tcp_recv_buffer_kb", ck4.a.f124065f);
                    ck4.a.f124066g = jSONObject.optInt("switch_video_limit_ms", ck4.a.f124066g);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPConfig", "updateTPConfig TP_LOCAL_BUFFER_KB:" + ck4.a.f124060a + " TP_LOCAL_SEND_SOCKET_KB:" + ck4.a.f124061b + " TP_SWITCH_STRATEGY_ENABLE:" + ck4.a.f124062c + " TP_BUFFER_PACKET_MS:" + ck4.a.f124063d + " TP_LEFT_PACKET_QUEUE_MS:" + ck4.a.f124064e + " TP_TCP_RECV_BUFFER_KB:" + ck4.a.f124065f);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TPConfig", e17, "updateTPConfig parse json error!", new java.lang.Object[0]);
                }
            }
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 c26466xe7648225 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225();
            c26466xe7648225.f53874x8d0f678f = 100;
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            c26466xe7648225.f53869x56050483 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183669e;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            int i17 = ck4.a.f124060a * 1024;
            if (i17 > 0) {
                jSONObject2.put("key_localserver_buffer_size", i17);
            }
            int i18 = ck4.a.f124061b * 1024;
            if (i18 > 0) {
                jSONObject2.put("key_localserver_send_socket_buffer_size", i18);
            }
            c26466xe7648225.f53870xf3d9c872 = jSONObject2.toString();
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103101xd1ade98e(c26466xe7648225);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTPPlayerConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSwitch", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        ma4.a.f406753d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_timeline_preload_switch, true);
        ma4.a.f406754e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_timeline_preload_time, "20:00-23:59", true);
        ma4.a.f406755f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_preload_nettype, 1);
        ma4.a.f406750a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_preload_in_queue, 6);
        ma4.a.f406751b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_parallel_in_queue, 3);
        ma4.a.f406752c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_max_preload, 1000);
        ma4.a.f406756g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_preload_percent, 60);
        ma4.a.f406758i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_timeline_preload_time_min, 4.0f);
        ma4.a.f406759j = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_timeline_preload_time_max, 8.0f);
        ma4.a.f406760k = ma4.a.c();
        ma4.a.f406761l = ma4.a.b();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsPreloadSwitch", "TIMELINE_MAIN_SWITCH:%b\nTIMELINE_DAY_UNABLE_PRELOAD_TIME_INTERVAL:%s\nTIMELINE_PRELOAD_NET_TYPE:%d\nTIMELINE_MAX_PRELOAD_IN_QUEUE:%d\nTIMELINE_MAX_PARALLEL_IN_QUEUE:%d\n TIMELINE_MAX_PRELOAD_COUNT:%d\nTIMELINE_PRELOAD_PERCENT:%d\nTIMELINE_OUT_PRELOAD_INTERVAL:%d\nSNS_RED_DOT_PRELOAD:%d\n SNS_PRELOAD_VIDEO_EXPIRED_TIME:%d\nSNS_RED_DOT_PRELOAD_BUSY_TIME:%s", java.lang.Boolean.valueOf(ma4.a.f406753d), ma4.a.f406754e, java.lang.Integer.valueOf(ma4.a.f406755f), java.lang.Integer.valueOf(ma4.a.f406750a), java.lang.Integer.valueOf(ma4.a.f406751b), java.lang.Integer.valueOf(ma4.a.f406752c), java.lang.Integer.valueOf(ma4.a.f406756g), java.lang.Integer.valueOf(ma4.a.f406757h), java.lang.Integer.valueOf(ma4.a.f406760k), java.lang.Integer.valueOf(ma4.a.f406761l), "20:00-23:59");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSwitch", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
    }
}
