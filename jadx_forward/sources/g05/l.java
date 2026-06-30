package g05;

/* loaded from: classes.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final g05.l f349011d = new g05.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_wxgame_dynamic_card_cache_size", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(aj6, "getExpt(...)");
        java.lang.Integer h17 = r26.h0.h(aj6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "exptValue card cache size is " + h17 + ", defaultsize : 8");
        return java.lang.Integer.valueOf(h17 != null ? h17.intValue() : 8);
    }
}
