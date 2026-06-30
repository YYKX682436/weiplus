package ae2;

/* loaded from: classes5.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.p1 f4087d = new ae2.p1();

    public p1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "直播包厢开关", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_enable_live_box, false, 2, null);
        aVar.a("LIVE_BOX_ENABLE_SWITCH_1", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        aVar.f317745p = "包厢本地配置";
        return aVar;
    }
}
