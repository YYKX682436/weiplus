package c00;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118488d = 0;

    public b(c00.c cVar, c00.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118488d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118488d;
        this.f118488d = i17 + 1;
        if (i17 == 0) {
            return b30.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
