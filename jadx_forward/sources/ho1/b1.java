package ho1;

/* loaded from: classes7.dex */
public final class b1 implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f364163d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f364164e;

    public b1(java.lang.String prefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        this.f364163d = prefix;
        this.f364164e = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        return new java.lang.Thread(r17, this.f364163d + '-' + this.f364164e.incrementAndGet());
    }
}
