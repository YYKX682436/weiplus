package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.r3 f126896a;

    /* renamed from: b, reason: collision with root package name */
    public final int f126897b;

    public o4(com.p176xb6135e39.p283xc50a8b8b.r3 r3Var, int i17) {
        this.f126896a = r3Var;
        this.f126897b = i17;
    }

    /* renamed from: equals */
    public boolean m20851xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.o4)) {
            return false;
        }
        com.p176xb6135e39.p283xc50a8b8b.o4 o4Var = (com.p176xb6135e39.p283xc50a8b8b.o4) obj;
        return this.f126896a == o4Var.f126896a && this.f126897b == o4Var.f126897b;
    }

    /* renamed from: hashCode */
    public int m20852x8cdac1b() {
        return (this.f126896a.hashCode() * 65535) + this.f126897b;
    }
}
