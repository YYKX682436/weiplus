package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class lj {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f194934a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f194935b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f194936c;

    public lj(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f194934a = str;
        this.f194935b = str2;
        this.f194936c = str3;
    }

    /* renamed from: equals */
    public boolean m57010xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lj ljVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lj) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194934a, ljVar.f194934a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194935b, ljVar.f194935b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194936c, ljVar.f194936c);
    }

    /* renamed from: hashCode */
    public int m57011x8cdac1b() {
        java.lang.String str = this.f194934a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f194935b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f194936c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m57012x9616526c() {
        return "username=" + this.f194934a + ", nickname=" + this.f194935b;
    }
}
