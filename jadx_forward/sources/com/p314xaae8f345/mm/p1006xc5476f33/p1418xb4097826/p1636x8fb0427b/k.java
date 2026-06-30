package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f208568a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f208569b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f208570c;

    public k(long j17, java.lang.String str, java.lang.String objectNonceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        this.f208568a = j17;
        this.f208569b = str;
        this.f208570c = objectNonceId;
    }

    /* renamed from: equals */
    public boolean m59977xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.k)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.k) obj;
        return this.f208568a == kVar.f208568a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f208569b, kVar.f208569b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f208570c, kVar.f208570c);
    }

    /* renamed from: hashCode */
    public int m59978x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f208568a) * 31;
        java.lang.String str = this.f208569b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f208570c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m59979x9616526c() {
        return "FeedAndNonceId(feedId=" + this.f208568a + ", dupFlag=" + this.f208569b + ", objectNonceId=" + this.f208570c + ')';
    }
}
