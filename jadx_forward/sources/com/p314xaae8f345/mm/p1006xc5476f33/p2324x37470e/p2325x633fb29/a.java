package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f257070a;

    /* renamed from: b, reason: collision with root package name */
    public final int f257071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f257072c;

    /* renamed from: d, reason: collision with root package name */
    public final int f257073d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 f257074e;

    public a(int i17, int i18, int i19, int i27, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025) {
        this.f257070a = i17;
        this.f257071b = i18;
        this.f257072c = i19;
        this.f257073d = i27;
        this.f257074e = c17683x770f5025;
    }

    /* renamed from: equals */
    public boolean m72453xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.a) obj;
        return this.f257070a == aVar.f257070a && this.f257071b == aVar.f257071b && this.f257072c == aVar.f257072c && this.f257073d == aVar.f257073d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257074e, aVar.f257074e);
    }

    /* renamed from: hashCode */
    public int m72454x8cdac1b() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f257070a) * 31) + java.lang.Integer.hashCode(this.f257071b)) * 31) + java.lang.Integer.hashCode(this.f257072c)) * 31) + java.lang.Integer.hashCode(this.f257073d)) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025 = this.f257074e;
        return hashCode + (c17683x770f5025 == null ? 0 : c17683x770f5025.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m72455x9616526c() {
        return "ABAResult(errCode=" + this.f257070a + ", width=" + this.f257071b + ", height=" + this.f257072c + ", bitrate=" + this.f257073d + ", abaParams=" + this.f257074e + ')';
    }
}
