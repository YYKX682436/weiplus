package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f226342a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f226343b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f226344c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f226345d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f226346e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f226347f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f226348g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.api.C13409xda58c12c f226349h;

    public f0(boolean z17, boolean z18, java.lang.String label, java.lang.String str, java.lang.String str2, android.graphics.drawable.Drawable drawable, java.lang.String str3) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(label, "label");
        this.f226342a = z17;
        this.f226343b = z18;
        this.f226344c = label;
        this.f226345d = str;
        this.f226346e = str2;
        this.f226347f = drawable;
        this.f226348g = str3;
    }

    /* renamed from: equals */
    public boolean m65972xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0) obj;
        return this.f226342a == f0Var.f226342a && this.f226343b == f0Var.f226343b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f226344c, f0Var.f226344c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f226345d, f0Var.f226345d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f226346e, f0Var.f226346e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f226347f, f0Var.f226347f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f226348g, f0Var.f226348g);
    }

    /* renamed from: hashCode */
    public int m65973x8cdac1b() {
        int hashCode = ((((java.lang.Boolean.hashCode(this.f226342a) * 31) + java.lang.Boolean.hashCode(this.f226343b)) * 31) + this.f226344c.hashCode()) * 31;
        java.lang.String str = this.f226345d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f226346e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        android.graphics.drawable.Drawable drawable = this.f226347f;
        int hashCode4 = (hashCode3 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        java.lang.String str3 = this.f226348g;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m65974x9616526c() {
        return "PoiNavigateItem(isDevice=" + this.f226342a + ", isAd=" + this.f226343b + ", label=" + this.f226344c + ", desc=" + this.f226345d + ", packageName=" + this.f226346e + ", icon=" + this.f226347f + ", iconUrl=" + this.f226348g + ')';
    }
}
