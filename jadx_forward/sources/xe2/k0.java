package xe2;

/* loaded from: classes3.dex */
public final class k0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535408c = "LiveGiftWallInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        java.util.Iterator it = msgList.iterator();
        while (it.hasNext()) {
            r45.ch1 ch1Var = (r45.ch1) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535408c, "msgType = " + ch1Var.m75939xb282bd08(1));
            gk2.e eVar = this.f526800a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) ((mm2.c1) eVar.a(mm2.c1.class)).f410339g).b(new ug2.c(ch1Var));
            zl2.r4 r4Var = zl2.r4.f555483a;
            if (!r4Var.y1(eVar) && r4Var.g0() == 1 && ch1Var.m75939xb282bd08(1) == 20090) {
                r45.xn1 xn1Var = (r45.xn1) ch1Var.m75936x14adae67(13);
                if (r4Var.c2((xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c())) {
                    ae2.in inVar = ae2.in.f85221a;
                    if (((java.lang.Boolean) ae2.in.f85278f6.r()).booleanValue() || !gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GIFT_WALL_FIRST_TOP_BOOLEAN_SYNC, false)) {
                        if (!gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_LIVE_VISITOR_HONOR_RANK_SWITCH_ENABLE_BOOLEAN_SYNC, false)) {
                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GIFT_WALL_FIRST_TOP_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                            pm0.v.X(new xe2.j0(ch1Var));
                        }
                    }
                }
            }
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20090, 20091, 20092};
    }
}
