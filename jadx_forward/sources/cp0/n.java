package cp0;

/* loaded from: classes15.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f302292a;

    /* renamed from: b, reason: collision with root package name */
    public final ip0.a f302293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f302294c;

    public n(java.lang.Object obj) {
        this.f302293b = new ip0.a("");
        this.f302292a = new java.lang.ref.WeakReference(obj);
        if (obj != null) {
            this.f302294c = obj.hashCode();
        } else {
            this.f302294c = hashCode();
        }
    }

    public java.lang.Object a() {
        java.lang.ref.WeakReference weakReference = this.f302292a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public android.view.View b() {
        java.lang.Object obj;
        java.lang.ref.WeakReference weakReference = this.f302292a;
        if (weakReference == null || (obj = weakReference.get()) == null || !(obj instanceof android.view.View)) {
            return null;
        }
        return (android.view.View) obj;
    }

    public n(java.lang.Object obj, ip0.a aVar) {
        this.f302293b = new ip0.a("");
        this.f302292a = new java.lang.ref.WeakReference(obj);
        if (obj != null) {
            this.f302294c = obj.hashCode();
        } else {
            this.f302294c = hashCode();
        }
        this.f302293b = aVar;
    }
}
