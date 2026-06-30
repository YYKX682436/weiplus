package ae2;

/* loaded from: classes3.dex */
public final class qa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.qa f4120d = new ae2.qa();

    public qa() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "直播上滑新手引导开关", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_guide_enable, false, 2, null);
        aVar.a("FINDER_LIVE_GUIDE_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        aVar.f317745p = "T32_next";
        return aVar;
    }
}
