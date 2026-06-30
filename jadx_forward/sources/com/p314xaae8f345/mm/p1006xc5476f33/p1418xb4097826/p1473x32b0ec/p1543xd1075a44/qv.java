package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class qv {

    /* renamed from: a, reason: collision with root package name */
    public final r45.h84 f201088a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f201089b;

    public qv(r45.h84 data, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f201088a = data;
        this.f201089b = path;
    }

    /* renamed from: equals */
    public boolean m58133xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qv)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qv qvVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qv) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201088a, qvVar.f201088a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201089b, qvVar.f201089b);
    }

    /* renamed from: hashCode */
    public int m58134x8cdac1b() {
        return (this.f201088a.hashCode() * 31) + this.f201089b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m58135x9616526c() {
        return "LiveScreenEffectResourceWrap(data=" + this.f201088a + ", path=" + this.f201089b + ')';
    }
}
