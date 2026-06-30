package r63;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f474546d = 0;

    public b(r63.c cVar, r63.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f474546d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f474546d;
        this.f474546d = i17 + 1;
        if (i17 == 0) {
            return r63.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
