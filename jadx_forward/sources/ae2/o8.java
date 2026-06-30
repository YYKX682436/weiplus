package ae2;

/* loaded from: classes3.dex */
public final class o8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.o8 f85603d = new ae2.o8();

    public o8() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(1, "直播feed是否允许录屏", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_feed_secure_switch, false, 2, null);
        aVar.a("FINDER_LIVE_FEED_SECURE_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
