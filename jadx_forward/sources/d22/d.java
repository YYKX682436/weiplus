package d22;

/* loaded from: classes9.dex */
public final class d extends qk.a7 implements d22.v {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f307363n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f307364o;

    /* renamed from: p, reason: collision with root package name */
    public final long f307365p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 f307366q;

    public d(java.lang.String md52, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        this.f307363n = md52;
        this.f307364o = c21053xdbf1e5f4;
        this.f307365p = java.lang.System.currentTimeMillis();
        if (c21053xdbf1e5f4 == null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            this.f307364o = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(md52);
        }
        this.f445688a = 40;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = this.f307364o;
        if (c21053xdbf1e5f42 == null || c21053xdbf1e5f42.A0()) {
            return;
        }
        c21053xdbf1e5f42.f68663x861009b5 = "";
    }

    @Override // d22.v
    public boolean a() {
        return false;
    }

    @Override // d22.v
    public d22.p b() {
        return new d22.e();
    }

    @Override // d22.v
    /* renamed from: isValid */
    public boolean mo123369x7b953cf2() {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4;
        java.lang.String str = this.f307363n;
        if ((str.length() == 0) || (c21053xdbf1e5f4 = this.f307364o) == null) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c21053xdbf1e5f4 != null ? c21053xdbf1e5f4.mo42933xb5885648() : null);
    }
}
