package p61;

/* loaded from: classes5.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 f433812d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d970) {
        this.f433812d = activityC11360x90d2d970;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d970 = this.f433812d;
        int measuredWidth = activityC11360x90d2d970.f154499i.getMeasuredWidth();
        if (activityC11360x90d2d970.f154500m.getMeasuredWidth() < measuredWidth) {
            activityC11360x90d2d970.f154500m.setWidth(measuredWidth);
        }
    }
}
