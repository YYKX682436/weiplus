package a03;

/* loaded from: classes2.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0 f82002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f82003e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0 c5795x6c1c62d0, a03.h0 h0Var) {
        super(0);
        this.f82002d = c5795x6c1c62d0;
        this.f82003e = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        h03.q qVar;
        com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24495xd6bee5f4 c24495xd6bee5f4;
        h03.q qVar2;
        com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24495xd6bee5f4 c24495xd6bee5f42;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0 c5795x6c1c62d0 = this.f82002d;
        if (pm0.v.Z(c5795x6c1c62d0.f136104g.f89251a) != 0) {
            a03.h0 h0Var = this.f82003e;
            pi0.l1 l1Var = h0Var.f81959n;
            am.qm qmVar = c5795x6c1c62d0.f136104g;
            if (l1Var != null && (qVar2 = (h03.q) l1Var.j(h03.q.class)) != null && (c24495xd6bee5f42 = qVar2.f359446g) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoUniversalService", "InteractionUtil home feedUpdateListener event id:" + qmVar.f89251a + ", " + qmVar.f89254d + ", " + qmVar.f89252b);
                java.lang.String localFeedId = qmVar.f89251a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(localFeedId, "localFeedId");
                c24495xd6bee5f42.m90889x86c5fc5e(localFeedId, qmVar.f89254d, a03.v.f81998d);
                java.lang.String localFeedId2 = qmVar.f89251a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(localFeedId2, "localFeedId");
                c24495xd6bee5f42.m90887x6c512124(localFeedId2, qmVar.f89252b, a03.w.f81999d);
            }
            pi0.l1 l1Var2 = h0Var.f81960o;
            if (l1Var2 != null && (qVar = (h03.q) l1Var2.j(h03.q.class)) != null && (c24495xd6bee5f4 = qVar.f359446g) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoUniversalService", "InteractionUtil player feedUpdateListener event id:" + qmVar.f89251a + ", " + qmVar.f89254d + ", " + qmVar.f89252b);
                java.lang.String localFeedId3 = qmVar.f89251a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(localFeedId3, "localFeedId");
                c24495xd6bee5f4.m90889x86c5fc5e(localFeedId3, qmVar.f89254d, a03.x.f82000d);
                java.lang.String localFeedId4 = qmVar.f89251a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(localFeedId4, "localFeedId");
                c24495xd6bee5f4.m90887x6c512124(localFeedId4, qmVar.f89252b, a03.y.f82001d);
            }
        }
        return jz5.f0.f384359a;
    }
}
