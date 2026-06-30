package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class dc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb f288203d;

    public dc(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb activityC22335xd5b6c7eb) {
        this.f288203d = activityC22335xd5b6c7eb;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb activityC22335xd5b6c7eb = this.f288203d;
        java.util.List list = activityC22335xd5b6c7eb.I;
        if (list != null) {
            ((java.util.LinkedList) list).size();
        }
        if (activityC22335xd5b6c7eb.y7(((java.util.LinkedList) activityC22335xd5b6c7eb.I).size())) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) ((java.util.LinkedList) activityC22335xd5b6c7eb.I).toArray(new java.lang.String[0]));
        if (P1 == null || P1.size() == 0) {
            intent.putExtra("Select_Contact", "");
        } else {
            intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(P1, ","));
        }
        activityC22335xd5b6c7eb.setResult(-1, intent);
        activityC22335xd5b6c7eb.finish();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.p2690x38b72420.cc(this), 100L);
        activityC22335xd5b6c7eb.mo48674x36654fab();
        return true;
    }
}
