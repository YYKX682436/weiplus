package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final wj.t0 f272571a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a f272572b;

    public y(wj.t0 magicAdPosId, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a businessType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(magicAdPosId, "magicAdPosId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        this.f272571a = magicAdPosId;
        this.f272572b = businessType;
    }

    /* renamed from: equals */
    public boolean m75591xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.y)) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.y yVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.y) obj;
        return this.f272571a == yVar.f272571a && this.f272572b == yVar.f272572b;
    }

    /* renamed from: hashCode */
    public int m75592x8cdac1b() {
        return (this.f272571a.hashCode() * 31) + this.f272572b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m75593x9616526c() {
        return "AdPositionInfo(magicAdPosId=" + this.f272571a + ", businessType=" + this.f272572b + ')';
    }
}
