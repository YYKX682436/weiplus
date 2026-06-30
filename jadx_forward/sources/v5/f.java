package v5;

/* loaded from: classes14.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f514815a = 0;

    static {
        x36.n nVar = x36.o.f533229h;
        nVar.a("GIF87a");
        nVar.a("GIF89a");
        nVar.a("RIFF");
        nVar.a("WEBP");
        nVar.a("VP8X");
        nVar.a("ftyp");
        nVar.a("msf1");
        nVar.a("hevc");
        nVar.a("hevx");
    }

    public static final int a(int i17, int i18, int i19, int i27, d6.g scale) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scale, "scale");
        int highestOneBit = java.lang.Integer.highestOneBit(i17 / i19);
        if (highestOneBit < 1) {
            highestOneBit = 1;
        }
        int highestOneBit2 = java.lang.Integer.highestOneBit(i18 / i27);
        if (highestOneBit2 < 1) {
            highestOneBit2 = 1;
        }
        int ordinal = scale.ordinal();
        if (ordinal == 0) {
            return java.lang.Math.min(highestOneBit, highestOneBit2);
        }
        if (ordinal == 1) {
            return java.lang.Math.max(highestOneBit, highestOneBit2);
        }
        throw new jz5.j();
    }

    public static final p135x2eae8f.p138x35e001.C1420x6f1c9387 b(int i17, int i18, p135x2eae8f.p138x35e001.AbstractC1421x275421 dstSize, d6.g scale) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dstSize, "dstSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scale, "scale");
        if (dstSize instanceof p135x2eae8f.p138x35e001.C1419x8939e192) {
            return new p135x2eae8f.p138x35e001.C1420x6f1c9387(i17, i18);
        }
        if (!(dstSize instanceof p135x2eae8f.p138x35e001.C1420x6f1c9387)) {
            throw new jz5.j();
        }
        p135x2eae8f.p138x35e001.C1420x6f1c9387 c1420x6f1c9387 = (p135x2eae8f.p138x35e001.C1420x6f1c9387) dstSize;
        double d17 = d(i17, i18, c1420x6f1c9387.f125445d, c1420x6f1c9387.f125446e, scale);
        return new p135x2eae8f.p138x35e001.C1420x6f1c9387(a06.d.a(i17 * d17), a06.d.a(d17 * i18));
    }

    public static final double c(double d17, double d18, double d19, double d27, d6.g scale) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scale, "scale");
        double d28 = d19 / d17;
        double d29 = d27 / d18;
        int ordinal = scale.ordinal();
        if (ordinal == 0) {
            return java.lang.Math.max(d28, d29);
        }
        if (ordinal == 1) {
            return java.lang.Math.min(d28, d29);
        }
        throw new jz5.j();
    }

    public static final double d(int i17, int i18, int i19, int i27, d6.g scale) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scale, "scale");
        double d17 = i19 / i17;
        double d18 = i27 / i18;
        int ordinal = scale.ordinal();
        if (ordinal == 0) {
            return java.lang.Math.max(d17, d18);
        }
        if (ordinal == 1) {
            return java.lang.Math.min(d17, d18);
        }
        throw new jz5.j();
    }
}
