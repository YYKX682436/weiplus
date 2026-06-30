package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes8.dex */
public class i1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4 f243815d;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4 activityC17681x5e0a88e4) {
        this.f243815d = activityC17681x5e0a88e4;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String str;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4.f243756q;
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4 activityC17681x5e0a88e4 = this.f243815d;
        activityC17681x5e0a88e4.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList.add(activityC17681x5e0a88e4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lag));
        linkedList2.add(0);
        linkedList.add(activityC17681x5e0a88e4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lah));
        linkedList2.add(1);
        if (!activityC17681x5e0a88e4.getIntent().getBooleanExtra("key_is_favorite_item", false)) {
            linkedList.add(activityC17681x5e0a88e4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
            linkedList2.add(2);
        } else if (activityC17681x5e0a88e4.getIntent().getBooleanExtra("key_can_delete_favorite_item", true)) {
            str = activityC17681x5e0a88e4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
            db5.e1.d(activityC17681x5e0a88e4, "", linkedList, linkedList2, str, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.m1(activityC17681x5e0a88e4));
            return true;
        }
        str = "";
        db5.e1.d(activityC17681x5e0a88e4, "", linkedList, linkedList2, str, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.m1(activityC17681x5e0a88e4));
        return true;
    }
}
