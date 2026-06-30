package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class kj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 f155523d;

    public kj(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 activityC11475xf1a02871) {
        this.f155523d = activityC11475xf1a02871;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/WelcomeActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("not_auth_setting", true);
        intent.putExtra("from_login_history", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 activityC11475xf1a02871 = this.f155523d;
        if (activityC11475xf1a02871 != null) {
            j45.l.j(activityC11475xf1a02871, "setting", ".ui.setting.SettingsLanguageUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
