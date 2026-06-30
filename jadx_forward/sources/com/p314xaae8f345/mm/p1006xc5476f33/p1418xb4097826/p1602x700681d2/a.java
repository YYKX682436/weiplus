package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f203781a;

    /* renamed from: b, reason: collision with root package name */
    public final int f203782b;

    public a(long j17, int i17) {
        this.f203781a = j17;
        this.f203782b = i17;
    }

    /* renamed from: equals */
    public boolean m58556xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.a) obj;
        return this.f203781a == aVar.f203781a && this.f203782b == aVar.f203782b;
    }

    /* renamed from: hashCode */
    public int m58557x8cdac1b() {
        return (java.lang.Long.hashCode(this.f203781a) * 31) + java.lang.Integer.hashCode(this.f203782b);
    }

    /* renamed from: toString */
    public java.lang.String m58558x9616526c() {
        return "CacheKey(collectionId=" + this.f203781a + ", enterType=" + this.f203782b + ')';
    }
}
