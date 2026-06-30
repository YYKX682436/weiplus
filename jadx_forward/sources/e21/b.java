package e21;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f328018d = 0;

    public b(e21.c cVar, e21.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f328018d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f328018d;
        this.f328018d = i17 + 1;
        if (i17 == 0) {
            return e21.c1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
