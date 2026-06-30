package rs3;

@j95.b
/* loaded from: classes5.dex */
public class h extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f480871d = new rs3.g(this);

    public static void Ai(boolean z17) {
        int o17 = c01.z1.o();
        gm0.j1.u().c().w(40, java.lang.Integer.valueOf(z17 ? o17 & (-1025) : o17 | 1024));
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.o(26, z17 ? 2 : 1));
    }

    public static void wi(rs3.h hVar) {
        hVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15416, "newsapp", java.lang.Integer.valueOf((c01.z1.n() & 524288) == 0 ? 1 : 0), java.lang.Integer.valueOf((c01.z1.o() & 1024) != 0 ? 0 : 1));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_READERAPP_REPORT_TIMESTAMP_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        s75.d.b(new rs3.e(this), "ReaderAppReport");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        gm0.j1.d().q(138, this.f480871d);
    }
}
