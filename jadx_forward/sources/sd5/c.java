package sd5;

/* loaded from: classes9.dex */
public final class c implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd5.d f488236d;

    public c(sd5.d dVar) {
        this.f488236d = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sd5.d dVar = this.f488236d;
        dVar.getClass();
        long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(dVar.f488238o);
        yb5.d dVar2 = dVar.f488237n;
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y2) ((sb5.p) dVar2.f542241c.a(sb5.p.class))).t0()) {
            long r07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y2) ((sb5.p) dVar2.f542241c.a(sb5.p.class))).r0();
            if (r07 > 0) {
                long c17 = c01.id.c() - r07;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingNormalDataPresenterV2", "[ChattingNormalDataSource] caseTime:%d, createTime:%d, createTimeLimit:%d", java.lang.Long.valueOf(c17), java.lang.Long.valueOf(m07), java.lang.Long.valueOf(r07));
                if (c17 > m07) {
                    m07 = c17;
                }
            }
        }
        return java.lang.Long.valueOf(m07);
    }
}
