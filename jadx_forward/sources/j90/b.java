package j90;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f379870d = 0;

    public b(j90.c cVar, j90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f379870d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f379870d;
        this.f379870d = i17 + 1;
        if (i17 == 0) {
            return j90.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
