package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class md implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10373x778035bf f145910d;

    public md(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10373x778035bf activityC10373x778035bf) {
        this.f145910d = activityC10373x778035bf;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        int i17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10373x778035bf.f145519w;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10373x778035bf activityC10373x778035bf = this.f145910d;
        activityC10373x778035bf.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(activityC10373x778035bf.f145514q);
        intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
        activityC10373x778035bf.setResult(-1, intent);
        activityC10373x778035bf.finish();
        return false;
    }
}
