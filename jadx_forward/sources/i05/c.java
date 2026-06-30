package i05;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368101d = 0;

    public c(i05.d dVar, i05.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368101d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368101d;
        this.f368101d = i17 + 1;
        if (i17 == 0) {
            return i05.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
