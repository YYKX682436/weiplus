package ae2;

/* loaded from: classes3.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.b4 f3494d = new ae2.b4();

    public b4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "主播开播温度过高提示阈值", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_battery_temperature_threshold, false, 2, null);
        aVar.a("FINDER_LIVE_ANCHOR_BATTERY_TEMPERATURE_THRESHOLD", kz5.c0.i(15, 20, 25, 30, 35, 40, 45, 50), kz5.c0.i("15度", "20度", "25度", "30度", "35度", "40度", "45度", "50度"));
        return aVar;
    }
}
