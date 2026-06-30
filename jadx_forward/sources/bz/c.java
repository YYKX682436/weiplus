package bz;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118152d = 0;

    public c(bz.d dVar, bz.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118152d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118152d;
        this.f118152d = i17 + 1;
        if (i17 == 0) {
            return bz.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
