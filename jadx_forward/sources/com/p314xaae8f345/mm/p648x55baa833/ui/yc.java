package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes9.dex */
public class yc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea f146227d;

    public yc(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea) {
        this.f146227d = activityC10372xd653ffea;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea = this.f146227d;
        activityC10372xd653ffea.setResult(0, intent);
        activityC10372xd653ffea.finish();
        return true;
    }
}
