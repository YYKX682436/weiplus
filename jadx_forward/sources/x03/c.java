package x03;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f532524d = 0;

    public c(x03.d dVar, x03.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f532524d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f532524d;
        this.f532524d = i17 + 1;
        if (i17 == 0) {
            return x03.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
