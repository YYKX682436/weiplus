package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes9.dex */
public class qd implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10374x1787784b f145996d;

    public qd(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10374x1787784b activityC10374x1787784b) {
        this.f145996d = activityC10374x1787784b;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10374x1787784b activityC10374x1787784b = this.f145996d;
        activityC10374x1787784b.setResult(0, intent);
        activityC10374x1787784b.finish();
        return true;
    }
}
