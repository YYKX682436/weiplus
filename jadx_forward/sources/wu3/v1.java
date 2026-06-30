package wu3;

/* loaded from: classes10.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final zv3.b f531343a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f531344b;

    /* renamed from: c, reason: collision with root package name */
    public final int f531345c;

    /* renamed from: d, reason: collision with root package name */
    public final int f531346d;

    /* renamed from: e, reason: collision with root package name */
    public final int f531347e;

    /* renamed from: f, reason: collision with root package name */
    public int f531348f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f531349g;

    /* renamed from: h, reason: collision with root package name */
    public float f531350h;

    /* renamed from: i, reason: collision with root package name */
    public int f531351i;

    /* renamed from: j, reason: collision with root package name */
    public int f531352j;

    /* renamed from: k, reason: collision with root package name */
    public int f531353k;

    /* renamed from: l, reason: collision with root package name */
    public float f531354l;

    /* renamed from: m, reason: collision with root package name */
    public float f531355m;

    /* renamed from: n, reason: collision with root package name */
    public float f531356n;

    public v1(java.lang.String videoPath, zv3.b emojiFrameRetriever) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiFrameRetriever, "emojiFrameRetriever");
        this.f531343a = emojiFrameRetriever;
        this.f531344b = "MicroMsg.MixFrameSyncMgr";
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(videoPath, true);
        if (d17 != null) {
            int i17 = d17.f243919e;
            this.f531346d = i17;
            int i18 = d17.f243915a;
            this.f531347e = i18;
            this.f531354l = 1000.0f / i17;
            this.f531345c = (int) (i17 * (i18 / 1000.0d));
        } else {
            this.f531345c = 0;
            this.f531346d = 0;
            this.f531354l = 0.0f;
            this.f531347e = 0;
        }
        this.f531353k = this.f531346d;
        this.f531355m = this.f531354l;
        this.f531351i = this.f531345c;
        this.f531352j = 0;
    }
}
