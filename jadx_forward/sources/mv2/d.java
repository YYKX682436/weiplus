package mv2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f413083a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f413084b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.q f413085c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f413086d;

    /* renamed from: e, reason: collision with root package name */
    public long f413087e;

    /* renamed from: f, reason: collision with root package name */
    public final int f413088f;

    /* renamed from: g, reason: collision with root package name */
    public final mv2.c f413089g;

    public d(long j17, java.lang.String imagePath, yz5.l progressCallback, yz5.q completeCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(progressCallback, "progressCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completeCallback, "completeCallback");
        this.f413083a = imagePath;
        this.f413084b = progressCallback;
        this.f413085c = completeCallback;
        this.f413086d = "Finder.CommentImageUploadTask";
        this.f413087e = -1L;
        this.f413088f = 2;
        this.f413089g = new mv2.c(this);
    }
}
