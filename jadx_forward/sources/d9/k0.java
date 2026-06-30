package d9;

/* loaded from: classes15.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f308903a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[] f308904b;

    /* renamed from: c, reason: collision with root package name */
    public int f308905c;

    public k0(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417... c1601x7dc4e417Arr) {
        t9.a.d(c1601x7dc4e417Arr.length > 0);
        this.f308904b = c1601x7dc4e417Arr;
        this.f308903a = c1601x7dc4e417Arr.length;
    }

    public int a(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417) {
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[] c1601x7dc4e417Arr = this.f308904b;
            if (i17 >= c1601x7dc4e417Arr.length) {
                return -1;
            }
            if (c1601x7dc4e417 == c1601x7dc4e417Arr[i17]) {
                return i17;
            }
            i17++;
        }
    }

    /* renamed from: equals */
    public boolean m123738xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d9.k0.class != obj.getClass()) {
            return false;
        }
        d9.k0 k0Var = (d9.k0) obj;
        return this.f308903a == k0Var.f308903a && java.util.Arrays.equals(this.f308904b, k0Var.f308904b);
    }

    /* renamed from: hashCode */
    public int m123739x8cdac1b() {
        if (this.f308905c == 0) {
            this.f308905c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + java.util.Arrays.hashCode(this.f308904b);
        }
        return this.f308905c;
    }
}
