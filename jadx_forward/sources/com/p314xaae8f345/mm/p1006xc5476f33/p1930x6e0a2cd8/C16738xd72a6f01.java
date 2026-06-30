package com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8;

/* renamed from: com.tencent.mm.plugin.newtips.CustomSizeIconNewTipPreference */
/* loaded from: classes8.dex */
public class C16738xd72a6f01 extends com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 {
    public C16738xd72a6f01(android.content.Context context) {
        super(context);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056
    public void l0(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.getHeight() <= 0) {
            return;
        }
        float width = bitmap.getWidth() / bitmap.getHeight();
        android.content.Context context = this.Y1;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561420i0);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomSizeIconNewTipPreference", "radioWH:%f, maxRadio:%f", java.lang.Float.valueOf(width), java.lang.Float.valueOf(1.7777778f));
        if (width == 1.0d) {
            Z(dimensionPixelOffset, dimensionPixelOffset);
            int i17 = dimensionPixelOffset + dimensionPixelOffset2;
            W(i17, i17);
        } else if (width < 1.7777778f) {
            int i18 = (int) (dimensionPixelOffset * width);
            Z(i18, dimensionPixelOffset);
            W(i18 + dimensionPixelOffset2, dimensionPixelOffset + dimensionPixelOffset2);
        } else {
            int i19 = (int) (dimensionPixelOffset * 1.7777778f);
            int i27 = (int) (i19 / width);
            Z(i19, i27);
            W(i19 + dimensionPixelOffset2, i27 + dimensionPixelOffset2);
        }
    }

    public C16738xd72a6f01(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C16738xd72a6f01(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
