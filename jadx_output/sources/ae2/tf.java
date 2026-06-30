package ae2;

/* loaded from: classes3.dex */
public final class tf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.tf f4197d = new ae2.tf();

    public tf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "直播下滑（进历史）新手引导开关", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_real_history_guide_enable, false, 2, null);
        aVar.a("FINDER_LIVE_REAL_HISTORY_GUIDE_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
