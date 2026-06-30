package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class e9 extends com.tencent.mm.plugin.appbrand.launching.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f84596a;

    public e9(long j17) {
        super(null);
        this.f84596a = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.launching.e9) && this.f84596a == ((com.tencent.mm.plugin.appbrand.launching.e9) obj).f84596a;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f84596a);
    }

    public java.lang.String toString() {
        return "FallbackIfTimeout[" + this.f84596a + "ms]";
    }
}
