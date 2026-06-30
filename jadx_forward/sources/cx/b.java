package cx;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f305909d = 0;

    public b(cx.c cVar, cx.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f305909d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f305909d;
        this.f305909d = i17 + 1;
        if (i17 == 0) {
            return cx.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
