package ae2;

/* loaded from: classes3.dex */
public final class x9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.x9 f4286d = new ae2.x9();

    public x9() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "直播获取IPUrl时触发一次localdns", null, null, 12, null);
        aVar.a("FINDER_LIVE_GET_IP_URL_REFRESH_LOCAL_DNS", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_get_ip_url_refresh_local_dns, false, 2, null);
        return aVar;
    }
}
