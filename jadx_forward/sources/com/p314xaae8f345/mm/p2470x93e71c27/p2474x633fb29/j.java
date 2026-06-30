package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f270878a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f270879b;

    public j(boolean z17, boolean z18) {
        this.f270878a = z17;
        this.f270879b = z18;
    }

    /* renamed from: equals */
    public boolean m75242xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j)) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j jVar = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j) obj;
        return this.f270878a == jVar.f270878a && this.f270879b == jVar.f270879b;
    }

    /* renamed from: hashCode */
    public int m75243x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f270878a) * 31) + java.lang.Boolean.hashCode(this.f270879b);
    }

    /* renamed from: toString */
    public java.lang.String m75244x9616526c() {
        return "ShowFinderDigestResult(showDigest=" + this.f270878a + ", showRedDot=" + this.f270879b + ')';
    }
}
