package i06;

/* loaded from: classes5.dex */
public final class p4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f368256a;

    /* renamed from: b, reason: collision with root package name */
    public final int f368257b;

    public p4(java.lang.ClassLoader classLoader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classLoader, "classLoader");
        this.f368256a = new java.lang.ref.WeakReference(classLoader);
        this.f368257b = java.lang.System.identityHashCode(classLoader);
    }

    /* renamed from: equals */
    public boolean m134389xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof i06.p4) && this.f368256a.get() == ((i06.p4) obj).f368256a.get();
    }

    /* renamed from: hashCode */
    public int m134390x8cdac1b() {
        return this.f368257b;
    }

    /* renamed from: toString */
    public java.lang.String m134391x9616526c() {
        java.lang.String obj;
        java.lang.ClassLoader classLoader = (java.lang.ClassLoader) this.f368256a.get();
        return (classLoader == null || (obj = classLoader.toString()) == null) ? "<null>" : obj;
    }
}
