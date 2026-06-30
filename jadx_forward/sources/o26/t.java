package o26;

/* loaded from: classes12.dex */
public final class t implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f424145d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f424146e = true;

    public t(java.lang.Object obj) {
        this.f424145d = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424146e;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f424146e) {
            throw new java.util.NoSuchElementException();
        }
        this.f424146e = false;
        return this.f424145d;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
