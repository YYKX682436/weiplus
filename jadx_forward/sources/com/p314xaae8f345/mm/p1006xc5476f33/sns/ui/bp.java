package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class bp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSettingUI f249563d;

    public bp(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI) {
        this.f249563d = snsSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this.f249563d.mo55332x76847179());
        u1Var.u("设置CDN测试IP");
        u1Var.f(java.lang.Boolean.TRUE);
        final java.lang.String str = "114.221.146.152";
        u1Var.o("114.221.146.152");
        u1Var.b(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1(str) { // from class: com.tencent.mm.plugin.sns.ui.bp$$a
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
            public final void a(boolean z17, java.lang.String str2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bp bpVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bp.this;
                bpVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$onClick$0", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$3");
                com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI = bpVar.f249563d;
                snsSettingUI.mo48674x36654fab();
                if (z17) {
                    x51.o1.C = true;
                    if (android.text.TextUtils.isEmpty(str2)) {
                        str2 = "114.221.146.152";
                    }
                    x51.o1.D = str2;
                    int i17 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(snsSettingUI.d, "set cdn debug ip:%s", str2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$onClick$0", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$3");
            }
        });
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$3");
    }
}
