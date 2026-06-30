package nj3;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final nj3.d f419430a;

    /* renamed from: b, reason: collision with root package name */
    public final nj3.d f419431b;

    /* renamed from: c, reason: collision with root package name */
    public final nj3.d f419432c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f419433d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f419434e;

    /* renamed from: f, reason: collision with root package name */
    public mj3.g f419435f;

    public e(nj3.j jVar, java.lang.String username, nj3.d yGLTextureObject, nj3.d uGLTextureObject, nj3.d vGLTextureObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yGLTextureObject, "yGLTextureObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uGLTextureObject, "uGLTextureObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vGLTextureObject, "vGLTextureObject");
        this.f419430a = yGLTextureObject;
        this.f419431b = uGLTextureObject;
        this.f419432c = vGLTextureObject;
        this.f419433d = true;
        this.f419434e = new java.util.concurrent.locks.ReentrantLock();
    }
}
