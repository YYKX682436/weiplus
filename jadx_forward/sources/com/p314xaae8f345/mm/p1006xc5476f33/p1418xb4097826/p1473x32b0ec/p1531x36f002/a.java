package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f196966a;

    /* renamed from: b, reason: collision with root package name */
    public long f196967b;

    /* renamed from: c, reason: collision with root package name */
    public int f196968c;

    /* renamed from: d, reason: collision with root package name */
    public long f196969d;

    public a(java.lang.String key, long j17, int i17, long j18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        key = (i18 & 1) != 0 ? "" : key;
        j17 = (i18 & 2) != 0 ? 0L : j17;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        j18 = (i18 & 8) != 0 ? 0L : j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f196966a = key;
        this.f196967b = j17;
        this.f196968c = i17;
        this.f196969d = j18;
    }

    /* renamed from: equals */
    public boolean m57153xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f196966a, aVar.f196966a) && this.f196967b == aVar.f196967b && this.f196968c == aVar.f196968c && this.f196969d == aVar.f196969d;
    }

    /* renamed from: hashCode */
    public int m57154x8cdac1b() {
        return (((((this.f196966a.hashCode() * 31) + java.lang.Long.hashCode(this.f196967b)) * 31) + java.lang.Integer.hashCode(this.f196968c)) * 31) + java.lang.Long.hashCode(this.f196969d);
    }

    /* renamed from: toString */
    public java.lang.String m57155x9616526c() {
        return "AverageCachePair(key=" + this.f196966a + ", valueCount=" + this.f196967b + ", times=" + this.f196968c + ", averageValue=" + this.f196969d + ')';
    }
}
