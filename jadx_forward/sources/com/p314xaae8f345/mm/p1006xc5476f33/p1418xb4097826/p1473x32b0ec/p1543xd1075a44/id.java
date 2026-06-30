package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class id {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f200200a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f200201b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f200202c;

    public id(boolean z17, java.lang.String desc, java.lang.String descExtend) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descExtend, "descExtend");
        this.f200200a = z17;
        this.f200201b = desc;
        this.f200202c = descExtend;
    }

    /* renamed from: equals */
    public boolean m58074xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.id)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.id idVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.id) obj;
        return this.f200200a == idVar.f200200a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f200201b, idVar.f200201b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f200202c, idVar.f200202c);
    }

    /* renamed from: hashCode */
    public int m58075x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f200200a) * 31) + this.f200201b.hashCode()) * 31) + this.f200202c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m58076x9616526c() {
        return "EditResult(isNewWay=" + this.f200200a + ", desc=" + this.f200201b + ", descExtend=" + this.f200202c + ')';
    }
}
