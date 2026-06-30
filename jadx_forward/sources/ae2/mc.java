package ae2;

/* loaded from: classes3.dex */
public final class mc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.mc f85559d = new ae2.mc();

    public mc() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(60, "抽奖中气泡展示时长(秒)", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_lottery_bubble_computing_stay_duration, false, 2, null);
        aVar.a("FINDER_LIVE_LOTTERY_BUBBLE_COMPUTING_STAY_DURATION", kz5.c0.i(60, 5, 30, 200), kz5.c0.i("60秒", "5秒", "30秒", "200秒"));
        aVar.f399278p = "T32";
        return aVar;
    }
}
