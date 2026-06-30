package qw1;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final qw1.d f448616a;

    /* renamed from: b, reason: collision with root package name */
    public final qw1.d f448617b;

    /* renamed from: c, reason: collision with root package name */
    public final qw1.d f448618c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f448619d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f448620e;

    /* renamed from: f, reason: collision with root package name */
    public pw1.g f448621f;

    public e(qw1.j jVar, java.lang.String username, qw1.d yGLTextureObject, qw1.d uGLTextureObject, qw1.d vGLTextureObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yGLTextureObject, "yGLTextureObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uGLTextureObject, "uGLTextureObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vGLTextureObject, "vGLTextureObject");
        this.f448616a = yGLTextureObject;
        this.f448617b = uGLTextureObject;
        this.f448618c = vGLTextureObject;
        this.f448619d = true;
        this.f448620e = new java.util.concurrent.locks.ReentrantLock();
    }
}
