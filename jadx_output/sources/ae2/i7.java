package ae2;

/* loaded from: classes3.dex */
public final class i7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.i7 f3671d = new ae2.i7();

    public i7() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(5, "视频号直播历史最多能有多少个历史直播", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_expire_watch_history_max_count, false, 2, null);
        aVar.a("FINDER_LIVE_EXPIRE_WATCH_HISTORY_MAX_COUNT", kz5.c0.i(0, 5, 30), kz5.c0.i("0个", "5个", "30个"));
        return aVar;
    }
}
