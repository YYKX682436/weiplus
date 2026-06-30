package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui;

/* loaded from: classes9.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.ActivityC19204x3c86060 f262928d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.ActivityC19204x3c86060 activityC19204x3c86060) {
        this.f262928d = activityC19204x3c86060;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.ActivityC19204x3c86060 activityC19204x3c86060 = this.f262928d;
        if (activityC19204x3c86060.f262922o) {
            activityC19204x3c86060.V6(0, 4, "user cancel setting wallet lock");
        } else {
            activityC19204x3c86060.finish();
        }
        return false;
    }
}
