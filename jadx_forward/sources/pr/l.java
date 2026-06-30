package pr;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final pr.l f439277d = new pr.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gr.v.f356229a.a(false);
        long H1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(r0.b().getInt("designer_sync_time", 0));
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_designer_sync_interval, be1.r0.f4232x366c91de);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPackSyncManager", "checkStart: " + (H1 / 3600) + ", " + Ni);
        if (Ni > 0 && H1 > Ni * 3600 && pr.o.f439283e == null) {
            pr.o oVar = new pr.o();
            pr.o.f439283e = oVar;
            oVar.a();
        }
        return jz5.f0.f384359a;
    }
}
