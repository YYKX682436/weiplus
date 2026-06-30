package z75;

/* loaded from: classes15.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f552151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f552152e;

    public a(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        this.f552151d = j17;
        this.f552152e = c21053xdbf1e5f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6828xd0e163fc c6828xd0e163fc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6828xd0e163fc();
        c6828xd0e163fc.f141486d = z75.c.f552155a;
        c6828xd0e163fc.f141487e = 4L;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = z75.c.f552156b;
        c6828xd0e163fc.r(c21053xdbf1e5f4 != null ? c21053xdbf1e5f4.f68663x861009b5 : null);
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = z75.c.f552156b;
        c6828xd0e163fc.q(c21053xdbf1e5f42 != null ? c21053xdbf1e5f42.mo42933xb5885648() : null);
        c6828xd0e163fc.f141492j = this.f552151d;
        c6828xd0e163fc.f141493k = 4L;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f43 = this.f552152e;
        c6828xd0e163fc.f141490h = c6828xd0e163fc.b("Pid", c21053xdbf1e5f43.f68663x861009b5, true);
        c6828xd0e163fc.f141491i = c6828xd0e163fc.b("Md5", c21053xdbf1e5f43.mo42933xb5885648(), true);
        c6828xd0e163fc.f141494l = c6828xd0e163fc.b("IsFree2", java.lang.String.valueOf(c21053xdbf1e5f43.G2), true);
        c6828xd0e163fc.f141496n = c6828xd0e163fc.b("IsLocal2", gr.t.g().j(c21053xdbf1e5f43) ? "2" : "1", true);
        if (n22.m.p(c21053xdbf1e5f43)) {
            c6828xd0e163fc.f141495m = c6828xd0e163fc.b("Type2", "1", true);
        } else {
            c6828xd0e163fc.f141495m = c6828xd0e163fc.b("Type2", "2", true);
        }
        c6828xd0e163fc.p(z75.c.f552157c);
        c6828xd0e163fc.k();
    }
}
