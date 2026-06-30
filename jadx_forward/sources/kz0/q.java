package kz0;

/* loaded from: classes5.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f395327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395329f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yz5.l lVar, n0.v2 v2Var, n0.v2 v2Var2) {
        super(0);
        this.f395327d = lVar;
        this.f395328e = v2Var;
        this.f395329f = v2Var2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2548x18d5ed17.C20466x9d7947bf());
        boolean fj6 = h17 != 2 ? h17 != 3 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_musicdrawer_v2, true) : false : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsMaasConfigImpl", "enableUseMusicDrawerV2: " + fj6);
        kz0.a aVar = fj6 ? kz0.a.f395180o : kz0.a.f395176h;
        int i17 = kz0.k1.f395300a;
        n0.v2 v2Var = this.f395328e;
        v2Var.mo148714x53d8522f(aVar);
        this.f395329f.mo148714x53d8522f(java.lang.Boolean.TRUE);
        this.f395327d.mo146xb9724478((kz0.a) v2Var.mo128745x754a37bb());
        return jz5.f0.f384359a;
    }
}
