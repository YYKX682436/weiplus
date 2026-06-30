package com.p314xaae8f345.p425x1ea3c036.sdk.p435x600e8c43.p436x316220;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f128845a;

    /* renamed from: b, reason: collision with root package name */
    public final long f128846b;

    public a(int i17, long j17) {
        this.f128845a = i17;
        this.f128846b = j17;
    }

    /* renamed from: equals */
    public boolean m32074xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p435x600e8c43.p436x316220.a)) {
            return false;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p435x600e8c43.p436x316220.a aVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p435x600e8c43.p436x316220.a) obj;
        return this.f128845a == aVar.f128845a && this.f128846b == aVar.f128846b;
    }

    /* renamed from: hashCode */
    public int m32075x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f128845a) * 31) + java.lang.Long.hashCode(this.f128846b);
    }

    /* renamed from: toString */
    public java.lang.String m32076x9616526c() {
        return "LastScan(id=" + this.f128845a + ", timeStamp=" + this.f128846b + ')';
    }
}
