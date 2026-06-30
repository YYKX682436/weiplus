package hu4;

/* loaded from: classes9.dex */
public class k {

    /* renamed from: c, reason: collision with root package name */
    public static final hu4.k[][] f366764c = (hu4.k[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) hu4.k.class, 3, 3);

    /* renamed from: a, reason: collision with root package name */
    public final int f366765a;

    /* renamed from: b, reason: collision with root package name */
    public final int f366766b;

    static {
        for (int i17 = 0; i17 < 3; i17++) {
            for (int i18 = 0; i18 < 3; i18++) {
                f366764c[i17][i18] = new hu4.k(i17, i18);
            }
        }
    }

    public k(int i17, int i18) {
        this.f366765a = 0;
        this.f366766b = 0;
        this.f366765a = i17;
        this.f366766b = i18;
    }

    public static synchronized hu4.k a(int i17, int i18) {
        hu4.k kVar;
        synchronized (hu4.k.class) {
            if (i17 < 0 || i17 > 2) {
                throw new java.lang.IllegalArgumentException("row id should be in range [0..2]");
            }
            if (i18 < 0 || i18 > 2) {
                throw new java.lang.IllegalArgumentException("col id should be in range [0..2]");
            }
            kVar = f366764c[i17][i18];
        }
        return kVar;
    }

    /* renamed from: toString */
    public java.lang.String m134169x9616526c() {
        return java.lang.String.format("{row: %d, col: %d}", java.lang.Integer.valueOf(this.f366765a), java.lang.Integer.valueOf(this.f366766b));
    }
}
