package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class yo implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zo f253172a;

    public yo(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zo zoVar) {
        this.f253172a = zoVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zo zoVar = this.f253172a;
        zoVar.f253237d.mo48674x36654fab();
        if (z17) {
            int i17 = -1;
            try {
                i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, -1);
            } catch (java.lang.Exception unused) {
            }
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.yj();
                s94.a.b(new android.os.CancellationSignal(), i17);
            } catch (java.lang.Exception e17) {
                int i18 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
                java.lang.String str2 = zoVar.f253237d.d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "cleanSnsTablesByTimeLimit error. %s", e17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$1$1");
    }
}
