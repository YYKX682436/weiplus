package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f198768a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f198769b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f198770c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f198771d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l2 f198772e;

    public m2(int i17, java.lang.String title, java.lang.String desc, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l2 l2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f198768a = i17;
        this.f198769b = title;
        this.f198770c = desc;
        this.f198771d = z17;
        this.f198772e = l2Var;
    }

    /* renamed from: equals */
    public boolean m57862xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m2 m2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m2) obj;
        return this.f198768a == m2Var.f198768a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198769b, m2Var.f198769b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198770c, m2Var.f198770c) && this.f198771d == m2Var.f198771d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198772e, m2Var.f198772e);
    }

    /* renamed from: hashCode */
    public int m57863x8cdac1b() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f198768a) * 31) + this.f198769b.hashCode()) * 31) + this.f198770c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f198771d)) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l2 l2Var = this.f198772e;
        return hashCode + (l2Var == null ? 0 : l2Var.m57860x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m57864x9616526c() {
        return "VisibleInfo(type=" + this.f198768a + ", title=" + this.f198769b + ", desc=" + this.f198770c + ", isChosen=" + this.f198771d + ", subInfo=" + this.f198772e + ')';
    }

    public /* synthetic */ m2(int i17, java.lang.String str, java.lang.String str2, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l2 l2Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, str, str2, z17, (i18 & 16) != 0 ? null : l2Var);
    }
}
