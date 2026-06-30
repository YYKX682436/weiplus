package p80;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434241d = 0;

    public b(p80.c cVar, p80.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434241d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434241d;
        this.f434241d = i17 + 1;
        if (i17 == 0) {
            return o80.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
