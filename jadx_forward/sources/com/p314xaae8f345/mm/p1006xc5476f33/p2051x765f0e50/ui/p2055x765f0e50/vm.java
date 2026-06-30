package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class vm implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea f243205d;

    public vm(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea) {
        this.f243205d = activityC17463xb337a9ea;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea = this.f243205d;
        activityC17463xb337a9ea.f242219f = false;
        activityC17463xb337a9ea.f242228r = false;
        activityC17463xb337a9ea.f242218e.m69113x2cb4dbe4(false);
        activityC17463xb337a9ea.f242218e.b();
        activityC17463xb337a9ea.Y6();
        if (activityC17463xb337a9ea.f242218e.m69112xa073bd58() == 0) {
            c01.uc ucVar = c01.uc.f119047c;
            if (((java.util.HashSet) ucVar.d()).size() > 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14978, 1, 11, ucVar.f(), ucVar.e(), wo.w0.k());
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14978, 0, 11, ucVar.f(), ucVar.e(), wo.w0.k());
            }
            android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(activityC17463xb337a9ea);
            b17.addFlags(67108864);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea2 = this.f243205d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(b17);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC17463xb337a9ea2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$9", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17463xb337a9ea2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC17463xb337a9ea2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$9", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17463xb337a9ea.finish();
            db5.f.k(activityC17463xb337a9ea);
            activityC17463xb337a9ea.f242227q = false;
        }
        return false;
    }
}
