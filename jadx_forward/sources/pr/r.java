package pr;

/* loaded from: classes12.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.t f439306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.u3 f439307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(pr.t tVar, com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var) {
        super(2);
        this.f439306d = tVar;
        this.f439307e = u3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        java.util.ArrayList arrayList = (java.util.ArrayList) com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().C1(0);
        pr.t tVar = this.f439306d;
        tVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSyncFetchList", "EmojiSyncMd5List downloadList " + arrayList.size());
        int size = arrayList.size();
        int i17 = tVar.f439314a;
        if (size > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSyncFetchList", "try to sync emoji downloadList:%d", java.lang.Integer.valueOf(arrayList.size()));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(11595, 2, java.lang.Integer.valueOf(i17));
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                g0Var.d(11595, 3, java.lang.Integer.valueOf(i17));
            }
        } else {
            gm0.j1.u().c().x(this.f439307e, java.lang.Boolean.FALSE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSyncFetchList", "no things need to download.");
        }
        if (i17 == 1) {
            gr.t.g().m(true);
            pr.k0.f439256q.a(false).b(true);
        } else {
            gr.t.g().n(true);
            gr.t.g().l(true);
            pr.k0.f439256q.b(false).b(true);
        }
        gr.v.f356229a.a(true);
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5897xc57a522().e();
        if (tVar.f439315b != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z4.f277924j.g();
        }
        return jz5.f0.f384359a;
    }
}
