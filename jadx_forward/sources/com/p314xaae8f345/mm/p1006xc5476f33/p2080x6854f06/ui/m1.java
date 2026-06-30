package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes9.dex */
public class m1 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4 f243842a;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4 activityC17681x5e0a88e4) {
        this.f243842a = activityC17681x5e0a88e4;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4 activityC17681x5e0a88e4 = this.f243842a;
        if (i18 == -1) {
            db5.e1.b(activityC17681x5e0a88e4.mo55332x76847179(), activityC17681x5e0a88e4.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571902t2), null, null, activityC17681x5e0a88e4.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.l1(this));
            return;
        }
        if (i18 == 0) {
            if (activityC17681x5e0a88e4.f243762i == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TVInfoUI", "shareToFriend, but tv is null");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10987, 4, "", "", "");
            java.lang.String c17 = j34.j.c(activityC17681x5e0a88e4.mo55332x76847179(), activityC17681x5e0a88e4.f243762i);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", c17);
            intent.putExtra("Retr_Msg_Type", 2);
            j34.h hVar = activityC17681x5e0a88e4.f243765o;
            if (hVar != null && activityC17681x5e0a88e4.f243766p) {
                intent.putExtra("Retr_Msg_thumb_path", hVar.k());
            }
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.v(intent, activityC17681x5e0a88e4);
            return;
        }
        if (i18 == 1) {
            if (activityC17681x5e0a88e4.f243762i == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TVInfoUI", "shareToTimeLine, but tv is null");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10987, 3, "", "", "");
            android.content.Intent intent2 = new android.content.Intent();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC17681x5e0a88e4.f243762i.f72372x29dfadaa)) {
                intent2.putExtra("KContentObjDesc", activityC17681x5e0a88e4.f243762i.f72369xa2f255bd);
            } else {
                intent2.putExtra("KContentObjDesc", activityC17681x5e0a88e4.f243762i.f72372x29dfadaa);
            }
            intent2.putExtra("Ksnsupload_title", activityC17681x5e0a88e4.f243762i.f72371x29dd02d3);
            intent2.putExtra("Ksnsupload_link", activityC17681x5e0a88e4.f243762i.f72367xf16e7ed5);
            intent2.putExtra("Ksnsupload_appname", activityC17681x5e0a88e4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574466ib3));
            if (h34.z.e()) {
                intent2.putExtra("Ksnsupload_appid", "wxaf060266bfa9a35c");
            }
            intent2.putExtra("Ksnsupload_imgurl", activityC17681x5e0a88e4.f243762i.f72370x7b28c57e);
            j34.h hVar2 = activityC17681x5e0a88e4.f243765o;
            if (hVar2 != null && activityC17681x5e0a88e4.f243766p) {
                intent2.putExtra("KsnsUpload_imgPath", hVar2.k());
            }
            intent2.putExtra("Ksnsupload_type", 5);
            intent2.putExtra("KUploadProduct_UserData", j34.j.a(activityC17681x5e0a88e4.f243762i));
            java.lang.String a17 = c01.n2.a("shake_tv");
            c01.n2.d().c(a17, true).i("prePublishId", "shake_tv");
            intent2.putExtra("reportSessionId", a17);
            j45.l.j(activityC17681x5e0a88e4, "sns", ".ui.SnsUploadUI", intent2, null);
            return;
        }
        if (i18 != 2) {
            return;
        }
        if (activityC17681x5e0a88e4.f243762i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TVInfoUI", "do favorite, but tv is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10987, 5, "", "", "");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.mq0 mq0Var = new r45.mq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(8);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        if (h34.z.e()) {
            jq0Var.b("wxaf060266bfa9a35c");
        }
        mq0Var.g(activityC17681x5e0a88e4.f243762i.f72371x29dd02d3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC17681x5e0a88e4.f243762i.f72372x29dfadaa)) {
            mq0Var.d(activityC17681x5e0a88e4.f243762i.f72369xa2f255bd);
        } else {
            mq0Var.d(activityC17681x5e0a88e4.f243762i.f72372x29dfadaa);
        }
        mq0Var.e(j34.j.a(activityC17681x5e0a88e4.f243762i));
        mq0Var.f(activityC17681x5e0a88e4.f243762i.f72370x7b28c57e);
        j34.i iVar = activityC17681x5e0a88e4.f243762i;
        java.lang.String str = iVar.f72371x29dd02d3;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87851d = str;
        c4Var.f87852e = iVar.f72372x29dfadaa;
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 15;
        bq0Var.o(jq0Var);
        bq0Var.q(mq0Var);
        c4Var.f87860m = 12;
        c4Var.f87856i = activityC17681x5e0a88e4;
        c5303xc75d2f73.e();
    }
}
