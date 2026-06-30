package a40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f1169d = 0;

    public b(a40.c cVar, a40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1169d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f1169d;
        this.f1169d = i17 + 1;
        if (i17 == 0) {
            return a40.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
