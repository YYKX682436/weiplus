package pu;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f439888a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f439889b;

    /* renamed from: c, reason: collision with root package name */
    public final l15.a f439890c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f439891d;

    /* renamed from: e, reason: collision with root package name */
    public final pu.l f439892e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f439893f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f439894g;

    public p(java.lang.String fromUsername, java.lang.String toUsername, l15.a msgXmlObj, java.lang.ref.WeakReference flowApiRef, pu.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgXmlObj, "msgXmlObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flowApiRef, "flowApiRef");
        this.f439888a = fromUsername;
        this.f439889b = toUsername;
        this.f439890c = msgXmlObj;
        this.f439891d = flowApiRef;
        this.f439892e = lVar;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f439893f = uuid;
        this.f439894g = new java.util.LinkedHashMap();
    }
}
