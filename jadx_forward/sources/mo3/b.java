package mo3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f411936d = 0;

    public b(mo3.c cVar, mo3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f411936d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f411936d;
        this.f411936d = i17 + 1;
        if (i17 == 0) {
            return mo3.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
