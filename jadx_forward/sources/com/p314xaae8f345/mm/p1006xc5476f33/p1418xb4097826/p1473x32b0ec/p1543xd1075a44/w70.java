package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class w70 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vw4 f201691a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f201692b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f201693c;

    public w70(r45.vw4 type, java.lang.String title, java.lang.String desc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f201691a = type;
        this.f201692b = title;
        this.f201693c = desc;
    }

    /* renamed from: equals */
    public boolean m58180xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w70)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w70 w70Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w70) obj;
        return this.f201691a == w70Var.f201691a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201692b, w70Var.f201692b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201693c, w70Var.f201693c);
    }

    /* renamed from: hashCode */
    public int m58181x8cdac1b() {
        return (((this.f201691a.hashCode() * 31) + this.f201692b.hashCode()) * 31) + this.f201693c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m58182x9616526c() {
        return "Type(type=" + this.f201691a + ", title=" + this.f201692b + ", desc=" + this.f201693c + ')';
    }
}
