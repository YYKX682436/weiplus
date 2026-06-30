package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes13.dex */
public final class s4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f127025a;

    /* renamed from: b, reason: collision with root package name */
    public final int f127026b;

    public s4(java.lang.Object obj, int i17) {
        this.f127025a = obj;
        this.f127026b = i17;
    }

    /* renamed from: equals */
    public boolean m20901xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.s4)) {
            return false;
        }
        com.p176xb6135e39.p283xc50a8b8b.s4 s4Var = (com.p176xb6135e39.p283xc50a8b8b.s4) obj;
        return this.f127025a == s4Var.f127025a && this.f127026b == s4Var.f127026b;
    }

    /* renamed from: hashCode */
    public int m20902x8cdac1b() {
        return (java.lang.System.identityHashCode(this.f127025a) * 65535) + this.f127026b;
    }
}
