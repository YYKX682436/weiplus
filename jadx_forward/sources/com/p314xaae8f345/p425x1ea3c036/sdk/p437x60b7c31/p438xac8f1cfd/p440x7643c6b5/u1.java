package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f129085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f129086b;

    public u1(java.lang.String libName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(libName, "libName");
        this.f129085a = libName;
        this.f129086b = i17;
    }

    /* renamed from: equals */
    public boolean m32163xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.u1)) {
            return false;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.u1 u1Var = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.u1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f129085a, u1Var.f129085a) && this.f129086b == u1Var.f129086b;
    }

    /* renamed from: hashCode */
    public int m32164x8cdac1b() {
        return (this.f129085a.hashCode() * 31) + java.lang.Integer.hashCode(this.f129086b);
    }

    /* renamed from: toString */
    public java.lang.String m32165x9616526c() {
        return "NativeLibMeta(libName=" + this.f129085a + ", minimumVersion=" + this.f129086b + ')';
    }
}
