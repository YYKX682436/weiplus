package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class wd implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28 f252278d;

    public wd(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28 activityC18010xd5ae6b28) {
        this.f252278d = activityC18010xd5ae6b28;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.lang.String str2;
        int i18;
        java.lang.String str3 = "onMMMenuItemSelected";
        java.lang.String str4 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2");
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28 activityC18010xd5ae6b28 = this.f252278d;
        switch (itemId) {
            case 1002:
                str = "onMMMenuItemSelected";
                str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28.K;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                activityC18010xd5ae6b28.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doTransmit", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("select_is_ret", true);
                intent.putExtra("mutil_select_is_ret", true);
                intent.putExtra("ad_video_title", activityC18010xd5ae6b28.f248317q);
                intent.putExtra("Retr_Msg_Type", 2);
                j45.l.v(activityC18010xd5ae6b28, ".ui.transmit.SelectConversationUI", intent, 999);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doTransmit", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                break;
            case 1003:
                str = "onMMMenuItemSelected";
                str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28.K;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                activityC18010xd5ae6b28.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shareToSns", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Ksnsupload_link", activityC18010xd5ae6b28.f248311h);
                intent2.putExtra("Ksnsupload_type", 11);
                intent2.putExtra("Ksnsupload_title", activityC18010xd5ae6b28.f248317q);
                intent2.putExtra("Ksnsupload_imgurl", activityC18010xd5ae6b28.f248312i);
                intent2.putExtra("KSnsStreamVideoTotalTime", activityC18010xd5ae6b28.f248306J);
                intent2.putExtra("KSnsStreamVideoWroding", activityC18010xd5ae6b28.G);
                intent2.putExtra("KSnsStreamVideoWebUrl", activityC18010xd5ae6b28.H);
                intent2.putExtra("KSnsStreamVideoAduxInfo", activityC18010xd5ae6b28.f248320t);
                intent2.putExtra("KSnsStreamVideoPublishId", activityC18010xd5ae6b28.f248321u);
                intent2.putExtra("need_result", true);
                intent2.putExtra("key_snsad_statextstr", activityC18010xd5ae6b28.E);
                int i28 = activityC18010xd5ae6b28.f248323w;
                java.lang.String str5 = "sns_";
                if (i28 == i64.o1.Sight.f370802d || i28 == i64.o1.AdUrl.f370802d) {
                    str5 = "sns_" + activityC18010xd5ae6b28.f248326z;
                } else if (i28 == i64.o1.Chat.f370802d || i28 == i64.o1.TalkChat.f370802d) {
                    str5 = "msg_" + activityC18010xd5ae6b28.A;
                } else if (i28 == i64.o1.Fav.f370802d) {
                    str5 = "fav_" + c01.z1.r() + "_" + activityC18010xd5ae6b28.B;
                }
                java.lang.String a17 = c01.n2.a(str5);
                c01.n2.d().c(a17, true).i("prePublishId", str5);
                intent2.putExtra("reportSessionId", a17);
                intent2.setClass(activityC18010xd5ae6b28, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.class);
                activityC18010xd5ae6b28.startActivityForResult(intent2, ce1.f.f4364x366c91de);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareToSns", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                break;
            case 1004:
                int i29 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28.K;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                activityC18010xd5ae6b28.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doFavorite", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) ((o72.c5) i95.n0.c(o72.c5.class))).wi(c5303xc75d2f73, 0, activityC18010xd5ae6b28.f248306J, activityC18010xd5ae6b28.f248317q, "", activityC18010xd5ae6b28.f248311h, activityC18010xd5ae6b28.G, activityC18010xd5ae6b28.H, activityC18010xd5ae6b28.f248312i, activityC18010xd5ae6b28.f248313m, activityC18010xd5ae6b28.f248324x, activityC18010xd5ae6b28.f248320t, activityC18010xd5ae6b28.f248321u, activityC18010xd5ae6b28.E);
                am.c4 c4Var = c5303xc75d2f73.f135623g;
                c4Var.f87856i = activityC18010xd5ae6b28;
                c4Var.f87860m = 24;
                c5303xc75d2f73.e();
                if (c5303xc75d2f73.f135624h.f87966a != 0 || (i18 = activityC18010xd5ae6b28.f248323w) == 0) {
                    str = "onMMMenuItemSelected";
                    str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
                } else {
                    str = "onMMMenuItemSelected";
                    str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
                    i64.s1.e(i64.p1.Fav, activityC18010xd5ae6b28.f248321u, activityC18010xd5ae6b28.f248320t, activityC18010xd5ae6b28.f248322v, i18, activityC18010xd5ae6b28.f248324x, activityC18010xd5ae6b28.f248325y, activityC18010xd5ae6b28.f248326z, activityC18010xd5ae6b28.A, activityC18010xd5ae6b28.B, activityC18010xd5ae6b28.C, 0);
                }
                if (activityC18010xd5ae6b28.D) {
                    ca4.z0.x0(new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(0, 6, activityC18010xd5ae6b28.I.f68891x29d1292e, 11, 0));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFavorite", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                break;
        }
        str3 = str;
        str4 = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str4);
    }
}
