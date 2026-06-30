package gs0;

/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f356504a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.Surface f356505b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.p f356506c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f356507d;

    /* renamed from: e, reason: collision with root package name */
    public int f356508e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f356509f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f356510g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f356511h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f356512i;

    public b(es0.d videoCodecConfig, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoCodecConfig, "videoCodecConfig");
        this.f356504a = "MicroMsg.IMediaCodecTransEncoder";
        this.f356512i = new java.lang.Object();
    }

    public abstract void a(long j17);

    public abstract void b();

    public final android.view.Surface c() {
        android.view.Surface surface = this.f356505b;
        if (surface != null) {
            return surface;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("codecSurface");
        throw null;
    }

    public abstract long d();

    public final void e(java.nio.ByteBuffer buffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356504a, "processEncodeBuffer, buffer " + buffer + ", pts: " + bufferInfo.presentationTimeUs + ", size: " + bufferInfo.size + ", isMain: " + p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper()));
        yz5.p pVar = this.f356506c;
        if (pVar != null) {
            pVar.mo149xb9724478(buffer, bufferInfo);
        }
        this.f356508e++;
    }

    public abstract void f();
}
