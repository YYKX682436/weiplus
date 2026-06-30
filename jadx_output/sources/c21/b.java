package c21;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37986d = 0;

    public b(c21.c cVar, c21.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37986d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37986d;
        this.f37986d = i17 + 1;
        if (i17 == 0) {
            return ll3.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
