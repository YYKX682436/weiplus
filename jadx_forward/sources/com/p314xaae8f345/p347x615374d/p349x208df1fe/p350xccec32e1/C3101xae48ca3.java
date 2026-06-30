package com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1;

/* renamed from: com.tencent.kinda.framework.animate.ArgbEvaluator */
/* loaded from: classes3.dex */
public class C3101xae48ca3 implements android.animation.TypeEvaluator {

    /* renamed from: sInstance */
    private static final android.animation.ArgbEvaluator f11823xbfaed628 = new android.animation.ArgbEvaluator();

    /* renamed from: getInstance */
    public static android.animation.ArgbEvaluator m24875x9cf0d20b() {
        return f11823xbfaed628;
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
