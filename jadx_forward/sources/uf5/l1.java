package uf5;

/* loaded from: classes8.dex */
public class l1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 f508804d;

    public l1(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c8) {
        this.f508804d = activityC22349xe6f834c8;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c8 = this.f508804d;
        j75.f m67437x4bd5310 = activityC22349xe6f834c8.m67437x4bd5310();
        if (m67437x4bd5310 != null && ((uf5.l) m67437x4bd5310.mo140437x75286adb()).f508799e) {
            m67437x4bd5310.B3(new uf5.y0());
            return true;
        }
        activityC22349xe6f834c8.mo48674x36654fab();
        activityC22349xe6f834c8.finish();
        return false;
    }
}
