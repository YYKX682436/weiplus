package ga;

/* loaded from: classes13.dex */
public abstract class a {
    public static float a(float f17, float f18, float f19, float f27, float f28, float f29) {
        double d17 = f19 - f17;
        double d18 = f27 - f18;
        float hypot = (float) java.lang.Math.hypot(d17, d18);
        double d19 = f28 - f17;
        float hypot2 = (float) java.lang.Math.hypot(d19, d18);
        double d27 = f29 - f18;
        float hypot3 = (float) java.lang.Math.hypot(d19, d27);
        float hypot4 = (float) java.lang.Math.hypot(d17, d27);
        return (hypot <= hypot2 || hypot <= hypot3 || hypot <= hypot4) ? (hypot2 <= hypot3 || hypot2 <= hypot4) ? hypot3 > hypot4 ? hypot3 : hypot4 : hypot2 : hypot;
    }
}
