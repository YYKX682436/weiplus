package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes9.dex */
public class vc implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xc f252162d;

    public vc(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xc xcVar) {
        this.f252162d = xcVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1");
        if (i18 == -1) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.SnsAdNativieLandingTestUI", "mmOnActivityResult fail, toUser is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b activityC18008xe14e452b = this.f252162d.f253038d;
            r35.u3 u3Var = r35.t3.f450796a;
            com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = activityC18008xe14e452b.mo78514x143f1b92();
            java.lang.String string = activityC18008xe14e452b.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uc ucVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uc(this, stringExtra, activityC18008xe14e452b);
            ((ez.z0) u3Var).getClass();
            r35.j1.j(mo78514x143f1b92, "test title", "http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150", "test desc", null, true, string, ucVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1");
    }
}
