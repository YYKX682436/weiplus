package w9;

/* loaded from: classes3.dex */
public class c implements android.animation.TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public static final w9.c f525572a = new w9.c();

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer evaluate(float f17, java.lang.Integer num, java.lang.Integer num2) {
        int intValue = num.intValue();
        float f18 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
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
