package g05;

/* loaded from: classes.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final g05.m f349012d = new g05.m();

    public m() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_wxgame_dynamic_card_keepalive_timeout_millseconds", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(aj6, "getExpt(...)");
        java.lang.Long j17 = r26.h0.j(aj6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "destroyTimeout expt value is " + j17 + ", default is: 30000");
        return java.lang.Long.valueOf(j17 != null ? j17.longValue() : 30000L);
    }
}
