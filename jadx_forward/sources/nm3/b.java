package nm3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f420009d = 0;

    public b(nm3.c cVar, nm3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f420009d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f420009d;
        this.f420009d = i17 + 1;
        if (i17 == 0) {
            return nm3.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
