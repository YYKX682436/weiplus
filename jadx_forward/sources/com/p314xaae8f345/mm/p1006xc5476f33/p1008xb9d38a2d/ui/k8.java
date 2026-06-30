package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class k8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11448x932bffb8 f155514d;

    public k8(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11448x932bffb8 activityC11448x932bffb8) {
        this.f155514d = activityC11448x932bffb8;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11448x932bffb8 activityC11448x932bffb8 = this.f155514d;
        android.content.Intent intent = activityC11448x932bffb8.getIntent();
        intent.putExtra("bind_facebook_succ", activityC11448x932bffb8.f154978i);
        activityC11448x932bffb8.setResult(-1, intent);
        activityC11448x932bffb8.finish();
        return true;
    }
}
