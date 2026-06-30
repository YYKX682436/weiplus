package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class fb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22331xe16dd710 f288243d;

    public fb(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22331xe16dd710 activityC22331xe16dd710) {
        this.f288243d = activityC22331xe16dd710;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22331xe16dd710 activityC22331xe16dd710 = this.f288243d;
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) activityC22331xe16dd710.C.toArray(new java.lang.String[0]));
        if (P1 == null || P1.size() == 0) {
            intent.putExtra("Select_Contact", "");
        } else {
            intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(P1, ","));
        }
        activityC22331xe16dd710.setResult(-1, intent);
        activityC22331xe16dd710.finish();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.p2690x38b72420.eb(this), 100L);
        activityC22331xe16dd710.mo48674x36654fab();
        return true;
    }
}
