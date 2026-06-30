package w80;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f525333d = 0;

    public b(w80.c cVar, w80.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f525333d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f525333d;
        this.f525333d = i17 + 1;
        if (i17 == 0) {
            return v80.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
