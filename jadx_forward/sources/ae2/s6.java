package ae2;

/* loaded from: classes3.dex */
public final class s6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.s6 f85697d = new ae2.s6();

    public s6() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(0, "是否允许主播设置不给谁看", ae2.r6.f85673d, null, 8, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_enable_anchor_invisible_mode_setting, false, 2, null);
        aVar.a("FINDER_LIVE_ENABLE_ANCHOR_INVISIBLE_MODE_SETTING", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
