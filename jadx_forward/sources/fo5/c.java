package fo5;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f346494d = 0;

    public c(fo5.d dVar, fo5.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f346494d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f346494d;
        this.f346494d = i17 + 1;
        if (i17 == 0) {
            return fo5.s2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
