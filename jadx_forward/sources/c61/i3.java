package c61;

/* loaded from: classes10.dex */
public final class i3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f120568e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(java.lang.String str, int i17) {
        super(0);
        this.f120567d = str;
        this.f120568e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4 m4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a;
        java.lang.String str = this.f120567d;
        java.lang.String h17 = m4Var.h(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommonFeatureService", "[checkUpdatePersonalMsg] sessionId=" + str + " talker=" + h17);
        zy2.dc fj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).fj(h17);
        if (fj6 != null) {
            if (java.lang.System.currentTimeMillis() - ((ya2.b2) fj6).f69332x7bc505b2 >= gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_ENTER_PERSONAL_MSG_REFRESH_INTERVAL_INT_SYNC, 3600) * 1000) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.lz0 lz0Var = new r45.lz0();
                lz0Var.set(0, h17);
                lz0Var.set(1, str);
                lz0Var.set(2, java.lang.Integer.valueOf(this.f120568e));
                linkedList.add(lz0Var);
                new db2.p4(linkedList).l();
            }
        }
        return jz5.f0.f384359a;
    }
}
