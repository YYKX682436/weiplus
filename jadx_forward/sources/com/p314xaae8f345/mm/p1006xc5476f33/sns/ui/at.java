package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes15.dex */
public class at implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249318g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249319h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249320i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249321m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249322n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249323o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18126x284db4ee f249324p;

    public at(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18126x284db4ee activityC18126x284db4ee, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        this.f249324p = activityC18126x284db4ee;
        this.f249315d = str;
        this.f249316e = str2;
        this.f249317f = str3;
        this.f249318g = str4;
        this.f249319h = str5;
        this.f249320i = str6;
        this.f249321m = str7;
        this.f249322n = str8;
        this.f249323o = str9;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18126x284db4ee activityC18126x284db4ee = this.f249324p;
        if (i18 == -1) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsTransparentUI", "mmOnActivityResult fail, toUser is null");
                activityC18126x284db4ee.finish();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsTransparentUI", "doTransimt snsAdNativeLadingPagesUI is ok");
            r35.u3 u3Var = r35.t3.f450796a;
            com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = activityC18126x284db4ee.mo78514x143f1b92();
            java.lang.String str = this.f249316e;
            java.lang.String str2 = this.f249317f;
            java.lang.String str3 = this.f249318g;
            java.lang.String string = activityC18126x284db4ee.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zs zsVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zs(this, this.f249315d, activityC18126x284db4ee, stringExtra);
            ((ez.z0) u3Var).getClass();
            r35.j1.j(mo78514x143f1b92, str, str2, str3, null, true, string, zsVar);
        } else {
            activityC18126x284db4ee.finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1");
    }
}
