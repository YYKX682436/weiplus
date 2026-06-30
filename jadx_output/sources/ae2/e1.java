package ae2;

/* loaded from: classes5.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.e1 f3566d = new ae2.e1();

    public e1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "是否预连接feed流直播间", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_preload_live_feed_enable, false, 2, null);
        aVar.a("FinderLivePreloadEnable", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
