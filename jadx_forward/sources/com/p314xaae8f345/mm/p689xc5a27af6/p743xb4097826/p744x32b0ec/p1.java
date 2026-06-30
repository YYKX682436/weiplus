package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f148395a;

    /* renamed from: b, reason: collision with root package name */
    public final int f148396b;

    public p1(int i17, int i18) {
        this.f148395a = i17;
        this.f148396b = i18;
    }

    /* renamed from: equals */
    public boolean m44980xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.p1)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.p1 p1Var = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.p1) obj;
        return this.f148395a == p1Var.f148395a && this.f148396b == p1Var.f148396b;
    }

    /* renamed from: hashCode */
    public int m44981x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f148395a) * 31) + java.lang.Integer.hashCode(this.f148396b);
    }

    /* renamed from: toString */
    public java.lang.String m44982x9616526c() {
        return "RequestAndRefreshActivityIconResult(interval=" + this.f148395a + ", actType=" + this.f148396b + ')';
    }
}
