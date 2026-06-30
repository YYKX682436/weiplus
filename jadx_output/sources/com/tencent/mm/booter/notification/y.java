package com.tencent.mm.booter.notification;

/* loaded from: classes14.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f63528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f63529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f63530f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f63531g;

    public y(java.lang.String str, long j17, int i17, java.lang.String str2) {
        this.f63528d = str;
        this.f63529e = j17;
        this.f63530f = i17;
        this.f63531g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        java.lang.String str = this.f63528d;
        long j17 = this.f63529e;
        com.tencent.mm.storage.f9 o27 = cj6.o2(str, j17);
        if (o27 == null) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.ServiceNofityNotificationReportStruct serviceNofityNotificationReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ServiceNofityNotificationReportStruct();
        serviceNofityNotificationReportStruct.f60238d = this.f63530f;
        serviceNofityNotificationReportStruct.f60243i = o27.getCreateTime() / 1000;
        serviceNofityNotificationReportStruct.f60239e = java.lang.System.currentTimeMillis() / 1000;
        serviceNofityNotificationReportStruct.f60242h = serviceNofityNotificationReportStruct.b("Content", this.f63531g, true);
        try {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(o27.j(), "msg", null);
            java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username");
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str4 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_type");
            if (str4 == null) {
                str4 = "";
            }
            serviceNofityNotificationReportStruct.f60244j = com.tencent.mm.sdk.platformtools.t8.D1(str4, 0);
            serviceNofityNotificationReportStruct.f60241g = serviceNofityNotificationReportStruct.b("MsgId", pm0.v.u(j17), true);
            java.lang.String str5 = (java.lang.String) d17.get(".msg.fromusername");
            if (str5 == null) {
                str5 = "";
            }
            serviceNofityNotificationReportStruct.f60240f = serviceNofityNotificationReportStruct.b("UserName", str5, true);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str5) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                serviceNofityNotificationReportStruct.f60240f = serviceNofityNotificationReportStruct.b("UserName", str2, true);
                java.lang.String str6 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
                if (str6 == null) {
                    str6 = "";
                }
                serviceNofityNotificationReportStruct.f60247m = serviceNofityNotificationReportStruct.b("feedId", str6, true);
                java.lang.String str7 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id");
                if (str7 != null) {
                    str3 = str7;
                }
                serviceNofityNotificationReportStruct.f60246l = serviceNofityNotificationReportStruct.b("liveId", str3, true);
            }
            serviceNofityNotificationReportStruct.f60245k = com.tencent.mm.sdk.platformtools.t8.K0(serviceNofityNotificationReportStruct.f60240f) ? 0L : com.tencent.mm.ui.chatting.viewitems.qg.c(serviceNofityNotificationReportStruct.f60240f);
            serviceNofityNotificationReportStruct.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMNotificationReportHelper", "report 32761, " + serviceNofityNotificationReportStruct.n());
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMNotificationReportHelper", e17, "reportServiceNotifyNotification", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMNotificationReportHelper", th6, "reportServiceNotifyNotification", new java.lang.Object[0]);
        }
    }
}
