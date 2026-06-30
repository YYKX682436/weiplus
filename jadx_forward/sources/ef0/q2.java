package ef0;

/* loaded from: classes.dex */
public final class q2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef0.y2 f333838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(ef0.y2 y2Var) {
        super(0);
        this.f333838d = y2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f333838d.getClass();
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ListenWhiteList", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "tingConfig ListenWhiteList: " + b17);
        if (b17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "tingConfig isWeChatUser isInWhiteListFromDynConfig");
            return java.lang.Boolean.FALSE;
        }
        boolean a07 = c01.e2.a0();
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ListenBlacklist", 0) != 0;
        boolean z18 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20779xd1fa21db()) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "tingConfig isWeChatUser: " + a07 + ", ListenBlacklist: " + z17 + ", fakeWeChatUser: " + z18);
        return java.lang.Boolean.valueOf(a07 || z17 || z18);
    }
}
