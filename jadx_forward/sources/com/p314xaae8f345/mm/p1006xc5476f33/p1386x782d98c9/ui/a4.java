package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class a4 implements db5.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 f180933d;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714) {
        this.f180933d = activityC13474xf9906714;
    }

    @Override // db5.j5
    public boolean A5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714 = this.f180933d;
        android.widget.ListView listView = activityC13474xf9906714.f180845p;
        android.view.View childAt = listView.getChildAt(listView.getChildCount() - 1);
        int count = activityC13474xf9906714.f180845p.getAdapter().getCount();
        return count > 0 && childAt != null && childAt.getBottom() <= activityC13474xf9906714.f180845p.getHeight() && activityC13474xf9906714.f180845p.getLastVisiblePosition() >= count - 1;
    }
}
