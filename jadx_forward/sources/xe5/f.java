package xe5;

/* loaded from: classes10.dex */
public final class f extends xe5.g0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f535554i = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f535555h = "FinderLiveGameTeamUpNotifyTmpl";

    @Override // xe5.g0, xe5.i0
    public void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fl flVar, java.util.Map values, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d ui6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        xe5.i iVar = flVar != null ? (xe5.i) flVar.a("TipsTempl_GamePurchaseTeamUp_Live") : null;
        java.lang.String str = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        long Z = pm0.v.Z(str);
        java.lang.String str2 = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id");
        if (str2 == null) {
            str2 = "";
        }
        long Z2 = pm0.v.Z(str2);
        java.lang.String str3 = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_nonce_id");
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id");
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String str7 = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_id");
        java.lang.String str8 = str7 == null ? "" : str7;
        java.lang.String str9 = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username");
        java.lang.String str10 = str9 == null ? "" : str9;
        java.lang.String str11 = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.msg_type");
        java.lang.String str12 = str11 != null ? str11 : "";
        boolean z18 = xe5.g0.f535559g.getBoolean(str10.concat("_game_team"), false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535555h, "msgType: " + str12 + ", " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str12, 0));
        java.lang.String str13 = str10;
        f(values, ".msg.appmsg.extinfo.notifymsg", iVar, z18, "", str8, ui6, Z, Z2, str4, f9Var, str13, str6, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str12, 0));
        android.view.View view = iVar.f535577e;
        if (view != null) {
            view.setOnClickListener(new xe5.e(this, ui6, str13, values, ".msg.appmsg.extinfo.notifymsg", Z2, Z, iVar));
        }
    }

    @Override // xe5.g0
    public java.lang.String d() {
        return this.f535555h;
    }

    @Override // xe5.g0
    public void e(java.lang.String str, long j17, long j18, dm.r4 info, long j19, java.lang.String tipsId, java.lang.String noticeId, xe5.i iVar, java.lang.String str2, int i17, java.lang.String str3) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsId, "tipsId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
    }
}
