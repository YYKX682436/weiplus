package kz5;

/* loaded from: classes7.dex */
public abstract class c implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f395495d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f395496e;

    public abstract void b();

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i17 = this.f395495d;
        if (i17 == 0) {
            this.f395495d = 3;
            b();
            if (this.f395495d != 1) {
                return false;
            }
        } else if (i17 != 1) {
            if (i17 == 2) {
                return false;
            }
            throw new java.lang.IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f395495d;
        if (i17 == 1) {
            this.f395495d = 0;
            return this.f395496e;
        }
        if (i17 != 2) {
            this.f395495d = 3;
            b();
            if (this.f395495d == 1) {
                this.f395495d = 0;
                return this.f395496e;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
