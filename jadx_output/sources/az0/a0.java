package az0;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.instamovie.MJMoviePlayer f15309a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f15310b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f15311c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15312d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f15313e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f15314f;

    public a0(com.tencent.maas.instamovie.MJMoviePlayer moviePlayer, kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(moviePlayer, "moviePlayer");
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f15309a = moviePlayer;
        this.f15310b = scope;
        this.f15311c = "MicroMsg.Maas.MJMoviePlayerController#" + moviePlayer.hashCode();
    }

    public final boolean a() {
        com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer = this.f15309a;
        boolean z17 = mJMoviePlayer.getCurrentState() == 5;
        boolean z18 = mJMoviePlayer.getCurrentState() == 2;
        com.tencent.mars.xlog.Log.i(this.f15311c, "enableStartPlay: isPlaying=" + z17 + ", isReady=" + z18 + ", hadOpenWithBundle=" + this.f15312d);
        return !z17 && z18 && this.f15312d;
    }
}
