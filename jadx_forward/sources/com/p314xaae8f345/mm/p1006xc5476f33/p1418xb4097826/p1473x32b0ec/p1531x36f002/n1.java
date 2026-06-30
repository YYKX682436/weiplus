package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f197170a;

    /* renamed from: b, reason: collision with root package name */
    public final long f197171b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f197172c;

    public n1(java.lang.String comboId, long j17, java.lang.String fromNickName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comboId, "comboId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromNickName, "fromNickName");
        this.f197170a = comboId;
        this.f197171b = j17;
        this.f197172c = fromNickName;
    }

    /* renamed from: equals */
    public boolean m57198xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n1 n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f197170a, n1Var.f197170a) && this.f197171b == n1Var.f197171b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f197172c, n1Var.f197172c);
    }

    /* renamed from: hashCode */
    public int m57199x8cdac1b() {
        return (((this.f197170a.hashCode() * 31) + java.lang.Long.hashCode(this.f197171b)) * 31) + this.f197172c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m57200x9616526c() {
        return "OvertimeCacheData(comboId=" + this.f197170a + ", offerTime=" + this.f197171b + ", fromNickName=" + this.f197172c + ')';
    }
}
