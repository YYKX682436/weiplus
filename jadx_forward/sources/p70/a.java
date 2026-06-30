package p70;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f433989a;

    /* renamed from: b, reason: collision with root package name */
    public final int f433990b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f433991c;

    /* renamed from: d, reason: collision with root package name */
    public final k70.i0 f433992d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f433993e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f433994f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f433995g;

    /* renamed from: h, reason: collision with root package name */
    public r15.b f433996h;

    public a(java.lang.String imgPath, int i17, java.lang.String toUsername, k70.i0 crossParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(crossParams, "crossParams");
        this.f433989a = imgPath;
        this.f433990b = i17;
        this.f433991c = toUsername;
        this.f433992d = crossParams;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f433993e = uuid;
        this.f433994f = new java.util.HashMap();
    }
}
