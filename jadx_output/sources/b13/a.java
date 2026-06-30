package b13;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f17086a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry.SurfaceTextureEntry f17087b;

    /* renamed from: c, reason: collision with root package name */
    public final d13.c f17088c;

    /* renamed from: d, reason: collision with root package name */
    public int f17089d;

    /* renamed from: e, reason: collision with root package name */
    public int f17090e;

    /* renamed from: f, reason: collision with root package name */
    public int f17091f;

    public a(long j17, io.flutter.view.TextureRegistry.SurfaceTextureEntry flutterTexture, d13.c voipSurfaceTexture, int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 8) != 0 ? 0 : i17;
        i18 = (i27 & 16) != 0 ? 0 : i18;
        i19 = (i27 & 32) != 0 ? 0 : i19;
        kotlin.jvm.internal.o.g(flutterTexture, "flutterTexture");
        kotlin.jvm.internal.o.g(voipSurfaceTexture, "voipSurfaceTexture");
        this.f17086a = j17;
        this.f17087b = flutterTexture;
        this.f17088c = voipSurfaceTexture;
        this.f17089d = i17;
        this.f17090e = i18;
        this.f17091f = i19;
    }
}
