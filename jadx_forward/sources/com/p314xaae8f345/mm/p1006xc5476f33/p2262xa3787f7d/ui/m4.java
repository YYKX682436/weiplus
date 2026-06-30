package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public class m4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.n4 f254605d;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.n4 n4Var) {
        this.f254605d = n4Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.n4 n4Var = this.f254605d;
        if (itemId == 0) {
            android.content.Intent intent = new android.content.Intent(n4Var.f254614d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.class);
            intent.putExtra("intent_process", 1);
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 3);
            android.content.Intent intent2 = new android.content.Intent(n4Var.f254614d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.class);
            intent2.putExtra("intent_process", 2);
            intent2.putExtra("WizardRootClass", "com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain");
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(n4Var.f254614d, intent, intent2);
            return;
        }
        if (itemId == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(n4Var.f254614d.mo55332x76847179());
            u1Var.u(n4Var.f254614d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jt6));
            u1Var.g(n4Var.f254614d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574876jt4));
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f574877jt5);
            u1Var.k(n4Var.f254614d.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
            u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.l4(this));
            u1Var.q(false);
            return;
        }
        if (itemId != 2) {
            return;
        }
        android.content.Intent intent3 = new android.content.Intent(n4Var.f254614d.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.class);
        intent3.putExtra("intent_process", 3);
        intent3.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9 = n4Var.f254614d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent3);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC18580x3cc47ed9, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$29$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18580x3cc47ed9.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC18580x3cc47ed9, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$29$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((vh4.t1) i95.n0.c(vh4.t1.class)).T(18);
    }
}
