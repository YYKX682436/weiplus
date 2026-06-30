package e1;

/* loaded from: classes14.dex */
public abstract class a0 {
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(float r10, float r11, float r12, float r13, f1.d r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.a0.a(float, float, float, float, f1.d):long");
    }

    public static final long b(int i17) {
        long j17 = i17 << 32;
        int i18 = e1.y.f327854l;
        return j17;
    }

    public static final long c(long j17) {
        long j18 = (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) << 32;
        int i17 = e1.y.f327854l;
        return j18;
    }

    public static final long d(long j17, long j18) {
        long a17 = e1.y.a(j17, e1.y.f(j18));
        float d17 = e1.y.d(j18);
        float d18 = e1.y.d(a17);
        float f17 = 1.0f - d18;
        float f18 = (d17 * f17) + d18;
        return a((f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((e1.y.h(a17) * d18) + ((e1.y.h(j18) * d17) * f17)) / f18, (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((e1.y.g(a17) * d18) + ((e1.y.g(j18) * d17) * f17)) / f18, f18 == 0.0f ? 0.0f : ((e1.y.e(a17) * d18) + ((e1.y.e(j18) * d17) * f17)) / f18, f18, e1.y.f(j18));
    }

    public static final float[] e(long j17) {
        return new float[]{e1.y.h(j17), e1.y.g(j17), e1.y.e(j17), e1.y.d(j17)};
    }

    public static final long f(long j17, long j18, float f17) {
        f1.h hVar = f1.h.f340009a;
        f1.d dVar = f1.h.f340029u;
        long a17 = e1.y.a(j17, dVar);
        long a18 = e1.y.a(j18, dVar);
        float d17 = e1.y.d(a17);
        float h17 = e1.y.h(a17);
        float g17 = e1.y.g(a17);
        float e17 = e1.y.e(a17);
        float d18 = e1.y.d(a18);
        float h18 = e1.y.h(a18);
        float g18 = e1.y.g(a18);
        float e18 = e1.y.e(a18);
        return e1.y.a(a(q2.a.a(h17, h18, f17), q2.a.a(g17, g18, f17), q2.a.a(e17, e18, f17), q2.a.a(d17, d18, f17), dVar), e1.y.f(j18));
    }

    public static final float g(long j17) {
        f1.d f17 = e1.y.f(j17);
        long j18 = f17.f340005b;
        int i17 = f1.c.f340003e;
        if (!f1.c.a(j18, f1.c.f339999a)) {
            throw new java.lang.IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((java.lang.Object) f1.c.b(f17.f340005b))).toString());
        }
        f1.w wVar = (f1.w) ((f1.y) f17).f340066n;
        float doubleValue = (float) ((((java.lang.Number) wVar.mo146xb9724478(java.lang.Double.valueOf(e1.y.h(j17)))).doubleValue() * 0.2126d) + (((java.lang.Number) wVar.mo146xb9724478(java.lang.Double.valueOf(e1.y.g(j17)))).doubleValue() * 0.7152d) + (((java.lang.Number) wVar.mo146xb9724478(java.lang.Double.valueOf(e1.y.e(j17)))).doubleValue() * 0.0722d));
        float f18 = 0.0f;
        if (doubleValue > 0.0f) {
            f18 = 1.0f;
            if (doubleValue < 1.0f) {
                return doubleValue;
            }
        }
        return f18;
    }

    public static final int h(long j17) {
        f1.d f17 = e1.y.f(j17);
        if (f17.d()) {
            return (int) (j17 >>> 32);
        }
        float[] e17 = e(j17);
        f1.e.d(f17, null, 0, 3, null).a(e17);
        return ((int) ((e17[2] * 255.0f) + 0.5f)) | (((int) ((e17[3] * 255.0f) + 0.5f)) << 24) | (((int) ((e17[0] * 255.0f) + 0.5f)) << 16) | (((int) ((e17[1] * 255.0f) + 0.5f)) << 8);
    }
}
