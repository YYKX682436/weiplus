package vo5;

/* loaded from: classes13.dex */
public final class a implements uo5.n {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f520239a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f520240b;

    public a(boolean z17, android.os.Handler codecHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codecHandler, "codecHandler");
        this.f520239a = codecHandler;
        this.f520240b = z17 ? "video/hevc" : "video/avc";
    }

    @Override // uo5.n
    public uo5.a a(boolean z17) {
        java.lang.String str = this.f520240b;
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(str, 640, 480);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createVideoFormat, "createVideoFormat(...)");
        return new uo5.a(false, str, createVideoFormat);
    }

    @Override // uo5.n
    public android.os.Handler b() {
        return this.f520239a;
    }

    @Override // uo5.n
    public int c() {
        return 0;
    }
}
