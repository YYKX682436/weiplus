package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class AspectRatio {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.c f48362a;

    /* renamed from: b, reason: collision with root package name */
    public final double f48363b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48364c;

    /* renamed from: d, reason: collision with root package name */
    public final int f48365d;

    private AspectRatio(int i17, double d17, int i18, int i19) {
        com.tencent.maas.moviecomposing.c cVar;
        com.tencent.maas.moviecomposing.c[] values = com.tencent.maas.moviecomposing.c.values();
        int length = values.length;
        int i27 = 0;
        while (true) {
            if (i27 >= length) {
                cVar = com.tencent.maas.moviecomposing.c.ASPECT_RATIO_INVALID;
                break;
            }
            cVar = values[i27];
            if (cVar.f48482d == i17) {
                break;
            } else {
                i27++;
            }
        }
        this.f48362a = cVar;
        this.f48363b = d17;
        this.f48364c = i18;
        this.f48365d = i19;
    }

    public static com.tencent.maas.moviecomposing.AspectRatio a(com.tencent.maas.moviecomposing.c cVar) {
        return nativeFromTypeValue(cVar.f48482d);
    }

    private static native com.tencent.maas.moviecomposing.AspectRatio nativeFromSize(int i17, int i18);

    private static native com.tencent.maas.moviecomposing.AspectRatio nativeFromTypeValue(int i17);

    public int getAspectRatioTypeValue() {
        return this.f48362a.f48482d;
    }

    public int getHeight() {
        return this.f48365d;
    }

    public int getWidth() {
        return this.f48364c;
    }

    public java.lang.String toString() {
        return "AspectRatio{aspectRatioType=" + this.f48362a + ", doubleValue=" + this.f48363b + ", width=" + this.f48364c + ", height=" + this.f48365d + '}';
    }
}
