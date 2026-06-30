package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f210451a;

    /* renamed from: b, reason: collision with root package name */
    public final long f210452b;

    public z(java.lang.String name, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f210451a = name;
        this.f210452b = j17;
    }

    /* renamed from: equals */
    public boolean m60909xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.z)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.z) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f210451a, zVar.f210451a) && this.f210452b == zVar.f210452b;
    }

    /* renamed from: hashCode */
    public int m60910x8cdac1b() {
        return (this.f210451a.hashCode() * 31) + java.lang.Long.hashCode(this.f210452b);
    }

    /* renamed from: toString */
    public java.lang.String m60911x9616526c() {
        return "RecentAtBean(name='" + this.f210451a + "', time=" + this.f210452b + ')';
    }
}
