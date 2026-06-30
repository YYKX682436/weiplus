package jh4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final jh4.c f381379a = new jh4.c();

    /* renamed from: b, reason: collision with root package name */
    public static int f381380b = 20;

    /* renamed from: c, reason: collision with root package name */
    public static float f381381c = 16.0f;

    /* renamed from: d, reason: collision with root package name */
    public static int f381382d;

    public final void a() {
        android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        int i17 = d17 != null ? d17.getInt("current_draw_fps", 20) : 20;
        f381380b = i17;
        f381381c = (1000.0f / i17) - 20;
        if (i17 == 2) {
            mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo updateAlphaAnimation %d", 1500L);
            nq.f.f420399n = 1500L;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBackgroundConfig", "computeSleepTimePerFrame: %f, fps: %d, DEFAULT_DRAW_FPS: %d", java.lang.Float.valueOf(f381381c), java.lang.Integer.valueOf(f381380b), 20);
    }
}
