package o90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425221d = 0;

    public b(o90.c cVar, o90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425221d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425221d;
        this.f425221d = i17 + 1;
        if (i17 == 0) {
            return o90.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
