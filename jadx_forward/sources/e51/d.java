package e51;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f331104a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.Choreographer f331105b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Choreographer.FrameCallback f331106c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f331107d;

    public d(java.lang.ref.WeakReference weakReference) {
        this.f331104a = weakReference;
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(choreographer, "getInstance(...)");
        this.f331105b = choreographer;
        this.f331106c = new e51.c(this);
    }
}
