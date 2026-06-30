package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class b4 implements db5.k5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 f180943d;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714) {
        this.f180943d = activityC13474xf9906714;
    }

    @Override // db5.k5
    public boolean E0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714 = this.f180943d;
        if (activityC13474xf9906714.f180845p.getFirstVisiblePosition() != 0) {
            return false;
        }
        android.widget.ListView listView = activityC13474xf9906714.f180845p;
        android.view.View childAt = listView.getChildAt(listView.getFirstVisiblePosition());
        return childAt != null && childAt.getTop() >= 0;
    }
}
