package ae2;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.q0 f4110d = new ae2.q0();

    public q0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "client_max_cache_time", null, null, 12, null);
        aVar.a("FINDER_LIVE_SQUARE_MAX_CACHE_TIME", kz5.c0.i(5, 30, 60, 120, -1), kz5.c0.i("5s", "30s", "60s", "120s", "默认(-1)"));
        return aVar;
    }
}
