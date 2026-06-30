package q9;

/* loaded from: classes15.dex */
public class b extends q9.e {

    /* renamed from: g, reason: collision with root package name */
    public final r9.e f442373g;

    /* renamed from: h, reason: collision with root package name */
    public final int f442374h;

    /* renamed from: i, reason: collision with root package name */
    public final long f442375i;

    /* renamed from: j, reason: collision with root package name */
    public final long f442376j;

    /* renamed from: k, reason: collision with root package name */
    public final float f442377k;

    /* renamed from: l, reason: collision with root package name */
    public int f442378l;

    /* renamed from: m, reason: collision with root package name */
    public int f442379m;

    public b(d9.k0 k0Var, int[] iArr, r9.e eVar, int i17, long j17, long j18, long j19, float f17) {
        super(k0Var, iArr);
        this.f442373g = eVar;
        this.f442374h = i17;
        this.f442375i = j17 * 1000;
        this.f442376j = j18 * 1000;
        this.f442377k = f17;
        this.f442378l = g(Long.MIN_VALUE);
        this.f442379m = 1;
    }

    @Override // q9.m
    public void a(long j17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i17 = this.f442378l;
        int g17 = g(elapsedRealtime);
        this.f442378l = g17;
        if (g17 == i17) {
            return;
        }
        if (!f(i17, elapsedRealtime)) {
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[] c1601x7dc4e417Arr = this.f442383d;
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417 = c1601x7dc4e417Arr[i17];
            int i18 = c1601x7dc4e417Arr[this.f442378l].f125609e;
            int i19 = c1601x7dc4e417.f125609e;
            if (i18 > i19 && j17 < this.f442375i) {
                this.f442378l = i17;
            } else if (i18 < i19 && j17 >= this.f442376j) {
                this.f442378l = i17;
            }
        }
        if (this.f442378l != i17) {
            this.f442379m = 3;
        }
    }

    @Override // q9.m
    public java.lang.Object b() {
        return null;
    }

    @Override // q9.m
    public int c() {
        return this.f442379m;
    }

    public final int g(long j17) {
        long j18 = this.f442373g.c() == -1 ? this.f442374h : ((float) r0) * this.f442377k;
        int i17 = 0;
        for (int i18 = 0; i18 < this.f442381b; i18++) {
            if (j17 == Long.MIN_VALUE || !f(i18, j17)) {
                if (this.f442383d[i18].f125609e <= j18) {
                    return i18;
                }
                i17 = i18;
            }
        }
        return i17;
    }

    @Override // q9.m
    /* renamed from: getSelectedIndex */
    public int mo14753x12f86b41() {
        return this.f442378l;
    }
}
