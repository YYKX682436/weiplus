package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class fu extends com.tencent.mm.plugin.finder.convert.ku {
    @Override // com.tencent.mm.plugin.finder.convert.ku, in5.r
    public int e() {
        return com.tencent.mm.R.layout.b7i;
    }

    @Override // com.tencent.mm.plugin.finder.convert.ku, in5.r
    /* renamed from: p */
    public void h(in5.s0 holder, ms2.c item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.l_n);
        android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null) {
            if (item.f330971f == item.f330972g - 1) {
                marginLayoutParams2.leftMargin = 0;
            } else {
                marginLayoutParams2.leftMargin = holder.f293121e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479661bz);
            }
            marginLayoutParams = marginLayoutParams2;
        }
        p17.setLayoutParams(marginLayoutParams);
    }
}
