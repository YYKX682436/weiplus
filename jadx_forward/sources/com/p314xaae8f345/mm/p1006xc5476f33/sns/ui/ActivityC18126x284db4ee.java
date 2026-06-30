package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTransparentUI */
/* loaded from: classes4.dex */
public class ActivityC18126x284db4ee extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f249013e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f249014d = new java.util.HashMap();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        super.onCreate(bundle);
        this.f39322x2305be9.J();
        android.content.Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("op", -1);
            if (intExtra == 2) {
                java.lang.String stringExtra = intent.getStringExtra("adlandingXml");
                java.lang.String stringExtra2 = intent.getStringExtra("shareTitle");
                java.lang.String stringExtra3 = intent.getStringExtra("shareThumbUrl");
                java.lang.String stringExtra4 = intent.getStringExtra("shareDesc");
                java.lang.String stringExtra5 = intent.getStringExtra("shareUrl");
                java.lang.String stringExtra6 = intent.getStringExtra("statExtStr");
                java.lang.String stringExtra7 = intent.getStringExtra("uxInfo");
                java.lang.String stringExtra8 = intent.getStringExtra("canvasId");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doTransimt", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsTransparentUI", "doTransimt snsAdNativeLadingPagesUI");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsTransparentUI.Share", "uxInfo = " + stringExtra7 + ", canvasId = " + stringExtra8);
                java.lang.String r17 = c01.z1.r();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "openAdCanvasPage doTransmit in SnsTransparentUI, uxInfo is " + stringExtra7 + ", selfUserName is " + r17);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Conv_Type", com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4);
                intent2.putExtra("select_is_ret", true);
                j45.l.w(this, ".ui.transmit.SelectConversationUI", intent2, 0, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.at(this, stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, r17, stringExtra8));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doTransimt", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                str = "onCreate";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
            }
            if (intExtra == 4) {
                java.lang.String stringExtra9 = intent.getStringExtra("phoneNum");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDial", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.q qVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.p.f272806a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bt btVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bt(this);
                android.os.Bundle bundle2 = new android.os.Bundle();
                ((ez.z0) qVar).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u0.d(this, stringExtra9, btVar, bundle2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDial", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
            }
        }
        str = "onCreate";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
    }
}
