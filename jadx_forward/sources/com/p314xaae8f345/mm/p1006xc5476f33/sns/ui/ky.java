package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class ky implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ly f251230a;

    public ky(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ly lyVar) {
        this.f251230a = lyVar;
    }

    @Override // db5.c1
    public void e(int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ly lyVar = this.f251230a;
        if (i17 == 0) {
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1";
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("select_is_ret", true);
            intent.putExtra("mutil_select_is_ret", true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933 activityC18151xfc5a9933 = lyVar.f251413d;
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            java.lang.String str5 = activityC18151xfc5a9933.f249200r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            intent.putExtra("ad_video_title", str5);
            intent.putExtra("Retr_Msg_Type", 2);
            j45.l.v(lyVar.f251413d, ".ui.transmit.SelectConversationUI", intent, 4097);
        } else if (i17 == 1) {
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933 activityC18151xfc5a99332 = lyVar.f251413d;
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            activityC18151xfc5a99332.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shareSns", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Ksnsupload_link", activityC18151xfc5a99332.f249194i);
            intent2.putExtra("Ksnsupload_type", 11);
            intent2.putExtra("Ksnsupload_title", activityC18151xfc5a99332.f249200r);
            intent2.putExtra("Ksnsupload_imgurl", activityC18151xfc5a99332.f249196n);
            intent2.putExtra("KSnsStreamVideoTotalTime", activityC18151xfc5a99332.f249188J.A);
            intent2.putExtra("KSnsStreamVideoWroding", activityC18151xfc5a99332.f249201s);
            intent2.putExtra("KSnsStreamVideoWebUrl", activityC18151xfc5a99332.f249202t);
            intent2.putExtra("KSnsStreamVideoAduxInfo", activityC18151xfc5a99332.f249203u);
            intent2.putExtra("KSnsStreamVideoPublishId", activityC18151xfc5a99332.f249204v);
            intent2.putExtra("need_result", true);
            intent2.putExtra("key_snsad_statextstr", activityC18151xfc5a99332.I);
            int i28 = activityC18151xfc5a99332.f249206x;
            java.lang.String str6 = "sns_";
            if (i28 == i64.o1.Sight.f370802d || i28 == i64.o1.AdUrl.f370802d) {
                str6 = "sns_" + activityC18151xfc5a99332.A;
            } else if (i28 == i64.o1.Chat.f370802d || i28 == i64.o1.TalkChat.f370802d) {
                str6 = "msg_" + activityC18151xfc5a99332.B;
            } else if (i28 == i64.o1.Fav.f370802d) {
                str6 = "fav_" + c01.z1.r() + "_" + activityC18151xfc5a99332.C;
            }
            java.lang.String a17 = c01.n2.a(str6);
            c01.n2.d().c(a17, true).i("prePublishId", str6);
            intent2.putExtra("reportSessionId", a17);
            j45.l.n(activityC18151xfc5a99332, "sns", ".ui.SnsUploadUI", intent2, 4098);
            if (activityC18151xfc5a99332.L != 0) {
                j64.b bVar = activityC18151xfc5a99332.f249191f.f370654i;
                int i29 = bVar.f379444c;
                if (activityC18151xfc5a99332.P) {
                    long j17 = bVar.f379448g;
                    if (j17 != 0) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        i29 += (int) ((android.os.SystemClock.elapsedRealtime() - j17) / 1000);
                    }
                }
                com.p314xaae8f345.mm.p959x883644fd.r rVar = new com.p314xaae8f345.mm.p959x883644fd.r(13228, "1,4," + i29 + "," + activityC18151xfc5a99332.M + "," + activityC18151xfc5a99332.N + "," + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + "," + activityC18151xfc5a99332.K + "," + activityC18151xfc5a99332.f249199q, (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                gm0.j1.i();
                gm0.j1.n().f354821b.g(rVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareSns", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        } else {
            if (i17 != 2) {
                str3 = "onClick";
                str4 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933 activityC18151xfc5a99333 = lyVar.f251413d;
            int i37 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            activityC18151xfc5a99333.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favVideo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
            r45.jj4 jj4Var = activityC18151xfc5a99333.f249188J;
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1";
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) c5Var).wi(c5303xc75d2f73, 0, jj4Var.A, activityC18151xfc5a99333.f249200r, "", jj4Var.f459408x, activityC18151xfc5a99333.f249201s, activityC18151xfc5a99333.f249202t, activityC18151xfc5a99333.f249196n, activityC18151xfc5a99333.f249193h, activityC18151xfc5a99333.f249207y, activityC18151xfc5a99333.f249203u, activityC18151xfc5a99333.f249204v, activityC18151xfc5a99333.I);
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87856i = activityC18151xfc5a99333;
            c4Var.f87860m = 24;
            c5303xc75d2f73.e();
            if (c5303xc75d2f73.f135624h.f87966a == 0 && (i18 = activityC18151xfc5a99333.f249206x) != 0) {
                i64.s1.e(i64.p1.Fav, activityC18151xfc5a99333.f249204v, activityC18151xfc5a99333.f249203u, activityC18151xfc5a99333.f249205w, i18, activityC18151xfc5a99333.f249207y, activityC18151xfc5a99333.f249208z, activityC18151xfc5a99333.A, activityC18151xfc5a99333.B, activityC18151xfc5a99333.C, activityC18151xfc5a99333.D, 0);
            }
            if (activityC18151xfc5a99333.f249198p) {
                ca4.z0.x0(new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(0, 6, activityC18151xfc5a99333.S.f68891x29d1292e, 11, 0));
            }
            if (activityC18151xfc5a99333.L != 0) {
                j64.b bVar2 = activityC18151xfc5a99333.f249191f.f370654i;
                int i38 = bVar2.f379444c;
                if (activityC18151xfc5a99333.P) {
                    long j18 = bVar2.f379448g;
                    if (j18 != 0) {
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        i38 += (int) ((android.os.SystemClock.elapsedRealtime() - j18) / 1000);
                    }
                }
                com.p314xaae8f345.mm.p959x883644fd.r rVar2 = new com.p314xaae8f345.mm.p959x883644fd.r(13228, "1,5," + i38 + "," + activityC18151xfc5a99333.M + "," + activityC18151xfc5a99333.N + "," + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + "," + activityC18151xfc5a99333.K + "," + activityC18151xfc5a99333.f249199q, (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                gm0.j1.i();
                gm0.j1.n().f354821b.g(rVar2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favVideo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        }
        str3 = str;
        str4 = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str4);
    }
}
