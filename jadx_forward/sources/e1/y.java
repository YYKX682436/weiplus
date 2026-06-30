package e1;

/* loaded from: classes14.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final long f327844b = e1.a0.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f327845c = e1.a0.c(4282664004L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f327846d = e1.a0.c(4287137928L);

    /* renamed from: e, reason: collision with root package name */
    public static final long f327847e = e1.a0.c(4291611852L);

    /* renamed from: f, reason: collision with root package name */
    public static final long f327848f = e1.a0.c(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);

    /* renamed from: g, reason: collision with root package name */
    public static final long f327849g = e1.a0.c(4294901760L);

    /* renamed from: h, reason: collision with root package name */
    public static final long f327850h = e1.a0.c(4278255360L);

    /* renamed from: i, reason: collision with root package name */
    public static final long f327851i = e1.a0.c(4278190335L);

    /* renamed from: j, reason: collision with root package name */
    public static final long f327852j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f327853k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f327854l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f327855a;

    static {
        e1.a0.c(4294967040L);
        e1.a0.c(4278255615L);
        e1.a0.c(4294902015L);
        f327852j = e1.a0.b(0);
        f327853k = e1.a0.a(0.0f, 0.0f, 0.0f, 0.0f, f1.h.f340028t);
    }

    public static final long a(long j17, f1.d colorSpace) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorSpace, "colorSpace");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(colorSpace, f(j17))) {
            return j17;
        }
        f1.k d17 = f1.e.d(f(j17), colorSpace, 0, 2, null);
        float[] e17 = e1.a0.e(j17);
        d17.a(e17);
        return e1.a0.a(e17[0], e17[1], e17[2], e17[3], colorSpace);
    }

    public static long b(long j17, float f17, float f18, float f19, float f27, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = d(j17);
        }
        if ((i17 & 2) != 0) {
            f18 = h(j17);
        }
        if ((i17 & 4) != 0) {
            f19 = g(j17);
        }
        if ((i17 & 8) != 0) {
            f27 = e(j17);
        }
        return e1.a0.a(f18, f19, f27, f17, f(j17));
    }

    public static final boolean c(long j17, long j18) {
        return j17 == j18;
    }

    public static final float d(long j17) {
        float a17;
        float f17;
        if ((63 & j17) == 0) {
            a17 = (float) jz5.h0.a((j17 >>> 56) & 255);
            f17 = 255.0f;
        } else {
            a17 = (float) jz5.h0.a((j17 >>> 6) & 1023);
            f17 = 1023.0f;
        }
        return a17 / f17;
    }

    public static final float e(long j17) {
        return (63 & j17) == 0 ? ((float) jz5.h0.a((j17 >>> 32) & 255)) / 255.0f : e1.c0.b((short) ((j17 >>> 16) & 65535));
    }

    public static final f1.d f(long j17) {
        f1.h hVar = f1.h.f340009a;
        return f1.h.f340030v[(int) (j17 & 63)];
    }

    public static final float g(long j17) {
        return (63 & j17) == 0 ? ((float) jz5.h0.a((j17 >>> 40) & 255)) / 255.0f : e1.c0.b((short) ((j17 >>> 32) & 65535));
    }

    public static final float h(long j17) {
        return (63 & j17) == 0 ? ((float) jz5.h0.a((j17 >>> 48) & 255)) / 255.0f : e1.c0.b((short) ((j17 >>> 48) & 65535));
    }

    public static java.lang.String i(long j17) {
        return "Color(" + h(j17) + ", " + g(j17) + ", " + e(j17) + ", " + d(j17) + ", " + f(j17).f340004a + ')';
    }

    /* renamed from: equals */
    public boolean m126676xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof e1.y) {
            return this.f327855a == ((e1.y) obj).f327855a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m126677x8cdac1b() {
        return java.lang.Long.hashCode(this.f327855a);
    }

    /* renamed from: toString */
    public java.lang.String m126678x9616526c() {
        return i(this.f327855a);
    }
}
