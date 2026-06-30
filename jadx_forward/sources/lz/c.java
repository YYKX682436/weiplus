package lz;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f403843d = 0;

    public c(lz.d dVar, lz.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f403843d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f403843d;
        this.f403843d = i17 + 1;
        if (i17 == 0) {
            return kz.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
