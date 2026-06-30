package ke5;

/* loaded from: classes9.dex */
public final class g implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ke5.i f388619d;

    public g(ke5.i iVar) {
        this.f388619d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ke5.i iVar = this.f388619d;
        iVar.getClass();
        long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(iVar.f388622j);
        yb5.d dVar = iVar.f388621i;
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y2) ((sb5.p) dVar.f542241c.a(sb5.p.class))).t0()) {
            long r07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y2) ((sb5.p) dVar.f542241c.a(sb5.p.class))).r0();
            if (r07 > 0) {
                long c17 = c01.id.c() - r07;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingBizContactDataPresenter", "[ChattingNormalDataSource] caseTime:%d, createTime:%d, createTimeLimit:%d", java.lang.Long.valueOf(c17), java.lang.Long.valueOf(m07), java.lang.Long.valueOf(r07));
                if (c17 > m07) {
                    m07 = c17;
                }
            }
        }
        return java.lang.Long.valueOf(m07);
    }
}
