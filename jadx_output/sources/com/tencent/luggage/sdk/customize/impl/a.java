package com.tencent.luggage.sdk.customize.impl;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f47312a;

    /* renamed from: b, reason: collision with root package name */
    public final long f47313b;

    public a(int i17, long j17) {
        this.f47312a = i17;
        this.f47313b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.luggage.sdk.customize.impl.a)) {
            return false;
        }
        com.tencent.luggage.sdk.customize.impl.a aVar = (com.tencent.luggage.sdk.customize.impl.a) obj;
        return this.f47312a == aVar.f47312a && this.f47313b == aVar.f47313b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f47312a) * 31) + java.lang.Long.hashCode(this.f47313b);
    }

    public java.lang.String toString() {
        return "LastScan(id=" + this.f47312a + ", timeStamp=" + this.f47313b + ')';
    }
}
