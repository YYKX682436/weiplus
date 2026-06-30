package zi4;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f554713d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f554714e;

    /* renamed from: f, reason: collision with root package name */
    public final zi4.g0 f554715f;

    public a(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        this.f554713d = cmdId;
        this.f554714e = weakReference;
        this.f554715f = host;
    }

    public abstract void a(byte[] bArr, yz5.l lVar);
}
