package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class s5 implements db5.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 f181193d;

    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7) {
        this.f181193d = activityC13477xb2a3ecd7;
    }

    @Override // db5.j5
    public boolean A5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7 = this.f181193d;
        android.widget.ListView listView = activityC13477xb2a3ecd7.f180866d;
        android.view.View childAt = listView.getChildAt(listView.getChildCount() - 1);
        int count = activityC13477xb2a3ecd7.f180866d.getCount();
        return count > 0 && childAt != null && childAt.getBottom() <= activityC13477xb2a3ecd7.f180866d.getHeight() && activityC13477xb2a3ecd7.f180866d.getLastVisiblePosition() == count - 1;
    }
}
