package ae2;

/* loaded from: classes3.dex */
public final class ai extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.ai f3451d = new ae2.ai();

    public ai() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "是否展示直播侧边栏", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_sidebar_switch, false, 2, null);
        aVar.a("FINDER_LIVE_SIDEBAR_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
