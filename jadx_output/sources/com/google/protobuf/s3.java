package com.google.protobuf;

/* loaded from: classes16.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.e4 f45490a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45491b;

    public s3(com.google.protobuf.e4 e4Var, int i17) {
        this.f45490a = e4Var;
        this.f45491b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.protobuf.s3)) {
            return false;
        }
        com.google.protobuf.s3 s3Var = (com.google.protobuf.s3) obj;
        return this.f45490a == s3Var.f45490a && this.f45491b == s3Var.f45491b;
    }

    public int hashCode() {
        return (this.f45490a.hashCode() * 65535) + this.f45491b;
    }
}
