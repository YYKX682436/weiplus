package i80;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f371041d = 0;

    public b(i80.c cVar, i80.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f371041d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f371041d;
        this.f371041d = i17 + 1;
        if (i17 == 0) {
            return i80.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
