package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes.dex */
public class h2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13053xb9371272 f176556d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13053xb9371272 activityC13053xb9371272) {
        this.f176556d = activityC13053xb9371272;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13053xb9371272 activityC13053xb9371272 = this.f176556d;
        int i17 = activityC13053xb9371272.K;
        if (i17 == 1 || i17 == 2) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.putExtra("preferred_tab", 3);
            j45.l.u(activityC13053xb9371272, "com.tencent.mm.ui.LauncherUI", intent, null);
            activityC13053xb9371272.finish();
        } else {
            activityC13053xb9371272.finish();
        }
        return true;
    }
}
