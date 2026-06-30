package l70;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f398333a;

    /* renamed from: b, reason: collision with root package name */
    public final s70.c f398334b;

    /* renamed from: c, reason: collision with root package name */
    public final j15.d f398335c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f398336d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f398337e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f398338f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f398339g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f398340h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f398341i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f398342j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f398343k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f398344l;

    /* renamed from: m, reason: collision with root package name */
    public l70.a f398345m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f398346n;

    /* renamed from: o, reason: collision with root package name */
    public int f398347o;

    /* renamed from: p, reason: collision with root package name */
    public final long f398348p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f398349q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f398350r;

    public d(boolean z17, s70.c imgType, j15.d imgMsg, java.lang.String imgUsername, java.lang.String mediaId, java.lang.String downloadPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgType, "imgType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgMsg, "imgMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgUsername, "imgUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadPath, "downloadPath");
        this.f398333a = z17;
        this.f398334b = imgType;
        this.f398335c = imgMsg;
        this.f398336d = imgUsername;
        this.f398337e = mediaId;
        this.f398338f = downloadPath;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f398339g = uuid;
        this.f398340h = true;
        this.f398341i = "MsgImgDownload";
        this.f398342j = new java.util.HashMap();
        this.f398343k = new java.util.LinkedHashMap();
        this.f398347o = 1;
        this.f398348p = 300000L;
        this.f398350r = true;
    }
}
