package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.zaaa */
/* loaded from: classes13.dex */
public final class C1943x38ed87 extends android.widget.Button {
    public C1943x38ed87(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, null, android.R.attr.buttonStyle);
    }

    private static final int zab(int i17, int i18, int i19, int i27) {
        if (i17 == 0) {
            return i18;
        }
        if (i17 == 1) {
            return i19;
        }
        if (i17 == 2) {
            return i27;
        }
        throw new java.lang.IllegalStateException("Unknown color scheme: " + i17);
    }

    public final void zaa(android.content.res.Resources resources, int i17, int i18) {
        setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i19 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i19);
        setMinWidth(i19);
        int i27 = com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1695xcebc809e.f5741x5310f56e;
        int i28 = com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1695xcebc809e.f5746xf81ee1e;
        int zab = zab(i18, i27, i28, i28);
        int i29 = com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1695xcebc809e.f5750x68193d3a;
        int i37 = com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1695xcebc809e.f5755x9b829fd2;
        int zab2 = zab(i18, i29, i37, i37);
        if (i17 == 0 || i17 == 1) {
            zab = zab2;
        } else if (i17 != 2) {
            throw new java.lang.IllegalStateException("Unknown button size: " + i17);
        }
        android.graphics.drawable.Drawable drawable = resources.getDrawable(zab);
        f3.b.h(drawable, resources.getColorStateList(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1694x5a72f63.f5739xc5263dc9));
        f3.b.i(drawable, android.graphics.PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i38 = com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1694x5a72f63.f5729x68193d3a;
        int i39 = com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1694x5a72f63.f5734x9b829fd2;
        setTextColor((android.content.res.ColorStateList) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(resources.getColorStateList(zab(i18, i38, i39, i39))));
        if (i17 == 0) {
            setText(resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5785xe4ff37d1));
        } else if (i17 == 1) {
            setText(resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5786xa6fd822a));
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("Unknown button size: " + i17);
            }
            setText((java.lang.CharSequence) null);
        }
        setTransformationMethod(null);
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.m18567xa53304a3(getContext())) {
            setGravity(19);
        }
    }
}
