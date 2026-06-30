package ae2;

/* loaded from: classes3.dex */
public final class y6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.y6 f4307d = new ae2.y6();

    public y6() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "直播是否允许半屏强制暗夜模式", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_enable_panel_force_dark, false, 2, null);
        aVar.a("FINDER_LIVE_ENABLE_PANEL_FORCE_DARK", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
