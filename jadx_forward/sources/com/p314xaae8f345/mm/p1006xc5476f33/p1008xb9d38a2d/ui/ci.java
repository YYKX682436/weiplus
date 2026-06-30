package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class ci implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b f155319d;

    public ci(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b activityC11470xc22f6d8b) {
        this.f155319d = activityC11470xc22f6d8b;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.f155193v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b activityC11470xc22f6d8b = this.f155319d;
        boolean booleanExtra = activityC11470xc22f6d8b.getIntent().getBooleanExtra("key_auto_login_wizard_exit", false);
        if (!booleanExtra) {
            activityC11470xc22f6d8b.T6();
        }
        activityC11470xc22f6d8b.W6(1);
        if (booleanExtra) {
            activityC11470xc22f6d8b.U6(1);
        }
        return true;
    }
}
