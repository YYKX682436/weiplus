package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class u5 implements db5.k5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 f181225d;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7) {
        this.f181225d = activityC13477xb2a3ecd7;
    }

    @Override // db5.k5
    public boolean E0() {
        android.view.View childAt;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7 = this.f181225d;
        int firstVisiblePosition = activityC13477xb2a3ecd7.f180866d.getFirstVisiblePosition();
        return firstVisiblePosition == 0 && (childAt = activityC13477xb2a3ecd7.f180866d.getChildAt(firstVisiblePosition)) != null && childAt.getTop() >= 0;
    }
}
