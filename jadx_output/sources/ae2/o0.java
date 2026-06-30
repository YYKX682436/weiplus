package ae2;

/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.o0 f4062d = new ae2.o0();

    public o0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3000, "引导延迟时间MS", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_square_guide_show_waiting_ms, false, 2, null);
        aVar.a("FINDER_LIVE_SQUARE_GUIDE_SHOW_WAITING_MS", kz5.c0.i(1000, 3000, 5000), kz5.c0.i("1000", "3000", "5000"));
        return aVar;
    }
}
