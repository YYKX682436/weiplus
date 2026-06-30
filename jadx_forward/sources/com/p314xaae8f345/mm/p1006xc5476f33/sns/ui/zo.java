package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class zo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSettingUI f253237d;

    public zo(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI) {
        this.f253237d = snsSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this.f253237d.mo55332x76847179());
        u1Var.u("清理多少（分钟）以前的朋友圈");
        u1Var.f(java.lang.Boolean.TRUE);
        u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yo(this));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$1");
    }
}
