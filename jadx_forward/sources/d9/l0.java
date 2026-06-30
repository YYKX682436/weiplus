package d9;

/* loaded from: classes15.dex */
public final class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final d9.l0 f308907d = new d9.l0(new d9.k0[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f308908a;

    /* renamed from: b, reason: collision with root package name */
    public final d9.k0[] f308909b;

    /* renamed from: c, reason: collision with root package name */
    public int f308910c;

    public l0(d9.k0... k0VarArr) {
        this.f308909b = k0VarArr;
        this.f308908a = k0VarArr.length;
    }

    public int a(d9.k0 k0Var) {
        for (int i17 = 0; i17 < this.f308908a; i17++) {
            if (this.f308909b[i17] == k0Var) {
                return i17;
            }
        }
        return -1;
    }

    /* renamed from: equals */
    public boolean m123741xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d9.l0.class != obj.getClass()) {
            return false;
        }
        d9.l0 l0Var = (d9.l0) obj;
        return this.f308908a == l0Var.f308908a && java.util.Arrays.equals(this.f308909b, l0Var.f308909b);
    }

    /* renamed from: hashCode */
    public int m123742x8cdac1b() {
        if (this.f308910c == 0) {
            this.f308910c = java.util.Arrays.hashCode(this.f308909b);
        }
        return this.f308910c;
    }
}
