package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class ip implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jp f250776a;

    public ip(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jp jpVar) {
        this.f250776a = jpVar;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jp jpVar = this.f250776a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem$1");
        try {
            java.lang.Object obj = jpVar.f251070d;
            boolean z17 = obj instanceof int[];
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = jpVar.f251069c;
            if (z17) {
                int i19 = ((int[]) obj)[i17];
                if (gm0.j1.a()) {
                    gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(i19));
                }
            } else if (obj instanceof long[]) {
                long j17 = ((long[]) obj)[i17];
                if (gm0.j1.a()) {
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j17));
                }
            }
            com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI = jpVar.f251071e;
            int i27 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hp hpVar = snsSettingUI.f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
            hpVar.notifyDataSetChanged();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI2 = jpVar.f251071e;
            int i28 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
            java.lang.String str = snsSettingUI2.d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem$1");
    }
}
