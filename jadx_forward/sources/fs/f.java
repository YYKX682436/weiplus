package fs;

/* loaded from: classes12.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f347608d;

    /* renamed from: e, reason: collision with root package name */
    public final fs.d f347609e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f347610f = null;

    public f(java.util.Iterator it, fs.d dVar) {
        this.f347608d = it;
        this.f347609e = dVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        java.lang.Object next;
        if (this.f347610f != null) {
            return true;
        }
        do {
            java.util.Iterator it = this.f347608d;
            if (!it.hasNext()) {
                return false;
            }
            next = it.next();
        } while (!this.f347609e.a(next));
        this.f347610f = next;
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f347610f;
        this.f347610f = null;
        return obj;
    }
}
