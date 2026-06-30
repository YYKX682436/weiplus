package kf3;

/* loaded from: classes12.dex */
public class w0 implements db5.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc f388990d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc) {
        this.f388990d = activityC16486x3260b8cc;
    }

    @Override // db5.j5
    public boolean A5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc = this.f388990d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16485x4d1368bb c16485x4d1368bb = activityC16486x3260b8cc.f230059d;
        android.view.View childAt = c16485x4d1368bb.getChildAt(c16485x4d1368bb.getChildCount() - 1);
        return childAt != null && childAt.getBottom() <= activityC16486x3260b8cc.f230059d.getHeight() && activityC16486x3260b8cc.f230059d.getLastVisiblePosition() == activityC16486x3260b8cc.f230059d.getAdapter().getCount() - 1;
    }
}
