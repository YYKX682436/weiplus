package ls0;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final hs0.a f402462a;

    /* renamed from: b, reason: collision with root package name */
    public fs0.g f402463b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.p f402464c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f402465d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f402466e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f402467f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f402468g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.HandlerThread f402469h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.r f402470i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.l f402471j;

    public v(hs0.a mediaExtractor, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaExtractor, "mediaExtractor");
        this.f402462a = mediaExtractor;
        this.f402466e = new java.lang.Object();
        this.f402468g = "MicroMsg.MediaCodecCheckVideoCropRect";
        android.os.Looper myLooper = android.os.Looper.myLooper();
        this.f402467f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3((myLooper == null || z17) ? android.os.Looper.getMainLooper() : myLooper);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecCheckVideoCropRect", "create MediaCodecCheckVideoCropRect");
        mediaExtractor.g();
        this.f402470i = new ls0.p(this);
        this.f402471j = new ls0.r(this);
    }
}
