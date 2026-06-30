package g32;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f349704d = 0;

    public x(g32.y yVar, g32.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f349704d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f349704d;
        this.f349704d = i17 + 1;
        if (i17 == 0) {
            return g32.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
