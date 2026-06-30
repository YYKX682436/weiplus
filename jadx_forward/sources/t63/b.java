package t63;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f497535d = 0;

    public b(t63.c cVar, t63.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f497535d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f497535d;
        this.f497535d = i17 + 1;
        if (i17 == 0) {
            return t63.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
