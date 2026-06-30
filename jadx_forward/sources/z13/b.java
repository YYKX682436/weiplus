package z13;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final z13.b f550925d = new z13.b();

    public b() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xj.m Ui;
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20679x8025f275()) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", "[fts] hardcode no adinfo");
            Ui = null;
        } else {
            Ui = ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Ui(wj.t0.f528042r);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fts] getAdInfo(MagicAdPosId.SEARCH_SIDEBAR) returns ");
        sb6.append(Ui != null ? Ui.f536286a : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", sb6.toString());
        return Ui;
    }
}
