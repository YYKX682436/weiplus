package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class ep implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSettingUI f249790d;

    public ep(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI) {
        this.f249790d = snsSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this.f249790d.mo55332x76847179());
        u1Var.u("清除见面有礼广告彩蛋页MMKV（重启生效）");
        u1Var.f(java.lang.Boolean.TRUE);
        u1Var.b(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1() { // from class: com.tencent.mm.plugin.sns.ui.ep$$a
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
            public final void a(boolean z17, java.lang.String str) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ep epVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ep.this;
                epVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$onClick$0", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$6");
                epVar.f249790d.mo48674x36654fab();
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearFreshList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
                    if (str == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearFreshList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
                    } else {
                        java.lang.String d17 = p44.b0.f433304a.d(str);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardStorage", "clearFreshList, key=" + d17);
                        p34.o.i(d17, "");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearFreshList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$onClick$0", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$6");
            }
        });
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$6");
    }
}
