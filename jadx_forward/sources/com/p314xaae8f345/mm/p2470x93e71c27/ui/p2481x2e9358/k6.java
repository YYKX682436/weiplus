package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f271979a;

    /* renamed from: b, reason: collision with root package name */
    public final int f271980b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f271981c;

    public k6(int i17, int i18, int[] loc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loc, "loc");
        this.f271979a = i17;
        this.f271980b = i18;
        this.f271981c = loc;
    }

    /* renamed from: equals */
    public boolean m75556xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k6)) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k6 k6Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k6) obj;
        return this.f271979a == k6Var.f271979a && this.f271980b == k6Var.f271980b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f271981c, k6Var.f271981c);
    }

    /* renamed from: hashCode */
    public int m75557x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f271979a) * 31) + java.lang.Integer.hashCode(this.f271980b)) * 31) + java.util.Arrays.hashCode(this.f271981c);
    }

    /* renamed from: toString */
    public java.lang.String m75558x9616526c() {
        return "AnimViewParam(width=" + this.f271979a + ", height=" + this.f271980b + ", loc=" + java.util.Arrays.toString(this.f271981c) + ')';
    }
}
