package ae2;

/* loaded from: classes5.dex */
public final class j6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.j6 f3948d = new ae2.j6();

    public j6() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pb2.a aVar = new pb2.a(300L, "直播纪念日背景装饰间隔时长", null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_anniversary_day_animation_interval, false, 2, null);
        aVar.a("FINDER_LIVE_DECORATION_BG_INTERVAL", kz5.c0.i(30L, 300L), kz5.c0.i("30s", "5min"));
        return aVar;
    }
}
