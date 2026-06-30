package ae2;

/* loaded from: classes5.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.r0 f4134d = new ae2.r0();

    public r0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "client_samll_refresh_max_time", null, null, 12, null);
        aVar.a("FINDER_LIVE_SQUARE_SMALL_CACHE_TIME", kz5.c0.i(10, 60, 120, 240, -1), kz5.c0.i("10s", "60s", "120s", "240s", "默认(-1)"));
        return aVar;
    }
}
