package p012xc85e97e9.p096x62f6fe4;

/* renamed from: androidx.media.AudioAttributesCompat */
/* loaded from: classes13.dex */
public class C1125xc009ef8f implements w4.e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f93226b = 0;

    /* renamed from: a, reason: collision with root package name */
    public p012xc85e97e9.p096x62f6fe4.InterfaceC1127x5ca5bd6d f93227a;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public C1125xc009ef8f() {
    }

    public static int c(boolean z17, int i17, int i18) {
        if ((i17 & 1) == 1) {
            return z17 ? 1 : 7;
        }
        if ((i17 & 4) == 4) {
            return z17 ? 0 : 6;
        }
        switch (i18) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z17 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z17) {
                    return 3;
                }
                throw new java.lang.IllegalArgumentException("Unknown usage value " + i18 + " in audio attributes");
        }
    }

    /* renamed from: equals */
    public boolean m7870xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof p012xc85e97e9.p096x62f6fe4.C1125xc009ef8f)) {
            return false;
        }
        p012xc85e97e9.p096x62f6fe4.C1125xc009ef8f c1125xc009ef8f = (p012xc85e97e9.p096x62f6fe4.C1125xc009ef8f) obj;
        p012xc85e97e9.p096x62f6fe4.InterfaceC1127x5ca5bd6d interfaceC1127x5ca5bd6d = this.f93227a;
        return interfaceC1127x5ca5bd6d == null ? c1125xc009ef8f.f93227a == null : interfaceC1127x5ca5bd6d.equals(c1125xc009ef8f.f93227a);
    }

    /* renamed from: hashCode */
    public int m7871x8cdac1b() {
        return this.f93227a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m7872x9616526c() {
        return this.f93227a.toString();
    }

    public C1125xc009ef8f(p012xc85e97e9.p096x62f6fe4.InterfaceC1127x5ca5bd6d interfaceC1127x5ca5bd6d) {
        this.f93227a = interfaceC1127x5ca5bd6d;
    }
}
