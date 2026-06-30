package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class eb {

    /* renamed from: a, reason: collision with root package name */
    public final long f215778a;

    /* renamed from: b, reason: collision with root package name */
    public long f215779b;

    /* renamed from: c, reason: collision with root package name */
    public int f215780c;

    public eb(long j17, long j18, int i17) {
        this.f215778a = j17;
        this.f215779b = j18;
        this.f215780c = i17;
    }

    /* renamed from: equals */
    public boolean m63102xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eb)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eb ebVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eb) obj;
        return this.f215778a == ebVar.f215778a && this.f215779b == ebVar.f215779b && this.f215780c == ebVar.f215780c;
    }

    /* renamed from: hashCode */
    public int m63103x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f215778a) * 31) + java.lang.Long.hashCode(this.f215779b)) * 31) + java.lang.Integer.hashCode(this.f215780c);
    }

    /* renamed from: toString */
    public java.lang.String m63104x9616526c() {
        return "FeedRecord(feedId=" + this.f215778a + ", offset=" + this.f215779b + ", replayCount=" + this.f215780c + ')';
    }
}
