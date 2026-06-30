package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f272721a;

    /* renamed from: b, reason: collision with root package name */
    public final int f272722b;

    /* renamed from: c, reason: collision with root package name */
    public final int f272723c;

    public b1(int i17, int i18, int i19) {
        this.f272721a = i17;
        this.f272722b = i18;
        this.f272723c = i19;
    }

    /* renamed from: equals */
    public boolean m75705xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b1)) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b1 b1Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b1) obj;
        return this.f272721a == b1Var.f272721a && this.f272722b == b1Var.f272722b && this.f272723c == b1Var.f272723c;
    }

    /* renamed from: hashCode */
    public int m75706x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f272721a) * 31) + java.lang.Integer.hashCode(this.f272722b)) * 31) + java.lang.Integer.hashCode(this.f272723c);
    }

    /* renamed from: toString */
    public java.lang.String m75707x9616526c() {
        return "SeparatorSpanObj(start=" + this.f272721a + ", end=" + this.f272722b + ", color=" + this.f272723c + ')';
    }
}
