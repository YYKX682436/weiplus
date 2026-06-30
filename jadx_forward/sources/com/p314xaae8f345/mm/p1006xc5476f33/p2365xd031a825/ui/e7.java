package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class e7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 f261787d;

    public e7(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 activityC19119xf1f23950) {
        this.f261787d = activityC19119xf1f23950;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 activityC19119xf1f23950 = this.f261787d;
        if (!activityC19119xf1f23950.mo73847x7d641a7d()) {
            activityC19119xf1f23950.finish();
            return false;
        }
        activityC19119xf1f23950.mo48674x36654fab();
        activityC19119xf1f23950.showDialog(1000);
        return false;
    }
}
