package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f177361a;

    /* renamed from: b, reason: collision with root package name */
    public final int f177362b;

    public b0(int i17, int i18) {
        this.f177361a = i17;
        this.f177362b = i18;
    }

    /* renamed from: equals */
    public boolean m54512xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b0) obj;
        return this.f177361a == b0Var.f177361a && this.f177362b == b0Var.f177362b;
    }

    /* renamed from: hashCode */
    public int m54513x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f177361a) * 31) + java.lang.Integer.hashCode(this.f177362b);
    }

    /* renamed from: toString */
    public java.lang.String m54514x9616526c() {
        return "AudioInfo(sampleRate=" + this.f177361a + ", channelCount=" + this.f177362b + ')';
    }
}
