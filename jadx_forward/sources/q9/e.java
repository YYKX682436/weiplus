package q9;

/* loaded from: classes15.dex */
public abstract class e implements q9.m {

    /* renamed from: a, reason: collision with root package name */
    public final d9.k0 f442380a;

    /* renamed from: b, reason: collision with root package name */
    public final int f442381b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f442382c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[] f442383d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f442384e;

    /* renamed from: f, reason: collision with root package name */
    public int f442385f;

    public e(d9.k0 k0Var, int... iArr) {
        int i17 = 0;
        t9.a.d(iArr.length > 0);
        k0Var.getClass();
        this.f442380a = k0Var;
        int length = iArr.length;
        this.f442381b = length;
        this.f442383d = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[length];
        for (int i18 = 0; i18 < iArr.length; i18++) {
            this.f442383d[i18] = k0Var.f308904b[iArr[i18]];
        }
        java.util.Arrays.sort(this.f442383d, new q9.d(null));
        this.f442382c = new int[this.f442381b];
        while (true) {
            int i19 = this.f442381b;
            if (i17 >= i19) {
                this.f442384e = new long[i19];
                return;
            } else {
                this.f442382c[i17] = k0Var.a(this.f442383d[i17]);
                i17++;
            }
        }
    }

    public final boolean d(int i17, long j17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean f17 = f(i17, elapsedRealtime);
        int i18 = 0;
        while (i18 < this.f442381b && !f17) {
            f17 = (i18 == i17 || f(i18, elapsedRealtime)) ? false : true;
            i18++;
        }
        if (!f17) {
            return false;
        }
        long[] jArr = this.f442384e;
        jArr[i17] = java.lang.Math.max(jArr[i17], elapsedRealtime + j17);
        return true;
    }

    public final int e(int i17) {
        for (int i18 = 0; i18 < this.f442381b; i18++) {
            if (this.f442382c[i18] == i17) {
                return i18;
            }
        }
        return -1;
    }

    /* renamed from: equals */
    public boolean m159616xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q9.e eVar = (q9.e) obj;
        return this.f442380a == eVar.f442380a && java.util.Arrays.equals(this.f442382c, eVar.f442382c);
    }

    public final boolean f(int i17, long j17) {
        return this.f442384e[i17] > j17;
    }

    /* renamed from: hashCode */
    public int m159617x8cdac1b() {
        if (this.f442385f == 0) {
            this.f442385f = (java.lang.System.identityHashCode(this.f442380a) * 31) + java.util.Arrays.hashCode(this.f442382c);
        }
        return this.f442385f;
    }
}
