package cm1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f124812d = 0;

    public b(cm1.c cVar, cm1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f124812d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f124812d;
        this.f124812d = i17 + 1;
        if (i17 == 0) {
            return cm1.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
