package d1;

/* loaded from: classes14.dex */
public abstract class c {
    public static final java.lang.String a(float f17, int i17) {
        int max = java.lang.Math.max(i17, 0);
        float pow = (float) java.lang.Math.pow(10.0f, max);
        float f18 = f17 * pow;
        int i18 = (int) f18;
        if (f18 - i18 >= 0.5f) {
            i18++;
        }
        float f19 = i18 / pow;
        return max > 0 ? java.lang.String.valueOf(f19) : java.lang.String.valueOf((int) f19);
    }
}
