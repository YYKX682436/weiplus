package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class y50 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f201948a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f201949b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f201950c;

    public y50(java.lang.String id6, java.lang.String title, java.util.List options) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        this.f201948a = id6;
        this.f201949b = title;
        this.f201950c = options;
    }

    /* renamed from: equals */
    public boolean m58195xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50 y50Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201948a, y50Var.f201948a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201949b, y50Var.f201949b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201950c, y50Var.f201950c);
    }

    /* renamed from: hashCode */
    public int m58196x8cdac1b() {
        return (((this.f201948a.hashCode() * 31) + this.f201949b.hashCode()) * 31) + this.f201950c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m58197x9616526c() {
        return "TabItem(id=" + this.f201948a + ", title=" + this.f201949b + ", options=" + this.f201950c + ')';
    }
}
