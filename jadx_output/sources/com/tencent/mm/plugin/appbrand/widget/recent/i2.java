package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class i2 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.l2 f91991n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.tencent.mm.plugin.appbrand.widget.recent.l2 l2Var, android.content.Context context) {
        super(context);
        this.f91991n = l2Var;
    }

    @Override // androidx.recyclerview.widget.g3
    public android.graphics.PointF a(int i17) {
        return ((androidx.recyclerview.widget.LinearLayoutManager) this.f91991n.f91999d.getLayoutManager()).a(i17);
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void c() {
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void d() {
        super.d();
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        return 80.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o1
    public int l(int i17) {
        return super.l(i17);
    }

    @Override // androidx.recyclerview.widget.o1
    public int m() {
        return -1;
    }
}
