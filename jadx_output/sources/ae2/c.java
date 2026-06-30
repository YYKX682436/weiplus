package ae2;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.c f3514d = new ae2.c();

    public c() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "主播是否开启粉丝团抽奖", null, null, 12, null);
        aVar.a("ENABLE_FINDER_LIVE_LOTTERY_FAN", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_lottery_fan_switch, false, 2, null);
        return aVar;
    }
}
