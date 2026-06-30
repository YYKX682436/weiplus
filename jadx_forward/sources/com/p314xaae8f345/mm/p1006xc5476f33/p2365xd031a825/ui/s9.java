package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class s9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 f262152d;

    public s9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3) {
        this.f262152d = activityC19125x69c29dd3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3 = this.f262152d;
        activityC19125x69c29dd3.mo48674x36654fab();
        if (activityC19125x69c29dd3.mo73847x7d641a7d()) {
            activityC19125x69c29dd3.showDialog(1000);
            return false;
        }
        activityC19125x69c29dd3.finish();
        return false;
    }
}
