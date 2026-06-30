package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class j2 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.l2 f91993n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.plugin.appbrand.widget.recent.l2 l2Var, android.content.Context context) {
        super(context);
        this.f91993n = l2Var;
    }

    @Override // androidx.recyclerview.widget.g3
    public android.graphics.PointF a(int i17) {
        return ((androidx.recyclerview.widget.LinearLayoutManager) this.f91993n.f91999d.getLayoutManager()).a(i17);
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void c() {
        this.f91993n.getClass();
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void d() {
        super.d();
        com.tencent.mm.plugin.appbrand.widget.recent.l2 l2Var = this.f91993n;
        com.tencent.mars.xlog.Log.i("ViewPagerHelper", "SmoothScrollerForFling onStop %d", java.lang.Integer.valueOf(l2Var.f91999d.getScrollState()));
        if (l2Var.f91999d.getScrollState() == 0) {
            l2Var.d();
        }
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        return 40.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o1
    public int m() {
        return -1;
    }
}
