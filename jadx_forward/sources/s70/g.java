package s70;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f485477a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f485478b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f485479c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f485480d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f485481e;

    /* renamed from: f, reason: collision with root package name */
    public int f485482f;

    /* renamed from: g, reason: collision with root package name */
    public final k70.i0 f485483g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f485484h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f485485i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.ref.WeakReference f485486j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.ref.WeakReference f485487k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.ref.WeakReference f485488l;

    public g(java.lang.String uploadId, java.lang.String imgXml, java.lang.String fromUsername, java.lang.String toUsername, java.lang.String clientImgId, int i17, k70.i0 crossParams, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i18 & 1) != 0) {
            uploadId = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uploadId, "toString(...)");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uploadId, "uploadId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgXml, "imgXml");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientImgId, "clientImgId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(crossParams, "crossParams");
        this.f485477a = uploadId;
        this.f485478b = imgXml;
        this.f485479c = fromUsername;
        this.f485480d = toUsername;
        this.f485481e = clientImgId;
        this.f485482f = i17;
        this.f485483g = crossParams;
        this.f485484h = new java.util.LinkedHashMap();
        this.f485485i = true;
    }
}
