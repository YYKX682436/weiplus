package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f197115a;

    /* renamed from: b, reason: collision with root package name */
    public int f197116b;

    /* renamed from: c, reason: collision with root package name */
    public int f197117c;

    public k(java.lang.String key, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        key = (i19 & 1) != 0 ? "" : key;
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f197115a = key;
        this.f197116b = i17;
        this.f197117c = i18;
    }

    /* renamed from: equals */
    public boolean m57180xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f197115a, kVar.f197115a) && this.f197116b == kVar.f197116b && this.f197117c == kVar.f197117c;
    }

    /* renamed from: hashCode */
    public int m57181x8cdac1b() {
        return (((this.f197115a.hashCode() * 31) + java.lang.Integer.hashCode(this.f197116b)) * 31) + java.lang.Integer.hashCode(this.f197117c);
    }

    /* renamed from: toString */
    public java.lang.String m57182x9616526c() {
        return "CachePair(key=" + this.f197115a + ", value=" + this.f197116b + ", times=" + this.f197117c + ')';
    }
}
