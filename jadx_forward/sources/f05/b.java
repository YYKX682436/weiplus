package f05;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f339961d = 0;

    public b(f05.c cVar, f05.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f339961d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f339961d;
        this.f339961d = i17 + 1;
        if (i17 == 0) {
            return f05.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
