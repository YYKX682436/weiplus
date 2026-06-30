package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes8.dex */
public class xb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22334x657dae5 f288785d;

    public xb(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22334x657dae5 activityC22334x657dae5) {
        this.f288785d = activityC22334x657dae5;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22334x657dae5 activityC22334x657dae5 = this.f288785d;
        activityC22334x657dae5.finish();
        if (!activityC22334x657dae5.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            activityC22334x657dae5.moveTaskToBack(true);
        }
        return true;
    }
}
