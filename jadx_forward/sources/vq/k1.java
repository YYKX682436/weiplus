package vq;

/* loaded from: classes4.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520710d = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoji_suggest_remote_enable, false);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_remote_request_interval, 24);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_remote_prefetch, 0);
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_personal_words_interval, 0);
        sb6.append("remote: " + fj6 + " \n");
        sb6.append("remote interval: " + Ni + " \n");
        sb6.append("remote preload type: " + Ni2 + " \n");
        sb6.append("word update interval: " + Ni3 + " \n");
        sb6.append("remote shuffle: " + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoji_suggest_remote_shuffle, false) + ", size:" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_remote_shuffle_size, 20) + " \n");
        int Ni4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_show_delay, 250);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("show delay: ");
        sb7.append(Ni4);
        sb7.append(" \n");
        sb6.append(sb7.toString());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this.f520710d);
        u1Var.g(sb6.toString());
        u1Var.a(true);
        u1Var.q(false);
        return jz5.f0.f384359a;
    }
}
