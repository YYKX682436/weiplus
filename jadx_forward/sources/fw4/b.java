package fw4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348627d = 0;

    public b(fw4.c cVar, fw4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348627d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348627d;
        this.f348627d = i17 + 1;
        if (i17 == 0) {
            return fw4.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
