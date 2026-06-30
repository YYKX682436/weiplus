package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f193307a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f193308b;

    public a(boolean z17, java.util.ArrayList data, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        data = (i17 & 2) != 0 ? new java.util.ArrayList() : data;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f193307a = z17;
        this.f193308b = data;
    }

    /* renamed from: equals */
    public boolean m56895xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a) obj;
        return this.f193307a == aVar.f193307a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f193308b, aVar.f193308b);
    }

    /* renamed from: hashCode */
    public int m56896x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f193307a) * 31) + this.f193308b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m56897x9616526c() {
        return "AudioStateData(isReady=" + this.f193307a + ", data=" + this.f193308b + ')';
    }
}
