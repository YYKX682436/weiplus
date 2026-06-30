package fc4;

/* loaded from: classes4.dex */
public final class g0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc4.j0 f342691d;

    public g0(fc4.j0 j0Var) {
        this.f342691d = j0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$menuItemSelectedListener$1");
        int itemId = menuItem.getItemId();
        fc4.j0 j0Var = this.f342691d;
        if (itemId == 1003) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(fc4.j0.O6(j0Var));
            if (k17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$menuItemSelectedListener$1");
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8 c6109xec0badb8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8();
            am.ix ixVar = c6109xec0badb8.f136385g;
            ixVar.f88513a = 1;
            ixVar.f88517e = 4097;
            ixVar.f88516d = fc4.j0.O6(j0Var);
            c6109xec0badb8.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k7.f245900a.c(k17, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 5");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6751x48475a11 c6751x48475a11 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6751x48475a11();
            c6751x48475a11.f140801e = (long) 2;
            c6751x48475a11.f140800d = (long) 5;
            c6751x48475a11.f140802f = 3L;
            c6751x48475a11.k();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        } else if (itemId == 1004) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(fc4.j0.O6(j0Var));
            if (k18 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$menuItemSelectedListener$1");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsOnlineVideoActivity", "expose id " + k18.m70367x7525eefd());
            intent.putExtra("k_expose_msg_id", k18.m70367x7525eefd());
            intent.putExtra("k_username", k18.f68896xdde069b);
            intent.putExtra("showShare", false);
            java.lang.String KExposeH5Url = com.p314xaae8f345.mm.ui.n2.f290931a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KExposeH5Url, "KExposeH5Url");
            java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{33}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            intent.putExtra("rawUrl", format);
            j45.l.j(j0Var.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        } else if (itemId == 1006) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8 c6109xec0badb82 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8();
            am.ix ixVar2 = c6109xec0badb82.f136385g;
            ixVar2.f88513a = 2;
            ixVar2.f88514b = 17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getScene$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            int i18 = j0Var.f342705e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getScene$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            ixVar2.f88515c = i18 == 0;
            ixVar2.f88516d = fc4.j0.O6(j0Var);
            c6109xec0badb82.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 8");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6751x48475a11 c6751x48475a112 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6751x48475a11();
            c6751x48475a112.f140801e = (long) 2;
            c6751x48475a112.f140800d = (long) 8;
            c6751x48475a112.f140802f = 3L;
            c6751x48475a112.k();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        } else if (itemId == 1008) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(fc4.j0.O6(j0Var));
            if (k19 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$menuItemSelectedListener$1");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            if (k19.m70371x485d7().f39014x86965dde.f451370e == 15 && ((r45.jj4) k19.m70371x485d7().f39014x86965dde.f451373h.get(0)) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsOnlineVideoActivity", "send sight fail, mediaObj is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$menuItemSelectedListener$1");
                return;
            } else {
                intent2.putExtra("exdevice_open_scene_type", 2);
                intent2.putExtra("sns_local_id", fc4.j0.O6(j0Var));
                intent2.putExtra("sns_send_data_ui_activity", true);
                j45.l.u(j0Var.m80379x76847179(), ".ui.chatting.ChattingSendDataToDeviceUI", intent2, null);
            }
        } else if (itemId == 1013) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8 c6109xec0badb83 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8();
            am.ix ixVar3 = c6109xec0badb83.f136385g;
            ixVar3.f88513a = 3;
            ixVar3.f88516d = fc4.j0.O6(j0Var);
            c6109xec0badb83.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 6");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6751x48475a11 c6751x48475a113 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6751x48475a11();
            c6751x48475a113.f140801e = (long) 2;
            c6751x48475a113.f140800d = (long) 6;
            c6751x48475a113.f140802f = 3L;
            c6751x48475a113.k();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$menuItemSelectedListener$1");
    }
}
