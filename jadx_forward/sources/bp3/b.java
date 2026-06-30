package bp3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f104615d = 0;

    public b(bp3.c cVar, bp3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f104615d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f104615d;
        this.f104615d = i17 + 1;
        if (i17 == 0) {
            return bp3.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
