package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class g0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f f290147d;

    public g0(com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f activityC21341x70473b8f) {
        this.f290147d = activityC21341x70473b8f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f290147d.onBackPressed();
        return true;
    }
}
