package ae2;

/* loaded from: classes3.dex */
public final class mf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.mf f4029d = new ae2.mf();

    public mf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "是否打开主播开播安全引导页的入口", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_precheck_entrance, false, 2, null);
        aVar.a("FINDER_LIVE_PRECHECK_ENTRANCE", kz5.c0.i(0, 1, 2), kz5.c0.i("打开", "非release打开", "关闭"));
        return aVar;
    }
}
