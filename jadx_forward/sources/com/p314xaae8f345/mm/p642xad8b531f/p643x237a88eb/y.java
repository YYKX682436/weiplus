package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes14.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f145062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f145063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145064g;

    public y(java.lang.String str, long j17, int i17, java.lang.String str2) {
        this.f145061d = str;
        this.f145062e = j17;
        this.f145063f = i17;
        this.f145064g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        java.lang.String str = this.f145061d;
        long j17 = this.f145062e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = cj6.o2(str, j17);
        if (o27 == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6859x9a5db792 c6859x9a5db792 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6859x9a5db792();
        c6859x9a5db792.f141771d = this.f145063f;
        c6859x9a5db792.f141776i = o27.mo78012x3fdd41df() / 1000;
        c6859x9a5db792.f141772e = java.lang.System.currentTimeMillis() / 1000;
        c6859x9a5db792.f141775h = c6859x9a5db792.b("Content", this.f145064g, true);
        try {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(o27.j(), "msg", null);
            java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username");
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str4 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_type");
            if (str4 == null) {
                str4 = "";
            }
            c6859x9a5db792.f141777j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str4, 0);
            c6859x9a5db792.f141774g = c6859x9a5db792.b("MsgId", pm0.v.u(j17), true);
            java.lang.String str5 = (java.lang.String) d17.get(".msg.fromusername");
            if (str5 == null) {
                str5 = "";
            }
            c6859x9a5db792.f141773f = c6859x9a5db792.b("UserName", str5, true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                c6859x9a5db792.f141773f = c6859x9a5db792.b("UserName", str2, true);
                java.lang.String str6 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
                if (str6 == null) {
                    str6 = "";
                }
                c6859x9a5db792.f141780m = c6859x9a5db792.b("feedId", str6, true);
                java.lang.String str7 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id");
                if (str7 != null) {
                    str3 = str7;
                }
                c6859x9a5db792.f141779l = c6859x9a5db792.b("liveId", str3, true);
            }
            c6859x9a5db792.f141778k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6859x9a5db792.f141773f) ? 0L : com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qg.c(c6859x9a5db792.f141773f);
            c6859x9a5db792.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNotificationReportHelper", "report 32761, " + c6859x9a5db792.n());
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMNotificationReportHelper", e17, "reportServiceNotifyNotification", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMNotificationReportHelper", th6, "reportServiceNotifyNotification", new java.lang.Object[0]);
        }
    }
}
