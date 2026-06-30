package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class k5 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f283425a;

    /* renamed from: b, reason: collision with root package name */
    public final int f283426b;

    /* renamed from: c, reason: collision with root package name */
    public final int f283427c;

    /* renamed from: d, reason: collision with root package name */
    public final int f283428d;

    public k5(int i17, int i18, int i19, int i27) {
        this.f283425a = i17;
        this.f283426b = i18;
        this.f283427c = i19;
        this.f283428d = i27;
    }

    /* renamed from: equals */
    public boolean m79759xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.k5)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.k5 k5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.k5) obj;
        return this.f283425a == k5Var.f283425a && this.f283426b == k5Var.f283426b && this.f283427c == k5Var.f283427c && this.f283428d == k5Var.f283428d;
    }

    /* renamed from: hashCode */
    public int m79760x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f283425a) * 31) + java.lang.Integer.hashCode(this.f283426b)) * 31) + java.lang.Integer.hashCode(this.f283427c)) * 31) + java.lang.Integer.hashCode(this.f283428d);
    }

    /* renamed from: toString */
    public java.lang.String m79761x9616526c() {
        return "ThumbParams(thumbLeft=" + this.f283425a + ", thumbTop=" + this.f283426b + ", thumbWidth=" + this.f283427c + ", thumbHeight=" + this.f283428d + ')';
    }
}
