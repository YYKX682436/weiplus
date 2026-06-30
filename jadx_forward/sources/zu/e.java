package zu;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f557178a;

    /* renamed from: b, reason: collision with root package name */
    public final long f557179b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f557180c;

    /* renamed from: d, reason: collision with root package name */
    public final l15.a f557181d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f557182e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f557183f;

    public e(java.lang.String fromUsername, java.lang.String toUsername, long j17, java.lang.String msgTalker, l15.a msgXmlObj, java.lang.ref.WeakReference flowApiRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgXmlObj, "msgXmlObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flowApiRef, "flowApiRef");
        this.f557178a = toUsername;
        this.f557179b = j17;
        this.f557180c = msgTalker;
        this.f557181d = msgXmlObj;
        this.f557182e = flowApiRef;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f557183f = uuid;
        new java.util.LinkedHashMap();
    }
}
