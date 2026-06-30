package rp1;

/* loaded from: classes14.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f480094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f480095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 f480096f;

    public z(android.view.WindowManager.LayoutParams layoutParams, android.graphics.Point point, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7) {
        this.f480094d = layoutParams;
        this.f480095e = point;
        this.f480096f = c12917x19ac03e7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Point point = this.f480095e;
        int i17 = point.x;
        android.view.WindowManager.LayoutParams layoutParams = this.f480094d;
        layoutParams.width = i17;
        layoutParams.height = point.y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f480096f;
        android.view.WindowManager windowManager = c12917x19ac03e7.f174958m;
        if (windowManager != null) {
            windowManager.updateViewLayout(c12917x19ac03e7, layoutParams);
        }
    }
}
