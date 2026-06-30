package fb0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342354d = 0;

    public b(fb0.c cVar, fb0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342354d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342354d;
        this.f342354d = i17 + 1;
        if (i17 == 0) {
            return ud5.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
