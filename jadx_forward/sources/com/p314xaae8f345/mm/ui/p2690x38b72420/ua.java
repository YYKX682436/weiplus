package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class ua implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22329x7cbba65c f288744d;

    public ua(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22329x7cbba65c activityC22329x7cbba65c) {
        this.f288744d = activityC22329x7cbba65c;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22329x7cbba65c activityC22329x7cbba65c = this.f288744d;
        java.util.ArrayList arrayList = new java.util.ArrayList(activityC22329x7cbba65c.F);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectLabelContactUI", "SelectUser: %s", arrayList.toString());
        activityC22329x7cbba65c.w7(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
        return true;
    }
}
