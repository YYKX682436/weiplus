package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class zaaa extends android.widget.Button {
    public zaaa(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        int i27 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i28 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int zab = zab(i18, i27, i28, i28);
        int i29 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i37 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int zab2 = zab(i18, i29, i37, i37);
        if (i17 == 0 || i17 == 1) {
            zab = zab2;
        } else if (i17 != 2) {
            throw new java.lang.IllegalStateException("Unknown button size: " + i17);
        }
        android.graphics.drawable.Drawable drawable = resources.getDrawable(zab);
        f3.b.h(drawable, resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        f3.b.i(drawable, android.graphics.PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i38 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i39 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((android.content.res.ColorStateList) com.google.android.gms.common.internal.Preconditions.checkNotNull(resources.getColorStateList(zab(i18, i38, i39, i39))));
        if (i17 == 0) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        } else if (i17 == 1) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("Unknown button size: " + i17);
            }
            setText((java.lang.CharSequence) null);
        }
        setTransformationMethod(null);
        if (com.google.android.gms.common.util.DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
