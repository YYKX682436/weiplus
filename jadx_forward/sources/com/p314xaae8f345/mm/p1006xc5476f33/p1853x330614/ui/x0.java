package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class x0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 f230045d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 activityC16479x8f884212) {
        this.f230045d = activityC16479x8f884212;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(14872, 0, 0, "", "", 0);
        g0Var.d(16500, 3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 activityC16479x8f884212 = this.f230045d;
        boolean z17 = activityC16479x8f884212.f229818w.f88830f;
        activityC16479x8f884212.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_default_show_currency", z17);
        j45.l.n(activityC16479x8f884212, "wallet", ".pwd.ui.WalletPasswordSettingUI", intent, 6);
        return true;
    }
}
