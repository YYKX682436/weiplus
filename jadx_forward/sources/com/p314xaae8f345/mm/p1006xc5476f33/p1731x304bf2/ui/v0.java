package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f223326a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f223327b;

    public v0(java.lang.String id6, java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f223326a = id6;
        this.f223327b = text;
    }

    /* renamed from: equals */
    public boolean m64826xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223326a, v0Var.f223326a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223327b, v0Var.f223327b);
    }

    /* renamed from: hashCode */
    public int m64827x8cdac1b() {
        return (this.f223326a.hashCode() * 31) + this.f223327b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m64828x9616526c() {
        return "FeatureItem(id=" + this.f223326a + ", text=" + this.f223327b + ')';
    }
}
