package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class cp extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f103086e;

    public cp(boolean z17) {
        this.f103086e = z17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b3g;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        if (this.f103086e) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.jru);
            android.content.Context context = holder.f293121e;
            p17.setPadding(0, context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz), 0, context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn));
        }
    }
}
