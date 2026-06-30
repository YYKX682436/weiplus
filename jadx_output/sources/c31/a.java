package c31;

/* loaded from: classes12.dex */
public abstract class a {
    public static float a(long j17) {
        float f17 = ((float) j17) / 1000.0f;
        if (f17 < 1.0f) {
            f17 = 1.0f;
        }
        return java.lang.Math.round(f17);
    }

    public static java.lang.CharSequence b(android.content.Context context, int i17) {
        if (i17 <= 0) {
            return context.getString(com.tencent.mm.R.string.ccs, 0, 0);
        }
        return context.getString(com.tencent.mm.R.string.ccs, java.lang.Integer.valueOf(i17 / 60), java.lang.Integer.valueOf(i17 % 60));
    }
}
