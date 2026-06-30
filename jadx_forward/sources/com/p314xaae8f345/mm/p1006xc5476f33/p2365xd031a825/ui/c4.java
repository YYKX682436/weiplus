package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class c4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19113xc67f5986 f261705d;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19113xc67f5986 activityC19113xc67f5986) {
        this.f261705d = activityC19113xc67f5986;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19113xc67f5986 activityC19113xc67f5986 = this.f261705d;
        if (!activityC19113xc67f5986.mo73847x7d641a7d()) {
            activityC19113xc67f5986.finish();
            return false;
        }
        activityC19113xc67f5986.mo48674x36654fab();
        activityC19113xc67f5986.showDialog(1000);
        return false;
    }
}
