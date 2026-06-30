package nj3;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f419436a;

    /* renamed from: b, reason: collision with root package name */
    public final nj3.d f419437b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f419438c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReadWriteLock f419439d;

    /* renamed from: e, reason: collision with root package name */
    public mj3.g f419440e;

    public f(nj3.j jVar, java.lang.String username, nj3.d textureWrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureWrapper, "textureWrapper");
        this.f419436a = username;
        this.f419437b = textureWrapper;
        this.f419438c = textureWrapper.f419428b;
        this.f419439d = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }
}
