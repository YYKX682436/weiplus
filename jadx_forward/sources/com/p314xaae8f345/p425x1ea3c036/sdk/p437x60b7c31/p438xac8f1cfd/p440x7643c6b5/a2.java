package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes3.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f128915a;

    /* renamed from: b, reason: collision with root package name */
    public final int f128916b;

    public a2(java.lang.String libName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(libName, "libName");
        this.f128915a = libName;
        this.f128916b = i17;
    }

    /* renamed from: equals */
    public boolean m32101xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a2)) {
            return false;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a2 a2Var = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f128915a, a2Var.f128915a) && this.f128916b == a2Var.f128916b;
    }

    /* renamed from: hashCode */
    public int m32102x8cdac1b() {
        return (this.f128915a.hashCode() * 31) + java.lang.Integer.hashCode(this.f128916b);
    }

    /* renamed from: toString */
    public java.lang.String m32103x9616526c() {
        return "WAUDRLibInfoMeta(libName=" + this.f128915a + ", minimumVersion=" + this.f128916b + ')';
    }
}
