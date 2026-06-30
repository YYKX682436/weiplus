package ae2;

/* loaded from: classes3.dex */
public final class j5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.j5 f85480d = new ae2.j5();

    public j5() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(0, "是否允许付费直播设置试看模式", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_charge_mode_choose_enable, false, 2, null);
        aVar.a("FINDER_LIVE_CHARGE_MODE_CHOOSER_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("不允许", "允许"));
        return aVar;
    }
}
