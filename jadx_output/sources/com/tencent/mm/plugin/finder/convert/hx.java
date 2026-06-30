package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class hx extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public int f103626e = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f103627f;

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b_x;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.i2j);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = this.f103626e;
        layoutParams2.height = this.f103627f;
        findViewById.setLayoutParams(layoutParams2);
    }
}
