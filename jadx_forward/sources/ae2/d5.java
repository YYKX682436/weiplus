package ae2;

/* loaded from: classes3.dex */
public final class d5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.d5 f85078d = new ae2.d5();

    public d5() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(0, "使用camera2", null, null, 12, null);
        aVar.c(e42.d0.clicfg_finder_live_camera_2_enable, false);
        aVar.a("FINDER_LIVE_CAMERA_2_ENABLE", kz5.c0.i(0, 1, 2, 3), kz5.c0.i("否", "是，自动防抖（优先光学，次选电子）", "是，只使用光学防抖（不支持则无防抖）", "是，只使用电子防抖（不支持则无防抖）"));
        aVar.f399278p = "T5";
        return aVar;
    }
}
