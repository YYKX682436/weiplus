package f93;

/* loaded from: classes11.dex */
public class e4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 f341862d;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868) {
        this.f341862d = activityC16172xa598f868;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868 = this.f341862d;
        if (activityC16172xa598f868.f224832g) {
            java.util.Iterator it = activityC16172xa598f868.f224848z.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                if (!activityC16172xa598f868.C.contains((java.lang.String) it.next())) {
                    z17 = true;
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16172xa598f868.f224835m.m79120xb8adf67a())) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868.X6(activityC16172xa598f868);
            } else {
                activityC16172xa598f868.finish();
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868.X6(activityC16172xa598f868);
        }
        return false;
    }
}
