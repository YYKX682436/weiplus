package wa0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f525627d = 0;

    public b(wa0.c cVar, wa0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f525627d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f525627d;
        this.f525627d = i17 + 1;
        if (i17 == 0) {
            return wa0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
