package ae2;

/* loaded from: classes3.dex */
public final class gh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.gh f3632d = new ae2.gh();

    public gh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号直播上下切换是否预热feed", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_rvfeed_enable_preload, false, 2, null);
        aVar.a("FINDER_LIVE_RV_FEED_ENABLE_PRELOAD", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
