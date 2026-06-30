package kf3;

/* loaded from: classes12.dex */
public class x0 implements db5.k5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc f388993d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc) {
        this.f388993d = activityC16486x3260b8cc;
    }

    @Override // db5.k5
    public boolean E0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16485x4d1368bb c16485x4d1368bb = this.f388993d.f230059d;
        android.view.View childAt = c16485x4d1368bb.getChildAt(c16485x4d1368bb.getFirstVisiblePosition());
        return childAt != null && childAt.getTop() == 0;
    }
}
