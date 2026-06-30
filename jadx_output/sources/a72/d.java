package a72;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f1925d = 0;

    public d(a72.e eVar, a72.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1925d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f1925d;
        this.f1925d = i17 + 1;
        if (i17 == 0) {
            return a72.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
