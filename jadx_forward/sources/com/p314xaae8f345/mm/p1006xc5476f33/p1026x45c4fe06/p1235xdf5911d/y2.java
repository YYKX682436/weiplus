package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes10.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f173884a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f173885b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f173886c;

    public y2(android.graphics.RectF rect, java.lang.String tagName, java.lang.String xPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xPath, "xPath");
        this.f173884a = rect;
        this.f173885b = tagName;
        this.f173886c = xPath;
    }

    /* renamed from: equals */
    public boolean m53794xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.y2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.y2 y2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.y2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f173884a, y2Var.f173884a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f173885b, y2Var.f173885b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f173886c, y2Var.f173886c);
    }

    /* renamed from: hashCode */
    public int m53795x8cdac1b() {
        return (((this.f173884a.hashCode() * 31) + this.f173885b.hashCode()) * 31) + this.f173886c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m53796x9616526c() {
        return "ViewRectInfo(rect=" + this.f173884a + ", tagName=" + this.f173885b + ", xPath=" + this.f173886c + ')';
    }
}
