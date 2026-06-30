package aw1;

/* loaded from: classes7.dex */
public final class g0 implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f96054d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f96055e;

    public g0(java.lang.String prefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        this.f96054d = prefix;
        this.f96055e = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        return new java.lang.Thread(r17, this.f96054d + '-' + this.f96055e.incrementAndGet());
    }
}
