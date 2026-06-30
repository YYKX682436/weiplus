package ae2;

/* loaded from: classes3.dex */
public final class rc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.rc f4146d = new ae2.rc();

    public rc() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "直播低延时配置", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_low_delay_cfg_android, false, 2, null);
        aVar.a("FINDER_LIVE_LOW_DELAY_CONFIG", kz5.c0.i(0, 1, 2, 3), kz5.c0.i("NONE", "自研flv低延时", "SDK内置flv低延时", "SDK内置快直播低延时"));
        return aVar;
    }
}
