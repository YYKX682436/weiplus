package zw1;

/* loaded from: classes9.dex */
public class j implements db5.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13140x1eaa4b43 f558204d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13140x1eaa4b43 activityC13140x1eaa4b43) {
        this.f558204d = activityC13140x1eaa4b43;
    }

    @Override // db5.j5
    public boolean A5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13140x1eaa4b43 activityC13140x1eaa4b43 = this.f558204d;
        if (activityC13140x1eaa4b43.f177878g.getVisibility() == 0) {
            return true;
        }
        android.widget.ListView listView = activityC13140x1eaa4b43.f177875d;
        android.view.View childAt = listView.getChildAt(listView.getChildCount() - 1);
        return childAt != null && childAt.getBottom() <= activityC13140x1eaa4b43.f177875d.getHeight() && activityC13140x1eaa4b43.f177875d.getLastVisiblePosition() == activityC13140x1eaa4b43.f177875d.getAdapter().getCount() - 1;
    }
}
