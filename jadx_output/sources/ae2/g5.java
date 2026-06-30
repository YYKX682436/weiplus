package ae2;

/* loaded from: classes3.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.g5 f3620d = new ae2.g5();

    public g5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "CGI上报直播Qos信息阈值", null, null, 12, null);
        aVar.a("FINDER_LIVE_CGI_REPORT_QOS_THRESHOLD", kz5.c0.i(0, 5, 10, 20, 50), kz5.c0.i("关", "5条", "10条", "20条", "50条"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_cgi_report_qos_threshold, false, 2, null);
        return aVar;
    }
}
