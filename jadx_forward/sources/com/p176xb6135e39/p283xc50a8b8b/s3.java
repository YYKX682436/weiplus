package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.e4 f127023a;

    /* renamed from: b, reason: collision with root package name */
    public final int f127024b;

    public s3(com.p176xb6135e39.p283xc50a8b8b.e4 e4Var, int i17) {
        this.f127023a = e4Var;
        this.f127024b = i17;
    }

    /* renamed from: equals */
    public boolean m20899xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.s3)) {
            return false;
        }
        com.p176xb6135e39.p283xc50a8b8b.s3 s3Var = (com.p176xb6135e39.p283xc50a8b8b.s3) obj;
        return this.f127023a == s3Var.f127023a && this.f127024b == s3Var.f127024b;
    }

    /* renamed from: hashCode */
    public int m20900x8cdac1b() {
        return (this.f127023a.hashCode() * 65535) + this.f127024b;
    }
}
