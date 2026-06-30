package ae2;

/* loaded from: classes3.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.m4 f4018d = new ae2.m4();

    public m4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "主播开播静音检测时长阈值", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_silent_audio_duration_threshold, false, 2, null);
        aVar.a("FINDER_LIVE_ANCHOR_SILENT_AUDIO_DURATION_THRESHOLD", kz5.c0.i(5, 10), kz5.c0.i("10s", "20s"));
        return aVar;
    }
}
