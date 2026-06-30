package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class hc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10367x479b7a81 f145746d;

    public hc(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10367x479b7a81 activityC10367x479b7a81) {
        this.f145746d = activityC10367x479b7a81;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        int i17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10367x479b7a81.f145489w;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10367x479b7a81 activityC10367x479b7a81 = this.f145746d;
        activityC10367x479b7a81.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(activityC10367x479b7a81.f145514q);
        intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
        activityC10367x479b7a81.setResult(-1, intent);
        activityC10367x479b7a81.finish();
        activityC10367x479b7a81.mo48674x36654fab();
        return false;
    }
}
