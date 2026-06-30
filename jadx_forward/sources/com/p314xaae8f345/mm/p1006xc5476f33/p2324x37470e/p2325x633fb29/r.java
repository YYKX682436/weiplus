package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f257249a;

    /* renamed from: b, reason: collision with root package name */
    public final long f257250b;

    public r(java.nio.ByteBuffer buffer, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        this.f257249a = buffer;
        this.f257250b = j17;
    }

    /* renamed from: equals */
    public boolean m72493xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.r)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.r rVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257249a, rVar.f257249a) && this.f257250b == rVar.f257250b;
    }

    /* renamed from: hashCode */
    public int m72494x8cdac1b() {
        return (this.f257249a.hashCode() * 31) + java.lang.Long.hashCode(this.f257250b);
    }

    /* renamed from: toString */
    public java.lang.String m72495x9616526c() {
        return "PendingYuvBuffer(buffer=" + this.f257249a + ", timestamp=" + this.f257250b + ')';
    }
}
