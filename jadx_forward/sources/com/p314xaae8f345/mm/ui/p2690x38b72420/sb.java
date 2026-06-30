package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes8.dex */
public class sb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22333xa8c37c31 f288718d;

    public sb(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22333xa8c37c31 activityC22333xa8c37c31) {
        this.f288718d = activityC22333xa8c37c31;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22333xa8c37c31 activityC22333xa8c37c31 = this.f288718d;
        activityC22333xa8c37c31.finish();
        if (!activityC22333xa8c37c31.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            activityC22333xa8c37c31.moveTaskToBack(true);
        }
        return true;
    }
}
