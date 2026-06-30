package bk4;

/* loaded from: classes11.dex */
public final class d1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f21453b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f21454c;

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.d1 f21452a = new bk4.d1();

    /* renamed from: d, reason: collision with root package name */
    public static final bk4.c1 f21455d = new bk4.c1();

    public final void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusMusicFloatBallUtil", "showTingFloatBall show: " + z17 + ", shouldShow: " + f21453b + ", tingFloatBallState: " + f21454c);
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusMusicFloatBallUtil", "hideTingFloatBall");
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(false);
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Bi(false);
        } else if (f21453b && f21454c) {
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(true);
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Bi(true);
        }
    }
}
