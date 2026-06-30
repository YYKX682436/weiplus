package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class b6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f198464a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f198465b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f198466c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f198467d;

    public b6(java.lang.String url, java.lang.String thumbUrl, java.lang.String choosePath, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbUrl, "thumbUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(choosePath, "choosePath");
        this.f198464a = url;
        this.f198465b = thumbUrl;
        this.f198466c = choosePath;
        this.f198467d = str;
    }

    /* renamed from: equals */
    public boolean m57839xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b6 b6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198464a, b6Var.f198464a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198465b, b6Var.f198465b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198466c, b6Var.f198466c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198467d, b6Var.f198467d);
    }

    /* renamed from: hashCode */
    public int m57840x8cdac1b() {
        int hashCode = ((((this.f198464a.hashCode() * 31) + this.f198465b.hashCode()) * 31) + this.f198466c.hashCode()) * 31;
        java.lang.String str = this.f198467d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m57841x9616526c() {
        return "CoverUrlDataItem(url=" + this.f198464a + ", thumbUrl=" + this.f198465b + ", choosePath=" + this.f198466c + ", fileMd5=" + this.f198467d + ')';
    }
}
