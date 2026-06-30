package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdProxyUI */
/* loaded from: classes12.dex */
public class ActivityC18009xc0007d67 extends com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f248304e = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f248305d = false;

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResources", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        if (getAssets() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e == null) {
            android.content.res.Resources resources = super.getResources();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResources", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            return resources;
        }
        android.content.res.Resources resources2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResources", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        return resources2;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.iw5 iw5Var;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdBlankUI", "intent null!");
            finish();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            return;
        }
        int intExtra = intent.getIntExtra("action_type", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdBlankUI", "action=" + intExtra);
        if (intExtra < 0) {
            finish();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delAction", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdBlankUI", "delAction， action=" + intExtra);
        if (intExtra == 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
            am.r3 r3Var = c5292x67f91197.f135612g;
            r3Var.f89314b = this;
            r3Var.f89313a = intent.getStringExtra("qrcodeStr");
            r3Var.f89315c = intent.getIntExtra("qrcodeType", 0);
            r3Var.f89316d = intent.getIntExtra("qrcodeVer", 0);
            r3Var.f89321i = 30;
            java.lang.String stringExtra = intent.getStringExtra("aid");
            int intExtra2 = intent.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            int intExtra3 = intent.getIntExtra("ad_scene", 0);
            r45.u2 u2Var = new r45.u2();
            u2Var.f468486e = ca4.z0.F0(stringExtra);
            u2Var.f468485d = intExtra3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdBlankUI", "aid is " + stringExtra + ", scene is " + intExtra2 + ", adScene is " + intExtra3 + ", long type aid is " + u2Var.f468486e);
            jd0.d2 d2Var = (jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class));
            d2Var.getClass();
            d2Var.wi(c5292x67f91197);
            r45.bx5 bx5Var = r3Var.f89328p.f453814d;
            bx5Var.f452665d = intExtra2;
            bx5Var.f452669h = u2Var;
            c5292x67f91197.e();
            this.f248305d = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ud(this), 2000L);
        } else if (intExtra == 2) {
            java.lang.String stringExtra2 = intent.getStringExtra(dm.i4.f66875xa013b0d5);
            java.lang.String stringExtra3 = intent.getStringExtra("url");
            java.lang.String stringExtra4 = intent.getStringExtra("sceneNote");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f88999a = stringExtra2;
            nxVar.f89000b = stringExtra3;
            nxVar.f89002d = 1084;
            nxVar.f89003e = stringExtra4;
            nxVar.f89004f = this;
            c6113xa3727625.e();
            finish();
        } else {
            java.lang.String str = "";
            if (intExtra == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOpenProfile", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
                byte[] byteArrayExtra = intent.getByteArrayExtra("searchContactResponseByte");
                java.lang.String stringExtra5 = intent.getStringExtra("searchWord");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (stringExtra5 == null) {
                    stringExtra5 = "";
                }
                try {
                    iw5Var = new r45.iw5();
                    linkedList = iw5Var.E;
                    iw5Var.mo11468x92b714fd(byteArrayExtra);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdBlankUI", "doOpenProfile, query=" + stringExtra5 + ", count=" + iw5Var.D);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdBlankUI", "parse GetWXUserNameResp exp=" + th6.toString());
                }
                if (iw5Var.D <= 0) {
                    java.lang.String g17 = x51.j1.g(iw5Var.f458889d);
                    if (g17 != null) {
                        str = g17;
                    }
                    if (str.length() > 0) {
                        android.content.Intent intent2 = new android.content.Intent();
                        ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).Ai(intent2, iw5Var, 182);
                        intent2.putExtra("Contact_Scene", 182);
                        intent2.putExtra("add_more_friend_search_scene", 2);
                        j45.l.j(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
                    }
                } else if (linkedList.isEmpty()) {
                    db5.e1.o(this, com.p314xaae8f345.mm.R.C30867xcad56011.icr, 0, true, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOpenProfile", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
                    finish();
                } else {
                    android.content.Intent intent3 = new android.content.Intent();
                    ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).wi(intent3, (r45.gw5) linkedList.getFirst(), 182);
                    j45.l.j(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent3, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOpenProfile", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
                finish();
            } else if (intExtra == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
                try {
                    java.lang.String stringExtra6 = intent.getStringExtra("finderUsername");
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (stringExtra6 == null) {
                        stringExtra6 = "";
                    }
                    java.lang.String stringExtra7 = intent.getStringExtra("uxInfo");
                    if (stringExtra7 == null) {
                        stringExtra7 = "";
                    }
                    java.lang.String stringExtra8 = intent.getStringExtra("snsIdStr");
                    if (stringExtra8 != null) {
                        str = stringExtra8;
                    }
                    l44.s4.h(this, stringExtra6, stringExtra7, str, intent.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0));
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdBlankUI", "doJumpToFinderProfileUI, exp=" + th7.toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
                finish();
            } else {
                finish();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delAction", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        super.onStop();
        if (this.f248305d && !isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdBlankUI", "finish, onStop");
            this.f248305d = false;
            finish();
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
    }
}
