package ha0;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361281d = 0;

    public b(ha0.c cVar, ha0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361281d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361281d;
        this.f361281d = i17 + 1;
        if (i17 == 0) {
            return ha0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
