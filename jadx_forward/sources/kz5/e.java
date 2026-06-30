package kz5;

/* loaded from: classes5.dex */
public class e implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f395497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kz5.h f395498e;

    public e(kz5.h hVar) {
        this.f395498e = hVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f395497d < this.f395498e.d();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.f395497d;
        this.f395497d = i17 + 1;
        return this.f395498e.get(i17);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
