package com.google.protobuf;

/* loaded from: classes13.dex */
public final class s4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f45492a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45493b;

    public s4(java.lang.Object obj, int i17) {
        this.f45492a = obj;
        this.f45493b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.protobuf.s4)) {
            return false;
        }
        com.google.protobuf.s4 s4Var = (com.google.protobuf.s4) obj;
        return this.f45492a == s4Var.f45492a && this.f45493b == s4Var.f45493b;
    }

    public int hashCode() {
        return (java.lang.System.identityHashCode(this.f45492a) * 65535) + this.f45493b;
    }
}
