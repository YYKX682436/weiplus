package wh;

/* loaded from: classes12.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ThreadLocal f527285a;

    public abstract java.lang.Object a();

    public java.lang.Object b() {
        java.lang.ref.WeakReference weakReference;
        java.lang.Object obj;
        java.lang.ThreadLocal threadLocal = this.f527285a;
        if (threadLocal != null && (weakReference = (java.lang.ref.WeakReference) threadLocal.get()) != null && (obj = weakReference.get()) != null) {
            return obj;
        }
        java.lang.Object a17 = a();
        java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(a17);
        java.lang.ThreadLocal threadLocal2 = new java.lang.ThreadLocal();
        this.f527285a = threadLocal2;
        threadLocal2.set(weakReference2);
        return a17;
    }
}
