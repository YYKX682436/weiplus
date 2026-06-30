package jr;

/* loaded from: classes4.dex */
public final class e extends dm.x2 {

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f382829r = dm.x2.m125679x3593deb(jr.e.class);

    @Override // dm.x2, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 info = f382829r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
        return info;
    }

    public final boolean t0() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_remote_request_interval, 24);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSuggestCacheInfo", "needUpdate: config " + Ni);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1((long) this.f69115xa783a79b) > ((long) Ni) * 3600;
    }
}
