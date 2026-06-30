package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public final class vk {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.vk f292702a = new com.p314xaae8f345.mm.ui.vk();

    public static android.graphics.drawable.GradientDrawable a(com.p314xaae8f345.mm.ui.vk vkVar, int i17, float f17, float f18, float f19, float f27, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 1) != 0) {
            i17 = 0;
        }
        if ((i27 & 2) != 0) {
            f17 = 0.0f;
        }
        if ((i27 & 4) != 0) {
            f18 = 0.0f;
        }
        if ((i27 & 8) != 0) {
            f19 = 0.0f;
        }
        if ((i27 & 16) != 0) {
            f27 = 0.0f;
        }
        if ((i27 & 32) != 0) {
            i18 = 0;
        }
        if ((i27 & 64) != 0) {
            i19 = 0;
        }
        vkVar.getClass();
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i17);
        gradientDrawable.setCornerRadii(new float[]{f17, f17, f18, f18, f27, f27, f19, f19});
        if (i18 > 0) {
            gradientDrawable.setStroke(i18, i19);
        }
        return gradientDrawable;
    }

    public final android.graphics.drawable.Drawable b(int i17, int i18, float f17, float f18, float f19, float f27) {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, a(this, i18, f17, f18, f19, f27, 0, 0, 96, null));
        stateListDrawable.addState(new int[0], a(this, i17, f17, f18, f19, f27, 0, 0, 96, null));
        return stateListDrawable;
    }
}
