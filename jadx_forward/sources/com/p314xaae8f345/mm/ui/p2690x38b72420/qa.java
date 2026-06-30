package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes10.dex */
public class qa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22328xf8c1b478 f288677d;

    public qa(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22328xf8c1b478 activityC22328xf8c1b478) {
        this.f288677d = activityC22328xf8c1b478;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22328xf8c1b478 activityC22328xf8c1b478 = this.f288677d;
        intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC22328xf8c1b478.C.f288715r, ","));
        activityC22328xf8c1b478.setResult(-1, intent);
        activityC22328xf8c1b478.finish();
        return true;
    }
}
