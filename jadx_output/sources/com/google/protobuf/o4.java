package com.google.protobuf;

/* loaded from: classes16.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.r3 f45363a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45364b;

    public o4(com.google.protobuf.r3 r3Var, int i17) {
        this.f45363a = r3Var;
        this.f45364b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.protobuf.o4)) {
            return false;
        }
        com.google.protobuf.o4 o4Var = (com.google.protobuf.o4) obj;
        return this.f45363a == o4Var.f45363a && this.f45364b == o4Var.f45364b;
    }

    public int hashCode() {
        return (this.f45363a.hashCode() * 65535) + this.f45364b;
    }
}
