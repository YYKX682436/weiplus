package k65;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f386143d = 0;

    public b(k65.c cVar, k65.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f386143d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f386143d;
        this.f386143d = i17 + 1;
        if (i17 == 0) {
            return fm.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
