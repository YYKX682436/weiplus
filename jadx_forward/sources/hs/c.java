package hs;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366048d = 0;

    public c(hs.d dVar, hs.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366048d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366048d;
        this.f366048d = i17 + 1;
        if (i17 == 0) {
            return hs.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
