package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes11.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f222949a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f222950b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f222951c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f222952d;

    public i2(java.lang.String id6, java.lang.String title, java.lang.String str, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f222949a = id6;
        this.f222950b = title;
        this.f222951c = str;
        this.f222952d = z17;
    }

    /* renamed from: equals */
    public boolean m64799xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2 i2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f222949a, i2Var.f222949a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f222950b, i2Var.f222950b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f222951c, i2Var.f222951c) && this.f222952d == i2Var.f222952d;
    }

    /* renamed from: hashCode */
    public int m64800x8cdac1b() {
        int hashCode = ((this.f222949a.hashCode() * 31) + this.f222950b.hashCode()) * 31;
        java.lang.String str = this.f222951c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f222952d);
    }

    /* renamed from: toString */
    public java.lang.String m64801x9616526c() {
        return "SwitchItem(id=" + this.f222949a + ", title=" + this.f222950b + ", subtitle=" + this.f222951c + ", checked=" + this.f222952d + ')';
    }
}
