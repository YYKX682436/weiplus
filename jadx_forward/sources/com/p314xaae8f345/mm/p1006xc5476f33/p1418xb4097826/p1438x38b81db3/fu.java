package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class fu extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ku {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ku, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b7i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ku, in5.r
    /* renamed from: p */
    public void h(in5.s0 holder, ms2.c item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.l_n);
        android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null) {
            if (item.f412504f == item.f412505g - 1) {
                marginLayoutParams2.leftMargin = 0;
            } else {
                marginLayoutParams2.leftMargin = holder.f374654e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561194bz);
            }
            marginLayoutParams = marginLayoutParams2;
        }
        p17.setLayoutParams(marginLayoutParams);
    }
}
