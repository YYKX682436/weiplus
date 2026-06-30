package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f238575a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f238576b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f238577c;

    public v1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i17 & 1) != 0 ? "" : str;
        str2 = (i17 & 2) != 0 ? "" : str2;
        str3 = (i17 & 4) != 0 ? "" : str3;
        this.f238575a = str;
        this.f238576b = str2;
        this.f238577c = str3;
    }

    /* renamed from: equals */
    public boolean m68422xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f238575a, v1Var.f238575a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f238576b, v1Var.f238576b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f238577c, v1Var.f238577c);
    }

    /* renamed from: hashCode */
    public int m68423x8cdac1b() {
        java.lang.String str = this.f238575a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f238576b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f238577c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m68424x9616526c() {
        return "LimitInfo{iconUrl='" + this.f238575a + "', darkIconUrl='" + this.f238576b + "', jumpInfo='" + this.f238577c + "', }";
    }
}
