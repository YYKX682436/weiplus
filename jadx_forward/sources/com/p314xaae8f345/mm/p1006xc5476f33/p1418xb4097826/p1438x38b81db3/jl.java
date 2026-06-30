package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class jl {
    public jl(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.res.Resources resources = context.getResources();
        int i17 = resources.getDisplayMetrics().widthPixels;
        int i18 = resources.getDisplayMetrics().heightPixels;
        if (i17 > i18) {
            i17 = i18;
        }
        float dimensionPixelOffset = (i17 * 0.75f) - resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        float dimension = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561235cy);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CarouselCardConvert", "getCardWidth: itemWidth=" + dimensionPixelOffset + ", maxWidth=" + dimension);
        if (dimensionPixelOffset > dimension) {
            dimensionPixelOffset = dimension;
        }
        return (int) dimensionPixelOffset;
    }
}
