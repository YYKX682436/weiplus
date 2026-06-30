package ae2;

/* loaded from: classes3.dex */
public final class rb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.rb f4145d = new ae2.rb();

    public rb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(5, "直播打赏升级信息显示时间", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_live_notice_top_time_max_count_android, false, 2, null);
        aVar.a("FINDER_LIVE_LEVEL_UP_DURATION", kz5.c0.i(5, 10, 15, 30, 60, 1800), kz5.c0.i("5秒", "10秒", "15秒", "30秒", "60秒", "半小时"));
        return aVar;
    }
}
