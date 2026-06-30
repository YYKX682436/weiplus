package ck0;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f42298d = 0;

    public c(ck0.d dVar, ck0.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f42298d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f42298d;
        this.f42298d = i17 + 1;
        if (i17 == 0) {
            return oy4.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
