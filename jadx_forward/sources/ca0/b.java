package ca0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f121298d = 0;

    public b(ca0.c cVar, ca0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f121298d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f121298d;
        this.f121298d = i17 + 1;
        if (i17 == 0) {
            return ba0.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
