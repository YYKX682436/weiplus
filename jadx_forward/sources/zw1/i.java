package zw1;

/* loaded from: classes9.dex */
public class i implements db5.k5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13140x1eaa4b43 f558190d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13140x1eaa4b43 activityC13140x1eaa4b43) {
        this.f558190d = activityC13140x1eaa4b43;
    }

    @Override // db5.k5
    public boolean E0() {
        android.view.View childAt;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13140x1eaa4b43 activityC13140x1eaa4b43 = this.f558190d;
        int firstVisiblePosition = activityC13140x1eaa4b43.f177875d.getFirstVisiblePosition();
        return firstVisiblePosition == 0 && (childAt = activityC13140x1eaa4b43.f177875d.getChildAt(firstVisiblePosition)) != null && childAt.getX() == 0.0f;
    }
}
