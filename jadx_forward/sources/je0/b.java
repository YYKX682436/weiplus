package je0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f380719d = 0;

    public b(je0.c cVar, je0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f380719d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f380719d;
        this.f380719d = i17 + 1;
        if (i17 == 0) {
            return ie0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
