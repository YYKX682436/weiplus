package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f257077a;

    /* renamed from: b, reason: collision with root package name */
    public final long f257078b;

    /* renamed from: c, reason: collision with root package name */
    public final long f257079c;

    public b(java.lang.String path, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f257077a = path;
        this.f257078b = j17;
        this.f257079c = j18;
    }

    /* renamed from: equals */
    public boolean m72459xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257077a, bVar.f257077a) && this.f257078b == bVar.f257078b && this.f257079c == bVar.f257079c;
    }

    /* renamed from: hashCode */
    public int m72460x8cdac1b() {
        return (((this.f257077a.hashCode() * 31) + java.lang.Long.hashCode(this.f257078b)) * 31) + java.lang.Long.hashCode(this.f257079c);
    }

    /* renamed from: toString */
    public java.lang.String m72461x9616526c() {
        return "ABAVideoInfo(path=" + this.f257077a + ", videoStart=" + this.f257078b + ", videoEnd=" + this.f257079c + ')';
    }
}
