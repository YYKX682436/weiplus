package k00;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f384529d = 0;

    public b(k00.c cVar, k00.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384529d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384529d;
        this.f384529d = i17 + 1;
        if (i17 == 0) {
            return l00.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
