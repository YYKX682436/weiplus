package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    public final long f215529a;

    /* renamed from: b, reason: collision with root package name */
    public long f215530b;

    /* renamed from: c, reason: collision with root package name */
    public long f215531c;

    /* renamed from: d, reason: collision with root package name */
    public long f215532d;

    /* renamed from: e, reason: collision with root package name */
    public long f215533e;

    /* renamed from: f, reason: collision with root package name */
    public long f215534f;

    /* renamed from: g, reason: collision with root package name */
    public long f215535g;

    /* renamed from: h, reason: collision with root package name */
    public long f215536h;

    /* renamed from: i, reason: collision with root package name */
    public int f215537i;

    public cb(long j17) {
        this.f215529a = j17;
    }

    public final void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.U6).mo141623x754a37bb()).r()).intValue() != 1) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5466x6fd95d5c c5466x6fd95d5c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5466x6fd95d5c();
        am.bb bbVar = c5466x6fd95d5c.f135804g;
        bbVar.f87762b = i17;
        bbVar.f87761a = this.f215529a;
        bbVar.f87763c = this.f215535g - this.f215530b;
        bbVar.f87764d = this.f215532d - this.f215531c;
        bbVar.f87765e = this.f215534f - this.f215533e;
        bbVar.f87766f = this.f215537i;
        c5466x6fd95d5c.e();
    }

    /* renamed from: equals */
    public boolean m63076xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.cb) && this.f215529a == ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.cb) obj).f215529a;
    }

    /* renamed from: hashCode */
    public int m63077x8cdac1b() {
        return java.lang.Long.hashCode(this.f215529a);
    }

    /* renamed from: toString */
    public java.lang.String m63078x9616526c() {
        return "{allCost=" + (this.f215535g - this.f215530b) + "ms, cgi=" + (this.f215532d - this.f215531c) + "ms, preload=" + (this.f215534f - this.f215533e) + "ms, ui=" + (this.f215535g - this.f215536h) + "ms}";
    }
}
