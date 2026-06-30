package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes10.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y1 f197284a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y1();

    public final android.graphics.drawable.Drawable a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u1 u1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u1 u1Var2, float f17, float f18) {
        android.graphics.drawable.ShapeDrawable shapeDrawable;
        android.graphics.drawable.ShapeDrawable shapeDrawable2;
        if (u1Var != null) {
            float[] fArr = new float[8];
            for (int i17 = 0; i17 < 8; i17++) {
                fArr[i17] = f17;
            }
            shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(fArr, null, null));
            shapeDrawable.setShaderFactory(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.w1(u1Var));
        } else {
            shapeDrawable = null;
        }
        if (u1Var2 != null) {
            float[] fArr2 = new float[8];
            for (int i18 = 0; i18 < 8; i18++) {
                fArr2[i18] = f17;
            }
            android.graphics.RectF rectF = new android.graphics.RectF(f18, f18, f18, f18);
            float[] fArr3 = new float[8];
            for (int i19 = 0; i19 < 8; i19++) {
                float f19 = f17 - f18;
                if (f19 < 0.0f) {
                    f19 = 0.0f;
                }
                fArr3[i19] = f19;
            }
            shapeDrawable2 = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(fArr2, rectF, fArr3));
            shapeDrawable2.setShaderFactory(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x1(u1Var2));
        } else {
            shapeDrawable2 = null;
        }
        if (shapeDrawable != null) {
            if (shapeDrawable2 != null) {
                return new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.ShapeDrawable[]{shapeDrawable, shapeDrawable2});
            }
        }
        if (shapeDrawable != null) {
            return shapeDrawable;
        }
        if (shapeDrawable2 != null) {
            return shapeDrawable2;
        }
        return null;
    }
}
