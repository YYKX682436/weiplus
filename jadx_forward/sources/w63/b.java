package w63;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f524810d = 0;

    public b(w63.c cVar, w63.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f524810d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f524810d;
        this.f524810d = i17 + 1;
        if (i17 == 0) {
            return w63.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
