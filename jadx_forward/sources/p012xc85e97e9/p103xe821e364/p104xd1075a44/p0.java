package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class p0 implements p012xc85e97e9.p103xe821e364.p104xd1075a44.s2 {

    /* renamed from: a, reason: collision with root package name */
    public int f93718a;

    /* renamed from: b, reason: collision with root package name */
    public int f93719b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f93720c;

    /* renamed from: d, reason: collision with root package name */
    public int f93721d;

    public void a(int i17, int i18) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i18 < 0) {
            throw new java.lang.IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i19 = this.f93721d * 2;
        int[] iArr = this.f93720c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f93720c = iArr2;
            java.util.Arrays.fill(iArr2, -1);
        } else if (i19 >= iArr.length) {
            int[] iArr3 = new int[i19 * 2];
            this.f93720c = iArr3;
            java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f93720c;
        iArr4[i19] = i17;
        iArr4[i19 + 1] = i18;
        this.f93721d++;
    }

    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, boolean z17) {
        this.f93721d = 0;
        int[] iArr = this.f93720c;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.f93435s;
        if (c1163xf1deaba4.f93434r == null || layoutManager == null || !layoutManager.m8044x9ec9e82d()) {
            return;
        }
        if (!z17) {
            if (!(!c1163xf1deaba4.f93446z || c1163xf1deaba4.I || c1163xf1deaba4.f93423g.g())) {
                layoutManager.mo7927x3a789507(this.f93718a, this.f93719b, c1163xf1deaba4.F1, this);
            }
        } else if (!c1163xf1deaba4.f93423g.g()) {
            layoutManager.mo7928x7cba7099(c1163xf1deaba4.f93434r.mo1894x7e414b06(), this);
        }
        int i17 = this.f93721d;
        if (i17 > layoutManager.f3600x5b55db97) {
            layoutManager.f3600x5b55db97 = i17;
            layoutManager.f3601xcca70e2e = z17;
            c1163xf1deaba4.f93421e.o();
        }
    }
}
