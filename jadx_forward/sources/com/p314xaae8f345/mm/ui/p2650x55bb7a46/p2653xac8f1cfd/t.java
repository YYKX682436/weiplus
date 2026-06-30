package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public long[] f281491a;

    /* renamed from: b, reason: collision with root package name */
    public int f281492b;

    public t(int i17) {
        this.f281491a = new long[i17];
    }

    /* renamed from: toString */
    public java.lang.String m79526x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append('#');
        long[] copyOf = java.util.Arrays.copyOf(this.f281491a, this.f281492b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
        java.lang.String arrays = java.util.Arrays.toString(copyOf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        return sb6.toString();
    }
}
