package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes8.dex */
public class gb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22331xe16dd710 f288267d;

    public gb(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22331xe16dd710 activityC22331xe16dd710) {
        this.f288267d = activityC22331xe16dd710;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22331xe16dd710 activityC22331xe16dd710 = this.f288267d;
        activityC22331xe16dd710.finish();
        if (!activityC22331xe16dd710.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            activityC22331xe16dd710.moveTaskToBack(true);
        }
        return true;
    }
}
