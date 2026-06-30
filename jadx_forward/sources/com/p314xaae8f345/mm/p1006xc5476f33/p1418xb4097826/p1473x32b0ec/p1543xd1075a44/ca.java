package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Long f199515a;

    /* renamed from: b, reason: collision with root package name */
    public final int f199516b;

    /* renamed from: c, reason: collision with root package name */
    public final int f199517c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f199518d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f199519e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f199520f;

    public ca(java.lang.Long l17, int i17, int i18, boolean z17, yz5.p pVar, yz5.a onClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClick, "onClick");
        this.f199515a = l17;
        this.f199516b = i17;
        this.f199517c = i18;
        this.f199519e = z17;
        this.f199520f = pVar;
        this.f199518d = onClick;
    }

    /* renamed from: equals */
    public boolean m57983xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ca)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ca caVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ca) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f199515a, caVar.f199515a) && this.f199516b == caVar.f199516b && this.f199517c == caVar.f199517c && this.f199519e == caVar.f199519e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f199520f, caVar.f199520f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f199518d, caVar.f199518d);
    }

    /* renamed from: hashCode */
    public int m57984x8cdac1b() {
        java.lang.Long l17 = this.f199515a;
        int hashCode = (((((((l17 == null ? 0 : l17.hashCode()) * 31) + java.lang.Integer.hashCode(this.f199516b)) * 31) + java.lang.Integer.hashCode(this.f199517c)) * 31) + java.lang.Boolean.hashCode(this.f199519e)) * 31;
        yz5.p pVar = this.f199520f;
        return ((hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31) + this.f199518d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m57985x9616526c() {
        return "InviteeMoreItem(permFlag=" + this.f199515a + ", titleResId=" + this.f199516b + ", iconResId=" + this.f199517c + ", checkOptionEnabled=" + this.f199519e + ", optionFactory=" + this.f199520f + ", onClick=" + this.f199518d + ')';
    }

    public /* synthetic */ ca(java.lang.Long l17, int i17, int i18, boolean z17, yz5.p pVar, yz5.a aVar, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(l17, i17, i18, (i19 & 8) != 0 ? false : z17, (i19 & 16) != 0 ? null : pVar, aVar);
    }
}
