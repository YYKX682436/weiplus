package ae2;

/* loaded from: classes3.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.l4 f3994d = new ae2.l4();

    public l4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "主播开播破音检测时长阈值", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_overflow_audio_duration_threshold, false, 2, null);
        aVar.a("FINDER_LIVE_ANCHOR_OVERFLOW_AUDIO_DURATION_THRESHOLD", kz5.c0.i(5, 10), kz5.c0.i("10s", "20s"));
        return aVar;
    }
}
