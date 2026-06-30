package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class k4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752 f145804d;

    public k4(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752 activityC10347x6bb1b752) {
        this.f145804d = activityC10347x6bb1b752;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "onMenuItemClick click");
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752 activityC10347x6bb1b752 = this.f145804d;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10377x84ecdd3.T6(activityC10347x6bb1b752);
        activityC10347x6bb1b752.finish();
        int i17 = activityC10347x6bb1b752.f145330e;
        if (i17 != 3) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752.T6(activityC10347x6bb1b752.f145329d, i17, 0, 0);
            return true;
        }
        activityC10347x6bb1b752.V6(0);
        return true;
    }
}
