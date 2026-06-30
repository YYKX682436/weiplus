package g9;

/* loaded from: classes15.dex */
public final class e extends q9.e {

    /* renamed from: g, reason: collision with root package name */
    public int f351100g;

    public e(d9.k0 k0Var, int[] iArr) {
        super(k0Var, iArr);
        int i17 = 0;
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417 = k0Var.f308904b[0];
        while (true) {
            if (i17 >= this.f442381b) {
                i17 = -1;
                break;
            } else if (this.f442383d[i17] == c1601x7dc4e417) {
                break;
            } else {
                i17++;
            }
        }
        this.f351100g = i17;
    }

    @Override // q9.m
    public void a(long j17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (f(this.f351100g, elapsedRealtime)) {
            for (int i17 = this.f442381b - 1; i17 >= 0; i17--) {
                if (!f(i17, elapsedRealtime)) {
                    this.f351100g = i17;
                    return;
                }
            }
            throw new java.lang.IllegalStateException();
        }
    }

    @Override // q9.m
    public java.lang.Object b() {
        return null;
    }

    @Override // q9.m
    public int c() {
        return 0;
    }

    @Override // q9.m
    /* renamed from: getSelectedIndex */
    public int mo14753x12f86b41() {
        return this.f351100g;
    }
}
