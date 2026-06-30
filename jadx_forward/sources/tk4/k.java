package tk4;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a f501523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.d2 f501524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f501525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a, bw5.d2 d2Var, tk4.c0 c0Var) {
        super(0);
        this.f501523d = c18711x7115b73a;
        this.f501524e = d2Var;
        this.f501525f = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a.N;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a = this.f501523d;
        c18711x7115b73a.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickPlay, contentType = ");
        bw5.d2 d2Var = this.f501524e;
        sb6.append(d2Var.f107818i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18711x7115b73a.f256172a, sb6.toString());
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map j17 = c18711x7115b73a.j(d2Var);
        ((java.util.HashMap) j17).put("view_id", "tyt_push_bubble_play");
        ((cy1.a) rVar).yj("view_clk", null, j17, 5, false);
        int i18 = d2Var.f107818i;
        if (i18 == 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7 c6973x5d0a81b7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7();
            c6973x5d0a81b7.f142835d = c18711x7115b73a.f256184m;
            c6973x5d0a81b7.k();
            c18711x7115b73a.g(d2Var, true);
        } else if (i18 == 2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7 c6973x5d0a81b72 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7();
            c6973x5d0a81b72.f142835d = c18711x7115b73a.f256185n;
            c6973x5d0a81b72.k();
            c18711x7115b73a.h(d2Var, true);
        }
        this.f501525f.a(true);
        return jz5.f0.f384359a;
    }
}
