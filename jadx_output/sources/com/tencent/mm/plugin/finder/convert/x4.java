package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class x4 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487839i;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.r item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (item.f410566g == 1) {
            holder.w(com.tencent.mm.R.id.jto, 8);
        } else {
            holder.w(com.tencent.mm.R.id.jto, 0);
            android.view.View p17 = holder.p(com.tencent.mm.R.id.jto);
            android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
            com.tencent.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.tencent.mm.R.id.jib)).getPaint(), 0.8f);
            int c17 = com.tencent.mm.plugin.finder.feed.pz.M1.c();
            if (layoutParams.width < c17) {
                layoutParams.width = c17;
                p17.setLayoutParams(layoutParams);
            }
        }
        holder.p(com.tencent.mm.R.id.jto).setOnClickListener(new com.tencent.mm.plugin.finder.convert.w4(item, this, holder));
    }
}
