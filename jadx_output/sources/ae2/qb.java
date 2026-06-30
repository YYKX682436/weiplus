package ae2;

/* loaded from: classes3.dex */
public final class qb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.qb f4121d = new ae2.qb();

    public qb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "开播页延迟初始化UIC插件（秒开模式）", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_prepare_live_lazy_load, false, 2, null);
        aVar.a("FINDER_LIVE_LAZY_INIT_UIC", kz5.c0.i(0, 1), kz5.c0.i("关闭", "开启"));
        return aVar;
    }
}
