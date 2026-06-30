package a00;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f81889d = 0;

    public b(a00.c cVar, a00.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f81889d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f81889d;
        this.f81889d = i17 + 1;
        if (i17 == 0) {
            return t02.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
