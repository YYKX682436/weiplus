package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes15.dex */
public class m1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a f181095d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a) {
        this.f181095d = activityC13462x5ea70b8a;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a = this.f181095d;
        if (!activityC13462x5ea70b8a.f180757q) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("is_wifi_connected", activityC13462x5ea70b8a.C != com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s1.NO_WIFI_CONNECTED);
            activityC13462x5ea70b8a.setResult(0, intent);
            activityC13462x5ea70b8a.finish();
        }
        return false;
    }
}
