package ae2;

/* loaded from: classes3.dex */
public final class ih extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.ih f3681d = new ae2.ih();

    public ih() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "录屏直播的低端机要不要开启功能", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_screen_cast_low_device_enable, false, 2, null);
        aVar.a("FINDER_LIVE_SCREEN_CAST_LOW_DEVICE_ENABLE", kz5.c0.i(1, 0), kz5.c0.i("是", "否"));
        aVar.f317745p = "T5";
        return aVar;
    }
}
