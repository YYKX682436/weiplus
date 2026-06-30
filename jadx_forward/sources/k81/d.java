package k81;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f386401d = 0;

    public d(k81.e eVar, k81.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f386401d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f386401d;
        this.f386401d = i17 + 1;
        if (i17 == 0) {
            return k81.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
