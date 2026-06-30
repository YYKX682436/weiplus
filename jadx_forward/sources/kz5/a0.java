package kz5;

/* loaded from: classes13.dex */
public abstract class a0 implements java.util.Iterator, zz5.a {
    @Override // java.util.Iterator
    public java.lang.Object next() {
        e06.b bVar = (e06.b) this;
        int i17 = bVar.f327737g;
        if (i17 != bVar.f327735e) {
            bVar.f327737g = bVar.f327734d + i17;
        } else {
            if (!bVar.f327736f) {
                throw new java.util.NoSuchElementException();
            }
            bVar.f327736f = false;
        }
        return java.lang.Character.valueOf((char) i17);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
