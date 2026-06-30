package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes15.dex */
public class o0 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 f241132a;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3) {
        this.f241132a = activityC17301x38c077a3;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3 = this.f241132a;
        e04.n3 n3Var = activityC17301x38c077a3.f240852q;
        if (n3Var == null) {
            return;
        }
        if (i18 == -1) {
            db5.e1.b(activityC17301x38c077a3.mo55332x76847179(), activityC17301x38c077a3.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571902t2), null, null, activityC17301x38c077a3.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.n0(this));
            return;
        }
        if (i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(11446, n3Var.f69639x5bec8545, 2);
            if (activityC17301x38c077a3.f240857v == 3) {
                z30.y yVar = (z30.y) i95.n0.c(z30.y.class);
                long longExtra = activityC17301x38c077a3.getIntent().getLongExtra("key_favorite_local_id", -1L);
                ((y30.w) yVar).getClass();
                o72.v2.d(longExtra, 1, 0);
                g0Var.d(10651, 10, 0, 0);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KContentObjDesc", activityC17301x38c077a3.f240852q.f69642xa2f255bd);
            intent.putExtra("Ksnsupload_title", activityC17301x38c077a3.f240852q.f69644x29dd02d3);
            intent.putExtra("Ksnsupload_link", activityC17301x38c077a3.f240852q.f69640xf16e7ed5);
            intent.putExtra("Ksnsupload_appname", e04.q3.b(activityC17301x38c077a3, activityC17301x38c077a3.f240852q.f69645x2262335f));
            intent.putExtra("Ksnsupload_appid", com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.k0.a(activityC17301x38c077a3.f240852q.f69632xff957a57));
            intent.putExtra("Ksnsupload_imgurl", activityC17301x38c077a3.f240852q.f69643x7b28c57e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.ProductUI", "product.field_thumburl : " + activityC17301x38c077a3.f240852q.f69643x7b28c57e);
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.b1 b1Var = activityC17301x38c077a3.f240861z;
            if (b1Var != null) {
                intent.putExtra("KsnsUpload_imgPath", b1Var.k());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.ProductUI", "imgGetStrategy is null");
            }
            intent.putExtra("Ksnsupload_type", 3);
            intent.putExtra("KUploadProduct_UserData", e04.q3.a(activityC17301x38c077a3.f240852q));
            intent.putExtra("KUploadProduct_subType", activityC17301x38c077a3.f240852q.f69645x2262335f);
            java.lang.String a17 = c01.n2.a("scan_product");
            c01.n2.d().c(a17, true).i("prePublishId", "scan_product");
            intent.putExtra("reportSessionId", a17);
            j45.l.j(activityC17301x38c077a3, "sns", ".ui.SnsUploadUI", intent, null);
            return;
        }
        if (i18 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.d(11446, n3Var.f69639x5bec8545, 1);
            java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.k0.c(activityC17301x38c077a3.mo55332x76847179(), activityC17301x38c077a3.f240852q);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Retr_Msg_content", c17);
            intent2.putExtra("Retr_Msg_Type", 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.b1 b1Var2 = activityC17301x38c077a3.f240861z;
            if (b1Var2 != null) {
                intent2.putExtra("Retr_Msg_thumb_path", b1Var2.k());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.ProductUI", "imgGetStrategy is null");
            }
            intent2.putExtra("Retr_go_to_chattingUI", false);
            intent2.putExtra("Retr_show_success_tips", true);
            ((com.p314xaae8f345.mm.app.y7) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.i1.a()).v(intent2, activityC17301x38c077a3);
            if (activityC17301x38c077a3.f240857v == 3) {
                g0Var2.d(10651, 10, 1, 0);
                return;
            }
            return;
        }
        if (i18 != 2) {
            if (i18 != 3) {
                if (i18 != 4) {
                    return;
                }
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("rawUrl", activityC17301x38c077a3.f240852q.f69629xb3d31626);
                j45.l.j(activityC17301x38c077a3.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent3, null);
                return;
            }
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("key_fav_scene", 2);
            intent4.putExtra("key_fav_item_id", activityC17301x38c077a3.getIntent().getLongExtra("key_favorite_local_id", -1L));
            z30.u uVar = (z30.u) i95.n0.c(z30.u.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17301x38c077a3.mo55332x76847179();
            ((y30.q) uVar).getClass();
            o72.x1.L0(mo55332x76847179, ".ui.FavTagEditUI", intent4, null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11446, n3Var.f69639x5bec8545, 3);
        if (activityC17301x38c077a3.f240852q == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.scanner.ProductUI", "do favorite, but product is null");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.aq0 aq0Var = new r45.aq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(8);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.b(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.k0.a(activityC17301x38c077a3.f240852q.f69632xff957a57));
        aq0Var.g(activityC17301x38c077a3.f240852q.f69644x29dd02d3);
        aq0Var.d(activityC17301x38c077a3.f240852q.f69642xa2f255bd);
        aq0Var.i(activityC17301x38c077a3.f240852q.f69645x2262335f);
        aq0Var.e(e04.q3.a(activityC17301x38c077a3.f240852q));
        aq0Var.f(activityC17301x38c077a3.f240852q.f69643x7b28c57e);
        e04.n3 n3Var2 = activityC17301x38c077a3.f240852q;
        java.lang.String str = n3Var2.f69644x29dd02d3;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87851d = str;
        c4Var.f87852e = n3Var2.f69642xa2f255bd;
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 10;
        bq0Var.o(jq0Var);
        bq0Var.n(aq0Var);
        c4Var.f87860m = 11;
        c4Var.f87856i = activityC17301x38c077a3;
        c5303xc75d2f73.e();
    }
}
