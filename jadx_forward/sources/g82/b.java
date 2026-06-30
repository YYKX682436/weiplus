package g82;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f351063d = 0;

    public b(g82.c cVar, g82.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351063d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f351063d;
        this.f351063d = i17 + 1;
        if (i17 == 0) {
            return g82.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
