package d3;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f307612a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f307613b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f307614c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f307615d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int a(float f17) {
        if (f17 < 1.0f) {
            return -16777216;
        }
        if (f17 > 99.0f) {
            return -1;
        }
        float f18 = (f17 + 16.0f) / 116.0f;
        float f19 = (f17 > 8.0f ? 1 : (f17 == 8.0f ? 0 : -1)) > 0 ? f18 * f18 * f18 : f17 / 903.2963f;
        float f27 = f18 * f18 * f18;
        boolean z17 = f27 > 0.008856452f;
        float f28 = z17 ? f27 : ((f18 * 116.0f) - 16.0f) / 903.2963f;
        if (!z17) {
            f27 = ((f18 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f307614c;
        return e3.b.b(f28 * fArr[0], f19 * fArr[1], f27 * fArr[2]);
    }

    public static float b(int i17) {
        float f17 = i17 / 255.0f;
        return (f17 <= 0.04045f ? f17 / 12.92f : (float) java.lang.Math.pow((f17 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static float c(float f17) {
        return (f17 > 8.0f ? (float) java.lang.Math.pow((f17 + 16.0d) / 116.0d, 3.0d) : f17 / 903.2963f) * 100.0f;
    }
}
