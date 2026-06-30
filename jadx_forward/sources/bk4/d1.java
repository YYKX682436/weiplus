package bk4;

/* loaded from: classes11.dex */
public final class d1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f102986b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f102987c;

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.d1 f102985a = new bk4.d1();

    /* renamed from: d, reason: collision with root package name */
    public static final bk4.c1 f102988d = new bk4.c1();

    public final void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusMusicFloatBallUtil", "showTingFloatBall show: " + z17 + ", shouldShow: " + f102986b + ", tingFloatBallState: " + f102987c);
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusMusicFloatBallUtil", "hideTingFloatBall");
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(false);
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Bi(false);
        } else if (f102986b && f102987c) {
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(true);
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Bi(true);
        }
    }
}
