package gf;

/* loaded from: classes5.dex */
public final class k2 implements java.lang.Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final gf.j2 f352640e = new gf.j2(null);

    /* renamed from: f, reason: collision with root package name */
    public static final gf.k2 f352641f = new gf.k2(new int[]{0, 0, 0});

    /* renamed from: g, reason: collision with root package name */
    public static final gf.k2 f352642g = new gf.k2(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE});

    /* renamed from: d, reason: collision with root package name */
    public final int[] f352643d;

    public k2(int[] iArr) {
        this.f352643d = iArr;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        gf.k2 other = (gf.k2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        for (int i17 = 0; i17 < 3; i17++) {
            int i18 = this.f352643d[i17];
            int i19 = other.f352643d[i17];
            if (i18 != i19) {
                return i18 - i19;
            }
        }
        return 0;
    }
}
