package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class rn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f f251961d;

    public rn(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f) {
        this.f251961d = accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$17");
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f = this.f251961d;
        if (itemId == 1003) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.C1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2602", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.f248862v = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2602", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8 c6109xec0badb8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8();
            am.ix ixVar = c6109xec0badb8.f136385g;
            ixVar.f88513a = 1;
            ixVar.f88517e = 4097;
            ixVar.f88516d = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.X6(accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f);
            c6109xec0badb8.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k7.f245900a.c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.U6(accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f), 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 5");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6751x48475a11 c6751x48475a11 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6751x48475a11();
            c6751x48475a11.f140801e = 2;
            c6751x48475a11.f140800d = 5;
            c6751x48475a11.f140802f = 3L;
            c6751x48475a11.k();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        } else if (itemId == 1004) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.X6(accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f));
            if (k17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsOnlineVideoActivity", "expose id " + k17.m70367x7525eefd());
            }
            intent.putExtra("k_expose_msg_id", k17 == null ? 0 : k17.m70367x7525eefd());
            intent.putExtra("k_username", k17 == null ? "" : k17.f68896xdde069b);
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", java.lang.String.format(com.p314xaae8f345.mm.ui.n2.f290931a, 33));
            j45.l.j(accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f, "webview", ".ui.tools.WebViewUI", intent, null);
        } else if (itemId == 1006) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8 c6109xec0badb82 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8();
            am.ix ixVar2 = c6109xec0badb82.f136385g;
            ixVar2.f88513a = 2;
            ixVar2.f88514b = 17;
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.C1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3500", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            int i27 = accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.f248848h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3500", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            ixVar2.f88515c = i27 == 0;
            ixVar2.f88516d = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.X6(accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f);
            c6109xec0badb82.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 8");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6751x48475a11 c6751x48475a112 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6751x48475a11();
            c6751x48475a112.f140801e = 2;
            c6751x48475a112.f140800d = 8;
            c6751x48475a112.f140802f = 3L;
            c6751x48475a112.k();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        } else if (itemId == 1008) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.X6(accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f));
            if (k18 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$17");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            if (k18.m70371x485d7().f39014x86965dde.f451370e == 15 && ((r45.jj4) k18.m70371x485d7().f39014x86965dde.f451373h.get(0)) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsOnlineVideoActivity", "send sight fail, mediaObj is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$17");
                return;
            } else {
                intent2.putExtra("exdevice_open_scene_type", 2);
                intent2.putExtra("sns_local_id", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.X6(accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f));
                intent2.putExtra("sns_send_data_ui_activity", true);
                j45.l.u(accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f, ".ui.chatting.ChattingSendDataToDeviceUI", intent2, null);
            }
        } else if (itemId == 1013) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8 c6109xec0badb83 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8();
            am.ix ixVar3 = c6109xec0badb83.f136385g;
            ixVar3.f88513a = 3;
            ixVar3.f88516d = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.X6(accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f);
            c6109xec0badb83.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 6");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6751x48475a11 c6751x48475a113 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6751x48475a11();
            c6751x48475a113.f140801e = 2;
            c6751x48475a113.f140800d = 6;
            c6751x48475a113.f140802f = 3L;
            c6751x48475a113.k();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$17");
    }
}
