package b60;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18125d = 0;

    public b(b60.c cVar, b60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18125d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18125d;
        this.f18125d = i17 + 1;
        if (i17 == 0) {
            return b60.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
