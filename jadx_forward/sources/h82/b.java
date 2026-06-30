package h82;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361060d = 0;

    public b(h82.c cVar, h82.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361060d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361060d;
        this.f361060d = i17 + 1;
        if (i17 == 0) {
            return h82.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
