package ae2;

/* loaded from: classes3.dex */
public final class ic extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.ic f3676d = new ae2.ic();

    public ic() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "支持主播使用本地视频推流", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_local_push_stream_enable, false, 2, null);
        aVar.a("FINDER_LIVE_LOCAL_PUSH_STREAM_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
