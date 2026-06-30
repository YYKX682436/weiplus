package com.tencent.kinda.framework.animate;

/* loaded from: classes3.dex */
public class ArgbEvaluator implements android.animation.TypeEvaluator {
    private static final android.animation.ArgbEvaluator sInstance = new android.animation.ArgbEvaluator();

    public static android.animation.ArgbEvaluator getInstance() {
        return sInstance;
    }

    @Override // android.animation.TypeEvaluator
    public java.lang.Object evaluate(float f17, java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Integer) obj).intValue();
        float f18 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((java.lang.Integer) obj2).intValue();
        float pow = (float) java.lang.Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) java.lang.Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) java.lang.Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) java.lang.Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f19 = f18 + (((((intValue2 >> 24) & 255) / 255.0f) - f18) * f17);
        float pow5 = pow2 + ((((float) java.lang.Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f17);
        float pow6 = pow3 + (f17 * (((float) java.lang.Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3));
        return java.lang.Integer.valueOf((java.lang.Math.round(((float) java.lang.Math.pow(pow + ((pow4 - pow) * f17), 0.45454545454545453d)) * 255.0f) << 16) | (java.lang.Math.round(f19 * 255.0f) << 24) | (java.lang.Math.round(((float) java.lang.Math.pow(pow5, 0.45454545454545453d)) * 255.0f) << 8) | java.lang.Math.round(((float) java.lang.Math.pow(pow6, 0.45454545454545453d)) * 255.0f));
    }
}
