package ae2;

/* loaded from: classes3.dex */
public final class hk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.hk f3659d = new ae2.hk();

    public hk() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(300, "直播url提前DNS解析时间间隔(s)", null, null, 12, null);
        aVar.a("FINDER_LIVE_URL_DNS_PRELOAD_INTERVAL", kz5.c0.i(300, 60, 10), kz5.c0.i("5min", "60s", "10s"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_url_dns_preload_interval_sec, false, 2, null);
        return aVar;
    }
}
