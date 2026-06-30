package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class de {

    /* renamed from: a, reason: collision with root package name */
    public final r45.h84 f199633a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f199634b;

    public de(r45.h84 data, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f199633a = data;
        this.f199634b = path;
    }

    /* renamed from: equals */
    public boolean m57999xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.de)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.de deVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.de) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f199633a, deVar.f199633a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f199634b, deVar.f199634b);
    }

    /* renamed from: hashCode */
    public int m58000x8cdac1b() {
        return (this.f199633a.hashCode() * 31) + this.f199634b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m58001x9616526c() {
        return "LiveElementResourceWrap(data=" + this.f199633a + ", path=" + this.f199634b + ')';
    }
}
