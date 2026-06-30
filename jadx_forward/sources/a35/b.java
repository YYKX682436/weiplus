package a35;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f82599d = 0;

    public b(a35.c cVar, a35.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f82599d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f82599d;
        this.f82599d = i17 + 1;
        if (i17 == 0) {
            return a35.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
