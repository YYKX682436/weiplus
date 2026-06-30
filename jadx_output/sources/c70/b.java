package c70;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f39519d = 0;

    public b(c70.c cVar, c70.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f39519d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f39519d;
        this.f39519d = i17 + 1;
        if (i17 == 0) {
            return c70.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
