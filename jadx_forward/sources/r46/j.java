package r46;

/* loaded from: classes13.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f474041d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class f474042e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Iterator f474043f;

    public j(java.lang.Class cls) {
        java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
        this.f474042e = cls;
        this.f474043f = java.util.ServiceLoader.load(cls, systemClassLoader).iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        java.util.Iterator it = this.f474043f;
        while (this.f474041d == null) {
            try {
            } catch (java.util.ServiceConfigurationError e17) {
                if (!(e17.getCause() instanceof java.lang.SecurityException)) {
                    throw e17;
                }
            }
            if (!it.hasNext()) {
                return false;
            }
            this.f474041d = it.next();
        }
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("No more elements for service ".concat(this.f474042e.getName()));
        }
        java.lang.Object obj = this.f474041d;
        this.f474041d = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("service=".concat(this.f474042e.getName()));
    }
}
