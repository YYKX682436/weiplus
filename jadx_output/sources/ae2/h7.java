package ae2;

/* loaded from: classes3.dex */
public final class h7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.h7 f3646d = new ae2.h7();

    public h7() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(15, "视频号直播历史多少的停留时长能加入到历史列表(ms)", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_expire_watch_history_duration, false, 2, null);
        aVar.a("FINDER_LIVE_EXPIRE_WATCH_HISTORY_DURATION", kz5.c0.i(5, 15, 30), kz5.c0.i("5s", "15s", "30s"));
        return aVar;
    }
}
