package az0;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 f96842a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f96843b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f96844c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f96845d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f96846e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f96847f;

    public a0(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 moviePlayer, p3325xe03a0797.p3326xc267989b.y0 scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moviePlayer, "moviePlayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f96842a = moviePlayer;
        this.f96843b = scope;
        this.f96844c = "MicroMsg.Maas.MJMoviePlayerController#" + moviePlayer.hashCode();
    }

    public final boolean a() {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54 = this.f96842a;
        boolean z17 = c4073xbc40c54.m33238xb7d72d0e() == 5;
        boolean z18 = c4073xbc40c54.m33238xb7d72d0e() == 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96844c, "enableStartPlay: isPlaying=" + z17 + ", isReady=" + z18 + ", hadOpenWithBundle=" + this.f96845d);
        return !z17 && z18 && this.f96845d;
    }
}
