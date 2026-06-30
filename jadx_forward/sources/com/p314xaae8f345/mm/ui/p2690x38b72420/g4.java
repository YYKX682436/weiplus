package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes4.dex */
public class g4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22310xc85a83bf f288252d;

    public g4(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22310xc85a83bf activityC22310xc85a83bf) {
        this.f288252d = activityC22310xc85a83bf;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22310xc85a83bf activityC22310xc85a83bf = this.f288252d;
        intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC22310xc85a83bf.f287964o, ","));
        activityC22310xc85a83bf.setResult(-1, intent);
        activityC22310xc85a83bf.finish();
        return true;
    }
}
