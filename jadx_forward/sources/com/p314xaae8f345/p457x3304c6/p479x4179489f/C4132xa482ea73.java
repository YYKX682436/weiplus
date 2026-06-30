package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* renamed from: com.tencent.maas.moviecomposing.AspectRatio */
/* loaded from: classes5.dex */
public class C4132xa482ea73 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.c f129895a;

    /* renamed from: b, reason: collision with root package name */
    public final double f129896b;

    /* renamed from: c, reason: collision with root package name */
    public final int f129897c;

    /* renamed from: d, reason: collision with root package name */
    public final int f129898d;

    private C4132xa482ea73(int i17, double d17, int i18, int i19) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.c[] m34310xcee59d22 = com.p314xaae8f345.p457x3304c6.p479x4179489f.c.m34310xcee59d22();
        int length = m34310xcee59d22.length;
        int i27 = 0;
        while (true) {
            if (i27 >= length) {
                cVar = com.p314xaae8f345.p457x3304c6.p479x4179489f.c.ASPECT_RATIO_INVALID;
                break;
            }
            cVar = m34310xcee59d22[i27];
            if (cVar.f130015d == i17) {
                break;
            } else {
                i27++;
            }
        }
        this.f129895a = cVar;
        this.f129896b = d17;
        this.f129897c = i18;
        this.f129898d = i19;
    }

    public static com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 a(com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar) {
        return m34018x412a8af6(cVar.f130015d);
    }

    /* renamed from: nativeFromSize */
    private static native com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 m34017xcdc23402(int i17, int i18);

    /* renamed from: nativeFromTypeValue */
    private static native com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 m34018x412a8af6(int i17);

    /* renamed from: getAspectRatioTypeValue */
    public int m34019x6408557a() {
        return this.f129895a.f130015d;
    }

    /* renamed from: getHeight */
    public int m34020x1c4fb41d() {
        return this.f129898d;
    }

    /* renamed from: getWidth */
    public int m34021x755bd410() {
        return this.f129897c;
    }

    /* renamed from: toString */
    public java.lang.String m34022x9616526c() {
        return "AspectRatio{aspectRatioType=" + this.f129895a + ", doubleValue=" + this.f129896b + ", width=" + this.f129897c + ", height=" + this.f129898d + '}';
    }
}
