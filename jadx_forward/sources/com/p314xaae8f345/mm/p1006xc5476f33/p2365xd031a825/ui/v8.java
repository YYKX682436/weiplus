package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class v8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8 f262226d;

    public v8(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8 activityC19122xf67b30d8) {
        this.f262226d = activityC19122xf67b30d8;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8 activityC19122xf67b30d8 = this.f262226d;
        if (!activityC19122xf67b30d8.mo73847x7d641a7d()) {
            activityC19122xf67b30d8.finish();
            return false;
        }
        activityC19122xf67b30d8.mo48674x36654fab();
        activityC19122xf67b30d8.showDialog(1000);
        return false;
    }
}
