package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes5.dex */
public class ba implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 f288161d;

    public ba(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8) {
        this.f288161d = activityC22325x8baa24f8;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = this.f288161d;
        activityC22325x8baa24f8.mo48674x36654fab();
        activityC22325x8baa24f8.finish();
        if (!activityC22325x8baa24f8.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(activityC22325x8baa24f8.f288073c2, 80L);
        }
        return true;
    }
}
