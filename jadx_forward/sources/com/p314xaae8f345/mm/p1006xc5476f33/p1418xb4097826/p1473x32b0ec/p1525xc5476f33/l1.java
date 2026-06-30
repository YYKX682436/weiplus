package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f194866a;

    /* renamed from: b, reason: collision with root package name */
    public final long f194867b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.CharSequence f194868c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f194869d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.CharSequence f194870e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.CharSequence f194871f;

    public l1(int i17, long j17, java.lang.CharSequence title, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, java.lang.CharSequence subTitle, java.lang.CharSequence charSequence, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        c19786x6a1e2862 = (i18 & 8) != 0 ? null : c19786x6a1e2862;
        subTitle = (i18 & 16) != 0 ? "" : subTitle;
        charSequence = (i18 & 32) != 0 ? null : charSequence;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subTitle, "subTitle");
        this.f194866a = i17;
        this.f194867b = j17;
        this.f194868c = title;
        this.f194869d = c19786x6a1e2862;
        this.f194870e = subTitle;
        this.f194871f = charSequence;
    }

    /* renamed from: equals */
    public boolean m57004xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l1 l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l1) obj;
        return this.f194866a == l1Var.f194866a && this.f194867b == l1Var.f194867b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194868c, l1Var.f194868c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194869d, l1Var.f194869d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194870e, l1Var.f194870e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194871f, l1Var.f194871f);
    }

    /* renamed from: hashCode */
    public int m57005x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f194866a) * 31) + java.lang.Long.hashCode(this.f194867b)) * 31) + this.f194868c.hashCode()) * 31;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f194869d;
        int hashCode2 = (((hashCode + (c19786x6a1e2862 == null ? 0 : c19786x6a1e2862.hashCode())) * 31) + this.f194870e.hashCode()) * 31;
        java.lang.CharSequence charSequence = this.f194871f;
        return hashCode2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m57006x9616526c() {
        return "CommonInfo(type=" + this.f194866a + ", value=" + this.f194867b + ", title=" + ((java.lang.Object) this.f194868c) + ", jump=" + this.f194869d + ", subTitle=" + ((java.lang.Object) this.f194870e) + ", valueStr=" + ((java.lang.Object) this.f194871f) + ')';
    }
}
