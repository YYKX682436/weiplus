package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class b2 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f90039n;

    /* renamed from: o, reason: collision with root package name */
    public final int f90040o;

    /* renamed from: p, reason: collision with root package name */
    public final int f90041p;

    public b2(android.content.Context context, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        super(context);
        this.f90039n = linearLayoutManager;
        this.f90040o = 3000;
        this.f90041p = java.lang.Math.round(context.getResources().getDisplayMetrics().heightPixels * 0.75f);
    }

    @Override // androidx.recyclerview.widget.g3
    public android.graphics.PointF a(int i17) {
        return this.f90039n.a(i17);
    }

    @Override // androidx.recyclerview.widget.o1
    public int l(int i17) {
        return super.l(java.lang.Math.max(this.f90041p, java.lang.Math.min(this.f90040o, i17)));
    }
}
