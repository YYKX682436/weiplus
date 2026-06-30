package qm5;

/* loaded from: classes14.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f446391a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f446392b = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f446393c = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f446394d = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    public static float a(float f17) {
        return f17 == 0.0f ? 1.0f : 0.0f;
    }

    public static float[] b(qm5.l lVar, boolean z17, boolean z18) {
        int ordinal = lVar.ordinal();
        float[] fArr = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? f446391a : f446394d : f446393c : f446392b;
        if (z17) {
            fArr = new float[]{a(fArr[0]), fArr[1], a(fArr[2]), fArr[3], a(fArr[4]), fArr[5], a(fArr[6]), fArr[7]};
        }
        return z18 ? new float[]{fArr[0], a(fArr[1]), fArr[2], a(fArr[3]), fArr[4], a(fArr[5]), fArr[6], a(fArr[7])} : fArr;
    }
}
