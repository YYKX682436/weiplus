package e40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f329144d = 0;

    public b(e40.c cVar, e40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f329144d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f329144d;
        this.f329144d = i17 + 1;
        if (i17 == 0) {
            return bf5.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
