package b14;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f98651d = 0;

    public b(b14.c cVar, b14.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f98651d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f98651d;
        this.f98651d = i17 + 1;
        if (i17 == 0) {
            return b14.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
