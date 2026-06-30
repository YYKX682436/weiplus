package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class xh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15073xb2df199 f211559d;

    public xh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15073xb2df199 activityC15073xb2df199) {
        this.f211559d = activityC15073xb2df199;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSettingProtectUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean g17 = hc2.s.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15073xb2df199 activityC15073xb2df199 = this.f211559d;
        if (g17) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15073xb2df199.f210282w;
            activityC15073xb2df199.getClass();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC15073xb2df199, 1, true);
            k0Var.q(activityC15073xb2df199.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nzy), 17);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.zh(activityC15073xb2df199);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ai(activityC15073xb2df199);
            k0Var.v();
        } else {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15073xb2df199.f210282w;
            activityC15073xb2df199.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSettingProtectUI", "modUserProtect open");
            activityC15073xb2df199.d7();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0.f361623e.n(true, activityC15073xb2df199.f210285v, activityC15073xb2df199.f210284u);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSettingProtectUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
